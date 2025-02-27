package io.github.juandev.restspringjavaerudio.services;

import io.github.juandev.restspringjavaerudio.exception.ResourceNotFoundException;
import io.github.juandev.restspringjavaerudio.mapper.ModelMapper;
import io.github.juandev.restspringjavaerudio.model.PersonVO;
import io.github.juandev.restspringjavaerudio.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private Logger logger = Logger.getLogger(PersonServices.class.getName());
    @Autowired
    private PersonRepository repository;

    public PersonVO findById(Long id) {
        logger.info("Finding one person");
        var entity = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("No record found with id: " + id)
        ) ;
        return ModelMapper.parseObject(entity, PersonVO.class);
    }

    public List<PersonVO> findAll() {
        return ModelMapper.parseListObjectsObject(repository.findAll(), PersonVO.class);
    }

}
