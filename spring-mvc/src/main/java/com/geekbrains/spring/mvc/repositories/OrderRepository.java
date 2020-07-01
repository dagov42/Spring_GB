package com.geekbrains.spring.mvc.repositories;

import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrderRepository {
    void save(Order order);

    void delete(Order order);

    List<com.geekbrains.spring.mvc.model.Order> getAll();

    com.geekbrains.spring.mvc.model.Order getById(Integer id);

}
