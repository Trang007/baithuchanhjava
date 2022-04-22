package Empoyee;

import java.util.Scanner;

import Person.Personnew;

public class Employee extends Personnew {
    public String Loainv;

    public void nhap() {
        System.out.println("Nhap ho ten: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
    }
    
    public void xuatLoaiNV() {
        System.out.println("\n\n==== " + Loainv + " ====");
    }
}
