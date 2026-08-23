class User:
    def __init__(self):
        self.uid = 0
        self.User_name = ""
        self.contact = ""
        self.age = 0
        self.email = ""
        self.address = ""

    def displayUser(self):
        print("User ID :", self.uid)
        print("Name    :", self.User_name)
        print("Contact :", self.contact)
        print("Age     :", self.age)
        print("Email   :", self.email)
        print("Address :", self.address)