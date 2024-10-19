import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            // Nhập số thứ nhất
            System.out.print("Nhập số nguyên thứ nhất: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            // Nhập số thứ hai
            System.out.print("Nhập số nguyên thứ hai: ");
            int num2 = Integer.parseInt(scanner.nextLine());

          // Nhập toán tử
            System.out.print("Nhập toán tử (+, -, *, /): ");
            String operator = scanner.nextLine();

            // Thực hiện phép tính
            int result = calculator.calculate(num1, num2, operator);
            System.out.println("Kết quả: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Bạn phải nhập vào số nguyên!");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); // Đóng Scanner
        }
    }
}
