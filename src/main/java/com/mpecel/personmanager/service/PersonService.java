package com.mpecel.personmanager.service;

import com.mpecel.personmanager.dao.FakePersonDataAccessService;
import com.mpecel.personmanager.dao.PersonDao;
import com.mpecel.personmanager.model.Person;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
