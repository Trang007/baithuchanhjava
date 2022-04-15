import app71.Hinhtron;

public class main71 {
    public static void main(String[]agrs){
        Hinhtron hinhtron = new Hinhtron();
        hinhtron.setbankinh(10);
        float chuvi = hinhtron.tinhchuvi();
        float dientich = hinhtron.tinhdientich();
        System.out.println("Chu vi hinh tron: " + chuvi + "; Va dien tich: " + dientich);
    }
}
