package com.sitch.repository;

import com.sitch.entity.Product ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface APIProduct extends JpaRepository<Product, Integer> {
}
