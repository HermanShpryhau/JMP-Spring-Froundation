package com.epam.jmp.springfoundation.service.impl;

import com.epam.jmp.springfoundation.model.Person;
import com.epam.jmp.springfoundation.repository.PersonRepository;
import com.epam.jmp.springfoundation.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }
}
