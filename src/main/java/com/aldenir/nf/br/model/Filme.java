package com.aldenir.nf.br.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "DB_FILM")
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
public class Filme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FILM_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "CLASSIFICATION")
    private Integer classification;

    @Column(name = "DIRECTOR")
    private String director;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "LAUNCH")
    private Date launch;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "BOX_OFFICE")
    private BigDecimal boxOffice;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user")
    private User user;

}
