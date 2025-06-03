package com.idrisnergis.microservice.order_service.service;

import com.idrisnergis.microservice.order_service.dto.OrderRequest;
import com.idrisnergis.microservice.order_service.model.Order;
import com.idrisnergis.microservice.order_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){
        Order order   = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(order.getPrice());
        order.setSkuCode(order.getSkuCode());
        order.setQuantity(orderRequest.quantity());
        orderRepository.save(order);
    }
}