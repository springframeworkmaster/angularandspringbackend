package com.springframeworkmaster.krish.services;

import com.springframeworkmaster.krish.domain.Person;
import com.springframeworkmaster.krish.domain.PersonList;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Optional<Person> getPersonById(Long id);
    List<Person> getAllPersons();
    Person createPerson(Person person);
    void deletePersonById(Long id);
    Person updatePerson(Person person, Long id);
}
