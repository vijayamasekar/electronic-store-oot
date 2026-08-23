// This class is for the person who owns the store.
public class Owner {
    int uid;
    int o_id;
    String User_name;
    String contact;
    String email;
    String address;

    // Prints all owner details
    void displayOwner() {
        System.out.println("Owner ID : " + o_id);
        System.out.println("User ID  : " + uid);
        System.out.println("Name     : " + User_name);
        System.out.println("Contact  : " + contact);
        System.out.println("Email    : " + email);
        System.out.println("Address  : " + address);
    }

    // Shows that owner is managing the store
    void ManageStore() {
        System.out.println(User_name + " is managing the store.");
    }
}