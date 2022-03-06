import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        int number, temp = 1;
        long giaiThua = 1;
         
        Scanner scanner = new Scanner(System.in);
         
        do {
            System.out.print("Nhap vao 1 so bat ki: ");
            number = scanner.nextInt();
        }
        while ((number <= 0) || (number > 10));
         /*  gia tri con cua temp nho hon hoac bang number dung while */
        while (temp <= number) {
            giaiThua *= temp;
            temp++;
        }
        
        System.out.print(number + "! = " + giaiThua);
    }
    
}
