package com.sitch.controller;



import com.sitch.entity.Product;
import com.sitch.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIcontroller {

    @Autowired
    private ProductService productService ;

    @GetMapping("/products")
    public List<Product> getProduct(){
        return productService.getAllProduct() ;
    }



}
