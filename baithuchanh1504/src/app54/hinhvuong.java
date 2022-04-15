package app54;
import java.util.Scanner;

public class hinhvuong extends hinhchunhat {
    private String ten;
    public hinhvuong(){
        ten = "Hinh vuong";
    }
    public void nhapcanh(){
        System.out.println("Canh = ");
        Scanner sc = new Scanner(System.in);
        dai = rong =sc.nextFloat();
    }
}
