// This is the Owner class - stores info about the person who owns the store
public class Owner {
    int uid;        // User ID
    int oId;        // Unique Owner ID
    String name;    // Owner name
    String phone;   // Phone number
    String email;   // Email address
    String address; // Home address

    // This function displays all owner details
    // No parameters, returns nothing
    void displayOwner() {
        System.out.println("Owner ID : " + oId);
        System.out.println("User ID  : " + uid);
        System.out.println("Name     : " + name);
        System.out.println("Phone    : " + phone);
        System.out.println("Email    : " + email);
        System.out.println("Address  : " + address);
    }

    // This function shows which store the owner owns
    // Parameter: s (a Store object) - tells which store is owned
    // Returns nothing
    void ownStore(Store s) {
        System.out.println(name + " owns " + s.storeName);
    }
}