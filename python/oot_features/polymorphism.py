class User:
    def __init__(self):
        self.User_name = ""
        self.role = ""

    def display(self):
        print("Generic User:", self.User_name)


class Customer(User):
    def __init__(self):
        super().__init__()
        self.total_purchase = 0.0

    def display(self):
        print("\n--- CUSTOMER ---")
        print("Name           :", self.User_name)
        print("Role           :", self.role)
        print("Total Purchase : Rs.", self.total_purchase)


class Staff(User):
    def __init__(self):
        super().__init__()
        self.salary = 0.0

    def display(self):
        print("\n--- STAFF ---")
        print("Name   :", self.User_name)
        print("Role   :", self.role)
        print("Salary : Rs.", self.salary)


class Owner(User):
    def __init__(self):
        super().__init__()
        self.o_id = 0

    def display(self):
        print("\n--- OWNER ---")
        print("Name    :", self.User_name)
        print("Role    :", self.role)
        print("Owner ID:", self.o_id)


if __name__ == "__main__":
    print(" POLYMORPHISM  \n")
    print("Same method display(), different output!\n")

    c = Customer()
    c.User_name = "Vijaya"
    c.role = "Customer"
    c.total_purchase = 75000

    s = Staff()
    s.User_name = "Rahul"
    s.role = "Sales Executive"
    s.salary = 25000

    o = Owner()
    o.User_name = "Mr. Sharma"
    o.role = "Owner"
    o.o_id = 401

    users = [c, s, o]

    print("Calling display() on each object:\n")

    for u in users:
        u.display()

  