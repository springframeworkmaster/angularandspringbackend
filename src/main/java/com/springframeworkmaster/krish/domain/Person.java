package com.springframeworkmaster.krish.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


//@Data

@Entity
@Data
@Table(name = "person")
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;


    public Person(Long id,String firstName, String lastName, String email, String phone, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public static class PersonBuilder{
        private Long id;
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private Address address;

        public PersonBuilder id(Long id){
            this.id=id;
            return this;
        }

        public PersonBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public PersonBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public PersonBuilder email(String email){
            this.email = email;
            return this;
        }

        public PersonBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public PersonBuilder address(Address address){
            this.address = address;
            return this;
        }

        public Person build(){
            return new Person(id, firstName, lastName, email, phone, address);
        }


    }



}
