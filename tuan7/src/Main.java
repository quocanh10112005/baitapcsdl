public class Main{
    public static void main(String[]args) {
        class DiemSoKhongHopLeException extends Exception {
            public DiemSoKhongHopLeException(String message) {
                super(message);
            }
        }
        public void kiemTraDiemSo ( int diem) throws DiemSoKhongHopLeException {
            if (diem < 0 || diem > 10) {
                throw new DiemSoKhongHopLeException("Điểm số phải nằm trong khoảng từ 0 đến 10.");
            }
// ... (xử lý điểm số nếu hợp lệ)
        }
        try {
            kiemTraDiemSo(12); // Cố tình nhập điểm số không hợp lệ
        } catch (DiemSoKhongHopLeException e) {
            System.out.println(e.getMessage()); // In ra thông báo lỗi cụ thể
        }
    }