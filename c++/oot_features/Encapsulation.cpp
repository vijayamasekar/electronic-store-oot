#include <iostream>
using namespace std;

class Product {
private:
    int p_id;
    string product_name;
    double Price;
    string Category;
    string Warranty;
    int stock;

public:
    int getP_id() { return p_id; }
    void setP_id(int id) {
        if(id > 0) p_id = id;
        else cout << "Product id must be greater than 0." << endl;
    }

    string getProduct_name() { return product_name; }
    void setProduct_name(string name) { product_name = name; }

    double getPrice() { return Price; }
    void setPrice(double price) {
        if(price > 0) Price = price;
        else cout << "Price cannot be negative" << endl;
    }

    string getCategory() { return Category; }
    void setCategory(string cat) { Category = cat; }

    string getWarranty() { return Warranty; }
    void setWarranty(string w) { Warranty = w; }

    int getStock() { return stock; }
    void setStock(int s) {
        if(s >= 0) stock = s;
        else cout << "Stock cannot be negative" << endl;
    }

    void display() {
        cout << "PRODUCT DETAILS" << endl;
        cout << "---------------" << endl;
        cout << "Product Id    : " << p_id << endl;
        cout << "Product Name  : " << product_name << endl;
        cout << "Price         : Rs." << Price << endl;
        cout << "Category      : " << Category << endl;
        cout << "Warranty      : " << Warranty << endl;
        cout << "Stock         : " << stock << endl;
    }
};

int main() {
    Product laptop;
    laptop.setP_id(1);
    laptop.setProduct_name("Laptop");
    laptop.setPrice(75000.00);
    laptop.setCategory("Computer");
    laptop.setWarranty("2 years");
    laptop.setStock(10);

    laptop.display();

    cout << "\n--- Trying invalid price ---" << endl;
    laptop.setPrice(-50000.00);

    return 0;
}