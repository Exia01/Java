package com.codingdojo.LuxuryProducts.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
public class Product {
	@Id
    @GeneratedValue
    private Long id;
	
    @Size(min = 4, max = 200, message="Please enter a brand.")
    private String brand;
    
    @Size(min = 4, max = 200, message="Please enter a name.")
    private String name;
    
    @Size(min = 4, max = 200, message="Please enter a description.")
    private String description;
    
    @Min(1)
    private double price;
    
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    

    public Product() {
    	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Product(String brand, String name, String description, double price) {
        this.brand = brand;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}