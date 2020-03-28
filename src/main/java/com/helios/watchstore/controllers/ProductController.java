package com.helios.watchstore.controllers;

import com.helios.watchstore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public ResponseEntity<?> getProducts(){
            return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }
}
