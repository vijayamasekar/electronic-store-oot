// This class stores details of any product in the store.
public class Product {
    int p_id;
    String product_name;
    String brand;
    double Price;
    String Category;
    String Warranty;
    int stock;

    // Prints all product details
    void Display() {
        System.out.println("Product ID    : " + p_id);
        System.out.println("Product Name  : " + product_name);
        System.out.println("Brand         : " + brand);
        System.out.println("Price         : Rs." + Price);
        System.out.println("Category      : " + Category);
        System.out.println("Warranty      : " + Warranty);
        System.out.println("Stock         : " + stock);
    }
}