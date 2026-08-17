// This is the Store class - stores info about the main electronic store
public class Store {
    int storeId;        // Unique Store ID
    String storeName;   // Name of the store
    String location;    // Location of the store
    String contact;     // Contact number

    // This function displays all store details
    // No parameters, returns nothing
    void displayStore() {
        System.out.println("Store ID : " + storeId);
        System.out.println("Name     : " + storeName);
        System.out.println("Location : " + location);
        System.out.println("Contact  : " + contact);
    }
}