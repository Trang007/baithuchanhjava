import java.util.Scanner;

public class App6 {   /*Nhập vào 1 số nguyên dương n, liệt kê các số hoàn thiện nhỏ hơn n*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.print("nhap vao 1 so nguyen duong : ");
		int n;
        do{ 
            n=sc.nextInt();
          }while(n<0);
		System.out.println("cac so hoan thien nho hon "+n+" la: ");
		for(int i=1;i<n;i++)
		{
			if(check(i))
			{
				System.out.print(i+"\t");
			}
    }
}
    public static boolean check(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(n==sum)
			return true;
		else
			return false;
	}
}