package com.codingdojo.dojoOverflow.respositories;

import java.util.List;

import com.codingdojo.dojoOverflow.models.Tag;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {

    List<Tag> findAll(); //This is creating a custom method for us to use so search by name.
	Tag findFirstByName(String tag);

}
