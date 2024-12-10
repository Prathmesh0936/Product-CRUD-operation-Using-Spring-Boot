package com.prathmesh.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prathmesh.product.entity.Product;

@Repository
public interface Product_Repository extends JpaRepository<Product, Integer> {

}
