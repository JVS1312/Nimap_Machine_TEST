package com.nmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nmt.Entity.Category;
import com.nmt.service.CategoryServices;

import java.util.List;

@RequestMapping("/api/categories")
@RestController
public class CategoryController {

    @Autowired
    private CategoryServices categoryServices;

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        return categoryServices.createCategory(category);
    }

    @GetMapping("/{cid}")
    public ResponseEntity<Category> getCategory(@PathVariable Integer cid) {
        return categoryServices.getCategory(cid);
    }

    @PutMapping("/{cid}")
    public ResponseEntity<Category> updateCategoryName(@PathVariable Integer cid, @RequestParam String cname) {
        return categoryServices.updateCategory(cid, cname);
    }

    @DeleteMapping("/{cid}")
    public ResponseEntity<String> deleteCategory(@PathVariable Integer cid) {
        return categoryServices.deleteCategories(cid);
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        return categoryServices.getAllCategories();
    }
}
