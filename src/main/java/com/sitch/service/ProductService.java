package com.sitch.service;


import com.sitch.controller.APIcontroller;
import com.sitch.entity.Product;
import com.sitch.repository.APIProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private APIProduct apiProduct;

    public List<Product> getAllProduct(){
        return apiProduct.findAll() ;
    }
}
