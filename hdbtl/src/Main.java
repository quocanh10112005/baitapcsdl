import java.io.File;
public class ViDuFile {
    public static void main(String[] args) {
// Tạo đối tượng File
        File file = new File("C:/Users/TenNguoiDung/Documents/baitap.txt");
// Kiểm tra sự tồn tại của tệp tin
        if (file.exists()) {
            System.out.println("Tệp tin tồn tại.");
// Lấy thông tin về tệp tin
            System.out.println("Tên tệp tin: " + file.getName());
            System.out.println("Đường dẫn tuyệt đối: " + file.getAbsolutePath());
            System.out.println("Kích thước: " + file.length() + " byte");
        } else {
            System.out.println("Tệp tin không tồn tại.");
        }
    }