package com.springframeworkmaster.krish.services;

import com.springframeworkmaster.krish.domain.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersons();
    Person createPerson(Person person);
    void deletePersonById(Long id);
    Person updatePerson(Person person, Long id);
}
