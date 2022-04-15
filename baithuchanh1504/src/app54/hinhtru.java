package app54;
import java.util.Scanner;

public class hinhtru extends hinhtron{
    public float chieucao;
    private String ten;
    public hinhtru(){
        ten = "Hinh Tru";
    }
    public void nhapchieucao(){
        nhapbankinh();
        System.out.println("Chieu cao = ");
        Scanner sc = new Scanner(System.in);
        chieucao = sc.nextFloat();
    }
    public void tinhthetich(){
        extracted();
        thetich = dientich * chieucao;
    }
    private void extracted() {
        tinhdientich();
    }
}
