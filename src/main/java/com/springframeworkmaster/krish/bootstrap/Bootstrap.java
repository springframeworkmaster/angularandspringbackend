package com.springframeworkmaster.krish.bootstrap;

import com.springframeworkmaster.krish.domain.Address;
import com.springframeworkmaster.krish.domain.Person;
import com.springframeworkmaster.krish.repositories.AddressRepository;
import com.springframeworkmaster.krish.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner{

    private PersonRepository personRepository;
    private AddressRepository addressRepository;

    public Bootstrap(PersonRepository personRepository, AddressRepository addressRepository) {
        this.personRepository = personRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        /*Person p = new Person();
        p.setFirstName("Sai");
        p.setLastName("krishna");
        p.setEmail("sai@gmail.com");
        p.setPhone("90909090");
*/
        if(personRepository.count()==0){


            Address a1 = new Address();

            a1.setStreetName("63 farquhar st");
            a1.setCity("boston");
            a1.setState("MA");
            a1.setPincode("02131");


            Address a2 = new Address();

            a2.setStreetName("65 farquhar st");
            a2.setCity("Nashua");
            a2.setState("NH");
            a2.setPincode("03060");

            Address a3 = new Address();

            a3.setStreetName("99 Hillburg st");
            a3.setCity("Des Moines");
            a3.setState("IA");
            a3.setPincode("52260");

            personRepository.save(Person.builder().firstName("Sai").lastName("Krishna").email("sai@gmail.com").phone("6034179197").address(a1).build());
            personRepository.save(Person.builder().firstName("Nilam").lastName("Khadka").email("nilam@gmail.com").phone("6034170517").address(a2).build());
            personRepository.save(Person.builder().firstName("Tirumal").lastName("Reddy").email("tirumal@gmail.com").phone("6034171217").address(a3).build());
            System.out.println("Person " + personRepository.count());

        }



    }
}
