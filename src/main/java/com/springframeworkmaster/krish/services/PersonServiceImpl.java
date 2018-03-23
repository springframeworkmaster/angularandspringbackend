package com.springframeworkmaster.krish.services;

import com.springframeworkmaster.krish.domain.Person;
import com.springframeworkmaster.krish.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        personRepository.findAll().iterator().forEachRemaining(persons::add);
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
