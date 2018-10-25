package com.otr.wuhan.learning.shared.client.dto;

import java.util.Date;
import java.util.List;

public class OrderDetailDto {
    private String id;
    private String userName;
    private Date createdTime;
    private String orderStatus;
    private String remark;

    private List<OrderItem> items;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String id, String userName, Date createdTime, String orderStatus, String remark) {
        this.id = id;
        this.userName = userName;
        this.createdTime = createdTime;
        this.orderStatus = orderStatus;
        this.remark = remark;
    }

    public static class OrderItem {
        private int itemId;
        private String productId;
        private int quantity;

        public OrderItem() {
        }

        public OrderItem(int itemId, String productId, int quantity) {
            this.itemId = itemId;
            this.productId = productId;
            this.quantity = quantity;
        }

        public int getItemId() {
            return itemId;
        }

        public String getProductId() {
            return productId;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public String getRemark() {
        return remark;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}
