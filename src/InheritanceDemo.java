/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

class Vehicle {
    
    private String brand;
    private int year;
    
    // Protected field - accessible by subclasses
    protected String color;
    
    // Public field - accessible everywhere
    public String type;
    
    // Constructor of superclass
    public Vehicle(String brand, int year, String color, String type) {
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.type = type;
        System.out.println("Vehicle constructor called");
    }
    
    // Public getter methods for private fields
    public String getBrand() {
        return brand;
    }
    
    public int getYear() {
        return year;
    }
    
    // Method that can be overridden
    public void start() {
        System.out.println("Vehicle is starting...");
    }
    
    // Method that can be overridden
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Color: " + color);
    }
    
    // Final method - cannot be overridden 
    public final void showWarranty() {
        System.out.println("This vehicle has a standard warranty");
    }
    
    // Static method - cannot be overridden 
    public static void getVehicleCategory() {
        System.out.println("This is a general vehicle");
    }
    
    // Private method - cannot be overridden 
    private void internalMaintenance() {
        System.out.println("Internal maintenance performed");
    }
    
    // Protected method that subclasses can access
    protected void performMaintenance() {
        System.out.println("Performing basic vehicle maintenance");
        internalMaintenance(); // Calling private method within same class
    }
}


class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;
    
    // Constructor calling superclass constructor 
    public Car(String brand, int year, String color, int numberOfDoors, String fuelType) {
        super(brand, year, color, "Car"); // Calling superclass constructor
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
        System.out.println("Car constructor called");
    }
    
    // Method overriding (Point 3: Override methods from superclass)
    @Override
    public void start() {
        System.out.println("Car engine is starting with a smooth purr...");
    }
    
    // Method overriding with additional functionality
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling superclass method (Point 5)
        System.out.println("Doors: " + numberOfDoors + ", Fuel: " + fuelType);
    }
    
    // Car-specific method
    public void honk() {
        System.out.println("Beep beep!");
    }
    
    // Accessing protected method from superclass (Point 5)
    public void carMaintenance() {
        super.performMaintenance(); // Accessing superclass method
        System.out.println("Checking car-specific components");
    }
    
    // Getters for private fields
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    
    public String getFuelType() {
        return fuelType;
    }
}


class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private int engineCapacity;
    
    // Constructor calling superclass constructor 
    public Motorcycle(String brand, int year, String color, boolean hasSidecar, int engineCapacity) {
        super(brand, year, color, "Motorcycle"); // Calling superclass constructor
        this.hasSidecar = hasSidecar;
        this.engineCapacity = engineCapacity;
        System.out.println("Motorcycle constructor called");
    }
    
    // Method overriding (Point 3)
    @Override
    public void start() {
        System.out.println("Motorcycle engine roars to life!");
    }
    
    // Method overriding with super call (Point 5)
    @Override
    public void displayInfo() {
        super.displayInfo(); // Accessing superclass method
        System.out.println("Sidecar: " + (hasSidecar ? "Yes" : "No") + 
                         ", Engine: " + engineCapacity + "cc");
    }
    
    // Motorcycle-specific method
    public void wheelie() {
        if (engineCapacity > 600) {
            System.out.println("Performing an awesome wheelie!");
        } else {
            System.out.println("Engine too small for wheelie");
        }
    }
    
    // Static method in subclass - this doesn't override superclass static method
    public static void getVehicleCategory() {
        System.out.println("This is a motorcycle - two wheels of freedom!");
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== JAVA INHERITANCE DEMONSTRATION ===\n");
        
        // Creating objects and calling constructors
        System.out.println("1. CREATING OBJECTS (Constructor calls):");
        System.out.println("Creating a Car...");
        Car myCar = new Car("Toyota", 2023, "Red", 4, "Gasoline");
        
        System.out.println("\nCreating a Motorcycle...");
        Motorcycle myBike = new Motorcycle("Harley", 2022, "Black", false, 1200);
        
        System.out.println("\n" + "=".repeat(50));
        
        // Demonstrating method overriding
        System.out.println("\n2. METHOD OVERRIDING:");
        System.out.println("Car starting:");
        myCar.start();
        
        System.out.println("Motorcycle starting:");
        myBike.start();
        
        System.out.println("\n" + "=".repeat(50));
        
        // Demonstrating accessing superclass methods
        System.out.println("\n3. ACCESSING SUPERCLASS METHODS:");
        System.out.println("Car info (calls super.displayInfo()):");
        myCar.displayInfo();
        
        System.out.println("\nMotorcycle info (calls super.displayInfo()):");
        myBike.displayInfo();
        
        System.out.println("\n" + "=".repeat(50));
        
        // Demonstrating information hiding and access modifiers
        System.out.println("\n4. INFORMATION HIDING & ACCESS MODIFIERS:");
        System.out.println("Accessing public field - Car type: " + myCar.type);
        System.out.println("Accessing private field via getter - Car brand: " + myCar.getBrand());
        
        // This would cause compilation error (private field):
        // System.out.println(myCar.brand); // Cannot access private field
        
        System.out.println("\n" + "=".repeat(50));
        
        // Demonstrating methods that cannot be overridden
        System.out.println("\n5. METHODS THAT CANNOT BE OVERRIDDEN:");
        
        System.out.println("Final method (same for all objects):");
        myCar.showWarranty();
        myBike.showWarranty();
        
        System.out.println("\nStatic methods (class-specific, not overridden):");
        Vehicle.getVehicleCategory();
        Motorcycle.getVehicleCategory(); // Different method, not overridden
        
        System.out.println("\n" + "=".repeat(50));
        
        // Demonstrating protected method access
        System.out.println("\n6. PROTECTED METHOD ACCESS:");
        myCar.carMaintenance(); // Accesses protected method from superclass
        
        System.out.println("\n" + "=".repeat(50));
        
        // Demonstrating subclass-specific methods
        System.out.println("\n7. SUBCLASS-SPECIFIC METHODS:");
        myCar.honk();
        myBike.wheelie();
        
        System.out.println("\n=== INHERITANCE DEMONSTRATION COMPLETE ===");
    }
}
