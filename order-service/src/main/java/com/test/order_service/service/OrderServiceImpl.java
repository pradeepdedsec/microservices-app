package com.test.order_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.order_service.client.InventoryClient;
import com.test.order_service.model.Order;
import com.test.order_service.repository.OrderRepository;

import java.util.UUID;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    @Autowired
    private final OrderRepository orderRepository;

    @Autowired
    private final InventoryClient inventoryClient;

    @Override
    public String placeOrder(Order order) {

        boolean isInStock=inventoryClient.isInStock(order.getSkuCode(), order.getQuantity());

        if(isInStock){
            order.setId(null);
            order.setOrderNumber(UUID.randomUUID().toString());
            orderRepository.save(order);
            return "Order Placed Successfully";
        }
        else{
            return "Product with SkuCode " + order.getSkuCode() + " is not in stock";
        }
        
    }
    
}
