package com.springframeworkmaster.krish.repositories;

import com.springframeworkmaster.krish.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long> {

}
