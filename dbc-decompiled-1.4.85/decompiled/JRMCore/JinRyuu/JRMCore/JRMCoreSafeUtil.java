/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.World
 *  net.minecraft.world.storage.ISaveHandler
 *  net.minecraft.world.storage.SaveHandler
 */
package JinRyuu.JRMCore;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import net.minecraft.world.World;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.SaveHandler;

public class JRMCoreSafeUtil {
    public static BufferedReader getReader(File file) throws UnsupportedEncodingException, FileNotFoundException {
        return new BufferedReader(new InputStreamReader((InputStream)new FileInputStream(file), "UTF8"));
    }

    public static File getWorldSaveDir(World world) {
        ISaveHandler isavehandler = world.getSaveHandler();
        if (isavehandler instanceof SaveHandler) {
            return ((SaveHandler)isavehandler).getWorldDirectory();
        }
        return null;
    }

    public static BufferedWriter getWriter(File file) throws UnsupportedEncodingException, FileNotFoundException {
        return new BufferedWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(file), "UTF8"));
    }
}

