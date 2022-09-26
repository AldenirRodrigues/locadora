package com.aldenir.nf.br.repository;

import com.aldenir.nf.br.model.imdb.TitleData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<TitleData, String > {


}
