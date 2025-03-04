package com.gokul.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @RequestMapping("/products")
    public List<Product> product(){
       return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        service.addProducrt(prod);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod) {
        service.updateProducrt(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public Product deleteProductById(@PathVariable int prodId){
         return service.deleteProductById(prodId);
    }
}


