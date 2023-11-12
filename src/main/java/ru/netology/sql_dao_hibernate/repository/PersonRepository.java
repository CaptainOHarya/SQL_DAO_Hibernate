package ru.netology.sql_dao_hibernate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.sql_dao_hibernate.entity.Person;
import ru.netology.sql_dao_hibernate.entity.PersonPrimaryKey;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends CrudRepository<Person, PersonPrimaryKey> {
    List<Person> findAllByCityOfLiving(String cityOfLiving);
    List<Person> findByPersonPrimaryKey_AgeIsLessThanOrderByPersonPrimaryKey_AgeAsc(int age);
    Optional<Person> findByPersonPrimaryKey_NameAndPersonPrimaryKey_Surname(String name, String surname);
}
