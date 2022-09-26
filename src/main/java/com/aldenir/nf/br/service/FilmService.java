package com.aldenir.nf.br.service;

import com.aldenir.nf.br.model.Filme;
import com.aldenir.nf.br.model.imdb.Film;
import com.aldenir.nf.br.model.imdb.TitleData;
import com.aldenir.nf.br.repository.FilmRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    private FilmRepository repository;

    public List<TitleData> findAll(){
        return repository.findAll();
    }

    public TitleData findById(String id){
        TitleData titleData = repository.findById(id).orElseThrow(() -> new RuntimeException(""));
        return titleData;
    }
    public TitleData save(String  id) {
        TitleData titleData = repository.save(new Film().searchFilmsById(id));
        return titleData;
    }

    public TitleData update(String id) {
        TitleData titleData = repository.save(new Film().searchFilmsById(id));
        return titleData;
    }

    public void delete(String id){
        TitleData titleData = repository.save(new Film().searchFilmsById(id));
        repository.delete(titleData);
    }

}
