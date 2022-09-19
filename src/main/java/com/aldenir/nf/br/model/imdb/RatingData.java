package com.aldenir.nf.br.model.imdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_rating_data")
public class RatingData implements Serializable {

    @Id
    @Column(name = "id")
    private String iMDbId;

    @Column(name = "title")
    private String title;

    @Column(name = "full_title")
    private String fullTitle;

    @Column(name = "type")
    private String type;

    @Column(name = "year")
    private String year;

    @Column(name = "imdb")
    private String iMDb;

    @Column(name = "meta_critic")
    private String metaCritic;

    @Column(name = "the_movie_db")
    private String theMovieDb;

    @Column(name = "rotten_tomatoes")
    private String rottenTomatoes;

    @Column(name = "film_affinity")
    private String filmAffinity;

    @Column(name = "error_message")
    private String errorMessage;

}
