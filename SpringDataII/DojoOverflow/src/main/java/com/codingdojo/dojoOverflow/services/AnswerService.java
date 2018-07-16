package com.codingdojo.dojoOverflow.services;

import java.util.ArrayList;

import com.codingdojo.dojoOverflow.models.Answer;
import com.codingdojo.dojoOverflow.respositories.AnswerRepository;

import org.springframework.stereotype.Service;

@Service
public class AnswerService {
	private AnswerRepository answerRepository;
	
	public AnswerService(AnswerRepository answerRepository) {
		this.answerRepository = answerRepository;
	}
	
	public ArrayList<Answer> all(){
		return (ArrayList<Answer>) answerRepository.findAll();
	}
	
	public Answer findOne(Long id) {
		return answerRepository.findById(id).get();
	}
	
	public void create(Answer category){
		answerRepository.save(category);
	}
	
	public void destroy(Long id){
		answerRepository.deleteById(id);
	}
	
	public void update(Answer category){
		answerRepository.save(category);
	}
}
