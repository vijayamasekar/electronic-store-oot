// This class is for suppliers who provide products to the store.
// They have company name along with basic user details.
public class Supplier {
    int sid;
    int uid;
    String User_name;
    String contact;
    String email;
    String address;
    String Company_Name;

    // Prints all supplier details
    void displaySupplier() {
        System.out.println("Supplier ID : " + sid);
        System.out.println("User ID     : " + uid);
        System.out.println("Name        : " + User_name);
        System.out.println("Contact     : " + contact);
        System.out.println("Email       : " + email);
        System.out.println("Address     : " + address);
        System.out.println("Company     : " + Company_Name);
    }

    // Shows that the supplier supplied a product
    void SupplyProduct() {
        System.out.println(Company_Name + " supplied a product.");
    }
}