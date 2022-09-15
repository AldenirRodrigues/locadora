package com.aldenir.nf.br.controller;

import com.aldenir.nf.br.model.User;
import com.aldenir.nf.br.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.Serializable;

@RestController
@RequestMapping("/locadora/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody User user){
        return ResponseEntity.ok(service.save(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.update(id));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }


}
