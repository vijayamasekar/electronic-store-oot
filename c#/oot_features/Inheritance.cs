using System;

class User {
    public int uid;
    public string User_name;
    public string contact;
    public int age;
    public string email;
    public string address;

    public void displayUserInfo() {
        Console.WriteLine("User ID : " + uid);
        Console.WriteLine("Name    : " + User_name);
        Console.WriteLine("Contact : " + contact);
        Console.WriteLine("Age     : " + age);
        Console.WriteLine("Email   : " + email);
        Console.WriteLine("Address : " + address);
    }
}

class Customer : User {
    public int cid;
    public double total_purchase;

    public void displayCustomer() {
        Console.WriteLine("\n--- CUSTOMER ---");
        displayUserInfo();
        Console.WriteLine("Customer ID    : " + cid);
        Console.WriteLine("Total Purchase : Rs." + total_purchase);
    }

    public void PurchaseProduct() {
        Console.WriteLine(User_name + " purchased a product.");
    }
}

class Staff : User {
    public int s_id;
    public string joining_date;
    public double salary;

    public void displayStaff() {
        Console.WriteLine("\n--- STAFF ---");
        displayUserInfo();
        Console.WriteLine("Staff ID     : " + s_id);
        Console.WriteLine("Joining Date : " + joining_date);
        Console.WriteLine("Salary       : Rs." + salary);
    }

    public void SellProduct() {
        Console.WriteLine(User_name + " sold a product.");
    }
}

class Inheritance {
    static void Main(string[] args) {
        Console.WriteLine(" INHERITANCE  \n");

        Customer c = new Customer();
        c.uid = 2;
        c.User_name = "Vijaya";
        c.contact = "9876543210";
        c.age = 25;
        c.email = "vijaya@gmail.com";
        c.address = "Goa";
        c.cid = 101;
        c.total_purchase = 75000;

        Staff s = new Staff();
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
        Console.WriteLine();
        s.displayStaff();
        s.SellProduct();

  
    }
}