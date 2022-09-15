package com.aldenir.nf.br.service;

import com.aldenir.nf.br.model.Address;
import com.aldenir.nf.br.model.dto.AddressDTO;
import com.aldenir.nf.br.repository.AddressRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AddressServiceTest {

    @Mock
    AddressRepository repository;
    @InjectMocks
    AddressService addressService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        List<Address> result = addressService.findAll();
        Assertions.assertEquals(Arrays.<Address>asList(new Address()), result);
    }

    @Test
    void testFindById() {
        AddressDTO result = addressService.findById(Long.valueOf(1));
        Assertions.assertEquals(new AddressDTO(), result);
    }

    @Test
    void testSave() {
        AddressDTO result = addressService.save(new Address());
        Assertions.assertEquals(new AddressDTO(), result);
    }

    @Test
    void testUpdate() {
        AddressDTO result = addressService.update(Long.valueOf(1));
        Assertions.assertEquals(new AddressDTO(), result);
    }

    @Test
    void testDelete() {
        addressService.delete(Long.valueOf(1));
    }
}

