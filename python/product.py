class Product:
    def __init__(self):
        self.p_id = 0
        self.product_name = ""
        self.brand = ""
        self.Price = 0.0
        self.Category = ""
        self.Warranty = ""
        self.stock = 0

    def Display(self):
        print("Product ID    :", self.p_id)
        print("Product Name  :", self.product_name)
        print("Brand         :", self.brand)
        print("Price         : Rs.", self.Price)
        print("Category      :", self.Category)
        print("Warranty      :", self.Warranty)
        print("Stock         :", self.stock)