# Dragon Block C Side Mod – Design & Context Document

> Obiettivo: fornire TUTTE le informazioni necessarie a un’altra IA per sviluppare una **side mod** per Dragon Block C 1.4.85 (JinRyuu), integrata nel codice esistente, con nuove feature come una nuova razza “Android”.

---

## 0. Contesto Tecnico

- **Gioco**: Minecraft 1.7.10  
- **Mod principale**: Dragon Block C (DBC) v1.4.85  
- **Dipendenze core**:
  - JRMCore v1.3.51 (libreria di base per tutti i mod JinRyuu)
  - JBRA-Client v1.6.52 (rendering/animazioni cliente)
- **Ambiente modding**:
  - Forge 1.7.10
  - Java 7 / 8
  - Struttura Forge classica: `@Mod`, event bus, NBT, ecc.

- **Side mod**:
  - Mod Forge separata che dipende da `jinryuujrmcore` e `jinryuudragonblockc`.
  - Non deve crashare se DBC non è presente (controlli di presenza classe / modid).

---

## 1. Panoramica dei Sistemi di DBC

### 1.1 Attributi principali (Stats)

DBC usa 6 attributi numerici principali collegati alle statistiche del personaggio.[web:20][web:143]

- **Strength (STR)**  
  Determina il danno fisico corpo a corpo (Melee Damage).[web:20]

- **Dexterity (DEX)**  
  Influisce su velocità e difesa. Aumenta Defense e velocità di corsa/volo.[web:20]

- **Constitution (CON)**  
  Determina “Body” (vita extra oltre gli HP vanilla) e resistenza fisica.[web:20]

- **Willpower (WILL / WIL)**  
  Influenza la potenza del Ki, il danno delle tecniche energetiche e il loro costo.[web:20]

- **Mind (MND)**  
  Incide sulla rigenerazione del Ki e su alcuni aspetti legati al controllo.[web:20]

- **Concentration / Spirit (CNC/SPI)**  
  Legata alla velocità di carica delle tecniche, precisione, ecc.[web:20]

Queste stats si potenziano spendendo **Training Points (TP)**.[web:20][web:143]

### 1.2 Statistiche derivate

Da questi attributi vengono calcolate statistiche derivate:[web:20][web:143]

- **Melee Damage** – danno fisico, principale output della STR.[web:20]
- **Defense** – riduce la quantità di danno ricevuto.[web:20]
- **Passive** – riduzione del danno quando non si blocca (tipicamente ~20% della Defense).[web:20]
- **Body** – barra di “vita avanzata” oltre gli HP vanilla.[web:20][web:143]
- **Stamina / Action Time** – barra che rappresenta la resistenza per bloccare, attaccare, correre e volare.[web:20][web:145]
- **Ki Power** – potenza delle tecniche energetiche, controllo e costo.[web:20]
- **Max Ki** – massimo serbatoio di Ki.[web:20]
- **Running speed / Flying speed** – velocità di movimento e volo.[web:20]

### 1.3 Stamina in DBC

La stamina è fondamentale:[web:20][web:145]

- **Consumo Stamina** quando:
  - Si blocca un attacco.
  - Si attacca fisicamente.
  - Si usa il Ki (alcune azioni).
  - Si corre e si vola.[web:145]

- **Rigenerazione Stamina**:
  - Col tempo.
  - In base a Body / altri parametri.
  - In condizioni di riposo o fuori combattimento.[web:145]

- **Stamina a 0**:
  - Non si può più bloccare.
  - Gli attacchi tornano “vanilla” (niente danno boost).[web:20]

---

## 2. Razze e Classi in DBC

### 2.1 Razze esistenti

Da wiki JinGames e Fandom:[web:3][web:149][web:151]

- **Human**
  - Buona stamina e Ki.
  - Attacchi fisici relativamente più deboli.
  - Alcune trasformazioni “umane”.

- **Saiyan**
  - Danno fisico alto.
  - Stamina più bassa, difesa non eccezionale.
  - Ampio set di trasformazioni (SSJ1..SSJ3, God, Blue, etc.).

- **Half-Saiyan**
  - Ibrido fra Human e Saiyan.

- **Namekian**
  - Forte sul Ki, fisico più debole.
  - Forme giganti e rigenerazione.

- **Arcosian (Frieza Race)**
  - Alta difesa e velocità, attacco medio.

- **Majin**
  - Tank, rigenerazione elevata, difesa buona.

Ogni razza ha:
- Stat base iniziali.
- Modificatori alle statistiche derivate (Melee, Defense, Body, Stamina, Ki, ecc.).[web:20]

### 2.2 Classi

Tre classi base del personaggio:[web:148]

- **Warrior** – focus fisico, più STR/CON.
- **Spiritualist** – focus energetico, più Ki/Willpower.
- **Martial Artist** – bilanciato.

Classe + Razza + Stats + Forme determinano la build finale.

---

## 3. Repository di Sorgente Decompilato

