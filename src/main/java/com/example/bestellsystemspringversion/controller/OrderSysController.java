package com.example.bestellsystemspringversion.controller;


import com.example.bestellsystemspringversion.model.Order;
import com.example.bestellsystemspringversion.model.Product;
import com.example.bestellsystemspringversion.service.ShopService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class OrderSysController {

    private final static ShopService shopService = new ShopService();

    @GetMapping("/api/products")
    public List<Product> listProducts(){
        return shopService.ListProducts();
    }

    @GetMapping(path = "/api/products/{id}")
    public Product listProducts(@PathVariable int id){
        return shopService.getProduct(id);
    }

    @GetMapping(path = "/api/orders")
    public List<Order> listOrders(){
        return shopService.listOrders();
    }

    @GetMapping(path = "/api/orders/{id}")
    public Order listOrders(@PathVariable int id){
        return shopService.getOrder(id);
    }

    /* AUFGABE 5 POST /api/orders/{id} (int-array als Body)
    // das passt noch nicht von den Übergabeparametern
    @PostMapping("/api/orders/{id}")
    public int[] giveOrders(@PathVariable int id, @RequestBody int[] newOrders){
        shopService.addOrder(newOrders[id]);
        return
    }
     */

    //Bonus AUFGABE 1

    //Bonus AUFGABE 2
    @PostMapping("/api/orders/add")
    public void addOrder(@RequestBody Order newOrder){
        shopService.addOrder(newOrder);
    }

    //Bonus AUFGABE 3
    @PostMapping
    public void addProduct(@RequestBody Product newProduct){
        shopService.addProduct(newProduct);
    }

    //Bonus AUFGABE 4
}