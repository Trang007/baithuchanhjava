package app75;

import java.util.Scanner;

public class hinhtron extends hinhhoc {
    public hinhtron(){
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
    private final float PI = 3.14f;
    public float bankinh;
    public float chuvi;
    private float dientich;
    public void nhapbankinh(){
        System.out.println("Ban kinh = ");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();
    }
    public void tinhchuvi(){
        setChuvi(2 * PI * bankinh);
    }
    public void tinhdientich(){
        dientich = PI * bankinh * bankinh;
    }
}
