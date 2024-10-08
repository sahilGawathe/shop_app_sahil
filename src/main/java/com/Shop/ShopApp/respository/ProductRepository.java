package com.Shop.ShopApp.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Shop.ShopApp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
