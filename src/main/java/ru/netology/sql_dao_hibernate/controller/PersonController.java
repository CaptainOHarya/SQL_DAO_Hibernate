package ru.netology.sql_dao_hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.sql_dao_hibernate.entity.Person;
import ru.netology.sql_dao_hibernate.service.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/by-city")
    public List<Person> getPersons(@RequestParam("city") String city) {
        return personService.getPersonByCityOfLiving(city);
    }

    @GetMapping("/by-age")
    public List<Person> getAge(@RequestParam("age") int age) {
        return personService.getPersonByAge(age);
    }

    @GetMapping("/by-name-and-surname")
    public Optional<Person> getNameAndSurname(String name, String surname) {
        return personService.getPersonByNameAndSurname(name, surname);
    }

}
