package com.codingdojo.dojoOverflow.services;

import java.util.ArrayList;

import com.codingdojo.dojoOverflow.models.Tag;
import com.codingdojo.dojoOverflow.respositories.TagRepository;

import org.springframework.stereotype.Service;


@Service
public class TagService {
	private TagRepository tagRepository;
	
	public TagService(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}
	
	public ArrayList<Tag> all(){
		return (ArrayList<Tag>) tagRepository.findAll();
	}
	
	// public Tag findOne(Long id) {
	// 	return tagRepository.findById(id).get();
	// } // this is in case we would like to find it by ID 

	public Tag findTag(String tag) {
		return tagRepository.findFirstByName(tag); // we are searching for a tag by its name and not by its ID 
	}
	
	public void create(Tag category){
		System.out.println("Hello from Tag Service" + category);
		tagRepository.save(category);
	}
	
	public void destroy(Long id){
		tagRepository.deleteById(id);
	}
	
	public void update(Tag category){
		tagRepository.save(category);
	}
}
