package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    public PersonController(){}

    @PostMapping("/people")
    public ResponseEntity<Person> createPerson(@RequestBody Person p){
        return null;
    }

    @GetMapping("/people/{id}")
    public Person getPerson(@PathVariable Long id){
        return null;
    }

    @GetMapping("/people")
    public List<Person> getPersonList(){
        return null;
    }

    @PutMapping("/people")
    public Person updatePerson(@RequestBody Person p){
        return null;
    }

    @DeleteMapping("/people/{id}")
    public void deletePerson(@PathVariable Long id){}
}
