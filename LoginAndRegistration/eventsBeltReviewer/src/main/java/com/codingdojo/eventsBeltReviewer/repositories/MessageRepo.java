package com.codingdojo.eventsBeltReviewer.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.codingdojo.eventsBeltReviewer.models.Message;

public interface MessageRepo extends CrudRepository<Message, Long>{
	List<Message> findAll();
}