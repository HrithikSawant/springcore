package org.springcore.LifeCycle;

public class Product {
    String name;
    String type;
    double price;
    String size;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void init()
    {
        System.out.println("Product Initiated");
    }
    public void destroy(){
        System.out.println("Product Purchased");
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
