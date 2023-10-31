package ru.netology.sql_dao_hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PERSONS")
@Entity
public class Person {
    @EmbeddedId
    private PersonPrimaryKey personPrimaryKey;

    @Column(name = "phoneNumber", unique = true, nullable = false)
    private String phoneNumber;

    @Column(name = "cityOfLiving", nullable = false)
    private String cityOfLiving;


}
