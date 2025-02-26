package io.github.juandev.restspringjavaerudio.controller;

import io.github.juandev.restspringjavaerudio.model.Person;
import io.github.juandev.restspringjavaerudio.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonServices service = new PersonServices();

    @GetMapping("/{id}")
    public Person findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public List<Person> findAll() {
        return service.findAll();
    }

}
