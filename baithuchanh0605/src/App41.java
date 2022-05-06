import java.util.Scanner;
import java.util.LinkedList;
public class App41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("thang 1");
        linkedlist.add("thang 2");
        linkedlist.add("thang 3");
        linkedlist.add("thang 4");
        linkedlist.add("thang 5");
        linkedlist.add("thang 6");
        linkedlist.add("thang 7");
        linkedlist.add("thang 8");
        linkedlist.add("thang 9");
        linkedlist.add("thang 10");
        linkedlist.add("thang 11");
        linkedlist.add("thang 12");

        System.out.println("Nhap vao chi so cua phan tu can lay: ");
        int index = sc.nextInt();

        if((index < 0) || (index > (linkedlist.size() - 1)))
            System.out.println("Chi so can lay phai lon hon 0 va nho hon " + (linkedlist.size() - 1));
        else {
            String node = linkedlist.get(index);
            System.out.println("Phan tu co chi so = " + index + " trong LinkedList la " + node);
        }

        String firstNode = linkedlist.getFirst();

        String lastNode = linkedlist.getLast();

        System.out.println("\nPhan tu dau tien trong danh sach la " + firstNode + " ; Phan tu cuoi cung trong danh sach la " + lastNode);
        sc.close();
    }
}
