package com.Shop.ShopApp.respository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Shop.ShopApp.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
