package com.example.bestellsystemspringversion.repository;

import com.example.bestellsystemspringversion.model.Product;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductRepo {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> list() {
        return products;
    }

    public Product get(int id){
        for(Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}