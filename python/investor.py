class Investor:
    def __init__(self):
        self.uid = 0
        self.i_id = 0
        self.User_name = ""
        self.contact = ""
        self.email = ""
        self.address = ""
        self.date = ""
        self.amount = 0.0

    def displayInvestor(self):
        print("Investor ID :", self.i_id)
        print("User ID     :", self.uid)
        print("Name        :", self.User_name)
        print("Contact     :", self.contact)
        print("Email       :", self.email)
        print("Address     :", self.address)
        print("Date        :", self.date)
        print("Amount      : Rs.", self.amount)

    def invest(self):
        print(self.User_name, "invested Rs.", self.amount)