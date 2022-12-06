package com.example.bestellsystemspringversion.repository;

import com.example.bestellsystemspringversion.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@Component
public class OrderRepo {

    private List<Order> orders = new ArrayList<>();

    public void add(Order order){
        orders.add(order);
    }

    public List<Order> list() {
        return orders;
    }

    public Order get(int id) {
        for(Order order : orders) {
            if(order.getId() == id){
                return order;
            }
        }
        return null;
    }
}