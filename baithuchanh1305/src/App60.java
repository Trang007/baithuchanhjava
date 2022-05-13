import java.util.Set;
import java.util.LinkedHashSet;

public class App60 {
    public static void main(String[] args) {
        Set<String> app2 = new LinkedHashSet<String>();
        app2.add("Java");
        app2.add("C++");
        app2.add("JAva");
        for (String str : app2) {
            System.out.println(str);
        }
    }
}
