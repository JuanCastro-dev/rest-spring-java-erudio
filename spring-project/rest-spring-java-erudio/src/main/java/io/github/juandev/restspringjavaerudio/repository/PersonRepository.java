package io.github.juandev.restspringjavaerudio.repository;

import io.github.juandev.restspringjavaerudio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
