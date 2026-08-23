class Customer:
    def __init__(self):
        self.cid = 0
        self.uid = 0
        self.User_name = ""
        self.contact = ""
        self.email = ""
        self.address = ""
        self.total_purchase = 0.0

    def displayCustomer(self):
        print("Customer ID    :", self.cid)
        print("User ID        :", self.uid)
        print("Name           :", self.User_name)
        print("Contact        :", self.contact)
        print("Email          :", self.email)
        print("Address        :", self.address)
        print("Total Purchase : Rs.", self.total_purchase)

    def PurchaseProduct(self):
        print(self.User_name, "purchased a product.")

    def ReturnProduct(self):
        print(self.User_name, "returned a product.")

    def ReplaceProduct(self):
        print(self.User_name, "replaced a product.")

    def GiveFeedback(self):
        print(self.User_name, "gave feedback.")