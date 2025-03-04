package com.gokul.MyApp;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@org.springframework.stereotype.Service
public class Service {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Pen", 30),
            new Product(2, "Pencil", 5),
            new Product(3, "Notebbok", 50)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getId() == prodId)
                .findFirst().orElse(new Product(10, "Book", 25));
    }


    public void addProducrt(Product prod) {
        products.add(prod);
    }

    public void updateProducrt(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == prod.getId())
                index = i;
        }
        products.set(index, prod);
    }

    public Product deleteProductById(int prodId) {

        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == prodId)
                index = i;
        }
        return products.remove(index);
    }
}

