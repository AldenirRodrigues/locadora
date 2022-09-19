package com.aldenir.nf.br.model.imdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tb_tv_series_info")
public class TvSeriesInfo implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "year_end")
    private String yearEnd;

    @Column(name = "creators")
    private String creators;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Set<StarShort> creatorList = new HashSet<>();

    @ElementCollection
    @Column(name = "seasons")
    private Map<String, String> seasons;


}
