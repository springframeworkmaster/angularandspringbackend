package com.springframeworkmaster.krish.controllers;


import com.springframeworkmaster.krish.services.PersonService;
import com.springframeworkmaster.krish.domain.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class PersonController{

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    @PostMapping("/persons")
    public Person createPerson(@RequestBody Person person){
     return personService.createPerson(person);
    }

    @PutMapping("/persons/{id}")
    public Person updatePerson(@RequestBody Person person, @PathVariable Long id){
        return personService.updatePerson(person,id);
    }

    @DeleteMapping("/persons/{id}")
    public void deletePersonById(@PathVariable Long id){
         personService.deletePersonById(id);
    }
}
