// This class is for people who invest money in the store.
public class Investor {
    int uid;
    int i_id;
    String User_name;
    String contact;
    String email;
    String address;
    String date;
    double amount;

    // Prints all investor details
    void displayInvestor() {
        System.out.println("Investor ID : " + i_id);
        System.out.println("User ID     : " + uid);
        System.out.println("Name        : " + User_name);
        System.out.println("Contact     : " + contact);
        System.out.println("Email       : " + email);
        System.out.println("Address     : " + address);
        System.out.println("Date        : " + date);
        System.out.println("Amount      : Rs." + amount);
    }

    // Shows that investor invested money
    void invest() {
        System.out.println(User_name + " invested Rs." + amount);
    }
}