L’utente ha già decompilato DBC, JRMCore e JBRA.

- Repo decompilata DBC:  
  `https://github.com/jojogamerCt/dbc-decompiled-1.4.85`

Questa repo contiene:
- `JRMCore/` – codice Java della libreria core JinRyuu.
- `DragonBlockC/` – codice Java della mod DBC.
- `JBRA/` – codice client‐side (rendering, animazioni).

L’altra IA **può e deve** leggere questi file per:

1. Capire come sono implementate:
   - Razze (array/enum, ID).
   - Calcolo delle stats.
   - Calcolo di stamina.
   - GUI di selezione razza.

2. Individuare le chiavi NBT esatte:
   - `jrmcRace`, `jrmcClass`, `jrmcStr` / `jrmcSTR`, ecc.

---

## 4. Obiettivo della Side Mod

Scopo principale (richiesto dall’utente):

- Aggiungere una nuova razza **Android** al roster DBC.
- “Android” è **una variante della razza umana**, quindi:
  - concettualmente parte da Human,
  - ma con modifiche specifiche su stamina, attacco, difesa.

**Caratteristiche desiderate per Android:**

- **Stamina infinita (o praticamente infinita)**:
  - Non consuma stamina, oppure
  - Consumo estremamente ridotto + rigenerazione elevata → in pratica non si svuota.

- **Attacco più basso di Human**:
  - Esempio: −20% di danno melee rispetto a Human con stessi stats.

- **Difesa/Body più bassi di Human**:
  - Esempio: −10–15% Defense/Body.

- Ki / Max Ki / Ki Power possono rimanere uguali a Human.

---

## 5. Design Dettagliato della Razza “Android”

### 5.1 Filosofia

- **Android** = “Human modificato”:
  - Origine umana, ma corpo meccanico/ibrido.
  - Non si stanca → stamina elevatissima.
  - Ma non raggiunge la stessa “potenza organica” in termini di forza grezza e resistenza → penalità a Melee e Defense/Body.

### 5.2 Proposta di Bilanciamento Numerico

Rispetto a **Human** (che consideriamo baseline 1.0):

- **Melee Damage**:
  - Human: 1.0
  - Android: 0.8  (−20%)

- **Defense / Body**:
  - Human: 1.0
  - Android: 0.9 (−10%) o 0.85 (−15%) a seconda di quanto lo si vuole penalizzare.

- **Stamina Cost**:
  - Human: 1.0
  - Android: 0.05 (−95%) → stamina praticamente infinita.

Questi fattori vanno inseriti dove il codice DBC calcola:

- Danno finale melee (funzione che combina STR, razza, classe, forma).
- Difesa / Body.
- Costo stamina per azione.

---

## 6. Analisi da Fare sul Codice DBC (per l’Altra IA)

L’altra IA deve aprire la repo `dbc-decompiled-1.4.85` e cercare:

### 6.1 Razze

- File probabili:  
  `JRMCore/JinRyuu/JRMCore/JRMCoreH.java`  
  `JRMCore/JinRyuu/JRMCore/JRMCoreConfig.java`  
  e altri con “Race” nel nome.

- Cerca:
  - Array con nomi delle razze (ad es. `jrRaceNames`).
  - Costanti `int` usate per gli ID (RACE_HUMAN, etc.).
  - Lettura/scrittura di `jrmcRace` in NBT.

Esempio tipico (solo illustrativo, NON reale):

```java
public static final String[] jrRaceNames = {
    "Human", "Saiyan", "Half-Saiyan", "Namekian", "Arcosian", "Majin"
};
```

### 6.2 Calcolo statistiche con razza

Cercare in JRMCore / DBC:

- Metodi che usano `race` o `jrmcRace` per modificare stats:
  - `calcMeleeDamage(…)`
  - `getDefense(…)`
  - `getBody(…)`
  - `getBP(…)` / `calcBattlePower(…)`

Blocchi `switch (race)` con commenti tipo `// Human`, `// Saiyan`, ecc.

Esempio generico:

```java
switch (race) {
    case 0: // Human
        melee = baseMelee * 1.0F;
        defense = baseDef * 1.0F;
        break;
    case 1: // Saiyan
        melee = baseMelee * 1.2F;
        defense = baseDef * 0.9F;
        break;
    ...
}
```

### 6.3 Stamina

Cercare:

- Metodi dove si calcola / consuma / rigenera la stamina.
- Collegamenti a:
  - attacco fisico,
  - blocco,
  - volo,
  - corsa.

Es: `staminaUse`, `actionTime`, `staminaDrain`, `staminaRegen`.

Lì va inserita la logica “se razza == Android → costo stamina ≈ 0”.

### 6.4 GUI di selezione razza

File probabili in DBC o JRMCore:

- `JRMCoreGuiRace.java`, `GuiRaceSelect`, `GuiDBCRace`, ecc.

Cercare:

