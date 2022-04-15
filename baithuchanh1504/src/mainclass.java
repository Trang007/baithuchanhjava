import app54.hinhchunhat;
import app54.hinhtron;
import app54.hinhtru;
import app54.hinhvuong;

public class mainclass{


    public static void main(String[] args){
        Hinhtron.hinhtron = new hinhtron();
        Hinhtron.xuatten();
        Hinhtron.nhapbankinh();
        Hinhtron.tinhchuvi();
        Hinhtron.tinhdientich();
        Hinhtron.inchuvi();
        Hinhtron.indientich();

        Hinhtru.hinhtru = new hinhtru();
        Hinhtru.xuatten();
        Hinhtru.nhapchieucao();
        Hinhtru.tinhthetich();
        Hinhtru.inthetich();

        Hinhchunhat.hinhchunhat =new hinhchunhat();
        Hinhchunhat.xuatten();
        Hinhchunhat.nhapchieudai();
        Hinhchunhat.nhapchieurong();
        Hinhchunhat.tinhchuvi();
        Hinhchunhat.tinhdientich();
        Hinhchunhat.inchuvi();
        Hinhchunhat.indientich();
        
        Hinhvuong.hinhvuong = new hinhvuong();
        Hinhvuong.xuatten();
        Hinhvuong.nhapcanh();
        Hinhvuong.tinhchuvi();
        Hinhvuong.tinhdientich();
        Hinhvuong.inchuvi();
        Hinhvuong.indientich();
    }


}
