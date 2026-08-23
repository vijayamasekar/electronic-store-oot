using System;

class User {
    public string User_name;
    public string role;

    public virtual void display() {
        Console.WriteLine("Generic User: " + User_name);
    }
}

class Customer : User {
    public double total_purchase;

    public override void display() {
        Console.WriteLine("\n--- CUSTOMER ---");
        Console.WriteLine("Name           : " + User_name);
        Console.WriteLine("Role           : " + role);
        Console.WriteLine("Total Purchase : Rs." + total_purchase);
    }
}

class Staff : User {
    public double salary;

    public override void display() {
        Console.WriteLine("\n--- STAFF ---");
        Console.WriteLine("Name   : " + User_name);
        Console.WriteLine("Role   : " + role);
        Console.WriteLine("Salary : Rs." + salary);
    }
}

class Owner : User {
    public int o_id;

    public override void display() {
        Console.WriteLine("\n--- OWNER ---");
        Console.WriteLine("Name    : " + User_name);
        Console.WriteLine("Role    : " + role);
        Console.WriteLine("Owner ID: " + o_id);
    }
}

class Polymorphism {
    static void Main(string[] args) {
        Console.WriteLine(" POLYMORPHISM  \n");
        Console.WriteLine("Same method display(), different output!\n");

        Customer c = new Customer();
        c.User_name = "Vijaya";
        c.role = "Customer";
        c.total_purchase = 75000;

        Staff s = new Staff();
        s.User_name = "Rahul";
        s.role = "Sales Executive";
        s.salary = 25000;

        Owner o = new Owner();
        o.User_name = "Mr. Sharma";
        o.role = "Owner";
        o.o_id = 401;

        User[] users = new User[3];
        users[0] = c;
        users[1] = s;
        users[2] = o;

        Console.WriteLine("Calling display() on each object:\n");

        for(int i = 0; i < users.Length; i++) {
            users[i].display();
        }


    }
}