// This is the Mobile class - stores info about mobile phone products
// It has all product details plus mobile-specific features like battery capacity
public class Mobile {
    int pId;                // Unique Product ID
    String productName;     // Name of the mobile
    String brand;           // Brand name
    double price;           // Price in Rupees
    String category;        // Category
    int warranty;           // Warranty in years
    int stock;              // Available quantity
    int batteryCapacity;    // Battery size in mAh

    // This function displays all mobile details
    // No parameters, returns nothing
    void displayMobile() {
        System.out.println("Product ID       : " + pId);
        System.out.println("Name             : " + productName);
        System.out.println("Brand            : " + brand);
        System.out.println("Price            : Rs." + price);
        System.out.println("Category         : " + category);
        System.out.println("Warranty         : " + warranty + " years");
        System.out.println("Stock            : " + stock);
        System.out.println("Battery Capacity : " + batteryCapacity + " mAh");
    }
}