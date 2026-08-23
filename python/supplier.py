class Supplier:
    def __init__(self):
        self.sid = 0
        self.uid = 0
        self.User_name = ""
        self.contact = ""
        self.email = ""
        self.address = ""
        self.Company_Name = ""

    def displaySupplier(self):
        print("Supplier ID :", self.sid)
        print("User ID     :", self.uid)
        print("Name        :", self.User_name)
        print("Contact     :", self.contact)
        print("Email       :", self.email)
        print("Address     :", self.address)
        print("Company     :", self.Company_Name)

    def SupplyProduct(self):
        print(self.Company_Name, "supplied a product.")