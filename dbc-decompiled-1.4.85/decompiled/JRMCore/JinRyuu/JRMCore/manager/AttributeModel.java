/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelRenderer
 */
package JinRyuu.JRMCore.manager;

import JinRyuu.JRMCore.manager.AttributeArray;
import net.minecraft.client.model.ModelRenderer;

public class AttributeModel {
    public static byte X = 0;
    public static byte Y = 1;
    public static byte Z = (byte)2;
    public ModelRenderer model;
    public AttributeArray attributeArray;
    public boolean hasEnded;
    public byte value;

    public AttributeModel(ModelRenderer model, byte value, AttributeArray attributeArray) {
        this.model = model;
        this.value = value;
        this.attributeArray = attributeArray;
        this.hasEnded = false;
    }

    public void update(float age) {
        if (!this.hasEnded) {
            this.attributeArray.update(age);
            if (this.attributeArray.hasEnded) {
                this.hasEnded = true;
            }
        }
    }
}

