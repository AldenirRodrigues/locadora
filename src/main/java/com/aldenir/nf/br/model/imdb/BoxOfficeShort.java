package com.aldenir.nf.br.model.imdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_box_office_short")
public class BoxOfficeShort implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "budget")
    private String budget;

    @Column(name = "opening_weekend_usa")
    private String openingWeekendUSA;

    @Column(name = "gross_usa")
    private String grossUSA;

    @Column(name = "cumulative_worldwide_gross")
    private String cumulativeWorldwideGross;
}

