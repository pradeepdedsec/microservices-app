package com.test.order_service.service;

import com.test.order_service.model.Order;

public interface OrderService {
    String placeOrder(Order order);
}
