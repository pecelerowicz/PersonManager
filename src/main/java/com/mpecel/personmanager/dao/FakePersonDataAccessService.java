package com.mpecel.personmanager.dao;

import com.mpecel.personmanager.model.Person;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {

    private static List<Person> persons = new LinkedList<>();

    @Override
    public int insertPerson(UUID id, Person person) {

        persons.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return persons;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return persons.stream()
                      .filter(person -> person.getId().equals(id))
                      .findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> maybePerson = selectPersonById(id);
        if(maybePerson.isPresent()) {
            persons.remove(persons.indexOf(maybePerson.get()));
        }

        return 1;
    }
}
