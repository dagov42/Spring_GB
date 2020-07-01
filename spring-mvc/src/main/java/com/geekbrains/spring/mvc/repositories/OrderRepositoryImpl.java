package com.geekbrains.spring.mvc.repositories;

import com.geekbrains.spring.mvc.model.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderRepositoryImpl implements OrderRepository{
    private List<Order> orders = new ArrayList<Order>();

    public OrderRepositoryImpl() {
        Order order = new Order();
        order.setId(1);
        order.setPrice(234d);
        order.setTitle("Pizza peperoni");
        Order order2 = new Order();
        order2.setId(2);
        order2.setPrice(123d);
        order2.setTitle("Sushi Philadelfia");
        orders.add(order);
        orders.add(order2);
    }

    @Override
    public void save(org.springframework.core.annotation.Order order) {
        orders.add((Order) order);
    }

    @Override
    public void delete(org.springframework.core.annotation.Order order) {
        orders.remove(order);
    }

    public List<Order> getAll() {
        return orders;
    }

    public Order getById(Integer id) {
        return orders.get(id);
    }
}
