package com.netology_dao.repositories;

import com.netology_dao.dto.Product;

import java.util.List;

public interface ProductsRepository {
    List<Product> getProductName(String name);
}