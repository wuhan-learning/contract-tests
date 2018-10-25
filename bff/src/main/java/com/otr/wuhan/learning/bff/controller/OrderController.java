package com.otr.wuhan.learning.bff.controller;

import com.otr.wuhan.learning.shared.client.OrderClient;
import com.otr.wuhan.learning.shared.client.dto.OrderDetailDto;
import com.otr.wuhan.learning.shared.client.dto.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    private final OrderClient orderClient;

    public OrderController(OrderClient orderClient) {
        this.orderClient = orderClient;
    }

    @GetMapping("/api/orders/{id}")
    OrderDetailDto getOrderDetail(@PathVariable String id) {
        return orderClient.getOrderDetail(id);
    }

    @GetMapping("/api/orders")
    List<OrderDetailDto> getOrders(@RequestParam String user) {
        return orderClient.getOrders(user);
    }
}
