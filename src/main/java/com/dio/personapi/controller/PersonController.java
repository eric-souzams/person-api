package com.dio.personapi.controller;

import com.dio.personapi.dto.request.PersonDTO;
import com.dio.personapi.dto.response.MessageResponseDTO;
import com.dio.personapi.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO newPerson(@Valid @RequestBody PersonDTO personDTO) {
        return personService.create(personDTO);
    }

    @GetMapping
    public List<PersonDTO> listAll() {
        return personService.list();
    }

    @GetMapping("/{personId}")
    public PersonDTO findById(@PathVariable Long personId) {
        return personService.find(personId);
    }

    @PutMapping("/{personId}")
    public MessageResponseDTO updateById(@PathVariable Long personId, @Valid @RequestBody PersonDTO personDTO) {
        return personService.update(personId, personDTO);
    }

    @DeleteMapping("/{personId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable long personId) {
        personService.delete(personId);
    }

}
