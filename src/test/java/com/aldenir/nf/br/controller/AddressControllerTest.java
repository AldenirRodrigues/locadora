package com.aldenir.nf.br.controller;

import com.aldenir.nf.br.model.Address;
import com.aldenir.nf.br.model.dto.AddressDTO;
import com.aldenir.nf.br.service.AddressService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AddressControllerTest {
    @Mock
    AddressService service;
    @InjectMocks
    AddressController addressController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(service.findAll()).thenReturn(Arrays.<Address>asList(new Address()));

        ResponseEntity<?> result = addressController.findAll();
        Assertions.assertEquals(null, result);
    }

    @Test
    void testFindById() {
        when(service.findById(anyLong())).thenReturn(new AddressDTO());

        ResponseEntity<?> result = addressController.findById(Long.valueOf(1));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testSave() {
        when(service.save(any())).thenReturn(new AddressDTO());

        ResponseEntity<?> result = addressController.save(new Address());
        Assertions.assertEquals(null, result);
    }

    @Test
    void testPut() {
        when(service.update(anyLong())).thenReturn(new AddressDTO());

        ResponseEntity<?> result = addressController.put(Long.valueOf(1));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testDelete() {
        addressController.delete(Long.valueOf(1));
    }
}

