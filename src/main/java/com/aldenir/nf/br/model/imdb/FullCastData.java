package com.aldenir.nf.br.model.imdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tb_full_cast_data")
public class FullCastData implements Serializable {

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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private CastShort directors;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private CastShort writers;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<ActorShort> actors = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<CastShort> others = new ArrayList<>();

    @Column(name = "error_message")
    private String errorMessage;


}
