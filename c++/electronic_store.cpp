#include <iostream>
#include <string>
using namespace std;

// User class
class User {
public:
    int uid;
    string User_name;
    string contact;
    int age;
    string email;
    string address;

    void displayUser() {
        cout << "User ID : " << uid << endl;
        cout << "Name    : " << User_name << endl;
        cout << "Contact : " << contact << endl;
        cout << "Age     : " << age << endl;
        cout << "Email   : " << email << endl;
        cout << "Address : " << address << endl;
    }
};

// Customer class
class Customer {
public:
    int cid;
    int uid;
    string User_name;
    string contact;
    string email;
    string address;
    double total_purchase;

    void displayCustomer() {
        cout << "Customer ID    : " << cid << endl;
        cout << "User ID        : " << uid << endl;
        cout << "Name           : " << User_name << endl;
        cout << "Contact        : " << contact << endl;
        cout << "Email          : " << email << endl;
        cout << "Address        : " << address << endl;
        cout << "Total Purchase : Rs." << total_purchase << endl;
    }

    void PurchaseProduct() {
        cout << User_name << " purchased a product." << endl;
    }

    void ReturnProduct() {
        cout << User_name << " returned a product." << endl;
    }

    void ReplaceProduct() {
        cout << User_name << " replaced a product." << endl;
    }

    void GiveFeedback() {
        cout << User_name << " gave feedback." << endl;
    }
};

// Supplier class
class Supplier {
public:
    int sid;
    int uid;
    string User_name;
    string contact;
    string email;
    string address;
    string Company_Name;

    void displaySupplier() {
        cout << "Supplier ID : " << sid << endl;
        cout << "User ID     : " << uid << endl;
        cout << "Name        : " << User_name << endl;
        cout << "Contact     : " << contact << endl;
        cout << "Email       : " << email << endl;
        cout << "Address     : " << address << endl;
        cout << "Company     : " << Company_Name << endl;
    }

    void SupplyProduct() {
        cout << Company_Name << " supplied a product." << endl;
    }
};

// Staff class
class Staff {
public:
    int uid;
    int s_id;
    string User_name;
    string contact;
    string email;
    string address;
    string joining_date;
    double salary;

    void displayStaff() {
        cout << "Staff ID     : " << s_id << endl;
        cout << "User ID      : " << uid << endl;
        cout << "Name         : " << User_name << endl;
        cout << "Contact      : " << contact << endl;
        cout << "Email        : " << email << endl;
        cout << "Address      : " << address << endl;
        cout << "Joining Date : " << joining_date << endl;
        cout << "Salary       : Rs." << salary << endl;
    }

    void SellProduct() {
        cout << User_name << " sold a product." << endl;
    }

    void RepairProduct() {
        cout << User_name << " repaired a product." << endl;
    }

    void Giveservice() {
        cout << User_name << " provided a service." << endl;
    }

    void MarketProduct() {
        cout << User_name << " marketed a product." << endl;
    }
};

// Owner class
class Owner {
public:
    int uid;
    int o_id;
    string User_name;
    string contact;
    string email;
    string address;

    void displayOwner() {
        cout << "Owner ID : " << o_id << endl;
        cout << "User ID  : " << uid << endl;
        cout << "Name     : " << User_name << endl;
        cout << "Contact  : " << contact << endl;
        cout << "Email    : " << email << endl;
        cout << "Address  : " << address << endl;
    }

    void ManageStore() {
        cout << User_name << " is managing the store." << endl;
    }
};

// Investor class
class Investor {
public:
    int uid;
    int i_id;
    string User_name;
    string contact;
    string email;
    string address;
    string date;
    double amount;

    void displayInvestor() {
        cout << "Investor ID : " << i_id << endl;
        cout << "User ID     : " << uid << endl;
        cout << "Name        : " << User_name << endl;
        cout << "Contact     : " << contact << endl;
        cout << "Email       : " << email << endl;
        cout << "Address     : " << address << endl;
        cout << "Date        : " << date << endl;
        cout << "Amount      : Rs." << amount << endl;
    }

    void invest() {
        cout << User_name << " invested Rs." << amount << endl;
    }
};

// Product class
class Product {
public:
    int p_id;
    string product_name;
    string brand;
    double Price;
    string Category;
    string Warranty;
    int stock;

    void Display() {
        cout << "Product ID    : " << p_id << endl;
        cout << "Product Name  : " << product_name << endl;
        cout << "Brand         : " << brand << endl;
        cout << "Price         : Rs." << Price << endl;
        cout << "Category      : " << Category << endl;
        cout << "Warranty      : " << Warranty << endl;
        cout << "Stock         : " << stock << endl;
    }
};

