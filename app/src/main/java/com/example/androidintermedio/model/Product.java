package com.example.androidintermedio.model;

import java.io.Serializable;

public class Product implements Serializable {
    Long id;
    String product_title;
    String title_description ;
    String title_thumbnail ;

    public Product(long id, String title, String title_description, String title_thumbnail){
        this.id = id;
        this.product_title = title;
        this.title_description = title_description;
        this.title_thumbnail = title_thumbnail;
    }

    public Long getId() {
        return id;
    }

    public String getProduct_title() {
        return product_title;
    }

    public String getTitle_description() {
        return title_description;
    }

    public String getTitle_thumbnail() {
        return title_thumbnail;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProduct_title(String product_title) {
        this.product_title = product_title;
    }

    public void setTitle_description(String title_description) {
        this.title_description = title_description;
    }

    public void setTitle_thumbnail(String title_thumbnail) {
        this.title_thumbnail = title_thumbnail;
    }
}

