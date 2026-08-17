# This is the User class - it stores basic info about any person using in python
class User:
    
    # self refers to the current object (like 'this' in Java)
    def __init__(self):
        # These are the attributes (data) that every user has
        self.uid = 0           # Unique ID for the user
        self.userName = ""     # Name of the user
        self.contact = ""      # Phone number
        self.age = 0           # Age of the user
        self.email = ""        # Email address
        self.address = ""      # Home address
    
    # This function displays all the user details on the screen
    # It does NOT take any parameters and does NOT return anything
    def displayUser(self):
        print("User ID :", self.uid)
        print("Name    :", self.userName)
        print("Contact :", self.contact)
        print("Age     :", self.age)
        print("Email   :", self.email)
        print("Address :", self.address)