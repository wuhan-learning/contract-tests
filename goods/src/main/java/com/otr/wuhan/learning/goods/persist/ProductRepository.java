package com.otr.wuhan.learning.goods.persist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

    List<ProductEntity> findAllByNameLike(String name);
}
