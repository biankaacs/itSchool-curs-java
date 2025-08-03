package org.example.session18.homework;

public class Product {
    /*
    Create a Product class with name, price, and id fields.
    Implement the equals() method to check only the id field.
    Implement the hashCode() method to use the id field to calculate the hash code.
    Test that two instances with the same id return true for equals() and have the same hash code.
    Then change the id of one instance and test that they are no longer equal and have different hash codes.
     */
    private String name;
    private double price;
    private String id;
    public Product(String name, double price, String id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return id.equals(product.id);
    }
    @Override
    public int hashCode() {
        return id.hashCode();
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99, "P123");
        Product product2 = new Product("Laptop", 999.99, "P123");
        Product product3 = new Product("Smartphone", 499.99, "P456");

        System.out.println("product1 equals product2: " + product1.equals(product2));
        System.out.println("product1 equals product3: " + product1.equals(product3));
        System.out.println("product1 hashCode: " + product1.hashCode());
        System.out.println("product2 hashCode: " + product2.hashCode());
        System.out.println("product3 hashCode: " + product3.hashCode());

        // Change id of product1
        product1.id = "P789";
        System.out.println("After changing id of product1:");
        System.out.println("product1 equals product2: " + product1.equals(product2));
        System.out.println("product1 hashCode: " + product1.hashCode());
    }
}
