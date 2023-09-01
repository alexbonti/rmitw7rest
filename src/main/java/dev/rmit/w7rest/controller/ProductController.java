package dev.rmit.w7rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.rmit.w7rest.model.Product;
import dev.rmit.w7rest.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Product> findAll() {
        return repository.findAll();
    }
    
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }
    
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        System.out.println("Hello hit post");
        return repository.save(product);
    }

    // create a delete endpoint

}
