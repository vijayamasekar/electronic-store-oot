// This is the Laptop class - stores info about laptop products
// It has all product details plus laptop-specific features like processor and RAM
public class Laptop {
    int pId;            // Unique Product ID
    String productName; // Name of the laptop
    String brand;       // Brand name
    double price;       // Price in Rupees
    String category;    // Category
    int warranty;       // Warranty in years
    int stock;          // Available quantity
    String processor;   // Processor type (like Intel i5, AMD Ryzen)
    int ram;            // RAM size in GB

    // This function displays all laptop details
    // No parameters, returns nothing
    void displayLaptop() {
        System.out.println("Product ID : " + pId);
        System.out.println("Name       : " + productName);
        System.out.println("Brand      : " + brand);
        System.out.println("Price      : Rs." + price);
        System.out.println("Category   : " + category);
        System.out.println("Warranty   : " + warranty + " years");
        System.out.println("Stock      : " + stock);
        System.out.println("Processor  : " + processor);
        System.out.println("RAM        : " + ram + " GB");
    }
}