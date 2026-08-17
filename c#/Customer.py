# This is the customer class - it stores basic info about any customer using in python
class Customer:
    def _init_(self):
        self.uid
        self.cid
        self.name
        self.phone
        self.email
        self.address
        self.total_purchase

# This is the display fuction that displays the customer details 
    def displayUser(self):
        print("User ID        :", self.uid)
        print("Customer ID    :", self.cid)
        print("Name           :", self.userName)
        print("Phone          :", self.phone)
        print("Email          :", self.email)
        print("Address        :", self.address)
        print("Total Purchase :", self.age)


    def purchaseProduct(self, p):
        print(self.name + " purchased " + p.productName)

    def replaceProduct(self, p):
        print(self.name + " replaced " + p.productName)

    def returnProduct(self, p):
        print(self.name + " returned " + p.productName)