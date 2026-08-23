// This is the Product class - stores general info about any product in the store
public class Product {
    int pId;            
    String productName; 
    String brand;      
    double price;     
    String category;    
    int warranty;       
    int stock;          

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