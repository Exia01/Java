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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity // Declaring a table
@Table(name="questions") // naming the questions
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // thiw will autoincrease the number id for us
	private Long id;


	@NotNull(message="The question cannot be blank.")
	@Size(min=5,max=50,message="Question must be at least 5 characters.")
	private String questionName;

	// @Column(updatable = false)
	// private Date createdAt;
	// private Date updatedAt;
	
	@ManyToMany(fetch=FetchType.LAZY) // establishing a many to many relationship for this.
	@JoinTable(
		name="tags_questions",
		joinColumns=@JoinColumn(name="category_id"), //Check definitions for this again. 
		inverseJoinColumns=@JoinColumn(name="tag_id") //check definitions for this again. 
	)
	private List<Tag> tags; // this is creating an array of tags for us to have on the table

	// This is the answers table that will be linked to the question.
	@OneToMany(mappedBy="question", fetch=FetchType.LAZY) // One way to read this is One question has --> many answers
	private List<Answer> answers; // This will provide us an "array" or "List" of Answers

	public Question() { // need a blank constructor to initialize it. 
		
	}

	public Question(String name, List<Tag> tags) { // we are passing the tag because we attaching the id 
		this.questionName = name;
		this.tags = tags; // it seems like the object but it is the ID 
	}

	
	// Getters And Setters 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}
