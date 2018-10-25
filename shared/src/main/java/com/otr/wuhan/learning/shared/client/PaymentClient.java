package com.otr.wuhan.learning.shared.client;

import com.otr.wuhan.learning.shared.client.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "payment-service", url = "http://127.0.0.1:9000", decode404 = true)
public interface PaymentClient {
    @GetMapping("/products")
    List<ProductDto> getProducts(@RequestParam("name") String name);
}
