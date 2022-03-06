import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        int age, year;
        String name, ageGroup;
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Nhap vao ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap vao nam sinh: ");
        year = scanner.nextInt();
         
        // Xác định độ tuổi tương ứng
        age = 2022 - year;
        if (age < 16) {
            ageGroup = "tuoi vi thanh nien.";
        } else if (age >= 16 || age < 18) {
            ageGroup = "tuoi truong thanh.";
        } else {
            ageGroup = "tuoi gia";
        }
         
        System.out.println("Ban " + name + " thuoc nhom " + ageGroup);
    }
}
