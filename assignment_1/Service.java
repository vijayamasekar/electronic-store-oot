// This is the Service class - stores general info about services offered by the store
// Services include installation, repair, customer support, etc.
public class Service {
    int serviceId;      // Unique Service ID
    String serviceType; // Type of service (like Installation, Repair)
    String date;        // Date when service was given
    String status;      // Current status (Active, Completed, Pending)
    double charge;      // Cost of the service

    // This function displays all service details
    // No parameters, returns nothing
    void displayService() {
        System.out.println("Service ID : " + serviceId);
        System.out.println("Type       : " + serviceType);
        System.out.println("Date       : " + date);
        System.out.println("Status     : " + status);
        System.out.println("Charge     : Rs." + charge);
    }
}