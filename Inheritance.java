/*
 * ============================================================
 * Author         : [Your Name]
 * Roll Number    : [Your Roll No]
 * Subject        : Object Oriented Technology
 * Topic          : Inheritance
 * Description    : Demonstrating Inheritance using User as parent
 *                  and Customer & Staff as child classes.
 * ============================================================
 */

// PARENT CLASS - This is the base class that holds common info
// Any class can "extend" this to reuse its fields and methods
class User {
    int uid;        // User ID - common for everyone
    String name;    // Name - common for everyone
    String contact; // Phone - common for everyone
    String email;   // Email - common for everyone

    // This function displays basic user info
    // No parameters, returns nothing
    void displayUserInfo() {
        System.out.println("User ID : " + uid);
        System.out.println("Name    : " + name);
        System.out.println("Contact : " + contact);
        System.out.println("Email   : " + email);
    }
}

// CHILD CLASS - Customer INHERITS from User
// "extends" means: Customer gets everything User has, plus its own stuff
class Customer extends User {
    int cid;                // Customer's own ID
    double totalPurchase;   // Customer's own field

    // This function displays customer-specific details
    // No parameters, returns nothing
    void displayCustomer() {
        System.out.println("\n--- CUSTOMER DETAILS ---");
        displayUserInfo();  // Reusing parent's method!
        System.out.println("Customer ID    : " + cid);
        System.out.println("Total Purchase : Rs." + totalPurchase);
    }

    // Customer buys a product
    // Parameter: productName (String) - name of product being purchased
    // Returns nothing
    void purchase(String productName) {
        System.out.println(name + " purchased " + productName);
    }
}

// CHILD CLASS - Staff INHERITS from User
class Staff extends User {
    int sId;            // Staff's own ID
    String jobRole;     // Staff's own field
    double salary;      // Staff's own field

    // Displays staff-specific details
    // No parameters, returns nothing
    void displayStaff() {
        System.out.println("\n--- STAFF DETAILS ---");
        displayUserInfo();  // Reusing parent's method!
        System.out.println("Staff ID : " + sId);
        System.out.println("Job Role : " + jobRole);
        System.out.println("Salary   : Rs." + salary);
    }

    // Staff sells a product
    // Parameter: productName (String) - name of product sold
    // Returns nothing
    void sell(String productName) {
        System.out.println(name + " sold " + productName);
    }
}

// MAIN CLASS - To test Inheritance
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("========== INHERITANCE DEMO ==========\n");
        System.out.println("Inheritance means: Child classes get");
        System.out.println("fields & methods from Parent class.\n");

        // Creating Customer object
        // Customer automatically gets uid, name, contact, email from User!
        Customer c = new Customer();
        c.uid = 1;           // From parent User
        c.name = "Vijaya";   // From parent User
        c.contact = "9876543210"; // From parent User
        c.email = "vijaya@gmail.com"; // From parent User
        c.cid = 101;         // Customer's own field
        c.totalPurchase = 75000; // Customer's own field

        // Creating Staff object
        // Staff also gets uid, name, contact, email from User!
        Staff s = new Staff();
        s.uid = 2;           // From parent User
        s.name = "Rahul";    // From parent User
        s.contact = "9999999999"; // From parent User
        s.email = "rahul@store.com"; // From parent User
        s.sId = 501;         // Staff's own field
        s.jobRole = "Sales Executive"; // Staff's own field
        s.salary = 25000;    // Staff's own field

        // Call methods
        c.displayCustomer();
        c.purchase("Laptop");

        System.out.println(); // Empty line for spacing

        s.displayStaff();
        s.sell("Mobile");

        System.out.println("\n========== INHERITANCE DEMO END ==========");
    }
}