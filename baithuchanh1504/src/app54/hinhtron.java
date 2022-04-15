package app54;
import java.util.Scanner;

public class hinhtron extends hinhhoc {
    private static final float PI = 3.14f;
    public float bankinh;
    private String ten;
    private float chuvi;
    public hinhtron() {
        ten = "Hinh tron";
    }
    public void nhapbankinh(){
        System.out.println("Ban kinh = ");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2 * PI * bankinh;
    }
    public void tinhdientich(float dientich){
        dientich = PI * bankinh * bankinh;
    }
}
