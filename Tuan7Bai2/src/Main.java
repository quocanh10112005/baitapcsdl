import java.util.Scanner;

// Tạo lớp ngoại lệ tùy chỉnh TuoiKhongHopLeException
class TuoiKhongHopLeException extends Exception {
    public TuoiKhongHopLeException(String message) {
        super(message);
    }
}

public class KiemTraTuoi {

    // Phương thức để kiểm tra tuổi và ném ngoại lệ nếu không hợp lệ
    public static void kiemTraTuoi(int tuoi) throws TuoiKhongHopLeException {
        if (tuoi < 18) {
            throw new TuoiKhongHopLeException("Tuổi phải lớn hơn hoặc bằng 18");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Yêu cầu người dùng nhập tuổi
            System.out.print("Nhập tuổi của bạn: ");
            int tuoi = scanner.nextInt();

            // Gọi phương thức kiểm tra tuổi
            kiemTraTuoi(tuoi);

            // Nếu tuổi hợp lệ
            System.out.println("Tuổi của bạn hợp lệ!");
        } catch (TuoiKhongHopLeException e) {
            // Bắt ngoại lệ và in thông báo lỗi
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}