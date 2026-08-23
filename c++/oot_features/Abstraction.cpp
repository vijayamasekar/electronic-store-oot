#include <iostream>
using namespace std;

// abstract class - has pure virtual function
class User {
public:
    int uid;
    string User_name;
    string contact;

    void displayUserInfo() {
        cout << "User ID : " << uid << endl;
        cout << "Name    : " << User_name << endl;
        cout << "Contact : " << contact << endl;
    }

    // pure virtual = 0 means children MUST implement this
    virtual void display() = 0;
};

class Customer : public User {
public:
    int cid;
    double total_purchase;

    void display() {
        cout << "\n--- CUSTOMER ---" << endl;
        displayUserInfo();
        cout << "Customer ID    : " << cid << endl;
        cout << "Total Purchase : Rs." << total_purchase << endl;
    }
};

class Staff : public User {
public:
    int s_id;
    double salary;

    void display() {
        cout << "\n--- STAFF ---" << endl;
        displayUserInfo();
        cout << "Staff ID : " << s_id << endl;
        cout << "Salary   : Rs." << salary << endl;
    }
};

int main() {
    // User u; // error - cannot create abstract object

    Customer c;
    c.uid = 2;
    c.User_name = "Vijaya";
    c.contact = "9876543210";
    c.cid = 101;
    c.total_purchase = 75000;

    Staff s;
    s.uid = 5;
    s.User_name = "Rahul";
    s.contact = "6666666666";
    s.s_id = 501;
    s.salary = 25000;

    c.display();
    s.display();

    return 0;
}