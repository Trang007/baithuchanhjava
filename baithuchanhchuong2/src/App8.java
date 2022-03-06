import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        
            int n, sum = 0, number;
            float avgNumber;
            Scanner scanner = new Scanner(System.in);
            System.out.print("nhap vao so cac so trong day so: ");
            n = scanner.nextInt();
            for (int count = 1; count <=n; count++) {
                System.out.print("Nhap vao so thu " + count + ": ");
                number = scanner.nextInt();
                sum += number;
            }
            avgNumber = (float) sum / n;
            System.out.print("Trung binh cong = " + sum/n );
        }
     
}
