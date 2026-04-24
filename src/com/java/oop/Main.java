package com.java.oop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //local variable
        int price;
        price = 100;
        Product product;// reference to an object

        product = new Product();
        product.id = 1;
        product.name = "Lenovo Laptop";
        product.maxRetailPrice = 1000;
        product.rating = 4.5f;
        product.reviewsCount = 100;
        product.discountPercentage = 10;
        product.isAvailable = true;
        product.company = "Lenovo";
        product.category = "Laptop";
        product.displayProductDetails();

        Product product2 = new Product();
        product2.id = 2;
        product2.name = "Samsung TV";
        product2.maxRetailPrice = 2000;
        product2.rating = 4.0f;
        product2.reviewsCount = 50;
        product2.discountPercentage = 5;
        product2.isAvailable = true;
        product2.company = "Samsung";
        product2.category = "TV";
        product2.displayProductDetails();

        //from here
        Product product3;
        new Product();
        Product product4 = new Product();
        Product product5;
        product5 = product4;
        product4.name = "Samsung TV";
        product5.name = "Appple Tv";
        System.out.println(product4.name);
        System.out.println(product5.name);
        System.out.println(new Product().name);


        Product product6 = new Product(666,"Lenovo Laptop",345345,4.5F,34534,(byte)20,true,"Lenovo","laptop");
        product6.displayProductDetails();

        Product product7 = new Product(777,"Samsung Laptop",345345,4.5F,34534,(byte)20,true,"Samsung","laptop");

       product7.displayProductDetails();


       product7.displayProductsByCompany("Samsung");
       product7.displayProductsByCategoryAndManufacturedYear("Laptop",2023);
       /*long totalInventoryValue = product7.totalInventoryValue();
        System.out.println("Total Inventory Value: " + totalInventoryValue );*/
        System.out.println("Total Inventory Value: " + product7.totalInventoryValue() );

        long totalInventoryValue = product7.totalInventoryValue();
        long totalEarnings = product7.totalEarnings(2023);
        System.out.println("Total Earnings: " + totalEarnings );

        //static
    }
}