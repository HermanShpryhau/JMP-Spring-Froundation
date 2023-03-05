package com.epam.jmp.springfoundation.repository;

import com.epam.jmp.springfoundation.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findAll();
}
