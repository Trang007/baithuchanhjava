package main;

import Empoyee.FullTime;
import Empoyee.PartTime;

public class App2 {
    public static void main(String[] args) {
        PartTime pt = new PartTime();
        FullTime ft = new FullTime();

        pt.nhap();
        pt.nhapXE();
        ft.nhap();
        ft.nhapLuong();

        pt.xuatLoaiNV();
        pt.inHoten();
        pt.inage();
        pt.inXE();

        ft.xuatLoaiNV();
        ft.inHoten();
        ft.inage();
        ft.inLuong();
    }
}
