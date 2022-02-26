import java.util.Scanner;
/*Nhập vào 1 số nguyên dương, hãy cho biết số đó có bao nhiêu chữ số. */
public class App10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao 1 so nguyen duong : ");
        int n;
        do{
            n= sc.nextInt();
        }while(n<0);
        int dem=0;
         while(n>=10)
         {
             n/=10;
             dem++;
            }
        System.out.println("So vua nhap co "+(dem+1)+" chu so");
        
        
    }
}
