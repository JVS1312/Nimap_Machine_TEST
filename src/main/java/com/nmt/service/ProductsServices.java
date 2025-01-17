package com.nmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.nmt.Entity.Products;
import com.nmt.Entity.Category;
import com.nmt.Repository.ProductsRepository;
import com.nmt.Repository.CategoryRepository;


@Service
public class ProductsServices {

    @Autowired
    private ProductsRepository productsRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public ResponseEntity<Products> addProducts(Products product) {
        if (product.getCategorypd() != null) {
            Category category = categoryRepository.findById(product.getCategorypd().getCid())
                    .orElseThrow(() -> new RuntimeException("not found"));
            product.setCategorypd(category);
        }
        Products savedProduct = productsRepository.save(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

  

    public ResponseEntity<Products> getProduct(Integer pid) {
        Products product = productsRepository.findById(pid)
            .orElseThrow(() -> new RuntimeException("Product not found"));
        if (product.getCategorypd() != null) {
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    public ResponseEntity<Products> updateProduct(Integer pid, Products productDetails) {
        Products existingProduct = productsRepository.findById(pid)
            .orElseThrow(() -> new RuntimeException("Product not found"));

        existingProduct.setProductName(productDetails.getProductName());

       

        Products updatedProduct = productsRepository.save(existingProduct);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }

    public ResponseEntity<String> deleteProduct(Integer pid) {
        Products product = productsRepository.findById(pid)
            .orElseThrow(() -> new RuntimeException("Product not found"));

        productsRepository.delete(product);
        return new ResponseEntity<>("deleted.", HttpStatus.OK);
    }
}
