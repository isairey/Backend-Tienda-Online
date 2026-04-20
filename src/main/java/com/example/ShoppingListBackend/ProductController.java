package com.example.ShoppingListBackend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")

public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAllProducts(){

        return this.productRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);

        if(optionalProduct.isPresent()) {
            return new ResponseEntity<>(optionalProduct.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        Optional<Product> optionalProduct = productRepository.findByName(product.getName());

        if (optionalProduct.isPresent()) {
            return new ResponseEntity<>(optionalProduct.get(), HttpStatus.BAD_REQUEST);
        }

        productRepository.save(product);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProductById(@PathVariable Long id){
        Optional<Product> productToDelete = productRepository.findById(id);

        if(productToDelete.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        productRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id){
        Product productToUpdate = productRepository.findById(id).get();
        productToUpdate.setBought(!productToUpdate.isBought());
        return productRepository.save(productToUpdate);
    }
}
