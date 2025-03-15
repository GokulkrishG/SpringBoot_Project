package com.gokul.e_com.repo;

import com.gokul.e_com.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
