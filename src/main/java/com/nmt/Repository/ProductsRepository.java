package com.nmt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nmt.Entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer>{

}
