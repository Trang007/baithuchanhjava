import java.util.ArrayList;
import java.util.ListIterator;

public class App19 {
    public static void main(String[] args){
        ArrayList<Character> arrListChar = new ArrayList<>();
        arrListChar.add('e');
        arrListChar.add('a');
        arrListChar.add('c');
        ListIterator<Character> listIterator = arrListChar.listIterator();
        System.out.println("cac phan tu co trong arrListChar la : ");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next()+ "\t");
        }
    }
}
