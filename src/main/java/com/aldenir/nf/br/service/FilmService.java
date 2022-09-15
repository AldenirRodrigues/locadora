package com.aldenir.nf.br.service;

import com.aldenir.nf.br.model.Film;
import com.aldenir.nf.br.model.dto.FilmDTO;
import com.aldenir.nf.br.repository.FilmRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    private FilmRepository repository;

    public List<Film> findAll(){
        return repository.findAll();
    }

    public FilmDTO findById(Long id){
        FilmDTO filmDTO = new FilmDTO();
        Film film = repository.findById(id).orElseThrow(() -> new RuntimeException(""));
        BeanUtils.copyProperties(film, filmDTO);
        return filmDTO;
    }
    public FilmDTO save(Film film) {
        FilmDTO filmDTO = new FilmDTO();
        BeanUtils.copyProperties(repository.save(film), filmDTO);
        return filmDTO;
    }

    public FilmDTO update(Long id) {
        Film film = repository.findById(id).orElseThrow(() -> new RuntimeException(""));
        FilmDTO filmDTO = new FilmDTO();
        BeanUtils.copyProperties(repository.save(film), filmDTO);
        return filmDTO;
    }

    public void delete(Long id){
        Film film = repository.findById(id).orElseThrow(() -> new RuntimeException(""));
        repository.delete(film);
    }

}
