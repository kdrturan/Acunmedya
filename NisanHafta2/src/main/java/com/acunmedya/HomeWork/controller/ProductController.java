package com.acunmedya.HomeWork.controller;

import com.acunmedya.HomeWork.entity.product;
import com.acunmedya.HomeWork.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @GetMapping
    public List<product> getProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<product> getById(@PathVariable int id)
    {
        Optional<product> product = productRepository.findById(id);
        return product.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<product> addProduct(@RequestBody product newProduct)
    {
        product savedProduct = productRepository.save(newProduct);
        return  ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }

    @PutMapping("/{id}")
    public ResponseEntity<product> updateProduct(@PathVariable int id, @RequestBody product newProduct) {
        return productRepository.findById(id)
                .map(existingProduct -> {
                    existingProduct.setName(newProduct.getName());
                    existingProduct.setPrice(newProduct.getPrice());
                    existingProduct.setStock(newProduct.getStock());
                    return productRepository.save(existingProduct);
                })
                .map(updatedProduct -> ResponseEntity.ok(updatedProduct))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<product> deleteProduct(@PathVariable int id) {
        return productRepository.findById(id).map(p ->
                {
                    productRepository.delete(p);
                    return ResponseEntity.ok(p);  // Silinen ürünü döndürüyoruz
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
