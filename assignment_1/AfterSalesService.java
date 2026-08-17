// This is the AfterSalesService class - stores info about post-purchase services
// After sales service includes repairs and maintenance after warranty
public class AfterSalesService {
    int serviceId;              // Unique Service ID
    String serviceType;         // Type of service
    String date;                // Date
    String status;              // Status
    double charge;              // Cost
    String issueDescription;    // Description of the problem

    // This function displays all after-sales service details
    // No parameters, returns nothing
    void displayAfterSalesService() {
        System.out.println("Service ID        : " + serviceId);
        System.out.println("Type              : " + serviceType);
        System.out.println("Date              : " + date);
        System.out.println("Status            : " + status);
        System.out.println("Charge            : Rs." + charge);
        System.out.println("Issue Description : " + issueDescription);
    }
}