package com.java.oop.collections.assignment;

import java.util.List;

public class ProductService {

    private List<Product> products;
    private CsvReader csvReader;

    public ProductService(CsvReader csvReader) {
        this.csvReader = csvReader;
        products = this.csvReader.getProductsFromCsv();
    }

    /*
    CRUD
    Create -> new Product
    REad -> existing product read
        -> existing all products
    Update -> existing product update
    Delete -> existing product delete
     */

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    public Product getProductById(int id) {
        Product getProductById = null;
        for (Product product : products) {
            if (product.getId() == id) {
                getProductById = product;
            }
        }
        return getProductById;
    }

    public Product updateProduct(Product product) {
        int index = 0;
        for (Product p : products) {
            if (p.getId() == product.getId()) {
                products.set(index, product);
                return product;
            }
            index++;
        }
        return null;

    }

    public void displayProducts(List<Product> products) {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-30s %-8s %-10s %-10s %-10s %-10s\n","ID","NAME","PRICE","DISCOUNT(%)","AVAILABILITY","CATEGORY","COMPANY");
        System.out.println("-----------------------------------------------------------------------------------------");

        products.forEach(product -> {
            System.out.printf("%-5d %-30s %-8d %-10d %-10b %-10s %-10s\n",product.getId(),product.getName(),product.getMaxRetailPrice(),product.getDiscountPercentage(),product.isAvailable(),product.getCategory(),product.getCompany());
            System.out.println("---------------------------------------------------------------------------------------");

        });

    }

}
