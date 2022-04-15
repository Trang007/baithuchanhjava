package app77;

import java.util.Scanner;

import app75.hinhhoc;

public class hinhtron extends hinhhoc {
    protected float bankinh;
    private Scanner scanner;
    
    public hinhtron(){
        super();
        scanner = new Scanner(System.in);
    }
    public void nhapbankinh(){
        System.out.println("Ban dung down vi tinh nao: ");
        System.out.println("\t1 = Centimet");
        System.out.println("\t2 = inch");
        Cofigs.donvi = scanner.nextInt();
        System.out.println("Hay nhap vao ban kinh hinh tron: ");
        bankinh = scanner.nextFloat();
    }
    public void inThongTin(){
        if (Cofigs.donvi == Cofigs.DON_VI_CM){
            System.out.println("Hinh tron co ban kinh: " + bankinh + "cm");
            System.out.println("Tuong duong " + hinhtron.ChuyenCentimetSangInch(bankinh) + "inch");
        }
        else {
            System.out.println("Hinh tron co ban kinh: " + bankinh + "inch");
            System.out.println("Tuong duong " + hinhtron.ChuyenCentimetSangInch(bankinh) + "cm"); 
        }
    }
    public static float ChuyenCentimetSangInch(float inch){
        float cm = inch * Cofigs.INCH_CM;
        return cm;
    }
    
}
