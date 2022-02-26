import java.util.Scanner;

public class App3 {  /*Nhập vào 1 số nguyên dương, kiểm tra xem nó có phải nguyên tố không ? (số nguyên tố sẽ không chia hết cho tất cả các số từ 2 đến số tự nhiên đi trước số đó).*/
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println( " la so nguyen to");
        } else {
            System.out.println( " khong phai la so nguyen to");
        }
    }
  
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
