import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
    String chuoi;
    int soKyTuInHoa = 0, soKyTuInThuong = 0, soChuSo = 0;
    Scanner scanner = new Scanner(System.in);
         
    // nếu độ dài chuỗi nhập vào còn lớn hơn 80 thì phải nhập lại
    do {
        System.out.print("Nhap vao chuoi bat ky: ");
        chuoi = scanner.nextLine();
    } while (chuoi.length() > 80);
         
    // đếm và in ra số lần xuất hiện của ký tự đó trong chuỗi
    // duyệt từ đầu đến cuối chuỗi
    // nếu có ký tự nào tại vị trí i bằng với ký tự ch thì tăng biến count lên 1
    for (int i = 0; i < chuoi.length(); i++) {
        // hàm isUpperCase() là hàm dùng để kiểm tra ký tự tại vị trí i
        // có phải là ký tự in hoa hay không.
        if (Character.isUpperCase(chuoi.charAt(i))) {
            soKyTuInHoa++;
        } 
             
        // hàm isLowerCase() là hàm dùng để kiểm tra ký tự tại vị trí i
        // có phải là ký tự in thường hay không.
        if (Character.isLowerCase(chuoi.charAt(i))) {
            soKyTuInThuong++;
        } 
             
        // hàm isDigit() là hàm dùng để kiểm tra ký tự tại vị trí i
        // có phải là số hay không.
        if (Character.isDigit(chuoi.charAt(i))) {
            soChuSo++;
        }
    }
         
    System.out.println("Trong chuoi " + chuoi +
        " co " + soKyTuInHoa + " ky tu in hoa," +
        " co " + soKyTuInThuong + " ky tu in thuong" +
        " va co " + soChuSo + " so." );
    }       
             
    
}
