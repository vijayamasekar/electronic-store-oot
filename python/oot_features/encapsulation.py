class Product:
    def __init__(self):
        self.__p_id = 0
        self.__product_name = ""
        self.__Price = 0.0
        self.__Category = ""
        self.__Warranty = ""
        self.__stock = 0

    def getP_id(self):
        return self.__p_id

    def setP_id(self, id):
        if id > 0:
            self.__p_id = id
        else:
            print("Product id must be greater than 0.")

    def getProduct_name(self):
        return self.__product_name

    def setProduct_name(self, name):
        self.__product_name = name

    def getPrice(self):
        return self.__Price

    def setPrice(self, price):
        if price > 0:
            self.__Price = price
        else:
            print("Price cannot be negative")

    def getCategory(self):
        return self.__Category

    def setCategory(self, cat):
        self.__Category = cat

    def getWarranty(self):
        return self.__Warranty

    def setWarranty(self, w):
        self.__Warranty = w

    def getStock(self):
        return self.__stock

    def setStock(self, s):
        if s >= 0:
            self.__stock = s
        else:
            print("Stock cannot be negative")

    def display(self):
        print("PRODUCT DETAILS")
        print("---------------")
        print("Product Id    :", self.__p_id)
        print("Product Name  :", self.__product_name)
        print("Price         : Rs.", self.__Price)
        print("Category      :", self.__Category)
        print("Warranty      :", self.__Warranty)
        print("Stock         :", self.__stock)


if __name__ == "__main__":
    print(" ENCAPSULATION  \n")

    laptop = Product()
    laptop.setP_id(1)
    laptop.setProduct_name("Laptop")
    laptop.setPrice(75000.00)
    laptop.setCategory("Computer")
    laptop.setWarranty("2 years")
    laptop.setStock(10)

    laptop.display()

    print("\n--- Trying invalid price ---")
    laptop.setPrice(-50000.00)

   