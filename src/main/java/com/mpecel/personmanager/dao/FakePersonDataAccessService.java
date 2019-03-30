package com.mpecel.personmanager.dao;

import com.mpecel.personmanager.model.Person;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {

    private static List<Person> persons = new LinkedList<>();

    @Override
    public int insertPerson(UUID id, Person person) {

        persons.add(new Person(id, person.getName()));
        return 1;
    }
}
