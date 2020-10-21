package com.shopping;

import java.util.ArrayList;
import java.util.List;


public class Products {
    private final List<Product> products = new ArrayList<Product>();

    public Products () {
        this.initStoreItems();
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
    public void initStoreItems() {
        String [] productNames = {"TV", "mobile", "Computer"};
        Double [] productPrice = {30800.00, 89000.00, 3700.00};
        Integer [] stock = {30, 40, 50};
        
        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, productNames[i], productPrice[i], stock[i]));
        }
    }
}