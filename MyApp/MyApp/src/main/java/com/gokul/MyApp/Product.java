package com.gokul.MyApp;

public class Product {
     private int id;
     private String name;
     private int price;

    public Product(int id, String name,int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

//    public Product(int id, String pen, int i) {
//    }

    public String getName() {
        return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getId() {
        return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public int getPrice() {
        return price;
     }

     public void setPrice(int price) {
        this.price = price;
     }
}
