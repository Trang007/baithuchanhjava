package Student;

import java.util.Scanner;

public class OnlineSt extends Student {
    public String trangthai;

    public OnlineSt() {
        Loaisv = "Sinh vien hoc online";
    }

    public void nhapTrangThai() {
        System.out.println("Nhap trang thai: ");
        Scanner sc = new Scanner(System.in);
        trangthai = sc.nextLine();
    }

    public void inTrangThai() {
        System.out.println("Trang thai: " + trangthai);
    }

    public void xuatLoaisv() {
    }
    
}
