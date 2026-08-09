// This is the Installation class - stores info about installation services
// Installation is when technicians set up products at customer's home
public class Installation {
    int serviceId;          // Unique Service ID
    String serviceType;     // Type of service
    String date;            // Date of installation
    String status;          // Status
    double charge;          // Cost
    String installationType; // Type of installation (like Wall Mount, Table Top)

    // This function displays all installation details
    // No parameters, returns nothing
    void displayInstallation() {
        System.out.println("Service ID        : " + serviceId);
        System.out.println("Type              : " + serviceType);
        System.out.println("Date              : " + date);
        System.out.println("Status            : " + status);
        System.out.println("Charge            : Rs." + charge);
        System.out.println("Installation Type : " + installationType);
    }
}