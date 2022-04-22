package Student;

import java.util.Scanner;

import Person.Personnew;

public class Student extends Personnew {

    public String Loaisv;
      
    public void inLoaisv() {
        System.out.println("Loai sinh vien :");
    }

        public void nhap() {
            System.out.print("Nhap ho va ten: ");
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            System.out.print("Nhap tuoi ");
            age = sc.nextInt();
            System.out.println("Nhap dia chi :");
            address = sc.nextLine();
        }
    }
    
    

