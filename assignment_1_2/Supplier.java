// This is the User class - it stores basic info about any person using the system
public class User {
    // These are the attributes (data) that every user has
    int uid;         
    String userName;   
    String contact;    
    int age;          
    String email;     
    String address;   

    // This function displays all the user details on the screen
    // It does NOT take any parameters and does NOT return anything (void)
    void displayUser() {
        System.out.println("User ID : " + uid);
        System.out.println("Name    : " + userName);
        System.out.println("Contact : " + contact);
        System.out.println("Age     : " + age);
        System.out.println("Email   : " + email);
        System.out.println("Address : " + address);
    }
}