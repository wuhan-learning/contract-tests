package com.otr.wuhan.learning.order.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItemEntity, Integer> {
    List<OrderItemEntity> findAllByOrderId(String orderId);

    List<OrderItemEntity> findAllByOrderIdIn(Collection<String> ids);
}
