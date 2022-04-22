package Student;

import java.util.Scanner;

public class OfflineSt extends Student {
    public String trangthai;

    public OfflineSt() {
        Loaisv = "Sinh vien hoc offline";
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
