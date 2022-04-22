package main;

import Student.OfflineSt;
import Student.OnlineSt;

public class mainperson {
    public static void main(String[] args){
        OfflineSt st = new OfflineSt();
        st.nhap();
        st.nhapTrangThai();
        

        OnlineSt st2 = new OnlineSt();
        st2.nhap();
        st2.nhapTrangThai();
        

        st.xuatLoaisv();
        st.inHoten();
        st.inage();
        st.inTrangThai();

        st2.xuatLoaisv();
        st2.inHoten();
        st2.inage();
        st2.inTrangThai();
    }
    }


