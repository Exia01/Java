package com.codingdojo.dojosandninjas.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
// import javax.validation.constraints.Null;
import javax.validation.constraints.Size;


@Entity
@Table(name="ninjas")
public class Ninja {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "First name is required")
	@Size(min=2, max=166, message="Please enter a First Name.")
	private String fname;
	
	@NotNull(message = "Last name is required")
	@Size(min=2, max=166, message="Please enter a Last Name.")
	private String lname;
	
	@Min(1)
	private int age;
	
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dojo_id") // this is creating a dojo_id column
	@NotNull(message = "Dojo is required")
    private Dojo dojo; // this is the dojo attribute
    
	public Ninja() {
	}
	
	
	
	public Dojo getDojo() { // this is from the dojo repository and creating it. 
		return dojo;
	}
	
	
	
	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
	}
	
	
	public Ninja(String fname, String lname, int age, Dojo dojo) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.dojo = dojo; 
	} // this is creating the dojo along with the ninja
	
	//GETTERS//
	public Long getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public int getAge() {
		return age;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	//SETTERS//
	public void setId(Long id) {
		this.id = id;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
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
