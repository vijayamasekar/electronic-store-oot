// This is the Investor class - stores info about people who invest money in the store
public class Investor {
    int iId;        
    int uid;        
    String name;    
    String phone;   
    String email;   
    String address; 
    String date;    
    double amount;  

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