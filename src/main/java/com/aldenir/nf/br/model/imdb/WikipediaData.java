package com.aldenir.nf.br.model.imdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tb_wikipedia_data")
public class WikipediaData {

    @Id
    @Column(name = "id")
    private String iMDbId;

    @Column(name = "title")
    private String title;

    @Column(name = "full_title")
    private String fullTitle;

    @Column(name = "type")
    private String type;

    @Column(name = "year")
    private String year;

    @Column(name = "language")
    private String language;

    @Column(name = "title_in_language")
    private String titleInLanguage;

    @Column(name = "url")
    private String url;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private WikipediaDataPlot plotShort;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private WikipediaDataPlot plotFull;

    @Column(name = "error_message")
    private String errorMessage;


}
