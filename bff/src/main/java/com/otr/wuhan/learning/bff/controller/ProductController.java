package com.otr.wuhan.learning.bff.controller;

import com.otr.wuhan.learning.shared.client.GoodsClient;
import com.otr.wuhan.learning.shared.client.dto.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final GoodsClient goodsClient;

    public ProductController(GoodsClient goodsClient) {
        this.goodsClient = goodsClient;
    }

    @GetMapping("/api/goods")
    public List<ProductDto> getProducts(@RequestParam("name") String name) {
        return goodsClient.getProducts(name);
    }
}
