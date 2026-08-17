// This is the TV class - stores info about television products
// It has all product details plus TV-specific features like screen size
public class TV {
    int pId;            // Unique Product ID
    String productName; // Name of the TV
    String brand;       // Brand name
    double price;       // Price in Rupees
    String category;    // Category
    int warranty;       // Warranty in years
    int stock;          // Available quantity
    int screenSize;     // Screen size in inches

    // This function displays all TV details
    // No parameters, returns nothing
    void displayTV() {
        System.out.println("Product ID  : " + pId);
        System.out.println("Name        : " + productName);
        System.out.println("Brand       : " + brand);
        System.out.println("Price       : Rs." + price);
        System.out.println("Category    : " + category);
        System.out.println("Warranty    : " + warranty + " years");
        System.out.println("Stock       : " + stock);
        System.out.println("Screen Size : " + screenSize + " inches");
    }
}