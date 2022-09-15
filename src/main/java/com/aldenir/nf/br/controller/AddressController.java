package com.aldenir.nf.br.controller;

import com.aldenir.nf.br.model.Address;
import com.aldenir.nf.br.model.dto.AddressDTO;
import com.aldenir.nf.br.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalogo/locadora")
public class AddressController {

    @Autowired
    private AddressService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{cep}")
    public ResponseEntity<?> findById(@RequestParam("cep") Long cep) {
        return ResponseEntity.ok(service.findById(cep));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Address user) {
        return ResponseEntity.ok(service.save(user));
    }

    @PutMapping("/{cep}")
    public ResponseEntity<?> put(@RequestParam("cep") Long cep) {
        return ResponseEntity.ok(service.update(cep));
    }

    @DeleteMapping("/{cep}")
    public void delete(@RequestParam("cep") Long cep) {
        service.delete(cep);
    }


}
