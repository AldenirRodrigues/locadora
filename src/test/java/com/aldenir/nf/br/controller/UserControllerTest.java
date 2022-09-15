package com.aldenir.nf.br.controller;

import com.aldenir.nf.br.model.User;
import com.aldenir.nf.br.model.dto.UserDTO;
import com.aldenir.nf.br.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @Mock
    UserService service;
    @InjectMocks
    UserController userController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(service.findAll()).thenReturn(Arrays.<User>asList(new User()));

        ResponseEntity<?> result = userController.findAll();
        Assertions.assertEquals(null, result);
    }

    @Test
    void testFindById() {
        when(service.findById(anyLong())).thenReturn(new UserDTO());

        ResponseEntity<?> result = userController.findById(Long.valueOf(1));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testSave() {
        when(service.save(any())).thenReturn(new UserDTO());

        ResponseEntity<?> result = userController.save(new User());
        Assertions.assertEquals(null, result);
    }

    @Test
    void testPut() {
        when(service.update(anyLong())).thenReturn(new UserDTO());

        ResponseEntity<?> result = userController.put(Long.valueOf(1));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testDelete() {
        userController.delete(Long.valueOf(1));
    }

}