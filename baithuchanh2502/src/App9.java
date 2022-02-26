import java.util.Scanner;
/*Nhập vào 1 số nguyên dương, in ra số theo thứ tự ngược lại.*/
public class App9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao 1 so nguyen duong : ");
        int n;
        do{
            n= sc.nextInt();
        }while(n<0);
        for(int i=n;i>=0;i--)
        {System.out.println(i+"\t");}
    }
}
