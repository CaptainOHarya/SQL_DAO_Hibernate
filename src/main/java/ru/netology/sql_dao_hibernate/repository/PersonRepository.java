package ru.netology.sql_dao_hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import ru.netology.sql_dao_hibernate.entity.Person;

import java.util.List;

@Repository
public class PersonRepository {
    @PersistenceContext
    private EntityManager entityManager;


    public List<Person> getPersonsByCity(String city) {
        Query query = entityManager.createQuery("select p from Person p where lower(p.cityOfLiving) = lower(:city)", Person.class);
        query.setParameter("city", city);
        return query.getResultList();

    }

}
