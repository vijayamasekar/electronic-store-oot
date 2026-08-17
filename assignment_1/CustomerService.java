// This is the CustomerService class - stores info about customer support services
// Customer service handles queries, complaints, and product inquiries
public class CustomerService {
    int serviceId;      // Unique Service ID
    String serviceType; // Type of service
    String date;        // Date
    String status;      // Status
    double charge;      // Cost (usually 0 for queries)
    String queryType;   // Type of query (like Product Inquiry, Complaint)

    // This function displays all customer service details
    // No parameters, returns nothing
    void displayCustomerService() {
        System.out.println("Service ID   : " + serviceId);
        System.out.println("Type         : " + serviceType);
        System.out.println("Date         : " + date);
        System.out.println("Status       : " + status);
        System.out.println("Charge       : Rs." + charge);
        System.out.println("Query Type   : " + queryType);
    }
}