// Store class
class Store {
public:
    int store_id;
    string name;
    string Location;
    string Contact;

    void displayStore() {
        cout << "Store ID : " << store_id << endl;
        cout << "Name     : " << name << endl;
        cout << "Location : " << Location << endl;
        cout << "Contact  : " << Contact << endl;
    }
};

// Main function
int main() {
    // creating objects
    User user;
    user.uid = 1;
    user.User_name = "Admin User";
    user.contact = "5695825152";
    user.age = 30;
    user.email = "admin@store.com";
    user.address = "Goa";

    Customer customer;
    customer.cid = 101;
    customer.uid = 2;
    customer.User_name = "Vijaya";
    customer.contact = "9876543210";
    customer.email = "vijaya@gmail.com";
    customer.address = "Panjim, Goa";
    customer.total_purchase = 75000;

    Supplier supplier;
    supplier.sid = 201;
    supplier.uid = 3;
    supplier.User_name = "Amit";
    supplier.contact = "2365958751";
    supplier.email = "amit@dell.com";
    supplier.address = "Mumbai";
    supplier.Company_Name = "Dell Pvt Ltd";

    Staff staff;
    staff.uid = 5;
    staff.s_id = 501;
    staff.User_name = "Rahul";
    staff.contact = "1232654578";
    staff.email = "rahul@store.com";
    staff.address = "Goa";
    staff.joining_date = "01-01-2024";
    staff.salary = 25000;

    Owner owner;
    owner.uid = 4;
    owner.o_id = 401;
    owner.User_name = "Mr. Sharma";
    owner.contact = "1232654578";
    owner.email = "owner@store.com";
    owner.address = "Goa";

    Investor investor;
    investor.uid = 6;
    investor.i_id = 601;
    investor.User_name = "Rakesh";
    investor.contact = "32652369545";
    investor.email = "rakesh@invest.com";
    investor.address = "Delhi";
    investor.date = "15-03-2024";
    investor.amount = 500000;

    Product product;
    product.p_id = 1001;
    product.product_name = "Headphones";
    product.brand = "Sony";
    product.Price = 5000;
    product.Category = "Audio";
    product.Warranty = "1 year";
    product.stock = 50;

    Store store;
    store.store_id = 1;
    store.name = "Smart Electronics";
    store.Location = "Goa";
    store.Contact = "0832-123456";

    int choice;

    do {
        cout << "\n ELECTRONIC STORE MANAGEMENT SYSTEM " << endl;
        cout << "1. Display All Users" << endl;
        cout << "2. Display Product Details" << endl;
        cout << "3. Display Store Details" << endl;
        cout << "4. Perform Activities" << endl;
        cout << "5. Exit" << endl;
        cout << "=====" << endl;
        cout << "Enter your choice (1-5): ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "\n USER DETAILS " << endl;
                user.displayUser();

                cout << "\n CUSTOMER DETAILS " << endl;
                customer.displayCustomer();

                cout << "\n SUPPLIER DETAILS " << endl;
                supplier.displaySupplier();

                cout << "\n STAFF DETAILS " << endl;
                staff.displayStaff();

                cout << "\n OWNER DETAILS " << endl;
                owner.displayOwner();

                cout << "\n INVESTOR DETAILS " << endl;
                investor.displayInvestor();
                break;

            case 2:
                cout << "\n PRODUCT DETAILS " << endl;
                product.Display();
                break;

            case 3:
                cout << "\n STORE DETAILS " << endl;
                store.displayStore();
                break;

            case 4:
                cout << "\n ACTIVITIES PERFORMED \n" << endl;

                cout << "--- CUSTOMER ACTIVITIES ---" << endl;
                customer.PurchaseProduct();
                customer.ReturnProduct();
                customer.ReplaceProduct();
                customer.GiveFeedback();
                cout << endl;

                cout << "--- SUPPLIER ACTIVITIES ---" << endl;
                supplier.SupplyProduct();
                cout << endl;

                cout << "--- STAFF ACTIVITIES ---" << endl;
                staff.SellProduct();
                staff.RepairProduct();
                staff.Giveservice();
                staff.MarketProduct();
                cout << endl;

                cout << "--- OWNER ACTIVITIES ---" << endl;
                owner.ManageStore();
                cout << endl;

                cout << "--- INVESTOR ACTIVITIES ---" << endl;
                investor.invest();
                cout << endl;

                cout << "--- PRODUCT DISPLAY ---" << endl;
                product.Display();
                break;

            case 5:
                cout << "\nThank you! Program Exited Successfully." << endl;
                break;

            default:
                cout << "\nInvalid choice! Please enter a number between 1 and 5." << endl;
        }

    } while (choice != 5);

    return 0;
}