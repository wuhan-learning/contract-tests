package com.otr.wuhan.learning.order.dto;

import com.otr.wuhan.learning.order.persist.OrderEntity;
import com.otr.wuhan.learning.order.persist.OrderItemEntity;
import com.otr.wuhan.learning.order.persist.OrderStatus;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDetailDto {
    private String id;
    private String userName;
    private Date createdTime;
    private OrderStatus orderStatus;
    private String remark;

    private List<OrderItem> items;

    public OrderDetailDto(String id, String userName, Date createdTime, OrderStatus orderStatus, String remark) {
        this.id = id;
        this.userName = userName;
        this.createdTime = createdTime;
        this.orderStatus = orderStatus;
        this.remark = remark;
    }

    public static OrderDetailDto from(final OrderEntity orderEntity, List<OrderItemEntity> itemEntities) {
        OrderDetailDto detail = new OrderDetailDto(orderEntity.getId(),
                orderEntity.getUserName(),
                orderEntity.getCreatedTime(),
                orderEntity.getOrderStatus(),
                orderEntity.getRemark());
        detail.items = itemEntities.stream()
                .map(OrderItem::from)
                .collect(Collectors.toList());
        return detail;
    }

    public static class OrderItem {
        private int itemId;
        private String productId;
        private int quantity;

        public OrderItem(int itemId, String productId, int quantity) {
            this.itemId = itemId;
            this.productId = productId;
            this.quantity = quantity;
        }

        public static OrderItem from(final OrderItemEntity entity) {
            return new OrderItem(entity.getItemId(),
                    entity.getProductId(),
                    entity.getQuantity());
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

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public String getRemark() {
        return remark;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}
