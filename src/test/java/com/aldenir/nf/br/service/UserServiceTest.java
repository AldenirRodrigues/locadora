package com.aldenir.nf.br.service;

import com.aldenir.nf.br.model.User;
import com.aldenir.nf.br.model.dto.UserDTO;
import com.aldenir.nf.br.repository.AddressRepository;
import com.aldenir.nf.br.repository.UserRepository;
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
class UserServiceTest {

    @Mock
    UserRepository repository;
    @Mock
    AddressRepository addressRepository;
    @InjectMocks
    UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        List<User> result = userService.findAll();
        Assertions.assertEquals(Arrays.<User>asList(new User()), result);
    }

    @Test
    void testFindById() {
        UserDTO result = userService.findById(Long.valueOf(1));
        Assertions.assertEquals(new UserDTO(), result);
    }

    @Test
    void testSave() {
        UserDTO result = userService.save(new User());
        Assertions.assertEquals(new UserDTO(), result);
    }

    @Test
    void testUpdate() {
        UserDTO result = userService.update(Long.valueOf(1));
        Assertions.assertEquals(new UserDTO(), result);
    }

    @Test
    void testDelete() {
        userService.delete(Long.valueOf(1));
    }
}

