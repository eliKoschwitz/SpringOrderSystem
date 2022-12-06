package com.example.bestellsystemspringversion.repository;

import com.example.bestellsystemspringversion.model.Product;

import com.example.bestellsystemspringversion.service.ShopService;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
//@Component
public class ProductRepo {
    private List<Product> products = new ArrayList<>();

    /* DAS WIRD HIER ZWEI MAL VERWENDET IWIE DAS EINE IST VOM ANDEREN ABHÄNGIG
    private ShopService shopService;
    public ProductRepo(ShopService shopService) {
        this.shopService = ShopService;
    }
    */

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