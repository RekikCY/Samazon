package com.company.samazon.Repositories;

import com.company.samazon.Models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findByName(String name);
    Iterable<Product> findAllByNameContainingIgnoreCase(String name);
}
