package app71;

public class Hinhtron {
    private final  float PI = 3.14f;
    private float bankinh;

    public float getbankinh(){
        return bankinh;
    }
    public  void setbankinh(float bankinh){
        this.bankinh = bankinh;
    }
    public  float tinhchuvi(){
        return 2 * PI * bankinh;
    }
    public float tinhdientich(){
        return PI * bankinh * bankinh;
    }
}
