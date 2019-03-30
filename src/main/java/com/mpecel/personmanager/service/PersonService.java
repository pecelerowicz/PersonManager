package com.mpecel.personmanager.service;

import com.mpecel.personmanager.dao.FakePersonDataAccessService;
import com.mpecel.personmanager.dao.PersonDao;
import com.mpecel.personmanager.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }

    public List<Person> selectPeople() {
        return personDao.selectAllPeople();
    }

    public Optional<Person> selectPersonById(UUID id) {
        return personDao.selectPersonById(id);
    }

    public int removePersonById(UUID id) {
        return personDao.deletePersonById(id);
    }
}
