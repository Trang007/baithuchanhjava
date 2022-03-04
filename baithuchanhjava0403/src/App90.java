import java.util.Scanner;

public class App90 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi bat ky: ");
        chuoi = scanner.nextLine();
        System.out.println("Cac ki tu trong chuoi la: ");
          for (int i = 0; i < chuoi.length(); i++) {
          
              kyTu = chuoi.charAt(i);
              System.out.println(kyTu);
        }
    }
}
