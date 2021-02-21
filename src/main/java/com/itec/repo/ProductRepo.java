package com.itec.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itec.pojo.Products;


public interface ProductRepo extends JpaRepository<Products, Integer>{

}
