package app75;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc {
    public hinhchunhat(){
        super();
    }
    public  float getChuvi() {
        return chuvi;
    }
    public void setChuvi(float chuvi) {
        this.chuvi = chuvi;
    }
    public  float getDientich() {
        return dientich;
    }
    public void setDientich(float dientich) {
        this.dientich = dientich;
    }
    public float dai;
    public float rong;
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
