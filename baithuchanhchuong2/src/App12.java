import java.util.Scanner;

public class App12 {
    public static void main(String[] args) {
        int m, n;
         
    Scanner scanner = new Scanner(System.in);
         
    System.out.print("Nhap vao so dong cua ma tran: ");
    m = scanner.nextInt();
    System.out.print("Nhap vao so cot cua ma tran: ");
    n = scanner.nextInt();
         
    // khai báo ma trận A có m dòng, n cột
    int A[][] = new int[m][n];
         
    System.out.println("Nhap cac phan tu cho ma tran: ");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("A[" + i + "]["+ j + "] = ");
            A[i][j] = scanner.nextInt();
        }
    }
         
    // tìm phần tử có giá trị lớn nhất trong ma trận
    
    int max = A[0][0];
         
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (max < A[i][j]) {
                max = A[i][j];
            }
        }
    }
         
    System.out.print("phan tu co gia tri lon nhat trong ma tran = " + max);
    }
}
