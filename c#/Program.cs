using System;

// User class
class User {
    public int uid;
    public string User_name;
    public string contact;
    public int age;
    public string email;
    public string address;

    public void displayUser() {
        Console.WriteLine("User ID : " + uid);
        Console.WriteLine("Name    : " + User_name);
        Console.WriteLine("Contact : " + contact);
        Console.WriteLine("Age     : " + age);
        Console.WriteLine("Email   : " + email);
        Console.WriteLine("Address : " + address);
    }
}

// Customer class
class Customer {
    public int cid;
    public int uid;
    public string User_name;
    public string contact;
    public string email;
    public string address;
    public double total_purchase;

    public void displayCustomer() {
        Console.WriteLine("Customer ID    : " + cid);
        Console.WriteLine("User ID        : " + uid);
        Console.WriteLine("Name           : " + User_name);
        Console.WriteLine("Contact        : " + contact);
        Console.WriteLine("Email          : " + email);
        Console.WriteLine("Address        : " + address);
        Console.WriteLine("Total Purchase : Rs." + total_purchase);
    }

    public void PurchaseProduct() {
        Console.WriteLine(User_name + " purchased a product.");
    }

    public void ReturnProduct() {
        Console.WriteLine(User_name + " returned a product.");
    }

    public void ReplaceProduct() {
        Console.WriteLine(User_name + " replaced a product.");
    }

    public void GiveFeedback() {
        Console.WriteLine(User_name + " gave feedback.");
    }
}

// Supplier class
class Supplier {
    public int sid;
    public int uid;
    public string User_name;
    public string contact;
    public string email;
    public string address;
    public string Company_Name;

    public void displaySupplier() {
        Console.WriteLine("Supplier ID : " + sid);
        Console.WriteLine("User ID     : " + uid);
        Console.WriteLine("Name        : " + User_name);
        Console.WriteLine("Contact     : " + contact);
        Console.WriteLine("Email       : " + email);
        Console.WriteLine("Address     : " + address);
        Console.WriteLine("Company     : " + Company_Name);
    }

    public void SupplyProduct() {
        Console.WriteLine(Company_Name + " supplied a product.");
    }
}

// Staff class
class Staff {
    public int uid;
    public int s_id;
    public string User_name;
    public string contact;
    public string email;
    public string address;
    public string joining_date;
    public double salary;

    public void displayStaff() {
        Console.WriteLine("Staff ID     : " + s_id);
        Console.WriteLine("User ID      : " + uid);
        Console.WriteLine("Name         : " + User_name);
        Console.WriteLine("Contact      : " + contact);
        Console.WriteLine("Email        : " + email);
        Console.WriteLine("Address      : " + address);
        Console.WriteLine("Joining Date : " + joining_date);
        Console.WriteLine("Salary       : Rs." + salary);
    }

    public void SellProduct() {
        Console.WriteLine(User_name + " sold a product.");
    }

    public void RepairProduct() {
        Console.WriteLine(User_name + " repaired a product.");
    }

    public void Giveservice() {
        Console.WriteLine(User_name + " provided a service.");
    }

    public void MarketProduct() {
        Console.WriteLine(User_name + " marketed a product.");
    }
}

// Owner class
class Owner {
    public int uid;
    public int o_id;
    public string User_name;
    public string contact;
    public string email;
    public string address;

    public void displayOwner() {
        Console.WriteLine("Owner ID : " + o_id);
        Console.WriteLine("User ID  : " + uid);
        Console.WriteLine("Name     : " + User_name);
        Console.WriteLine("Contact  : " + contact);
        Console.WriteLine("Email    : " + email);
        Console.WriteLine("Address  : " + address);
    }

    public void ManageStore() {
        Console.WriteLine(User_name + " is managing the store.");
    }
}

// Investor class
class Investor {
    public int uid;
    public int i_id;
    public string User_name;
    public string contact;
    public string email;
    public string address;
    public string date;
    public double amount;

    public void displayInvestor() {
        Console.WriteLine("Investor ID : " + i_id);
        Console.WriteLine("User ID     : " + uid);
        Console.WriteLine("Name        : " + User_name);
        Console.WriteLine("Contact     : " + contact);
        Console.WriteLine("Email       : " + email);
        Console.WriteLine("Address     : " + address);
        Console.WriteLine("Date        : " + date);
        Console.WriteLine("Amount      : Rs." + amount);
    }

    public void invest() {
        Console.WriteLine(User_name + " invested Rs." + amount);
    }
}

// Product class
class Product {
    public int p_id;
    public string product_name;
    public string brand;
    public double Price;
    public string Category;
    public string Warranty;
    public int stock;

    public void Display() {
        Console.WriteLine("Product ID    : " + p_id);
        Console.WriteLine("Product Name  : " + product_name);
        Console.WriteLine("Brand         : " + brand);
        Console.WriteLine("Price         : Rs." + Price);
        Console.WriteLine("Category      : " + Category);
        Console.WriteLine("Warranty      : " + Warranty);
        Console.WriteLine("Stock         : " + stock);
    }
}

// Store class
class Store {
    public int store_id;
    public string name;
    public string Location;
    public string Contact;

