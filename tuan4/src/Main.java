import java.util.Scanner;

class Vehicle {
    private String name;
    private double value;
    private int engineCapacity;

    // Constructor
    public Vehicle(String name, double value, int engineCapacity) {
        this.name = name;
        this.value = value;
        this.engineCapacity = engineCapacity;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    // Method to calculate tax based on engine capacity
    public double calculateTax() {
        if (engineCapacity < 100) {
            return value * 0.01; // 1% of value
        } else if (engineCapacity <= 200) {
            return value * 0.03; // 3% of value
        } else {
            return value * 0.05; // 5% of value
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle xe1 = null, xe2 = null, xe3 = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input vehicle information and create xe1, xe2, xe3");
            System.out.println("2. Print tax for each vehicle");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Input vehicle information
                    xe1 = inputVehicle(scanner, "xe1");
                    xe2 = inputVehicle(scanner, "xe2");
                    xe3 = inputVehicle(scanner, "xe3");
                    break;
                case 2:
                    // Output the tax information
                    if (xe1 != null && xe2 != null && xe3 != null) {
                        printTax(xe1);
                        printTax(xe2);
                        printTax(xe3);
                    } else {
                        System.out.println("Please enter vehicle information first.");
                    }
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to input vehicle details
    private static Vehicle inputVehicle(Scanner scanner, String vehicleName) {
        System.out.println("Enter information for " + vehicleName + ":");
        System.out.print("Enter vehicle name: ");
        String name = scanner.next();
        System.out.print("Enter vehicle value: ");
        double value = scanner.nextDouble();
        System.out.print("Enter engine capacity (cc): ");
        int engineCapacity = scanner.nextInt();
        return new Vehicle(name, value, engineCapacity);
    }

    // Method to print the tax for a vehicle
    private static void printTax(Vehicle vehicle) {
        System.out.println("Vehicle: " + vehicle.getName() + ", Tax: " + vehicle.calculateTax());
    }
}
