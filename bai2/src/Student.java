// Định nghĩa lớp SinhVien
class Student {
    // Các thuộc tính private
    private int Sudent code;
    private String full name;
    private float diemLT; //
    private float diemTH; //
    // Constructor mặc định
    public SinhVien() {
        this.maSinhVien = 0;
        this.hoTen = "";
        this.diemLT = 0.0f;
        this.diemTH = 0.0f;
    }

    // Constructor có tham số (khởi tạo với đầy đủ thông tin)
    public SinhVien(int maSinhVien, String hoTen, float diemLT, float diemTH) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    // Getter cho mã sinh viên
    public int getMaSinhVien() {
        return maSinhVien;
    }

    // Setter cho mã sinh viên
    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    // Getter cho họ tên
    public String getHoTen() {
        return hoTen;
    }

    // Setter cho họ tên
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    // Getter cho điểm LT
    public float getDiemLT() {
        return diemLT;
    }

    // Setter cho điểm LT
    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    // Getter cho điểm TH
    public float getDiemTH() {
        return diemTH;
    }

    // Setter cho điểm TH
    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    // Phương thức tính điểm trung bình
    public float tinhDiemTrungBinh() {
        return (diemLT + diemTH) / 2;
    }

    // Phương thức trả về chuỗi thông tin của sinh viên
    @Override
    public String toString() {
        return "Mã sinh viên: " + maSinhVien +
                ", Họ tên: " + hoTen +
                ", Điểm LT: " + diemLT +
                ", Điểm TH: " + diemTH +
                ", Điểm trung bình: " + tinhDiemTrungBinh();
    }
}