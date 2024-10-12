package com.boot.graphql.controller;

import com.boot.graphql.entity.Product;
import com.boot.graphql.service.IProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Log4j2
public class ProductController {

    @Autowired
    private IProductService productService;

    @QueryMapping
    public Product getProductById(@Argument int id) {
        Product productById = productService.getProductById(id);
        log.info("Fetch product by id from db : {}", productById);
        return productById;
    }

    @QueryMapping
    public List<Product> getAllProducts() {
        List<Product> allProducts = productService.getAllProducts();
        log.info("Fetch all products from db : {}", allProducts);
        return allProducts;
    }
}
