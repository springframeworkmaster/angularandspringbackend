package com.springframeworkmaster.krish.services;

import com.springframeworkmaster.krish.domain.Person;
import com.springframeworkmaster.krish.domain.PersonList;
import com.springframeworkmaster.krish.repositories.PersonRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class PersonServiceImpl implements PersonService{

    private PersonRepository personRepository;


    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;

    }

    @Override
    public Optional<Person> getPersonById(Long id) {

        return personRepository.findById(id);
    }
    @Override
    public List<Person> getAllPersons() {
        //Set<Person> persons = new HashSet<>();
        List<Person> persons = new ArrayList<>();

        personRepository.findAll().iterator().forEachRemaining(person->  persons.add(person));
        PersonList p = new PersonList();
        
        p.setPersons(persons);
        return persons;
    }
    @Override
    public Person createPerson(Person person) {
       return personRepository.save(person);
    }

    @Override
    public Person updatePerson(Person person, Long id) {
        person.setId(id);
        return personRepository.save(person);
    }

    @Override
    public void deletePersonById(Long id) {
         personRepository.deleteById(id);
    }
}
