// This is the Outlet class - stores info about branch outlets of the main store
public class Outlet {
    int outletId;       // Unique Outlet ID
    int storeId;        // Store ID (which main store this outlet belongs to)
    String outletName;  // Name of the outlet
    String location;    // Address of the outlet
    String contact;     // Contact number

    // This function displays all outlet details
    // No parameters, returns nothing
    void displayOutlet() {
        System.out.println("Outlet ID : " + outletId);
        System.out.println("Store ID  : " + storeId);
        System.out.println("Name      : " + outletName);
        System.out.println("Location  : " + location);
        System.out.println("Contact   : " + contact);
    }
}