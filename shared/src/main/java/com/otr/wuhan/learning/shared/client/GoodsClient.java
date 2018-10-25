package com.otr.wuhan.learning.shared.client;

import com.otr.wuhan.learning.shared.client.dto.ProductDto;
import com.otr.wuhan.learning.shared.client.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "goods-service", decode404 = true)
public interface GoodsClient {
    @GetMapping("/products")
    List<ProductDto> getProducts(@RequestParam("name") String name);
}
