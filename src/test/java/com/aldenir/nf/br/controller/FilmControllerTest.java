package com.aldenir.nf.br.controller;

import com.aldenir.nf.br.model.Film;
import com.aldenir.nf.br.model.dto.FilmDTO;
import com.aldenir.nf.br.service.FilmService;
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
class FilmControllerTest {
    @Mock
    FilmService service;
    @InjectMocks
    FilmController filmController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(service.findAll()).thenReturn(Arrays.<Film>asList(new Film()));

        ResponseEntity<?> result = filmController.findAll();
        Assertions.assertEquals(null, result);
    }

    @Test
    void testFindById() {
        when(service.findById(anyLong())).thenReturn(new FilmDTO());

        ResponseEntity<?> result = filmController.findById(Long.valueOf(1));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testSave() {
        when(service.save(any())).thenReturn(new FilmDTO());

        ResponseEntity<?> result = filmController.save(new Film());
        Assertions.assertEquals(null, result);
    }

    @Test
    void testPut() {
        when(service.update(anyLong())).thenReturn(new FilmDTO());

        ResponseEntity<?> result = filmController.put(Long.valueOf(1));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testDelete() {
        filmController.delete(Long.valueOf(1));
    }
}

