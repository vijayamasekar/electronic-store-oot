// This is the Investor class - stores info about people who invest money in the store
public class Investor {
    int iId;        // Unique Investor ID
    int uid;        // User ID
    String name;    // Investor name
    String phone;   // Phone number
    String email;   // Email address
    String address; // Home address
    String date;    // Date of investment
    double amount;  // Amount invested

    // This function displays all investor details
    // No parameters, returns nothing
    void displayInvestor() {
        System.out.println("Investor ID : " + iId);
        System.out.println("User ID     : " + uid);
        System.out.println("Name        : " + name);
        System.out.println("Phone       : " + phone);
        System.out.println("Email       : " + email);
        System.out.println("Address     : " + address);
        System.out.println("Date        : " + date);
        System.out.println("Amount      : Rs." + amount);
    }

    // This function shows that investor invested in a store
    // Parameter: s (a Store object) - tells which store got the investment
    // Returns nothing
    void invest(Store s) {
        System.out.println(name + " invested Rs." + amount + " in " + s.storeName);
    }
}