package com.aldenir.nf.br.model.imdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tb_poster_data")
public class PosterData implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private String iMDbId;

    @Column(name = "title")
    private String title;

    @Column(name = "full_title")
    private String fullTitle;

    @Column(name = "type")
    private String type;

    @Column(name = "year")
    private String year;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Set<PosterDataItem> posters  = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Set<PosterDataItem> backdors  = new HashSet<>();

    @Column(name = "error_message")
    private String errorMessage;

}
