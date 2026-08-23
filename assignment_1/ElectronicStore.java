/*
 Author         : Vijaya Masekar
 Roll Number    : 2657
 Subject        : Object Oriented Technology
 Assignment     : Electronic Store Management System
 
 DESCRIPTION:
 This is a Menu-Driven Electronic Store Management System.
 It allows the user to view different sections like Users,
 Products, Store details, and Activities through a simple
 numbered menu.
 */

import java.util.Scanner;

public class ElectronicStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        //  CREATE ALL OBJECTS 
        
        // --- User ---
        User user = new User();
        user.uid = 1;
        user.User_name = "Admin";
        user.contact = "52489635";
        user.age = 30;
        user.email = "admin@store.com";
        user.address = "Goa";
        
        // --- Customer ---
        Customer customer = new Customer();
        customer.cid = 101;
        customer.uid = 2;
        customer.User_name = "Vijaya Masekar";
        customer.contact = "9876543210";
        customer.email = "vijaya@gmail.com";
        customer.address = "Panjim, Goa";
        customer.total_purchase = 75000;
        
        // --- Supplier ---
        Supplier supplier = new Supplier();
        supplier.sid = 201;
        supplier.uid = 3;
        supplier.User_name = "Vinayak Masekar";
        supplier.contact = "2365984526";
        supplier.email = "vinayak@gmail.com";
        supplier.address = "Mumbai";
        supplier.Company_Name = "Dell Pvt Ltd";
        
        // --- Staff ---
        Staff staff = new Staff();
        staff.uid = 5;
        staff.s_id = 501;
        staff.User_name = "Rahul Kumar";
        staff.contact = "1236958472";
        staff.email = "rahul@store.com";
        staff.address = "Goa";
        staff.joining_date = "01-01-2024";
        staff.salary = 25000;
        
        // --- Owner ---
        Owner owner = new Owner();
        owner.uid = 4;
        owner.o_id = 401;
        owner.User_name = "Mr. Khurana";
        owner.contact = "2345782152";
        owner.email = "khurana@store.com";
        owner.address = "Goa";
        
        // --- Investor ---
        // NOTE: Use lowercase 'investor' for the object name!
        Investor investor = new Investor();
        investor.uid = 6;
        investor.i_id = 601;
        investor.User_name = "Rakesh Ahuja";
        investor.contact = "6595221524";
        investor.email = "rakesh@invest.com";
        investor.address = "Delhi";
        investor.date = "15-03-2024";
        investor.amount = 500000;
        
        // --- Product ---
        Product product = new Product();
        product.p_id = 1001;
        product.product_name = "Headphones";
        product.brand = "Sony";
        product.Price = 5000;
        product.Category = "Audio";
        product.Warranty = "1 year";
        product.stock = 50;

        // --- Store ---
        Store store = new Store();
        store.store_id = 1;
        store.name = "Smart Electronics";
        store.Location = "Goa";
        store.Contact = "0832-123456";

        //  MENU LOOP 
        do {
            System.out.println("\n ELECTRONIC STORE MANAGEMENT SYSTEM ");
            System.out.println("1. Display All Users");
            System.out.println("2. Display Product Details");
            System.out.println("3. Display Store Details");
            System.out.println("4. Perform Activities");
            System.out.println("5. Exit");
            System.out.println("-------------------------------");
            System.out.print("Enter your choice (1-5): ");
            
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("\n USER DETAILS ");
                    user.displayUser();
                    
                    System.out.println("\n CUSTOMER DETAILS ");
                    customer.displayCustomer();
                    
                    System.out.println("\n SUPPLIER DETAILS ");
                    supplier.displaySupplier();
                    
                    System.out.println("\n STAFF DETAILS ");
                    staff.displayStaff();
                    
                    System.out.println("\n OWNER DETAILS ");
                    owner.displayOwner();
                    
                    System.out.println("\n INVESTOR DETAILS ");
                    investor.displayInvestor();
                    break;
                    
                case 2:
                    System.out.println("\n PRODUCT DETAILS ");
                    product.Display();
                    break;
                    
                case 3:
                    System.out.println("\n STORE DETAILS ");
                    store.displayStore();
                    break;
                    
                case 4:
                    System.out.println("\n ACTIVITIES PERFORMED \n");
                    
                    System.out.println("--- CUSTOMER ACTIVITIES ---");
                    customer.PurchaseProduct();
                    customer.ReturnProduct();
                    customer.ReplaceProduct();
                    customer.GiveFeedback();
                    System.out.println();
                    
                    System.out.println("--- SUPPLIER ACTIVITIES ---");
                    supplier.SupplyProduct();
                    System.out.println();
                    
                    System.out.println("--- STAFF ACTIVITIES ---");
                    staff.SellProduct();
                    staff.RepairProduct();
                    staff.Giveservice();
                    staff.MarketProduct();
                    System.out.println();
                    
                    System.out.println("--- OWNER ACTIVITIES ---");
                    owner.ManageStore();
                    System.out.println();
                    
                    System.out.println("--- INVESTOR ACTIVITIES ---");
                    investor.invest();
                    System.out.println();
                    
                    System.out.println("--- PRODUCT DISPLAY ---");
                    product.Display();
                    break;
                    
                case 5:
                    System.out.println("\nThank you! Program Exited Successfully.");
                    break;
                    
                default:
                    System.out.println("\nInvalid choice! Please enter a number between 1 and 5.");
            }
            
        } while (choice != 5);
        
        sc.close();
    }
}