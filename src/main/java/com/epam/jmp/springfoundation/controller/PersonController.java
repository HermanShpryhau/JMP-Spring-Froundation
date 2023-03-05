package com.epam.jmp.springfoundation.controller;

import com.epam.jmp.springfoundation.model.Person;
import com.epam.jmp.springfoundation.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAll() {
        return personService.findAll();
    }
}
