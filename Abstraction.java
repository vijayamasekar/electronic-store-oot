/*
 * ============================================================
 * Author         : [Your Name]
 * Roll Number    : [Your Roll No]
 * Subject        : Object Oriented Technology
 * Topic          : Abstraction
 * Description    : Demonstrating Abstraction using Product as
 *                  abstract parent. You cannot create generic
 *                  Product objects - only specific ones like
 *                  Laptop or Mobile.
 * ============================================================
 */

// ABSTRACT CLASS - You CANNOT create objects of this class directly!
// "abstract" keyword hides the complexity and forces children to implement details.
abstract class Product {
    int pId;
    String productName;
    String brand;
    double price;

    // Concrete method - shared by all children
    // No parameters, returns nothing
    void displayBasicInfo() {
        System.out.println("Product ID   : " + pId);
        System.out.println("Product Name : " + productName);
        System.out.println("Brand        : " + brand);
        System.out.println("Price        : Rs." + price);
    }

    // ABSTRACT METHOD - No body! Every child MUST write their own version.
    // This hides the implementation details from the parent.
    // No parameters, returns nothing
    abstract void displayDetails();
}

// CONCRETE CLASS - Laptop provides the body for abstract method
class Laptop extends Product {
    String processor;
    int ram;

    // Implementing the abstract method - Laptop's own version
    // No parameters, returns nothing
    @Override
    void displayDetails() {
        System.out.println("\n--- LAPTOP DETAILS ---");
        displayBasicInfo();  // Reusing parent's concrete method
        System.out.println("Processor : " + processor);
        System.out.println("RAM       : " + ram + " GB");
    }
}

// CONCRETE CLASS - Mobile provides the body for abstract method
class Mobile extends Product {
    int batteryCapacity;

    // Implementing the abstract method - Mobile's own version
    // No parameters, returns nothing
    @Override
    void displayDetails() {
        System.out.println("\n--- MOBILE DETAILS ---");
        displayBasicInfo();  // Reusing parent's concrete method
        System.out.println("Battery : " + batteryCapacity + " mAh");
    }
}

// MAIN CLASS - To test Abstraction
public class Abstraction {
    public static void main(String[] args) {
        System.out.println("========== ABSTRACTION DEMO ==========\n");
        System.out.println("Abstraction means: Hiding complex details");
        System.out.println("and showing only essential features.");
        System.out.println("You CANNOT create objects of abstract class!\n");

        // This would give ERROR:
        // Product p = new Product(); 
        // Because Product is abstract!

        // Creating Laptop object - this is allowed
        Laptop laptop = new Laptop();
        laptop.pId = 1001;
        laptop.productName = "Inspiron 15";
        laptop.brand = "Dell";
        laptop.price = 65000;
        laptop.processor = "Intel i5";
        laptop.ram = 16;

        // Creating Mobile object - this is allowed
        Mobile mobile = new Mobile();
        mobile.pId = 1002;
        mobile.productName = "Galaxy S24";
        mobile.brand = "Samsung";
        mobile.price = 80000;
        mobile.batteryCapacity = 5000;

        // Call the abstract method - each object knows its own version!
        laptop.displayDetails();
        mobile.displayDetails();

        System.out.println("\n========== ABSTRACTION DEMO END ==========");
    }
}