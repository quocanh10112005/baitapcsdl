import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Phương thức nhập thông tin xe từ người dùng
    public void inputVehicle() {
        System.out.print("Nhập tên chủ xe: ");
        String owner = scanner.nextLine();

        System.out.print("Nhập loại xe: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Nhập dung tích xy-lanh: ");
        int engineCapacity = scanner.nextInt();

        System.out.print("Nhập trị giá xe: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  // Clear buffer

        // Tạo đối tượng Vehicle và thêm vào danh sách
        Vehicle vehicle = new Vehicle(owner, vehicleType, engineCapacity, price);
        vehicles.add(vehicle);
    }

    // Phương thức xuất bảng kê khai tiền thuế của các xe
    public void displayVehicles() {
        System.out.printf("%-20s %-15s %-10s %-15s %-15s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
        System.out.println("--------------------------------------------------------------------------");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }

    // Phương thức hiển thị menu
    public void menu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Nhập thông tin và tạo các đối tượng xe.");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe.");
            System.out.println("3. Thoát.");

            System.out.print("Nhập lựa chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear buffer

            switch (choice) {
                case 1:
                    inputVehicle();
                    break;
                case 2:
                    if (vehicles.isEmpty()) {
                        System.out.println("Chưa có xe nào được nhập!");
                    } else {
                        displayVehicles();
                    }
                    break;
                case 3:
                    System.out.println("Chương trình kết thúc.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại!");
            }
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.menu();
    }
}