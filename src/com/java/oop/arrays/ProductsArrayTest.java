package com.java.oop.arrays;

public class ProductsArrayTest {
    public static void main(String[] args) {
        /*Product[] products = new Product[5];
        products[0] = new Product(1,"laptop",3423,4.5f,23423,(byte)10,true,"lenovo", "laptop");
        products[1] = new Product(2,"laptop2",3423,4.5f,23423,(byte)10,true,"lenovo", "laptop");
        products[2] = new Product(3,"laptop3",3423,4.5f,23423,(byte)10,true,"lenovo", "laptop");
        products[3] = new Product(4,"laptop4",3423,4.5f,23423,(byte)10,true,"lenovo", "laptop");
        products[4] = new Product(5,"laptop5",3423,4.5f,23423,(byte)10,true,"lenovo", "laptop");
        */
        Product[] products = new Product[]{
                new Product(1,"laptop",3423,4.5f,23423,(byte)10,true,"lenovo", "laptop"),
                new Product(2,"laptop2",3423,4.5f,23423,(byte)10,true,"lenovo", "laptop"),
                new Product(3,"laptop3",3423,4.5f,23423,(byte)10,true,"lenovo", "laptop"),
                new Product(4,"laptop4",3423,4.5f,23423,(byte)10,true,"lenovo", "laptop"),
                new Product(5,"laptop5",3423,4.5f,23423,(byte)10,true,"lenovo", "laptop"),

        };

        for (Product product : products) {
            product.displayProductDetails();
        }
    }
}
