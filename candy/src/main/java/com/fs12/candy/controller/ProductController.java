package com.fs12.candy.controller;

import com.fs12.candy.model.Product;
import com.fs12.candy.service.emplement.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    private final ProductServiceImpl productServiceImpl;
    @Autowired
    public ProductController( ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productServiceImpl.getAllProducts();
    }
    @GetMapping("/{id}")
    public Optional<Product> findProductById(@PathVariable("id") Long id) {
        return productServiceImpl.findById(id);
    }
    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productServiceImpl.saveProduct(product);
    }
    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return productServiceImpl.updateProduct(product);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        productServiceImpl.deleteProduct(id);
    }
}
