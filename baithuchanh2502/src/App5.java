import java.util.Scanner;

public class App5 {    /*Nhập vào 1 số nguyên dương , kiểm tra xem số đó có phải là số hòan thiện không?  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        System.out.print("Nhap so nguyen duong can kiem tra : ");
       
        n = sc.nextInt();
        
        for(int i=1 ; i<=n/2; i++){
            if(n % i == 0) 
              //tổng các ước số của a
              sum+= i;
         }
        if(sum==n) {
            System.out.println(n + " la so hoan thien" );
          }
        else {
            System.out.println(n + " khong phai so hoan thien");
          }
}

}
