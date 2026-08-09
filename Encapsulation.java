/*
 * ============================================================
 * Author         : [Your Name]
 * Roll Number    : [Your Roll No]
 * Subject        : Object Oriented Technology
 * Topic          : Encapsulation
 * Description    : Demonstrating Encapsulation by keeping fields
 *                  private and accessing them through public
 *                  getters and setters with validation.
 * ============================================================
 */

class Product{
    private int productId;
    private String productName;
    private String brand;
    private double price;
    private int stock;


    public int getProductId()
    {
        return productId;
    }


    public String getProductName()
    {
        return productName;
    }


    public String getBrand()
    {
        return brand;
    }


    public double getPrice()
    {
        return price;
    }


    public int getStock()
    {
        return stock;
    }


    public void setProductId(int id)
    {
        if(id>0)
        {
            productId=id;
        }
        else{
            System.out.println("Product id must be greater than 0.");
        }
    }


    public void setProductName(String name)
    {
        productName=name;
    }


    public void setBrand(String brandname)
    {
        brand=brandname;
    }


    public void setPrice(Double productprice)
    {
        if(productprice>0)
        {
            price=productprice;
        }
        else
        {
            System.out.println("Price cannot be negative");
        }
    }


    public void setStock(int productstock)
    {
        if(productstock>0)
        {
            stock=productstock;
        }
        else{
            System.out.println("stock cannot be negative");
        }
    }
    public void display()
    {
        System.out.println("PRODUCT DETAILS");
        System.out.println("---------------");
        System.out.println("Product Id : "+productId);
        System.out.println("Product Name : "+productName);
        System.out.println("Product Brand :"+brand);
        System.out.println("Product Price : Rs."+price);
        System.out.println("Product Stock : "+stock);
    }


}


public class Encapsulation {


    public static void main(String[] args) {
        Product laptop=new Product();
        laptop.setProductId(1);
        laptop.setProductName("Laptop");
        laptop.setBrand("HP");
        laptop.setPrice(75000.00);
        laptop.setStock(10);
        laptop.display();
        laptop.setPrice(-50000.00);
    }
   
}