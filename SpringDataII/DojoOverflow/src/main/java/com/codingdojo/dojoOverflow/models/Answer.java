package com.codingdojo.dojoOverflow.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
// import javax.validation.constraints.Null;
import javax.validation.constraints.Size;


@Entity
@Table(name="answers") //naming the table for as "answers" instead of answer. 
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoincreasing the ID for us
	private Long id;
	
	@NotNull(message = "A name is required")
	@Size(min=2, max=166, message="Your name must be at least 2 characters")
	private String person;
	
	@NotNull(message = "Answer cannot be empty")
	@Size(min=2, max=255, message="The answer must be a least 2 characters.")
	private String response;
	

    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
	@ManyToOne(fetch = FetchType.LAZY) // Way to read this is s 
    @JoinColumn(name="question_id") // this is creating a question_id column
    private Question question; // this is the question attribute
    
	public Answer() {
	}
	
	
	public Question getQuestion() { // this is from the question repository. 
		return question;
	}
	
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	public Answer(String person, String response, Question question) {
		this.person = person;
		this.response = response;
		this.question = question; 
	} // this is creating the Answer along with the along with the question
	
	
	
	// Getters and Setters 
    
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPerson() {
		return person;
	}


	public void setPerson(String person) {
		this.person = person;
	}


	public String getResponse() {
		return response;
	}


	public void setResponse(String response) {
		this.response = response;
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

	// missing at prepersit??? 
}
