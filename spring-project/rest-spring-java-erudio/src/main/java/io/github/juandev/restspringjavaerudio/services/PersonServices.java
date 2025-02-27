package io.github.juandev.restspringjavaerudio.services;

import io.github.juandev.restspringjavaerudio.exception.ResourceNotFoundException;
import io.github.juandev.restspringjavaerudio.model.Person;
import io.github.juandev.restspringjavaerudio.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private Logger logger = Logger.getLogger(PersonServices.class.getName());
    @Autowired
    private PersonRepository repository;

    public Person findById(Long id) {
        logger.info("Finding one person");
        return repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("No record found with id: " + id)
        ) ;
    }

    public List<Person> findAll() {
        return repository.findAll();
    }

}
