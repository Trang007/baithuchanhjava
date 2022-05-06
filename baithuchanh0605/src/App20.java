import java.util.ArrayList;

public class App20 {
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<String>(3);
        colors.add("A");
        colors.add("B");
        colors.add("C");
        colors.remove("B");
        colors.add("H");
        colors.add("Y");
        System.out.println(colors.get(1));
        System.out.println(colors.contains("B"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
}
