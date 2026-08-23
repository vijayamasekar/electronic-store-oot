class Staff:
    def __init__(self):
        self.uid = 0
        self.s_id = 0
        self.User_name = ""
        self.contact = ""
        self.email = ""
        self.address = ""
        self.joining_date = ""
        self.salary = 0.0

    def displayStaff(self):
        print("Staff ID     :", self.s_id)
        print("User ID      :", self.uid)
        print("Name         :", self.User_name)
        print("Contact      :", self.contact)
        print("Email        :", self.email)
        print("Address      :", self.address)
        print("Joining Date :", self.joining_date)
        print("Salary       : Rs.", self.salary)

    def SellProduct(self):
        print(self.User_name, "sold a product.")

    def RepairProduct(self):
        print(self.User_name, "repaired a product.")

    def Giveservice(self):
        print(self.User_name, "provided a service.")

    def MarketProduct(self):
        print(self.User_name, "marketed a product.")