package com.java.oop;

public class Product {
    //instance variables
    int id;
    String name;
    int maxRetailPrice;
    float rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;
    String company;
    String category;

    static String vendorName;

    //no-arg constructor
    public Product(){
        System.out.println("Product constructor called");
        this.id = 111;
        name = "Lenovo Laptop";
        maxRetailPrice = 1000;
        rating = 4.5f;
        reviewsCount = 100;
        discountPercentage = 10;
        isAvailable = true;
        company = "Lenovo";
        category = "Laptop";
    }

    public Product(String name, int maxRetailPrice, String company, String category) {
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.company = company;
        this.category = category;
    }

    public Product(int id, String name, int maxRetailPrice, float rating, int reviewsCount, byte discountPercentage, boolean isAvailable, String company, String category) {

        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
        this.company = company;
        this.category = category;
    }


    //display product details
    //instance method
    //no return type no-arguments
    void displayProductDetails(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Max Retail Price: " + maxRetailPrice);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews Count: " + reviewsCount);
        System.out.println("Discount Percentage: " + discountPercentage);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Company: " + company);
    }

    /*
    no return type with arguments
     */
    void displayProductsByCompany(String company){
        System.out.println("Displaying products by company: " + company);
    }

    void displayProductsByCategoryAndManufacturedYear(String category, int manufacturedYear){
        System.out.println("Displaying products by category and manufactured year: " + category + " " + manufacturedYear);
    }

    //return type with out arguments
    long totalInventoryValue(){
       long totalInventoryValue = 2342342342344324L;
       return totalInventoryValue;
    }

    //return type with arguments
    long totalEarnings(int year){
        long totalEarnings = 2342342342344324L;
        return totalEarnings;
    }
}


