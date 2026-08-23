/*
  Author         : Vijaya Masekar
  Roll Number    : 2657
  Subject        : Object Oriented Technology
  Topic          : Polymorphism
  Description    : Demonstrating Polymorphism where the same
                    method name display() behaves differently
                    for different objects (User types).
 */

class User {
    String User_name;
    String role;

    // Parent version - will be overridden
    void display() {
        System.out.println("Generic User: " + User_name);
    }
}

class Customer extends User {
    double total_purchase;

    // OVERRIDING - Same name, different behavior!
    @Override
    void display() {
        System.out.println("\n--- CUSTOMER ---");
        System.out.println("Name           : " + User_name);
        System.out.println("Role           : " + role);
        System.out.println("Total Purchase : Rs." + total_purchase);
    }
}

class Staff extends User {
    double salary;

    // OVERRIDING - Same name, different behavior!
    @Override
    void display() {
        System.out.println("\n--- STAFF ---");
        System.out.println("Name   : " + User_name);
        System.out.println("Role   : " + role);
        System.out.println("Salary : Rs." + salary);
    }
}

class Owner extends User {
    int o_id;

    // OVERRIDING - Same name, different behavior!
    @Override
    void display() {
        System.out.println("\n--- OWNER ---");
        System.out.println("Name    : " + User_name);
        System.out.println("Role    : " + role);
        System.out.println("Owner ID: " + o_id);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println(" POLYMORPHISM  \n");
        System.out.println("Same method display(), different output!\n");

        // Creating objects
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

        // POLYMORPHISM IN ACTION!
        // Parent array holding different child objects
        User[] users = new User[3];
        users[0] = c;  // Customer object
        users[1] = s;  // Staff object
        users[2] = o;  // Owner object

        System.out.println("Looping through array and calling display():");
        System.out.println("Java automatically picks the CORRECT version!\n");

        for (int i = 0; i < users.length; i++) {
            users[i].display();  // Same call, different results!
        }

   
    }
}