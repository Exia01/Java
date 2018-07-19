package com.codingdojo.dojoOverflow.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tags") // naming the tags
public class Tag {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="Tag(s) cannot be empty!")
	@Size(min=1,max=255,message="Tag(s) must have at least 3 characters .")
	private String name;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
		name="tags_questions",
		joinColumns=@JoinColumn(name="tag_id"),
		inverseJoinColumns=@JoinColumn(name="category_id")
	)
	private List<Question> questions; //creating the questions list that will be stored in the join table ...I think?

	public Tag(){

	}

	public Tag(String x) { // we are instanciating a tag that will have the names in it. 
		System.out.println("This is from the constructor " + x);
		this.name = x;
		
	}
	
	
	// Getters and Setters
	
	public void setQuestions(List<Question> questions){ //sets the question into an array?
		this.questions = questions;
	}

	public List<Question> getQuestions(){
		return questions;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name){
		System.out.println(name);
		this.name=name;
	}

	public String getName(){
		return name;
	}
}
