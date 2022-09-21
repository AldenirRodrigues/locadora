package com.aldenir.nf.br.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "DB_ADDRESS")
public class Address implements Serializable {

    @Id
    @Column(name = "ZIP_CODE")
    private String cep;

    @Column(name = "STREET")
    private String logradouro;

    @Column(name = "NEIGHBORHOOD")
    private String bairro;

    @Column(name = "CIT")
    private String localidade;

    @Column(name = "NUMBER")
    private Integer number;

    @Column(name = "STATE")
    private String uf;

    @Column(name = "COMPLEMENT")
    private String complemento;

    @ManyToOne
    @JoinColumn
    private User address;

}