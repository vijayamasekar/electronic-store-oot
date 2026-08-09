/*
 * ============================================================
 * Author         : [Your Full Name]
 * Roll Number    : [Your Roll Number]
 * Subject        : Object Oriented Technology
 * Assignment     : Electronic Store Management System
 * Date           : [Today's Date]
 * ============================================================
 * 
 * DESCRIPTION:
 * This is a Menu-Driven Electronic Store Management System.
 * It allows the user to view different sections like Users,
 * Products, Store details, Services, and Activities through
 * a simple numbered menu.
 * ============================================================
 */

// Scanner is used to take input from the keyboard
import java.util.Scanner;

public class ElectronicStore {
    
    // Main function - program starts here
    public static void main(String[] args) {
        
        // Create Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        int choice;
        
        // ========== CREATE ALL OBJECTS FIRST ==========
        // We create all objects here so they are ready to use
        // when the user selects an option from the menu
        
        // --- Users ---
        User user = new User();
        user.uid = 1;
        user.userName = "Admin User";
        user.contact = "9999999999";
        user.age = 30;
        user.email = "admin@store.com";
        user.address = "Goa";
        
        Customer customer = new Customer();
        customer.cid = 101;
        customer.uid = 2;
        customer.name = "Vijaya";
        customer.phone = "9876543210";
        customer.email = "vijaya@gmail.com";
        customer.address = "Panjim, Goa";
        customer.totalPurchase = 75000;
        
        Supplier supplier = new Supplier();
        supplier.sid = 201;
        supplier.uid = 3;
        supplier.name = "Amit";
        supplier.phone = "8888888888";
        supplier.email = "amit@dell.com";
        supplier.address = "Mumbai";
        supplier.companyName = "Dell Pvt Ltd";
        
        Owner owner = new Owner();
        owner.uid = 4;
        owner.oId = 401;
        owner.name = "Mr. Sharma";
        owner.phone = "7777777777";
        owner.email = "owner@store.com";
        owner.address = "Goa";
        
        Staff staff = new Staff();
        staff.uid = 5;
        staff.sId = 501;
        staff.name = "Rahul";
        staff.phone = "6666666666";
        staff.email = "rahul@store.com";
        staff.address = "Goa";
        staff.joiningDate = "01-01-2024";
        staff.salary = 25000;
        
        Investor investor = new Investor();
        investor.iId = 601;
        investor.uid = 6;
        investor.name = "Rakesh";
        investor.phone = "5555555555";
        investor.email = "rakesh@invest.com";
        investor.address = "Delhi";
        investor.date = "15-03-2024";
        investor.amount = 500000;
        
        // --- Products ---
        Product product = new Product();
        product.pId = 1001;
        product.productName = "Headphones";
        product.brand = "Sony";
        product.price = 5000;
        product.category = "Audio";
        product.warranty = 1;
        product.stock = 50;
        
        Laptop laptop = new Laptop();
        laptop.pId = 1002;
        laptop.productName = "Inspiron 15";
        laptop.brand = "Dell";
        laptop.price = 65000;
        laptop.category = "Computer";
        laptop.warranty = 2;
        laptop.stock = 15;
        laptop.processor = "Intel i5";
        laptop.ram = 16;
        
        Fridge fridge = new Fridge();
        fridge.pId = 1003;
        fridge.productName = "Double Door Fridge";
        fridge.brand = "LG";
        fridge.price = 45000;
        fridge.category = "Appliance";
        fridge.warranty = 3;
        fridge.stock = 10;
        fridge.capacity = 350;
        
        TV tv = new TV();
        tv.pId = 1004;
        tv.productName = "Smart LED TV";
        tv.brand = "Samsung";
        tv.price = 55000;
        tv.category = "Entertainment";
        tv.warranty = 2;
        tv.stock = 8;
        tv.screenSize = 55;
        
        Mobile mobile = new Mobile();
        mobile.pId = 1005;
        mobile.productName = "Galaxy S24";
        mobile.brand = "Samsung";
        mobile.price = 80000;
        mobile.category = "Mobile";
        mobile.warranty = 1;
        mobile.stock = 20;
        mobile.batteryCapacity = 5000;
        
        Accessories accessories = new Accessories();
        accessories.pId = 1006;
        accessories.productName = "USB-C Cable";
        accessories.brand = "Belkin";
        accessories.price = 800;
        accessories.category = "Accessory";
        accessories.warranty = 1;
        accessories.stock = 100;
        accessories.accessoryType = "Charging Cable";
        
        // --- Store & Outlet ---
        Store store = new Store();
        store.storeId = 1;
        store.storeName = "Smart Electronics";
        store.location = "Goa";
        store.contact = "0832-123456";
        
        Outlet outlet = new Outlet();
        outlet.outletId = 101;
        outlet.storeId = 1;
        outlet.outletName = "Panjim Outlet";
        outlet.location = "18th June Road, Panjim";
        outlet.contact = "0832-654321";
        
        // --- Services ---
        Service service = new Service();
        service.serviceId = 1;
        service.serviceType = "General Service";
        service.date = "10-08-2024";
        service.status = "Active";
        service.charge = 1000;
        
        Installation installation = new Installation();
        installation.serviceId = 2;
        installation.serviceType = "Installation";
        installation.date = "12-08-2024";
        installation.status = "Completed";
        installation.charge = 500;
        installation.installationType = "Wall Mount";
        
        AfterSalesService afterSales = new AfterSalesService();
        afterSales.serviceId = 3;
        afterSales.serviceType = "After Sales Service";
        afterSales.date = "15-08-2024";
        afterSales.status = "Pending";
        afterSales.charge = 0;
        afterSales.issueDescription = "Screen flickering issue";
        
        CustomerService custService = new CustomerService();
        custService.serviceId = 4;
        custService.serviceType = "Customer Service";
        custService.date = "16-08-2024";
        custService.status = "Active";
        custService.charge = 0;
        custService.queryType = "Product Inquiry";
        
        // ========== MENU LOOP ==========
        // do-while means: show menu at least once, then keep showing
        // until user chooses option 6 (Exit)
        do {
            System.out.println("\n========== ELECTRONIC STORE MANAGEMENT SYSTEM ==========");
            System.out.println("1. Display All Users");
            System.out.println("2. Display All Products");
            System.out.println("3. Display Store & Outlet Details");
            System.out.println("4. Display All Services");
            System.out.println("5. Perform Activities");
            System.out.println("6. Exit");
            System.out.println("=======================================================");
            System.out.print("Enter your choice (1-6): ");
            
            choice = sc.nextInt();  // Read number from keyboard
            
            // switch-case checks which number user typed
            // and runs only that block of code
            switch (choice) {
                case 1:
                    System.out.println("\n--- USER ---");
                    user.displayUser();
                    System.out.println("\n--- CUSTOMER ---");
                    customer.displayCustomer();
                    System.out.println("\n--- SUPPLIER ---");
                    supplier.displaySupplier();
                    System.out.println("\n--- OWNER ---");
                    owner.displayOwner();
                    System.out.println("\n--- STAFF ---");
                    staff.displayStaff();
                    System.out.println("\n--- INVESTOR ---");
                    investor.displayInvestor();
                    break;
                    
                case 2:
                    System.out.println("\n--- PRODUCT ---");
                    product.displayProduct();
                    System.out.println("\n--- LAPTOP ---");
                    laptop.displayLaptop();
                    System.out.println("\n--- FRIDGE ---");
                    fridge.displayFridge();
                    System.out.println("\n--- TV ---");
                    tv.displayTV();
                    System.out.println("\n--- MOBILE ---");
                    mobile.displayMobile();
                    System.out.println("\n--- ACCESSORIES ---");
                    accessories.displayAccessories();
                    break;
                    
                case 3:
                    System.out.println("\n--- STORE ---");
                    store.displayStore();
                    System.out.println("\n--- OUTLET ---");
                    outlet.displayOutlet();
                    break;
                    
                case 4:
                    System.out.println("\n--- SERVICE ---");
                    service.displayService();
                    System.out.println("\n--- INSTALLATION ---");
                    installation.displayInstallation();
                    System.out.println("\n--- AFTER SALES SERVICE ---");
                    afterSales.displayAfterSalesService();
                    System.out.println("\n--- CUSTOMER SERVICE ---");
                    custService.displayCustomerService();
                    break;
                    
                case 5:
                    System.out.println("\n========== ACTIVITIES ==========\n");
                    supplier.supplyProduct(product);
                    owner.ownStore(store);
                    investor.invest(store);
                    staff.sellProduct(product);
                    customer.purchaseProduct(product);
                    staff.marketProduct(product);
                    staff.repairProduct(product);
                    staff.provideService(service);
                    customer.returnProduct(product);
                    customer.replaceProduct(product);
                    break;
                    
                case 6:
                    System.out.println("\nThank you! Program Exited Successfully.");
                    break;
                    
                default:
                    System.out.println("\nInvalid choice! Please enter a number between 1 and 6.");
            }
            
        } while (choice != 6);  // Keep looping until user enters 6
        
        sc.close();  // Close the scanner when done (good practice)
    }
}