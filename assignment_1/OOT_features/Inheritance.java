/*
 Author         : Vijaya Masekar
 Roll Number    : 2657
 Subject        : Object Oriented Technology
 Topic          : Inheritance
 Description    : Customer and Staff classes inherits from User class
 */

// Parent class - has common stuff
class User {
    int uid;
    String User_name;
    String contact;
    int age;
    String email;
    String address;

    void displayUserInfo() {
        System.out.println("User ID : " + uid);
        System.out.println("Name    : " + User_name);
        System.out.println("Contact : " + contact);
        System.out.println("Age     : " + age);
        System.out.println("Email   : " + email);
        System.out.println("Address : " + address);
    }
}

// Child class - gets everything from User plus its own stuff
class Customer extends User {
    int cid;
    double total_purchase;

    void displayCustomer() {
        System.out.println("\n--- CUSTOMER ---");
        displayUserInfo();  // using parent's method
        System.out.println("Customer ID    : " + cid);
        System.out.println("Total Purchase : Rs." + total_purchase);
    }

    void PurchaseProduct() {
        System.out.println(User_name + " purchased a product.");
    }
}

// Another child class
class Staff extends User {
    int s_id;
    String joining_date;
    double salary;

    void displayStaff() {
        System.out.println("\n--- STAFF ---");
        displayUserInfo();
        System.out.println("Staff ID     : " + s_id);
        System.out.println("Joining Date : " + joining_date);
        System.out.println("Salary       : Rs." + salary);
    }

    void SellProduct() {
        System.out.println(User_name + " sold a product.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println(" INHERITANCE  \n");

        Customer c = new Customer();
        c.uid = 2;
        c.User_name = "Vijaya";
        c.contact = "9876543210";
        c.age = 25;
        c.email = "vijaya@gmail.com";
        c.address = "Goa";
        c.cid = 101;
        c.total_purchase = 75000;

        Staff s = new Staff();
        s.uid = 5;
        s.User_name = "Rahul";
        s.contact = "6666666666";
        s.age = 28;
        s.email = "rahul@store.com";
        s.address = "Goa";
        s.s_id = 501;
        s.joining_date = "01-01-2024";
        s.salary = 25000;

        c.displayCustomer();
        c.PurchaseProduct();

        System.out.println();

        s.displayStaff();
        s.SellProduct();


    }
}