package com.lcwd.orm.repositories;

import com.lcwd.orm.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, String> {

    //custom/finder methods

    Product findByProductName(String productName);
    List<Product> findByAllProductName(String productName);
    Product findByPId(int pid);
    Product findProductNameIsNot(String productName);


    //query methods
}
