#include <iostream>
using namespace std;

class User {
public:
    string User_name;
    string role;

    // virtual allows children to override
    virtual void display() {
        cout << "Generic User: " << User_name << endl;
    }
};

class Customer : public User {
public:
    double total_purchase;

    void display() {
        cout << "\n--- CUSTOMER ---" << endl;
        cout << "Name           : " << User_name << endl;
        cout << "Role           : " << role << endl;
        cout << "Total Purchase : Rs." << total_purchase << endl;
    }
};

class Staff : public User {
public:
    double salary;

    void display() {
        cout << "\n--- STAFF ---" << endl;
        cout << "Name   : " << User_name << endl;
        cout << "Role   : " << role << endl;
        cout << "Salary : Rs." << salary << endl;
    }
};

class Owner : public User {
public:
    int o_id;

    void display() {
        cout << "\n--- OWNER ---" << endl;
        cout << "Name    : " << User_name << endl;
        cout << "Role    : " << role << endl;
        cout << "Owner ID: " << o_id << endl;
    }
};

int main() {
    Customer c;
    c.User_name = "Vijaya";
    c.role = "Customer";
    c.total_purchase = 75000;

    Staff s;
    s.User_name = "Rahul";
    s.role = "Sales Executive";
    s.salary = 25000;

    Owner o;
    o.User_name = "Mr. Sharma";
    o.role = "Owner";
    o.o_id = 401;

    // array of pointers to base class
    // this is how C++ does polymorphism
    User* users[3];
    users[0] = &c;
    users[1] = &s;
    users[2] = &o;

    cout << "Calling display() on each object:\n" << endl;

    for(int i = 0; i < 3; i++) {
        users[i]->display(); // -> is used for pointers
    }

    return 0;
}