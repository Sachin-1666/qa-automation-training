package basics;

public class Car {
    // Attributes
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacture Year: " + year);
        System.out.println("-------------------------");
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);
        Car car3 = new Car("Tesla", "Model 3", 2023);

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}