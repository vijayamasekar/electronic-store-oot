// This class is for customers who buy stuff from the store.
// It has its own fields plus the common user info (uid, name, etc.)
public class Customer {
    int cid;
    int uid;
    String User_name;
    String contact;
    String email;
    String address;
    double total_purchase;

    // Prints all customer details including the user info
    void displayCustomer() {
        System.out.println("Customer ID    : " + cid);
        System.out.println("User ID        : " + uid);
        System.out.println("Name           : " + User_name);
        System.out.println("Contact        : " + contact);
        System.out.println("Email          : " + email);
        System.out.println("Address        : " + address);
        System.out.println("Total Purchase : Rs." + total_purchase);
    }

    // Shows that the customer bought something
    void PurchaseProduct() {
        System.out.println(User_name + " purchased a product.");
    }

    // Shows that the customer returned something
    void ReturnProduct() {
        System.out.println(User_name + " returned a product.");
    }

    // Shows that the customer replaced something
    void ReplaceProduct() {
        System.out.println(User_name + " replaced a product.");
    }

    // Shows that the customer gave feedback
    void GiveFeedback() {
        System.out.println(User_name + " gave feedback.");
    }
}