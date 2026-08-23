// This is the Customer class - it stores details about customers who buy products
public class Customer {
    int cid;            
    int uid;            
    String name;        
    String phone;       
    String email;       
    String address;     
    double totalPurchase; 

    // This function shows all customer details
    // No parameters, returns nothing
    void displayCustomer() {
        System.out.println("Customer ID    : " + cid);
        System.out.println("User ID        : " + uid);
        System.out.println("Name           : " + name);
        System.out.println("Phone          : " + phone);
        System.out.println("Email          : " + email);
        System.out.println("Address        : " + address);
        System.out.println("Total Purchase : Rs." + totalPurchase);
    }

    // This function shows that a customer purchased a product
    // Parameter: p (a Product object) - tells which product was bought
    // Returns nothing
    void purchaseProduct(Product p) {
        System.out.println(name + " purchased " + p.productName);
    }

    // This function shows that a customer returned a product
    // Parameter: p (a Product object) - tells which product was returned
    // Returns nothing
    void returnProduct(Product p) {
        System.out.println(name + " returned " + p.productName);
    }

    // This function shows that a customer replaced a product
    // Parameter: p (a Product object) - tells which product was replaced
    // Returns nothing
    void replaceProduct(Product p) {
        System.out.println(name + " replaced " + p.productName);
    }
}