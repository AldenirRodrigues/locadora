package com.aldenir.nf.br.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "DB_USER")
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class User extends RepresentationModel<User> implements Serializable {

    @Id
    @Column(name = "CPF", length = 11)
    private Long cpf;

    @Column(name = "CNPJ", length = 14)
    private Long cnpj;

    @Column(name = "RG", length = 9)
    private Long rg;

    @Column(name = "PRIMARY_NAME")
    private String name;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE", length = 11)
    private String phone;

    @Column(name = "GENDER")
    private Character gender;

    @Column(name = "CHILDREN")
    private boolean children;

    @Column(name = "SINGLE")
    private boolean single;

    @OneToMany(mappedBy = "address")
    private Set<Address> address = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Film> films = new HashSet<>();

}
