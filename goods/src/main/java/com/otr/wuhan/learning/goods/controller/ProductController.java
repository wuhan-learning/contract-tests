package com.otr.wuhan.learning.goods.controller;

import com.otr.wuhan.learning.goods.persist.ProductEntity;
import com.otr.wuhan.learning.goods.persist.ProductRepository;
import com.otr.wuhan.learning.shared.client.dto.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public List<ProductDto> getProducts(@RequestParam("name") String name) {
        return productRepository.findAllByNameLike("%" + name + "%")
                .stream()
                .map(ProductEntity::toProductDto)
                .collect(Collectors.toList());
    }
}
