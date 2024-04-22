package com.netology_dao.controllers;

import com.netology_dao.dto.Product;
import com.netology_dao.services.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductsController {

    private final ProductsService productsService;

    @GetMapping("/fetch-product")
    @ResponseBody
    public Collection<Product> fetchProduct(@RequestParam String name) {
        return productsService.fetchProduct(name);
    }
}