    public void displayStore() {
        Console.WriteLine("Store ID : " + store_id);
        Console.WriteLine("Name     : " + name);
        Console.WriteLine("Location : " + Location);
        Console.WriteLine("Contact  : " + Contact);
    }
}

// Main class
class Program {
    static void Main(string[] args) {
        // creating all objects
        User user = new User();
        user.uid = 1;
        user.User_name = "Admin User";
        user.contact = "9999999999";
        user.age = 30;
        user.email = "admin@store.com";
        user.address = "Goa";

        Customer customer = new Customer();
        customer.cid = 101;
        customer.uid = 2;
        customer.User_name = "Vijaya";
        customer.contact = "9876543210";
        customer.email = "vijaya@gmail.com";
        customer.address = "Panjim, Goa";
        customer.total_purchase = 75000;

        Supplier supplier = new Supplier();
        supplier.sid = 201;
        supplier.uid = 3;
        supplier.User_name = "Amit";
        supplier.contact = "8888888888";
        supplier.email = "amit@dell.com";
        supplier.address = "Mumbai";
        supplier.Company_Name = "Dell Pvt Ltd";

        Staff staff = new Staff();
        staff.uid = 5;
        staff.s_id = 501;
        staff.User_name = "Rahul";
        staff.contact = "6666666666";
        staff.email = "rahul@store.com";
        staff.address = "Goa";
        staff.joining_date = "01-01-2024";
        staff.salary = 25000;

        Owner owner = new Owner();
        owner.uid = 4;
        owner.o_id = 401;
        owner.User_name = "Mr. Sharma";
        owner.contact = "7777777777";
        owner.email = "owner@store.com";
        owner.address = "Goa";

        Investor investor = new Investor();
        investor.uid = 6;
        investor.i_id = 601;
        investor.User_name = "Rakesh";
        investor.contact = "5555555555";
        investor.email = "rakesh@invest.com";
        investor.address = "Delhi";
        investor.date = "15-03-2024";
        investor.amount = 500000;

        Product product = new Product();
        product.p_id = 1001;
        product.product_name = "Headphones";
        product.brand = "Sony";
        product.Price = 5000;
        product.Category = "Audio";
        product.Warranty = "1 year";
        product.stock = 50;

        Store store = new Store();
        store.store_id = 1;
        store.name = "Smart Electronics";
        store.Location = "Goa";
        store.Contact = "0832-123456";

        int choice;

        do {
            Console.WriteLine("\n ELECTRONIC STORE MANAGEMENT SYSTEM ");
            Console.WriteLine("1. Display All Users");
            Console.WriteLine("2. Display Product Details");
            Console.WriteLine("3. Display Store Details");
            Console.WriteLine("4. Perform Activities");
            Console.WriteLine("5. Exit");
            Console.WriteLine("=====");
            Console.Write("Enter your choice (1-5): ");
            choice = Convert.ToInt32(Console.ReadLine());

            switch (choice) {
                case 1:
                    Console.WriteLine("\n USER DETAILS ");
                    user.displayUser();

                    Console.WriteLine("\n CUSTOMER DETAILS ");
                    customer.displayCustomer();

                    Console.WriteLine("\n SUPPLIER DETAILS ");
                    supplier.displaySupplier();

                    Console.WriteLine("\n STAFF DETAILS ");
                    staff.displayStaff();

                    Console.WriteLine("\n OWNER DETAILS ");
                    owner.displayOwner();

                    Console.WriteLine("\n INVESTOR DETAILS ");
                    investor.displayInvestor();
                    break;

                case 2:
                    Console.WriteLine("\n PRODUCT DETAILS ");
                    product.Display();
                    break;

                case 3:
                    Console.WriteLine("\n STORE DETAILS ");
                    store.displayStore();
                    break;

                case 4:
                    Console.WriteLine("\n ACTIVITIES PERFORMED \n");

                    Console.WriteLine("--- CUSTOMER ACTIVITIES ---");
                    customer.PurchaseProduct();
                    customer.ReturnProduct();
                    customer.ReplaceProduct();
                    customer.GiveFeedback();
                    Console.WriteLine();

                    Console.WriteLine("--- SUPPLIER ACTIVITIES ---");
                    supplier.SupplyProduct();
                    Console.WriteLine();

                    Console.WriteLine("--- STAFF ACTIVITIES ---");
                    staff.SellProduct();
                    staff.RepairProduct();
                    staff.Giveservice();
                    staff.MarketProduct();
                    Console.WriteLine();

                    Console.WriteLine("--- OWNER ACTIVITIES ---");
                    owner.ManageStore();
                    Console.WriteLine();

                    Console.WriteLine("--- INVESTOR ACTIVITIES ---");
                    investor.invest();
                    Console.WriteLine();

                    Console.WriteLine("--- PRODUCT DISPLAY ---");
                    product.Display();
                    break;

                case 5:
                    Console.WriteLine("\nThank you! Program Exited Successfully.");
                    break;

                default:
                    Console.WriteLine("\nInvalid choice! Please enter a number between 1 and 5.");
                    break;
            }

        } while (choice != 5);
    }
}