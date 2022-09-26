package com.aldenir.nf.br.controller;

import com.aldenir.nf.br.model.User;
import com.aldenir.nf.br.model.dto.UserDTO;
import com.aldenir.nf.br.model.dto.Mapper;
import com.aldenir.nf.br.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/locadora")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public ResponseEntity<?> findAll() {
        Mapper mapper = new Mapper();
        service.findAll().forEach(userDTO -> {
            ResponseEntity<?> methodLinkBuilder = methodOn(UserController.class).findById(userDTO.getCpf());
            Link reportLink = linkTo(methodLinkBuilder).withRel("user");
            userDTO.add(reportLink);
            mapper.getMappers().add(userDTO);
        });
        return ResponseEntity.ok(mapper);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id) {
        User user = service.findById(id);
        Link selfLink = linkTo(methodOn(UserController.class).findAll()).withRel("users");
        user.add(selfLink);
        return ResponseEntity.ok(user);
    }

    @PostMapping("user/")
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO user) {
        return ResponseEntity.ok(service.save(user));
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<UserDTO> put(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.update(id));
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }


}
