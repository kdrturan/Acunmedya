package com.acunmedya.HomeWork.repository;

import com.acunmedya.HomeWork.entity.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<product,Integer> {

}
