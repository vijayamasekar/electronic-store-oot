// This is the Fridge class - stores info about refrigerator products
// It has all product details plus fridge-specific features like capacity
public class Fridge {
    int pId;            // Unique Product ID
    String productName; // Name of the fridge
    String brand;       // Brand name
    double price;       // Price in Rupees
    String category;    // Category
    int warranty;       // Warranty in years
    int stock;          // Available quantity
    double capacity;    // Storage capacity in Litres

    // This function displays all fridge details
    // No parameters, returns nothing
    void displayFridge() {
        System.out.println("Product ID : " + pId);
        System.out.println("Name       : " + productName);
        System.out.println("Brand      : " + brand);
        System.out.println("Price      : Rs." + price);
        System.out.println("Category   : " + category);
        System.out.println("Warranty   : " + warranty + " years");
        System.out.println("Stock      : " + stock);
        System.out.println("Capacity   : " + capacity + " Litres");
    }
}