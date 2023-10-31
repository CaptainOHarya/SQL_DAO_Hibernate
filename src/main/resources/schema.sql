create schema if not exists netology;
create table if not exists netology.persons
(
    name varchar(255) not null,
    surname varchar(255) not null,
    age int check ( age > 0 and age < 555 ),
    phone_number varchar(25) not null,
    city_of_living varchar(55) not null,
    primary key (name, surname, age)


);

# drop table netology.PERSONS;


