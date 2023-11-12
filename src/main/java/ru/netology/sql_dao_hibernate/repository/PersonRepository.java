package ru.netology.sql_dao_hibernate.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.netology.sql_dao_hibernate.entity.Person;
import ru.netology.sql_dao_hibernate.entity.PersonPrimaryKey;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends CrudRepository<Person, PersonPrimaryKey> {
    @Query("select p from Person p where p.cityOfLiving = :city")
    List<Person> findCityOfLiving(@Param("city") String cityOfLiving);

    @Query("select p from Person p where p.personPrimaryKey.age < :age order by p.personPrimaryKey.age")
    List<Person> findByAge(@Param("age") int age);

    @Query("select p from Person p where p.personPrimaryKey.name = :name and p.personPrimaryKey.surname = :surname")
    Optional<Person> findByNameAndSurname(@Param("name") String name, @Param("surname") String surname);
}
