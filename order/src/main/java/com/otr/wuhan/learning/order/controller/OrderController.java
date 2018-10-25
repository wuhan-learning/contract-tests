package com.otr.wuhan.learning.order.controller;

import com.otr.wuhan.learning.order.dto.OrderDetailDto;
import com.otr.wuhan.learning.order.persist.OrderEntity;
import com.otr.wuhan.learning.order.persist.OrderItemEntity;
import com.otr.wuhan.learning.order.persist.OrderItemRepository;
import com.otr.wuhan.learning.order.persist.OrderRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class OrderController {
    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;

    public OrderController(OrderRepository orderRepository, OrderItemRepository orderItemRepository) {
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
    }

    @GetMapping("/orders/{id}")
    OrderDetailDto getOrderDetail(@PathVariable String id) {
        final Optional<OrderEntity> order = orderRepository.findById(id);
        final List<OrderItemEntity> items = orderItemRepository.findAllByOrderId(id);
        return OrderDetailDto.from(order.get(), items);
    }

    @GetMapping("/orders")
    List<OrderDetailDto> getOrders(@RequestParam String user) {
        List<OrderEntity> orders = orderRepository.findAllByUserName(user);
        Set<String> orderIds = orders.stream()
                .map(OrderEntity::getId)
                .collect(Collectors.toSet());
        Map<String, List<OrderItemEntity>> items = orderItemRepository.findAllByOrderIdIn(orderIds)
                .stream()
                .collect(Collectors.groupingBy(OrderItemEntity::getOrderId));
        return orders.stream()
                .map(order -> OrderDetailDto.from(order, items.get(order.getId())))
                .collect(Collectors.toList());

    }
}
