#include <iostream>
using namespace std;

class User {
public:
    int uid;
    string User_name;
    string contact;
    int age;
    string email;
    string address;

    void displayUserInfo() {
        cout << "User ID : " << uid << endl;
        cout << "Name    : " << User_name << endl;
        cout << "Contact : " << contact << endl;
        cout << "Age     : " << age << endl;
        cout << "Email   : " << email << endl;
        cout << "Address : " << address << endl;
    }
};

class Customer : public User {
public:
    int cid;
    double total_purchase;

    void displayCustomer() {
        cout << "\n--- CUSTOMER ---" << endl;
        displayUserInfo();
        cout << "Customer ID    : " << cid << endl;
        cout << "Total Purchase : Rs." << total_purchase << endl;
    }

    void PurchaseProduct() {
        cout << User_name << " purchased a product." << endl;
    }
};

class Staff : public User {
public:
    int s_id;
    string joining_date;
    double salary;

    void displayStaff() {
        cout << "\n--- STAFF ---" << endl;
        displayUserInfo();
        cout << "Staff ID     : " << s_id << endl;
        cout << "Joining Date : " << joining_date << endl;
        cout << "Salary       : Rs." << salary << endl;
    }

    void SellProduct() {
        cout << User_name << " sold a product." << endl;
    }
};

int main() {
    Customer c;
    c.uid = 2;
    c.User_name = "Vijaya";
    c.contact = "9876543210";
    c.age = 25;
    c.email = "vijaya@gmail.com";
    c.address = "Goa";
    c.cid = 101;
    c.total_purchase = 75000;

    Staff s;
    s.uid = 5;
    s.User_name = "Rahul";
    s.contact = "6666666666";
    s.age = 28;
    s.email = "rahul@store.com";
    s.address = "Goa";
    s.s_id = 501;
    s.joining_date = "01-01-2024";
    s.salary = 25000;

    c.displayCustomer();
    c.PurchaseProduct();
    cout << endl;
    s.displayStaff();
    s.SellProduct();

    return 0;
}