package com.example.vuvietanh.repository;

import com.example.vuvietanh.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
