package com.codingdojo.dojoOverflow.services;


import java.util.ArrayList;

import com.codingdojo.dojoOverflow.models.Question;
import com.codingdojo.dojoOverflow.respositories.QuestionRepository;

import org.springframework.stereotype.Service;



@Service
public class QuestionService {
	private QuestionRepository questionRepository;
	
	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	public ArrayList<Question> all(){
		return (ArrayList<Question>) questionRepository.findAll();
	}
	
	public Question findOne(Long id) {
		return questionRepository.findById(id).get();
	}
	
	public void create(Question question){
		questionRepository.save(question);
	}
	
	public void destroy(Long id){
		questionRepository.deleteById(id);
	}
	
	public void update(Question question){
		questionRepository.save(question);
	}
}
