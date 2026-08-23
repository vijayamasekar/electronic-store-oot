class User:
    def __init__(self):
        self.uid = 0
        self.User_name = ""
        self.contact = ""
        self.age = 0
        self.email = ""
        self.address = ""

    def displayUserInfo(self):
        print("User ID :", self.uid)
        print("Name    :", self.User_name)
        print("Contact :", self.contact)
        print("Age     :", self.age)
        print("Email   :", self.email)
        print("Address :", self.address)


class Customer(User):
    def __init__(self):
        super().__init__()
        self.cid = 0
        self.total_purchase = 0.0

    def displayCustomer(self):
        print("\n--- CUSTOMER ---")
        self.displayUserInfo()
        print("Customer ID    :", self.cid)
        print("Total Purchase : Rs.", self.total_purchase)

    def PurchaseProduct(self):
        print(self.User_name, "purchased a product.")


class Staff(User):
    def __init__(self):
        super().__init__()
        self.s_id = 0
        self.joining_date = ""
        self.salary = 0.0

    def displayStaff(self):
        print("\n--- STAFF ---")
        self.displayUserInfo()
        print("Staff ID     :", self.s_id)
        print("Joining Date :", self.joining_date)
        print("Salary       : Rs.", self.salary)

    def SellProduct(self):
        print(self.User_name, "sold a product.")


if __name__ == "__main__":
    print(" INHERITANCE  \n")

    c = Customer()
    c.uid = 2
    c.User_name = "Vijaya"
    c.contact = "9876543210"
    c.age = 25
    c.email = "vijaya@gmail.com"
    c.address = "Goa"
    c.cid = 101
    c.total_purchase = 75000

    s = Staff()
    s.uid = 5
    s.User_name = "Rahul"
    s.contact = "6666666666"
    s.age = 28
    s.email = "rahul@store.com"
    s.address = "Goa"
    s.s_id = 501
    s.joining_date = "01-01-2024"
    s.salary = 25000

    c.displayCustomer()
    c.PurchaseProduct()
    print()
    s.displayStaff()
    s.SellProduct()

    