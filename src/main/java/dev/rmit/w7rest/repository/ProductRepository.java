package dev.rmit.w7rest.repository;

import org.springframework.data.repository.CrudRepository;

import dev.rmit.w7rest.model.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
