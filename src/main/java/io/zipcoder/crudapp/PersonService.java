package io.zipcoder.crudapp;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService {
    private PersonRepository repository;

    public PersonService(PersonRepository repository){
        this.repository = repository;
    }

    public Iterable<Person> index(){
        return repository.findAll();
    }

    public Person show(Long id){
        return repository.findOne(id);
    }

    public Person create(Person p){
        return repository.save(p);
    }

    public Person update(Long id, Person newPersonData){
        Person originalPerson = repository.findOne(id);
        originalPerson.setFirstName(newPersonData.getFirstName());
        originalPerson.setLastName(newPersonData.getLastName());
        return repository.save(originalPerson);
    }

    public Boolean delete(Long id){
        repository.delete(id);
        return true;
    }

    public Iterable<Person> getAll(){
        return repository.findAll();
    }
}
