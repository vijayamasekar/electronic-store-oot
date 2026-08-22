// This is the Store class - stores info about the main electronic store
public class Store {
    int storeId;        
    String storeName;   
    String location;    
    String contact;     

    // This function displays all store details
    // No parameters, returns nothing
    void displayStore() {
        System.out.println("Store ID : " + storeId);
        System.out.println("Name     : " + storeName);
        System.out.println("Location : " + location);
        System.out.println("Contact  : " + contact);
    }
}