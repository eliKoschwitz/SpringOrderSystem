package com.example.bestellsystemspringversion.service;

import com.example.bestellsystemspringversion.model.Order;
import com.example.bestellsystemspringversion.model.Product;
import com.example.bestellsystemspringversion.repository.OrderRepo;
import com.example.bestellsystemspringversion.repository.ProductRepo;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class ShopService {
    private OrderRepo orderRepo = new OrderRepo();
    private ProductRepo productRepo = new ProductRepo();

    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }

    public void addOrder(Order order){
        checkProductsExist(order.getProducts());
        orderRepo.add(order);
    }

    private void checkProductsExist(List<Product> produktsFromTheOrder){
        for(Product product : produktsFromTheOrder) {
            if (productRepo.list().contains(product)) {
                System.out.println(product +" Produkt kann bestellt werden");
            } else {
                throw new IndexOutOfBoundsException("Produkt nicht vorhanden");
            }
        }
    }

    public Product getProduct(int i) {
        return productRepo.get(i);
    }

    public List<Product> ListProducts() {
        return productRepo.list();
    }

    public Order getOrder(int i) {
        return orderRepo.get(i);
    }

    public List<Order> listOrders() {
        return orderRepo.list();
    }
}
