package com.codingdojo.dojoOverflow.respositories;

import com.codingdojo.dojoOverflow.models.Question;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

}
