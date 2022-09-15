package com.aldenir.nf.br.service;

import com.aldenir.nf.br.model.Film;
import com.aldenir.nf.br.model.dto.FilmDTO;
import com.aldenir.nf.br.repository.FilmRepository;
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
class FilmServiceTest {

    @Mock
    FilmRepository repository;
    @InjectMocks
    FilmService filmService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        List<Film> result = filmService.findAll();
        Assertions.assertEquals(Arrays.<Film>asList(new Film()), result);
    }

    @Test
    void testFindById() {
        FilmDTO result = filmService.findById(Long.valueOf(1));
        Assertions.assertEquals(new FilmDTO(), result);
    }

    @Test
    void testSave() {
        FilmDTO result = filmService.save(new Film());
        Assertions.assertEquals(new FilmDTO(), result);
    }

    @Test
    void testUpdate() {
        FilmDTO result = filmService.update(Long.valueOf(1));
        Assertions.assertEquals(new FilmDTO(), result);
    }

    @Test
    void testDelete() {
        filmService.delete(Long.valueOf(1));
    }
}

