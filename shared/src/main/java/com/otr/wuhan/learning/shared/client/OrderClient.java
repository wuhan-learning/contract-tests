package com.otr.wuhan.learning.shared.client;

import com.otr.wuhan.learning.shared.client.dto.OrderDetailDto;
import com.otr.wuhan.learning.shared.client.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "order-service", decode404 = true)
public interface OrderClient {
    @GetMapping("/orders/{id}")
    OrderDetailDto getOrderDetail(@PathVariable("id") String id);

    @GetMapping("/orders")
    List<OrderDetailDto> getOrders(@RequestParam("user") String user);
}
