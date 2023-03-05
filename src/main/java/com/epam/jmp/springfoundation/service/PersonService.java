package com.epam.jmp.springfoundation.service;

import com.epam.jmp.springfoundation.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person save(Person person);
}
