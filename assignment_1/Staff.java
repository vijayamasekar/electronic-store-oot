// This class is for employees working in the store.
// They have salary and joining date along with basic info.
public class Staff {
    int uid;
    int s_id;
    String User_name;
    String contact;
    String email;
    String address;
    String joining_date;
    double salary;

    // Prints all staff details
    void displayStaff() {
        System.out.println("Staff ID     : " + s_id);
        System.out.println("User ID      : " + uid);
        System.out.println("Name         : " + User_name);
        System.out.println("Contact      : " + contact);
        System.out.println("Email        : " + email);
        System.out.println("Address      : " + address);
        System.out.println("Joining Date : " + joining_date);
        System.out.println("Salary       : Rs." + salary);
    }

    // Shows that staff sold a product
    void SellProduct() {
        System.out.println(User_name + " sold a product.");
    }

    // Shows that staff repaired a product
    void RepairProduct() {
        System.out.println(User_name + " repaired a product.");
    }

    // Shows that staff provided a service
    void Giveservice() {
        System.out.println(User_name + " provided a service.");
    }

    // Shows that staff marketed a product
    void MarketProduct() {
        System.out.println(User_name + " marketed a product.");
    }
}