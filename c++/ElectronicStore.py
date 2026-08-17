# Import the User class from user.py file
from User import User

# ========== MAIN PROGRAM ==========
# This is where we create objects and call their functions
if __name__ == "__main__":
    
    print("----- ELECTRONIC STORE MANAGEMENT SYSTEM -----\n")
    
    # Creating a User object
    # This automatically calls the constructor __init__()
    user = User()
    
    # Setting values one by one (exactly like your Java main!)
    user.uid = 1
    user.userName = "Admin User"
    user.contact = "9999999999"
    user.age = 30
    user.email = "admin@store.com"
    user.address = "Goa"
    
    # Calling the display function
    print("--- USER ---")
    user.displayUser()
    
    customer = Customer()

    custom