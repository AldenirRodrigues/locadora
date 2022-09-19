package com.aldenir.nf.br.model.imdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_actors_hort")
public class ActorShort implements Serializable {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "image")
    private String image;

    @Column(name = "name")
    private String name;

    @Column(name = "asCharacter")
    private String asCharacter;


}
