package com.lcwd.orm.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa_category")
public class Category {
    @Id
    private String cId;
    private String title;
    @ManyToMany(mappedBy = "categories", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    //mapped by is used so that another table is not created
    //cascade is used so that database opertions should be performed in both the tables

    //set can be uset insted of arraylist if there is more data
    private List<Product> products = new ArrayList<>();

    public Category(String cId, String title) {
        this.cId = cId;
        this.title = title;
    }

    public Category() {
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
