from abc import ABC, abstractmethod

# ABC means Abstract Base Class
class User(ABC):
    def __init__(self):
        self.uid = 0
        self.User_name = ""
        self.contact = ""

    def displayUserInfo(self):
        print("User ID :", self.uid)
        print("Name    :", self.User_name)
        print("Contact :", self.contact)

    @abstractmethod
    def display(self):
        pass


class Customer(User):
    def __init__(self):
        super().__init__()
        self.cid = 0
        self.total_purchase = 0.0

    def display(self):
        print("\n--- CUSTOMER ---")
        self.displayUserInfo()
        print("Customer ID    :", self.cid)
        print("Total Purchase : Rs.", self.total_purchase)


class Staff(User):
    def __init__(self):
        super().__init__()
        self.s_id = 0
        self.salary = 0.0

    def display(self):
        print("\n--- STAFF ---")
        self.displayUserInfo()
        print("Staff ID :", self.s_id)
        print("Salary   : Rs.", self.salary)


if __name__ == "__main__":
    print(" ABSTRACTION  \n")
    print("User is abstract - cannot create User objects.")
    print("Only specific types can exist.\n")

    # u = User()  # this would give error

    c = Customer()
    c.uid = 2
    c.User_name = "Vijaya"
    c.contact = "9876543210"
    c.cid = 101
    c.total_purchase = 75000

    s = Staff()
    s.uid = 5
    s.User_name = "Rahul"
    s.contact = "6666666666"
    s.s_id = 501
    s.salary = 25000

    c.display()
    s.display()

    