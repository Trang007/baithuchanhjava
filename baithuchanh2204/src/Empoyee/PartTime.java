package Empoyee;

import java.util.Scanner;

public class PartTime extends Employee {
    String run;
    public PartTime() {
        Loainv = "Nhan vien thoi vu";
    }
    
    public void nhapXE(){
        System.out.println("Di xe may");
        Scanner sc = new Scanner(System.in);
        run = sc.nextLine();
    }
    public void inXE(){
        System.out.println("Xe :" + run);
    }
    
}
