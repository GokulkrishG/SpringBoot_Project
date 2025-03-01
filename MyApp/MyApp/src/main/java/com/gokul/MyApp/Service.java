package com.gokul.MyApp;


import java.util.Arrays;
import java.util.List;


@org.springframework.stereotype.Service
public class Service {

    List<Product> products = Arrays.asList(
            new Product(1, "Pen", 30),
            new Product(2, "Pencil", 5),
            new Product(3, "Notebbok", 50));

    public List<Product> getProducts() {
        return products;
    }
}
