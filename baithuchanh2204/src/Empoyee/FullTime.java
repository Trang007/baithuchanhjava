package Empoyee;

import java.util.Scanner;

public class FullTime extends Employee{
    int luong;
    public void fullTime(){
        Loainv = "Nhan vien full thoi gian";
    }
    public void nhapLuong() {
        System.out.println("Nhap luong: ");
        Scanner sc = new Scanner(System.in);
        luong = sc.nextInt();
    }

    public void inLuong() {
        System.out.println("Luong: " + luong);
    }
}
