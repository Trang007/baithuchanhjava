package app54;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc {
    public float dai;
    public float rong;
    private String ten;
    public hinhchunhat(){
        ten = "Hinh chu nhat";
    }
    public void nhapChieudai(){
        System.out.println("Chieu dai: ");
        Scanner sc = new Scanner(System.in);
        dai =sc.nextFloat();
    }
    public void nhapChieurong(){
        System.out.println("Chieu rong: ");
        Scanner sc = new Scanner(System.in);
        rong =sc.nextFloat();
    }
    public void tinhchuvi(){
        float chuvi = 2 * (dai + rong);
    }
    public void tinhdientich(){
        float dientich = dai *rong;
    }
}
