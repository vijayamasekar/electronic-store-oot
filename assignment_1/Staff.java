// This is the Staff class - stores info about employees working in the store
public class Staff {
    int uid;            // User ID
    int sId;            // Unique Staff ID
    String name;        // Staff name
    String phone;       // Phone number
    String email;       // Email address
    String address;     // Home address
    String joiningDate; // Date when staff joined
    double salary;      // Monthly salary

    // This function displays all staff details
    // No parameters, returns nothing
    void displayStaff() {
        System.out.println("Staff ID     : " + sId);
        System.out.println("User ID      : " + uid);
        System.out.println("Name         : " + name);
        System.out.println("Phone        : " + phone);
        System.out.println("Email        : " + email);
        System.out.println("Address      : " + address);
        System.out.println("Joining Date : " + joiningDate);
        System.out.println("Salary       : Rs." + salary);
    }

    // This function shows that staff sold a product
    // Parameter: p (a Product object) - tells which product was sold
    // Returns nothing
    void sellProduct(Product p) {
        System.out.println(name + " sold " + p.productName);
    }

    // This function shows that staff repaired a product
    // Parameter: p (a Product object) - tells which product was repaired
    // Returns nothing
    void repairProduct(Product p) {
        System.out.println(name + " repaired " + p.productName);
    }

    // This function shows that staff marketed a product
    // Parameter: p (a Product object) - tells which product was marketed
    // Returns nothing
    void marketProduct(Product p) {
        System.out.println(name + " marketed " + p.productName);
    }

    // This function shows that staff provided a service
    // Parameter: s (a Service object) - tells which service was provided
    // Returns nothing
    void provideService(Service s) {
        System.out.println(name + " provided " + s.serviceType + " service");
    }
}