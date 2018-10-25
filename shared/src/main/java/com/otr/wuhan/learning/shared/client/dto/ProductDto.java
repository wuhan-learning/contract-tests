package com.otr.wuhan.learning.shared.client.dto;

import java.math.BigDecimal;

public class ProductDto {
    private String id;
    private String name;
    private BigDecimal price;
    private int stockBalance;
    private String description;
    private boolean isAvailable;

    public ProductDto() {
    }

    public ProductDto(String id, String name, BigDecimal price, int stockBalance, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockBalance = stockBalance;
        this.description = description;
        this.isAvailable = stockBalance > 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getStockBalance() {
        return stockBalance;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
