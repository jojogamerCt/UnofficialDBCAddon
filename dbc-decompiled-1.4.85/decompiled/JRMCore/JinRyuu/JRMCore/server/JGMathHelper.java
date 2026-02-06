/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
package JinRyuu.JRMCore.server;

import net.minecraft.entity.Entity;

public class JGMathHelper {
    public static double StringMethod(String method, double n1, double n2) {
        if (method.equals("+")) {
            n1 += n2;
        } else if (method.equals("-")) {
            n1 -= n2;
        } else if (method.equals("*")) {
            n1 *= n2;
        } else if (method.equals("/")) {
            n1 /= n2;
        } else if (method.equals("%")) {
            n1 %= n2;
        }
        return n1;
    }

    public static long StringMethod(String method, long n1, long n2) {
        if (method.equals("+")) {
            n1 += n2;
        } else if (method.equals("-")) {
            n1 -= n2;
        } else if (method.equals("*")) {
            n1 *= n2;
        } else if (method.equals("/")) {
            n1 /= n2;
        } else if (method.equals("%")) {
            n1 %= n2;
        }
        return n1;
    }

    public static double doubleLimit(double value, double max) {
        boolean minus;
        boolean bl = minus = value < 0.0;
        if (minus) {
            value *= -1.0;
        }
        if (value > max) {
            value = max;
        }
        if (minus) {
            value *= -1.0;
        }
        return value;
    }

    public static boolean doubleHigherThan(double value, double min) {
        return value < 0.0 ? -value > min : value > min;
    }

    public static boolean doubleSmallerThan(double value, double min) {
        return value < 0.0 ? -value < min : value < min;
    }

    public static boolean isMotionSmallerThanN(Entity entity, double minMotion, boolean doX, boolean doY, boolean doZ, boolean methodOne) {
        double z;
        double y;
        double x;
        if (methodOne) {
            boolean canDoY;
            boolean canDoX;
            double x2 = entity.motionX;
            double y2 = entity.motionY;
            double z2 = entity.motionZ;
            boolean bl = doX ? x2 <= minMotion && x2 >= -minMotion : (canDoX = true);
            boolean bl2 = doY ? y2 <= minMotion && y2 >= -minMotion : (canDoY = true);
            boolean canDoZ = doZ ? z2 <= minMotion && z2 >= -minMotion : true;
            return canDoX && canDoY && canDoZ;
        }
        double motion = 0.0;
        double d = x = doX ? entity.motionX : 0.0;
        if (x < 0.0) {
            x *= -1.0;
        }
        double d2 = y = doY ? entity.motionY : 0.0;
        if (y < 0.0) {
            y *= -1.0;
        }
        double d3 = z = doZ ? entity.motionZ : 0.0;
        if (z < 0.0) {
            z *= -1.0;
        }
        return (motion += x + y + z) < minMotion;
    }

    public static boolean isMotionBiggerThanN(Entity entity, double minMotion, boolean doX, boolean doY, boolean doZ, boolean methodOne) {
        double z;
        double y;
        double x;
        if (methodOne) {
            boolean canDoY;
            boolean canDoX;
            double x2 = entity.motionX;
            double y2 = entity.motionY;
            double z2 = entity.motionZ;
            boolean bl = doX ? x2 >= minMotion && x2 <= -minMotion : (canDoX = false);
            boolean bl2 = doY ? y2 >= minMotion && y2 <= -minMotion : (canDoY = false);
            boolean canDoZ = doZ ? z2 >= minMotion && z2 <= -minMotion : false;
            return canDoX || canDoY || canDoZ;
        }
        double motion = 0.0;
        double d = x = doX ? entity.motionX : 0.0;
        if (x < 0.0) {
            x *= -1.0;
        }
        double d2 = y = doY ? entity.motionY : 0.0;
        if (y < 0.0) {
            y *= -1.0;
        }
        double d3 = z = doZ ? entity.motionZ : 0.0;
        if (z < 0.0) {
            z *= -1.0;
        }
        return (motion += x + y + z) > minMotion;
    }

    public static boolean isMotionSmallerThanN(Entity entity, double minMotion) {
        return JGMathHelper.isMotionSmallerThanN(entity, minMotion, true, true, true, true);
    }

    public static boolean isMotionBiggerThanN(Entity entity, double minMotion) {
        return JGMathHelper.isMotionBiggerThanN(entity, minMotion, true, true, true, true);
    }
}

