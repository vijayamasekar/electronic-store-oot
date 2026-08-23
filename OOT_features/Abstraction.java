/*

 * Author         : Vijaya Masekar
 * Roll Number    : 2657
 * Subject        : Object Oriented Technology
 * Topic          : Abstraction
 * Description    : User is abstract. Customer and Staff MUST
 *                  implement their own display() method.

 */

// ABSTRACT CLASS - Cannot create objects of User directly!
abstract class User {
    int uid;
    String User_name;
    String contact;

    // Concrete method - shared by all
    void displayUserInfo() {
        System.out.println("User ID : " + uid);
        System.out.println("Name    : " + User_name);
        System.out.println("Contact : " + contact);
    }

    // ABSTRACT METHOD - No body! Children MUST write their own.
    abstract void display();
}

// CONCRETE CLASS - Must implement display()
class Customer extends User {
    int cid;
    double total_purchase;

    // Forced to implement this because parent is abstract
    @Override
    void display() {
        System.out.println("\n--- CUSTOMER ---");
        displayUserInfo();
        System.out.println("Customer ID    : " + cid);
        System.out.println("Total Purchase : Rs." + total_purchase);
    }
}

// CONCRETE CLASS - Must implement display()
class Staff extends User {
    int s_id;
    double salary;

    @Override
    void display() {
        System.out.println("\n--- STAFF ---");
        displayUserInfo();
        System.out.println("Staff ID : " + s_id);
        System.out.println("Salary   : Rs." + salary);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        System.out.println("========== ABSTRACTION DEMO ==========\n");
        System.out.println("User is abstract - you cannot create User objects.");
        System.out.println("Only specific types like Customer or Staff can exist