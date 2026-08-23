class Owner:
    def __init__(self):
        self.uid = 0
        self.o_id = 0
        self.User_name = ""
        self.contact = ""
        self.email = ""
        self.address = ""

    def displayOwner(self):
        print("Owner ID :", self.o_id)
        print("User ID  :", self.uid)
        print("Name     :", self.User_name)
        print("Contact  :", self.contact)
        print("Email    :", self.email)
        print("Address  :", self.address)

    def ManageStore(self):
        print(self.User_name, "is managing the store.")