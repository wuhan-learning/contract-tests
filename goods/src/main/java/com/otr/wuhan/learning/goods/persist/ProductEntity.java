package com.otr.wuhan.learning.goods.persist;

import com.otr.wuhan.learning.shared.client.dto.ProductDto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_product")
public class ProductEntity {
    @Id
    private String id;
    private String name;
    private BigDecimal price;
    private int stockBalance;
    private String description;

    public ProductEntity() {
    }

    public ProductDto toProductDto() {
        return new ProductDto(id, name, price, stockBalance, description);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStockBalance() {
        return stockBalance;
    }

    public void setStockBalance(int stockBalance) {
        this.stockBalance = stockBalance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
