import java.util.ArrayList;

public class App17 {
    public static void main(String[]args){
        ArrayList<Integer> arrListInteger = new ArrayList<>();
    
        arrListInteger.add(0);
        arrListInteger.add(7);
        arrListInteger.add(1);
        arrListInteger.add(9);
        System.out.println("Cac phan tu cos trong arrListInterget la:");
        for(int number : arrListInteger){
            System.out.println(number + "\t");
        }
        arrListInteger.set(2, null);
        arrListInteger.remove(4);
        for(int i = 0; i < arrListInteger.size(); i++){
            System.out.println(arrListInteger.get(i) + "\t");
        }
}
}

