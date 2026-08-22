/*
 * ============================================================
  Author         : Vijaya Masekar
  Roll Number    : 2657
  Subject        : Object Oriented Technology
  Topic          : Polymorphism
  Description    : Demonstrating Polymorphism where the same
                    method name display() behaves differently
                    for different objects (User types).

 */

// PARENT CLASS
class User {
    String name;
    String role;

    // This method will be OVERRIDDEN by children
    // No parameters, returns nothing
    void display() {
        System.out.println("Generic User: " + name);
    }
}

// CHILD CLASS 1 - Overrides display()
class Customer extends User {
    double totalPurchase;

    // OVERRIDING - Same method name, different behavior!
    // No parameters, returns nothing
    @Override
    void display() {
        System.out.println("\n--- CUSTOMER ---");
        System.out.println("Name           : " + name);
        System.out.println("Role           : " + role);
        System.out.println("Total Purchase : Rs." + totalPurchase);
    }
}

// CHILD CLASS 2 - Overrides display()
class Staff extends User {
    double salary;

    // OVERRIDING - Same method name, different behavior!
    // No parameters, returns nothing
    @Override
    void display() {
        System.out.println("\n--- STAFF ---");
        System.out.println("Name   : " + name);
        System.out.println("Role   : " + role);
        System.out.println("Salary : Rs." + salary);
    }
}

// CHILD CLASS 3 - Overrides display()
class Owner extends User {
    int storesOwned;

    // OVERRIDING - Same method name, different behavior!
    // No parameters, returns nothing
    @Override
    void display() {
        System.out.println("\n--- OWNER ---");
        System.out.println("Name        : " + name);
        System.out.println("Role        : " + role);
        System.out.println("Stores Owned: " + storesOwned);
    }
}

// MAIN CLASS - To test Polymorphism
public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("========== POLYMORPHISM DEMO ==========\n");
        System.out.println("Polymorphism means: Same method name,");
        System.out.println("different behavior for different objects.\n");

        // Creating objects
        Customer c = new Customer();
        c.name = "Vijaya";
        c.role = "Customer";
        c.totalPurchase = 75000;

        Staff s = new Staff();
        s.name = "Rahul";
        s.role = "Sales Executive";
        s.salary = 25000;

        Owner o = new Owner();
        o.name = "Mr. Sharma";
        o.role = "Owner";
        o.storesOwned = 3;

        // POLYMORPHISM IN ACTION!
        // We store different child objects in a Parent array
        User[] users = new User[3];
        users[0] = c;  // Customer object in User reference
        users[1] = s;  // Staff object in User reference
        users[2] = o;  // Owner object in User reference

        System.out.println("Calling display() on each object:");
        System.out.println("Same method name, but different output!\n");

        // Loop through array and call display()
        // Java automatically picks the CORRECT version based on the actual object!
        for (int i = 0; i < users.length; i++) {
            users[i].display();  // Polymorphism happens here!
        }

        System.out.println("\n========== POLYMORPHISM DEMO END ==========");
    }
}