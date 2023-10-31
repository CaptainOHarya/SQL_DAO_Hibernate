package ru.netology.sql_dao_hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.sql_dao_hibernate.entity.Person;
import ru.netology.sql_dao_hibernate.repository.PersonRepository;

import java.util.List;

@RestController
public class PersonController {
    PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;


    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersons(@RequestParam String city) {
        return personRepository.getPersonsByCity(city);
    }

}
