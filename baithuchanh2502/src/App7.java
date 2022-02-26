import java.util.Scanner;

public class App7 {    /*Nhập vào các số thực cho đến khi gặp 0, đưa ra giá trị lớn nhất trong các số vừa nhập.*/

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);		
        float n,max=0;
        do 
        {
            System.out.print("nhap vao so thuc: ");
            n=sc.nextFloat();
            if(n>max)
            {
                max=n;
            }
        }
        while(n!=0);
        System.out.println("so lon nhat trong cac so vua nhap la: "+max);

    
}

    }
    
