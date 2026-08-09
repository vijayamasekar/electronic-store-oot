// This is the Product class - stores general info about any product in the store
public class Product {
    int pId;            // Unique Product ID
    String productName; // Name of the product
    String brand;       // Brand name (like Dell, Samsung, LG)
    double price;       // Price in Rupees
    String category;    // Category (like Laptop, TV, Mobile)
    int warranty;       // Warranty period in years
    int stock;          // How many items are available

    // This function displays all product details
    // No parameters, returns nothing
    void displayProduct() {
        System.out.println("Product ID : " + pId);
        System.out.println("Name       : " + productName);
        System.out.println("Brand      : " + brand);
        System.out.println("Price      : Rs." + price);
        System.out.println("Category   : " + category);
        System.out.println("Warranty   : " + warranty + " years");
        System.out.println("Stock      : " + stock);
    }
}