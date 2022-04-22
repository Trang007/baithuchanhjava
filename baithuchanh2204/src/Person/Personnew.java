package Person;

public class Personnew{
    protected String name;
    protected int age;
    protected String address;
    // Ham hien thi thong tin
    public void inHoten() {
        System.out.println("\tHo ten: " + getName());}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void inage(){
        System.out.println("\tTuoi: " + age);
    }
    public void inaddress(){

        System.out.println("\tDia chi: " + address);
    
    }

    
    
}

