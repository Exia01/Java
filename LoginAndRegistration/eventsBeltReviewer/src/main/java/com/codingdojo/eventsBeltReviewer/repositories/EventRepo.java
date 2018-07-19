package com.codingdojo.eventsBeltReviewer.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.codingdojo.eventsBeltReviewer.models.Event;

public interface EventRepo extends CrudRepository<Event, Long>{
	List<Event> findAll();
}