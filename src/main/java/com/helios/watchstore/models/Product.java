package com.helios.watchstore.models;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    @Column(name = "description")
    private String description;
    private String image_url;
    private String image_thumbnail_url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getImage_thumbnail_url() {
        return image_thumbnail_url;
    }

    public void setImage_thumbnail_url(String image_thumbnail_url) {
        this.image_thumbnail_url = image_thumbnail_url;
    }
}
