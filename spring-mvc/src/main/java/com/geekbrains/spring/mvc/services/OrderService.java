package com.geekbrains.spring.mvc.services;

import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrderService {
    void save(Order order);

    void delete(Order order);

    List<com.geekbrains.spring.mvc.model.Order> getAll();

    com.geekbrains.spring.mvc.model.Order getById(Integer id);
}
