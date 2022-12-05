package com.example.bestellsystemspringversion.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor

public class Order {

    private int id;

    List<Product> products;


    public int getId() {
        return id;
    }


    public List<Product> getProducts() {
        return products;
    }
}