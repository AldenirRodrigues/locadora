package com.aldenir.nf.br.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "DB_USER")
public class User implements Serializable {

    @Id
    @Column(name = "CPF", length = 11, unique = true)
    private Long cpf;

    @Column(name = "CNPJ", length = 14, unique = true)
    private Long cnpj;

    @Column(name = "RG", length = 9, unique = true)
    private Long rg;

    @Column(name = "PRIMARY_NAME")
    private String name;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL", unique = true)
    private String email;

    @Column(name = "PHONE", length = 11, unique = true)
    private String phone;

    @Column(name = "GENDER")
    private Character gender;

    @Column(name = "CHILDREN")
    private boolean children;

    @Column(name = "SINGLE")
    private boolean single;

    @Column(name = "ZIP_CODE")
    private String cep;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "ZIP_CODE")
    private Set<Address> address = new HashSet<>();

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "FILM_ID")
    private Set<Film> films = new HashSet<>();

}