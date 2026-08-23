/*

 * Author         : Vijaya Masekar
 * Roll Number    : 2657
 * Subject        : Object Oriented Technology
 * Topic          : Encapsulation
 * Description    : Product class with private fields accessed
 *                  through public getters and setters.

 */

class Product {
    // PRIVATE fields - cannot be accessed directly from outside
    private int p_id;
    private String product_name;
    private double Price;
    private String Category;
    private String Warranty;
    private int stock;

    // GETTER for p_id
    // No parameters, returns int
    public int getP_id() {
        return p_id;
    }

    // SETTER for p_id with validation
    // Parameter: id (int), returns nothing
    public void setP_id(int id) {
        if (id > 0) {
            p_id = id;
        } else {
            System.out.println("Product ID must be greater than 0.");
        }
    }

    // GETTER for product_name
    public String getProduct_name() {
        return product_name;
    }

    // SETTER for product_name
    public void setProduct_name(String name) {
        product_name = name;
    }

    // GETTER for Price
    public double getPrice() {
        return Price;
    }

    // SETTER for Price with validation
    public void setPrice(double price) {
        if (price > 0) {
            Price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    // GETTER for Category
    public String getCategory() {
        return Category;
    }

    // SETTER for Category
    public void setCategory(String category) {
        Category = category;
    }

    // GETTER for Warranty
    public String getWarranty() {
        return Warranty;
    }

    // SETTER for Warranty
    public void setWarranty(String warranty) {
        Warranty = warranty;
    }

    // GETTER for stock
    public int getStock() {
        return stock;
    }

    // SETTER for stock with validation
    public void setStock(int product_stock) {
        if (product_stock >= 0) {
            stock = product_stock;
        } else {
            System.out.println("Stock cannot be negative.");
        }
    }

    // Display all product details
    // No parameters, returns nothing
    public void display() {
        System.out.println("PRODUCT DETAILS");
        System.out.println("---------------");
        System.out.println("Product ID    : " + p_id);
        System.out.println("Product Name  : " + product_name);
        System.out.println("Price         : Rs." + Price);
        System.out.println("Category      : " + Category);
        System.out.println("Warranty      : " + Warranty);
        System.out.println("Stock         : " + stock);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("========== ENCAPSULATION DEMO ==========\n");

        // Creating object and setting values through setters only
        Product p = new Product();
        p.setP_id(1001);
        p.setProduct_name("Headphones");
        p.setPrice(5000);
        p.setCategory("Audio");
        p.setWarranty("1 year");
        p.setStock(50);

        // Display using getter logic inside display()
        p.display();

        // Trying invalid value to show validation works
        System.out.println("\n--- Trying invalid price ---");
        p.setPrice(-1000);

        System.out.println("\n========== DEMO END ==========");
    }
}