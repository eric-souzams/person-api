package com.dio.personapi.controller;

import com.dio.personapi.dto.MessageResponseDTO;
import com.dio.personapi.entities.Person;
import com.dio.personapi.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonRepository personRepository;

    @PostMapping
    public MessageResponseDTO newPerson(@RequestBody Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID: " + savedPerson.getId())
                .build();
    }

}
