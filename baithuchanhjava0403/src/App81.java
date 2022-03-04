import java.util.Scanner;

public class App81 {
    public static void main(String[] args) {
            int m, n;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap vao dong cua ma tran: ");
            m = scanner.nextInt();
            System.out.print("Nhap vao cot cua ma tran: ");
            n = scanner.nextInt();
            // khai báo ma trận A có m dòng, n cột
            int A[][] = new int[m][n];
            System.out.println("Nhap cac phan tu cua ma tran: ");
            for (int i = 0; i < m; i++) {
               for (int j = 0; j < n; j++) {
            System.out.print("A[" + i + "]["+ j + "]= ");
            A[i][j] = scanner.nextInt();  
            // tìm phần tử có giá trị lớn nhất trong ma trận
           // giả sử phần tử tại vị trí (0,0) là phần tử lớn nhất
           int max = A[0][0];
           for (int o = 0; o < m; o++) {
               for (int  e= 0; e < n; e++) 
               {

                  if (max < A[i][j]) 
                  {
                      max = A[i][j];
                    } 
                 }  
                }
            System.out.println("Phan tu lon nhat trong ma tran = " + max);
           
                       
               }
           }
	}    
}
