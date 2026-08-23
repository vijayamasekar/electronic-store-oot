// This class stores details of the main store.
public class Store {
    int store_id;
    String name;
    String Location;
    String Contact;

    // Prints all store details
    void displayStore() {
        System.out.println("Store ID : " + store_id);
        System.out.println("Name     : " + name);
        System.out.println("Location : " + Location);
        System.out.println("Contact  : " + Contact);
    }
}