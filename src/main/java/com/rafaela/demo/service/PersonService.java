package com.rafaela.demo.service;

import com.rafaela.demo.dao.PersonDao;
import com.rafaela.demo.model.Person;

public class PersonService {
    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
