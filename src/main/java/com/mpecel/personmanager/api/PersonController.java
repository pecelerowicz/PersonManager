package com.mpecel.personmanager.api;

import com.mpecel.personmanager.model.Person;
import com.mpecel.personmanager.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
