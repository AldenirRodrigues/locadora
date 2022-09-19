package com.aldenir.nf.br.model;

import com.aldenir.nf.br.model.imdb.TitleData;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
@NoArgsConstructor
public class DescFilm {

    private String title;
    private String by;
    private String created;
    private String updated = null;
    private String description;

    private Set<FilmListDataDetail> filmListDataDetails = new LinkedHashSet<>();

    public DescFilm(TitleData titleData) {
        this.title = titleData.getTitle();
        this.by = titleData.getDirectors();
        this.created = titleData.getYear();
        this.updated = updated;
        this.description = titleData.getPlotLocal();

        AtomicInteger atomicInteger = new AtomicInteger();
        FilmListDataDetail filmListDataDetail = new FilmListDataDetail();
        filmListDataDetail.setIndex(String.valueOf(atomicInteger.getAndIncrement()));


        this.filmListDataDetails = Set.of(new FilmListDataDetail(titleData));
    }
}
