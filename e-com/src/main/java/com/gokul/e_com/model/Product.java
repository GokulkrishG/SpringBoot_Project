package com.gokul.e_com.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private long price;
    private String category;
    private Date release_date;
    private boolean available;
    private int quantity;

    private String imageName;
    private String imageType;
    @Lob
    public byte[] imageDate;

}
