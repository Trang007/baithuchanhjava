import java.util.Iterator;
import java.util.ArrayList;

public class App18 {
    public static void main(String[] args) {
        ArrayList<Float> arrListFloat = new ArrayList<>();
        arrListFloat.add(0.7f);
        arrListFloat.add(7.26f);
        arrListFloat.add(1.02f);
        Iterator<Float> iterator = arrListFloat.iterator();
        System.out.println("Cac phan tu co trong arrListFloat la: "
        );
        while (iterator.hasNext()){
            System.out.println(iterator.next()+"\t");
        }

    }
}
