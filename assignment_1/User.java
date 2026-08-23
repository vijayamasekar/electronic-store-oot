// This class stores basic info that every person in the system has.
// Customer, Supplier, Staff, Owner, Investor all use these same fields.
public class User {
    int uid;
    String User_name;
    String contact;
    int age;
    String email;
    String address;

    // Shows all the basic user details on screen
    // No parameters needed, nothing returned
    void displayUser() {
        System.out.println("User ID : " + uid);
        System.out.println("Name    : " + User_name);
        System.out.println("Contact : " + contact);
        System.out.println("Age     : " + age);
        System.out.println("Email   : " + email);
        System.out.println("Address : " + address);
    }
}