- Liste di razze per la GUI:
  - Array di stringhe.
  - Cicli `for` che creano pulsanti.
  - Switch / if per gli ID.

Qui sarà necessario:

- Aggiungere Android come voce di selezione.
- Associare il nuovo ID di razza.

---

## 7. Strategia di Implementazione (per l’Altra IA)

Esistono due strade:

### 7.1 Patch Diretta del Fork Decompilato

Se il repo decompilato è inteso come fork compilabile:

1. **Aggiungere Android alla definizione di razze:**

   - Modificare l’array di nomi razza (p.es. `jrRaceNames`) aggiungendo `"Android"`.
   - Definire una costante `public static final int RACE_ANDROID = X;` (X nuovo ID).

2. **Agganciare i modificatori di Android:**

   - Nei metodi di calcolo danni/difesa/Body:

     ```java
     case RACE_ANDROID:
         melee *= 0.8F;
         defense *= 0.9F;
         body *= 0.9F;
         break;
     ```

   - Nei metodi di stamina:

     ```java
     if (race == RACE_ANDROID) {
         staminaCost *= 0.05F;
     }
     ```

3. **Aggiornare GUI di selezione razza:**

   - Aggiungere una voce “Android” nelle liste.
   - Collegare pulsante/ID.

4. **Testing**:
   - Creare PG Android.
   - Verificare che:
     - Appare nel menu razze.
     - Le stats risultanti siano coerenti.
     - La stamina non si svuota praticamente mai.
     - Attacco/difesa risultino più bassi di Human.

### 7.2 Side Mod Esterno (hook via eventi e NBT)

Se invece si vuole mantenere i JAR di DBC originali intatti:

1. **Creare una nuova mod Forge**, con:
   - `@Mod(dependencies = "required-after:jinryuujrmcore;required-after:jinryuudragonblockc")`
   - Compat layer che:
     - Verifica che le classi JRMCore/DBC siano presenti (reflection).
     - Legge/scrive `jrmcRace` via NBT.

2. **ID extra per Android**:
   - Scegliere un ID (es. 6) e interpretarlo come Android nella side mod.
   - DBC di base vedrà solo un numero extra → la mod deve compensare.

3. **Hook sugli eventi**:
   - `LivingHurtEvent` / `LivingAttackEvent`:
     - Se attacker è Android: ridurre danno finale (`×0.8`).
     - Se defender è Android: ridurre difesa/body (`×0.9`) se la difesa è calcolata in side mod.
   - `PlayerTickEvent`:
     - Se race = Android: ripristinare stamina a valori alti, o annullare il consumo.

4. **GUI/Selezione razza**:
   - Più complicato: il menu originale non conosce Android.
   - Si può:
     - Inserire un sistema alternativo (es. comando o GUI custom) per settare `jrmcRace` a Android.
     - Oppure patchare via ASM/bytecode la GUI originale (complesso).

Questa strada è più complessa, ed è consigliabile modificare direttamente il fork decompilato se l’utente lo consente.

---

## 8. Vincoli e Buone Pratiche

- Non cambiare massicciamente il formato NBT di DBC.
- Non modificare la logica di gioco di altre razze (Saiyan, Namekian, etc.) se non necessario.
- Commentare chiaramente ogni **patch Android**:
  - `// ANDROID RACE BEGIN` / `// ANDROID RACE END`.
- Mantenere compatibilità con DBC 1.4.85 e JRMCore 1.3.51.

---

## 9. Cosa si Aspetta l’Utente dalla Prossima IA

1. Usare questo documento come **contesto globale** di game design e architettura.
2. Leggere il repository `dbc-decompiled-1.4.85`.
3. Trovare i punti concreti nel codice dove:
   - Sono definite le razze.
   - Si calcolano le stats in base alla razza.
   - Si calcola e consuma la stamina.
   - È realizzata la GUI di selezione razza.
4. Proporre e scrivere **patch di codice Java reali**, pronte da incollare, che:
   - Definiscano la razza Android (nome, ID).
   - Implementino i modificatori (stamina infinita, -atk/-def).
   - Aggiornino la GUI di selezione per includere Android.
5. Spiegare passo passo:
   - In quali file si mette cosa.
   - Come ricompilare il mod o la side mod.
   - Eventuali problemi/edge cases (es. missioni che non gestiscono la nuova razza).

---

## 10. Riassunto Breve (per l’altra IA)

- **Mod**: Dragon Block C 1.4.85, con sorgente decompilato in `dbc-decompiled-1.4.85`.
- **Task**: Aggiungere razza **Android**:
  - Stamina infinita (o quasi).
  - Attacco e difesa inferiori a Human.
  - Android = Human modificato.
- **Serve**:
  - Modifica della definizione di razze (array/enum, ID).
  - Modifica delle funzioni di calcolo stats + stamina.
  - Aggiornamento della GUI di selezione razza.
- **Vincolo**:
  - Usare nomi/metodi/campi così come emergono dal sorgente decompilato, senza inventare API.