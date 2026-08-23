using System;

class Product {
    private int p_id;
    private string product_name;
    private double Price;
    private string Category;
    private string Warranty;
    private int stock;

    public int getP_id() { return p_id; }
    public void setP_id(int id) {
        if(id > 0) p_id = id;
        else Console.WriteLine("Product id must be greater than 0.");
    }

    public string getProduct_name() { return product_name; }
    public void setProduct_name(string name) { product_name = name; }

    public double getPrice() { return Price; }
    public void setPrice(double price) {
        if(price > 0) Price = price;
        else Console.WriteLine("Price cannot be negative");
    }

    public string getCategory() { return Category; }
    public void setCategory(string cat) { Category = cat; }

    public string getWarranty() { return Warranty; }
    public void setWarranty(string w) { Warranty = w; }

    public int getStock() { return stock; }
    public void setStock(int s) {
        if(s >= 0) stock = s;
        else Console.WriteLine("Stock cannot be negative");
    }

    public void display() {
        Console.WriteLine("PRODUCT DETAILS");
        Console.WriteLine("---------------");
        Console.WriteLine("Product Id    : " + p_id);
        Console.WriteLine("Product Name  : " + product_name);
        Console.WriteLine("Price         : Rs." + Price);
        Console.WriteLine("Category      : " + Category);
        Console.WriteLine("Warranty      : " + Warranty);
        Console.WriteLine("Stock         : " + stock);
    }
}

class Encapsulation {
    static void Main(string[] args) {
        Console.WriteLine(" ENCAPSULATION  \n");

        Product laptop = new Product();
        laptop.setP_id(1);
        laptop.setProduct_name("Laptop");
        laptop.setPrice(75000.00);
        laptop.setCategory("Computer");
        laptop.setWarranty("2 years");
        laptop.setStock(10);

        laptop.display();

        Console.WriteLine("\n--- Trying invalid price ---");
        laptop.setPrice(-50000.00);

    }
}