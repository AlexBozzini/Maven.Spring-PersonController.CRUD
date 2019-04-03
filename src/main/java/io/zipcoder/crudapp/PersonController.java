package io.zipcoder.crudapp;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    private List<Person> personList;

    @PostMapping
    public Person createPerson(Person p){
        return null;
    }

    @GetMapping
    public Person getPerson(int id){
        return null;
    }

    @GetMapping
    public List<Person> getPersonList(){
        return null;
    }

    @PutMapping
    public Person updatePerson(Person p){
        return null;
    }

    @DeleteMapping
    public void deletePerson(int id){}
}
