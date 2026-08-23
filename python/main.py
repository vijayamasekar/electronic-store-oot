from user import User
from customer import Customer
from supplier import Supplier
from staff import Staff
from owner import Owner
from investor import Investor
from product import Product
from store import Store

print("------ ELECTRONIC STORE MANAGEMENT SYSTEM -----\n")

user = User()
user.uid = 1
user.User_name = "Admin User"
user.contact = "1234569872"
user.age = 30
user.email = "admin@gmail.com"
user.address = "Goa"

customer = Customer()
customer.cid = 101
customer.uid = 2
customer.User_name = "Vijaya Masekar"
customer.contact = "9876543210"
customer.email = "vijaya@gmail.com"
customer.address = "Panjim, Goa"
customer.total_purchase = 75000

supplier = Supplier()
supplier.sid = 201
supplier.uid = 3
supplier.User_name = "Amit Kumar"
supplier.contact = "2315248536"
supplier.email = "amit@dell.com"
supplier.address = "Mumbai"
supplier.Company_Name = "Dell Pvt Ltd"

staff = Staff()
staff.uid = 5
staff.s_id = 501
staff.User_name = "Rahul Sharma"
staff.contact = "1236547985"
staff.email = "rahul@store.com"
staff.address = "Goa"
staff.joining_date = "01-01-2024"
staff.salary = 25000

owner = Owner()
owner.uid = 4
owner.o_id = 401
owner.User_name = "Mr. Sharma"
owner.contact = "2536952458"
owner.email = "owner@store.com"
owner.address = "Goa"

investor = Investor()
investor.uid = 6
investor.i_id = 601
investor.User_name = "Rakesh Chaudhary"
investor.contact = "9568458575"
investor.email = "rakesh@invest.com"
investor.address = "Delhi"
investor.date = "15-03-2024"
investor.amount = 500000

product = Product()
product.p_id = 1001
product.product_name = "Headphones"
product.brand = "Sony"
product.Price = 5000
product.Category = "Audio"
product.Warranty = "1 year"
product.stock = 50

store = Store()
store.store_id = 1
store.name = "Smart Electronics"
store.Location = "Goa"
store.Contact = "0832-123456"

while True:
    print("\n ELECTRONIC STORE MANAGEMENT SYSTEM  ")
    print("1. Display All Users")
    print("2. Display Product Details")
    print("3. Display Store Details")
    print("4. Perform Activities")
    print("5. Exit")
    print("")
    choice = int(input("Enter your choice (1-5): "))

    if choice == 1:
        print("\n USER DETAILS ")
        user.displayUser()

        print("\n CUSTOMER DETAILS ")
        customer.displayCustomer()

        print("\n SUPPLIER DETAILS ")
        supplier.displaySupplier()

        print("\n STAFF DETAILS ")
        staff.displayStaff()

        print("\n OWNER DETAILS ")
        owner.displayOwner()

        print("\n INVESTOR DETAILS ")
        investor.displayInvestor()

    elif choice == 2:
        print("\n PRODUCT DETAILS ")
        product.Display()

    elif choice == 3:
        print("\n STORE DETAILS ")
        store.displayStore()

    elif choice == 4:
        print("\n ACTIVITIES PERFORMED \n")

        print("--- CUSTOMER ACTIVITIES ---")
        customer.PurchaseProduct()
        customer.ReturnProduct()
        customer.ReplaceProduct()
        customer.GiveFeedback()
        print()

        print("--- SUPPLIER ACTIVITIES ---")
        supplier.SupplyProduct()
        print()

        print("--- STAFF ACTIVITIES ---")
        staff.SellProduct()
        staff.RepairProduct()
        staff.Giveservice()
        staff.MarketProduct()
        print()

        print("--- OWNER ACTIVITIES ---")
        owner.ManageStore()
        print()

        print("--- INVESTOR ACTIVITIES ---")
        investor.invest()
        print()

        print("--- PRODUCT DISPLAY ---")
        product.Display()

    elif choice == 5:
        print("\nThank you! Program Exited Successfully.")
        break

    else:
        print("\nInvalid choice! Please enter a number between 1 and 5.")