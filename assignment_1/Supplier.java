// This is the Supplier class - stores info about companies that supply products to the store
public class Supplier {
    int sid;             // Unique Supplier ID
    int uid;             // User ID
    String name;         // Supplier name
    String phone;        // Phone number
    String email;        // Email address
    String address;      // Office address
    String companyName;  // Name of the company

    // This function displays all supplier details
    // No parameters, returns nothing
    void displaySupplier() {
        System.out.println("Supplier ID : " + sid);
        System.out.println("User ID     : " + uid);
        System.out.println("Name        : " + name);
        System.out.println("Phone       : " + phone);
        System.out.println("Email       : " + email);
        System.out.println("Address     : " + address);
        System.out.println("Company     : " + companyName);
    }

    // This function shows that the supplier supplied a product
    // Parameter: p (a Product object) - tells which product was supplied
    // Returns nothing
    void supplyProduct(Product p) {
        System.out.println(companyName + " supplied " + p.productName);
    }
}