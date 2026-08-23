class Store:
    def __init__(self):
        self.store_id = 0
        self.name = ""
        self.Location = ""
        self.Contact = ""

    def displayStore(self):
        print("Store ID :", self.store_id)
        print("Name     :", self.name)
        print("Location :", self.Location)
        print("Contact  :", self.Contact)