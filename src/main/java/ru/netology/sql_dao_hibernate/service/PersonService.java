package ru.netology.sql_dao_hibernate.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.sql_dao_hibernate.entity.Person;
import ru.netology.sql_dao_hibernate.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersonByCityOfLiving(String city) {
        return personRepository.findAllByCityOfLiving(city);
    }

    public List<Person> getPersonByAge(int age) {
        return personRepository.findByPersonPrimaryKey_AgeIsLessThanOrderByPersonPrimaryKey_AgeAsc(age);
    }

    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return personRepository.findByPersonPrimaryKey_NameAndPersonPrimaryKey_Surname(name, surname);
    }


}
