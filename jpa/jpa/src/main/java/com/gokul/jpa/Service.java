package com.gokul.jpa;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(1, "Pen", 30),
//            new Product(2, "Pencil", 5),
//            new Product(3, "Notebbok", 50)));

    public List<com.gokul.jpa.Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }


    public void addProduct(com.gokul.jpa.Product prod) {
        repo.save(prod);
    }

    public void updateProduct(com.gokul.jpa.Product prod) {
         repo.save(prod);
    }

    public void deleteProductById(int prodId) {
          repo.deleteById(prodId);
    }
}

