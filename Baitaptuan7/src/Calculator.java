class Calculator {

    // Phương thức thực hiện phép tính
    public int calculate(int num1, int num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Lỗi: Không thể chia cho 0!");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Lỗi: Toán tử không hợp lệ!");
        }
    }
}