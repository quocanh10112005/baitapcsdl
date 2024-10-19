public class Vehicle {
    private String owner;
    private String vehicleType;
    private int engineCapacity;
    private double price;

    // Constructor
    public Vehicle(String owner, String vehicleType, int engineCapacity, double price) {
        this.owner = owner;
        this.vehicleType = vehicleType;
        this.engineCapacity = engineCapacity;
        this.price = price;
    }

    // Getter và Setter cho từng thuộc tính
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Phương thức tính thuế dựa trên dung tích xy-lanh
    public double calculateTax() {
        if (engineCapacity < 100) {
            return price * 0.01;  // 1% giá trị xe
        } else if (engineCapacity >= 100 && engineCapacity <= 200) {
            return price * 0.03;  // 3% giá trị xe
        } else {
            return price * 0.05;  // 5% giá trị xe
        }
    }

    // Phương thức hiển thị thông tin xe
    public void displayInfo() {
        double tax = calculateTax();
        System.out.printf("%-20s %-15s %-10d %-15.2f %-15.2f\n", owner, vehicleType, engineCapacity, price, tax);
    }
}