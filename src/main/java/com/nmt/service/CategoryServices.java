package com.nmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nmt.Entity.Category;
import com.nmt.Repository.CategoryRepository;


@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository categoryRepository;

    public ResponseEntity<Category> createCategory(Category category) {
        Category savedCategory = categoryRepository.save(category);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }

    public ResponseEntity<Category> getCategory(Integer cid) {
        Category category = categoryRepository.findById(cid)
            .orElseThrow(() -> new RuntimeException("Category not found"));
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    public ResponseEntity<Category> updateCategory(Integer cid, String cname) {
        Category category = categoryRepository.findById(cid)
            .orElseThrow(() -> new RuntimeException("Category not found"));

        category.setCname(cname);
        Category updatedCategory = categoryRepository.save(category);
        return new ResponseEntity<>(updatedCategory, HttpStatus.OK);
    }

    public ResponseEntity<String> deleteCategories(Integer cid) {
        Category category = categoryRepository.findById(cid)
            .orElseThrow(() -> new RuntimeException("Category not found"));

        categoryRepository.delete(category);
        return new ResponseEntity<>("Category deleted.", HttpStatus.OK);
    }

}
