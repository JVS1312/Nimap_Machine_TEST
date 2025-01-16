package com.nmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nmt.Entity.Products;
import com.nmt.service.ProductsServices;


@RequestMapping("/api/products")
@RestController
public class ProductController {

    @Autowired
    private ProductsServices productsServices;

    @PostMapping("/add")
    public ResponseEntity<Products> addProduct(@RequestBody Products products) {
        return productsServices.addProducts(products);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Products>> getAllProducts() {
        return productsServices.getAllProducts();
    }

    @GetMapping("/{pid}")
    public ResponseEntity<Products> getProduct(@PathVariable Integer pid) {
        return productsServices.getProduct(pid);
    }

    @PutMapping("/{pid}")
    public ResponseEntity<Products> updateProduct(@PathVariable Integer pid, @RequestBody Products products) {
        return productsServices.updateProduct(pid, products);
    }

    @DeleteMapping("/{pid}")
    public ResponseEntity<String> deleteProduct(@PathVariable Integer pid) {
        return productsServices.deleteProduct(pid);
    }
}
