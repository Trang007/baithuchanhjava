import app54.hinhchunhat;
import app54.hinhtron;
import app54.hinhtru;
import app54.hinhvuong;

public class mainclass{


    public static void main(String[] args){
        hinhtron hinhtron = new hinhtron();
        hinhtron. xuatten();
        hinhtron. nhapbankinh();
        hinhtron .tinhchuvi();
        hinhtron.tinhdientich();
        hinhtron.inchuvi();
        hinhtron.indientich();

        hinhtru hinhtru = new hinhtru();
        hinhtru.xuatten();
        hinhtru.nhapchieucao();
        hinhtru.tinhthetich();
        hinhtru.inthetich();

        hinhchunhat hinhchunhat =new hinhchunhat();
        hinhchunhat.xuatten();
        hinhchunhat.nhapChieudai();
        hinhchunhat.nhapChieurong();
        hinhchunhat.tinhchuvi();
        hinhchunhat.tinhdientich();
        hinhchunhat.inchuvi();
        hinhchunhat.indientich();
        
        hinhvuong hinhvuong = new hinhvuong();
        hinhvuong.xuatten();
        hinhvuong.nhapcanh();
        hinhvuong.tinhchuvi();
        hinhvuong.tinhdientich();
        hinhvuong.inchuvi();
        hinhvuong.indientich();
    }


}
