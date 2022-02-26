import java.util.Scanner;

public class App1 {       /*Viết chương trình nhập vào 2 số nguyên dương a và b từ bàn phím. Tìm ước chung lớn nhất của a,b.*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong a = ");
        int a = scanner.nextInt();
        System.out.print("Nhap so nguyen duong b = ");
        int b = scanner.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN cua " + a + " va " + b + " la: " + USCLN(a, b));
    }
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
}


