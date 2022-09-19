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
@Table(name = "tb_cast_short")
public class CastShort implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "job")
    private String job;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<CastShortItem> items = new ArrayList<>();
}
