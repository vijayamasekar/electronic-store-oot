using System;

// abstract class
abstract class User {
    public int uid;
    public string User_name;
    public string contact;

    public void displayUserInfo() {
        Console.WriteLine("User ID : " + uid);
        Console.WriteLine("Name    : " + User_name);
        Console.WriteLine("Contact : " + contact);
    }

    // abstract method - no body
    public abstract void display();
}

class Customer : User {
    public int cid;
    public double total_purchase;

    public override void display() {
        Console.WriteLine("\n--- CUSTOMER ---");
        displayUserInfo();
        Console.WriteLine("Customer ID    : " + cid);
        Console.WriteLine("Total Purchase : Rs." + total_purchase);
    }
}

class Staff : User {
    public int s_id;
    public double salary;

    public override void display() {
        Console.WriteLine("\n--- STAFF ---");
        displayUserInfo();
        Console.WriteLine("Staff ID : " + s_id);
        Console.WriteLine("Salary   : Rs." + salary);
    }
}

class Abstraction {
    static void Main(string[] args) {
        Console.WriteLine(" ABSTRACTION  \n");
        Console.WriteLine("User is abstract - cannot create User objects.");
        Console.WriteLine("Only specific types can exist.\n");

        // User u = new User(); // error

        Customer c = new Customer();
        c.uid = 2;
        c.User_name = "Vijaya";
        c.contact = "9876543210";
        c.cid = 101;
        c.total_purchase = 75000;

        Staff s = new Staff();
        s.uid = 5;
        s.User_name = "Rahul";
        s.contact = "6666666666";
        s.s_id = 501;
        s.salary = 25000;

        c.display();
        s.display();

    }
}