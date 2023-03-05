package com.epam.jmp.springfroundation.service;

import com.epam.jmp.springfoundation.JmpSpringFoundationApplication;
import com.epam.jmp.springfoundation.model.Person;
import com.epam.jmp.springfoundation.service.PersonService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = JmpSpringFoundationApplication.class)
@Transactional
public class PersonServiceIntegrationTest {
    @Autowired
    private PersonService personService;

    @Test
    public void saveTest() {
        Person person = new Person();
        person.setPersonName("Test Name");

        Person savedPerson = personService.save(person);

        assertThat(savedPerson.getPersonName(), equalTo(person.getPersonName()));
        assertThat(personService.findAll().size(), equalTo(1));
    }
}
