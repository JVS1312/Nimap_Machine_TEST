package com.nmt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nmt.Entity.Category;



public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
