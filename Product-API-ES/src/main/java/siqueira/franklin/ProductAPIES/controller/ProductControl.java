package siqueira.franklin.ProductAPIES.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import siqueira.franklin.ProductAPIES.model.Product;
import siqueira.franklin.ProductAPIES.repository.ProductRepo;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductControl {

    @Autowired
    private ProductRepo productRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping
    public Iterable<Product> list() {
        return productRepository.findAll();
    }

    @RequestMapping(value = "/{id}")
    public Optional<Product> findById(@PathVariable("id") Integer id) {
        return productRepository.findById(id);
    }

    @RequestMapping(value = "/name/{name}")
    public Iterable<Product> findByName(@PathVariable("name") String name) {
        return productRepository.findByName(name);
    }
}
