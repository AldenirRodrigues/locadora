package com.aldenir.nf.br.model.imdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_language")
public class Language implements Serializable {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private String key;

    @Column(name = "value")
    private String value;

}
