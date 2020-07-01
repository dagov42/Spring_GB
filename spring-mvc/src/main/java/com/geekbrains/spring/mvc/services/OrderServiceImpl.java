package com.geekbrains.spring.mvc.services;

import com.geekbrains.spring.mvc.repositories.OrderRepository;
import com.geekbrains.spring.mvc.repositories.OrderRepositoryImpl;
import com.geekbrains.spring.mvc.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository = new OrderRepositoryImpl();


    public void save(Order order) {
        if (order != null) {
            List<Order> orders = orderRepository.getAll();
            if (!orders.isEmpty()) {
                Order lastOrder = orders.get(orders.size() - 1);
                order.setId(lastOrder.getId() + 1);
                orderRepository.save(order);
            }
        }
    }
    public void delete(Order order) {
        if (order != null) {
            orderRepository.delete(order);
        }
    }

    public List<Order> getAll() {
        return orderRepository.getAll();
    }

    public Order getById(Integer id) {
        if (id != null) {
            return orderRepository.getById(id);
        }
        return null;
    }
}
