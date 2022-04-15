package app77;

public class Cofigs {
    public static final int SO_LUONG_HINH_TOI_THIEU = 0;
    public static final int SO_LUONG_HINH_TOI_DA = 5;

    public static final float PI = 3.14f;
    public static final float INCH_CM = 2.54f;
    public static final float DON_VI_CM = 1;
    public static final float DON_VI_ICM = 2;
    public static float donvi= DON_VI_CM;

    public static float ChuyenCentimetSangInch(float cm){
        float inch = cm / INCH_CM;
        return cm;
    }
}
