// This is the Accessories class - stores info about accessory products
// Accessories are things like chargers, cables, headphones, etc.
public class Accessories {
    int pId;                // Unique Product ID
    String productName;     // Name of the accessory
    String brand;           // Brand name
    double price;           // Price in Rupees
    String category;        // Category
    int warranty;           // Warranty in years
    int stock;              // Available quantity
    String accessoryType;   // Type of accessory (like Cable, Charger, Case)

    // This function displays all accessory details
    // No parameters, returns nothing
    void displayAccessories() {
        System.out.println("Product ID     : " + pId);
        System.out.println("Name           : " + productName);
        System.out.println("Brand          : " + brand);
        System.out.println("Price          : Rs." + price);
        System.out.println("Category       : " + category);
        System.out.println("Warranty       : " + warranty + " years");
        System.out.println("Stock          : " + stock);
        System.out.println("Accessory Type : " + accessoryType);
    }
}