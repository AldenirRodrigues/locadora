package com.aldenir.nf.br.model.imdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Getter
@Setter
@Entity
@Table(name = "tb_title_data")
public class TitleData implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "title")
    private String title;

    @Column(name = "original_title")
    private String originalTitle;

    @Column(name = "full_title")
    private String fullTitle;

    @Column(name = "year")
    private String year;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "runtime_mins")
    private String runtimeMins;

    @Column(name = "runtime_str")
    private String runtimeStr;

    @Column(name = "plot")
    private String plot;

    @Column(name = "plot_local")
    private String plotLocal;

    @Column(name = " plot_local_is_rtl")
    private boolean plotLocalIsRtl;

    @Column(name = "awards")
    private String awards;

    @Column(name = "image")
    private String image;

    @Column(name = "type")
    private String type;

    @Column(name = "directors")
    private String directors;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<StarShort> directorList = new ArrayList<>();

    @Column(name = "writers")
    private String writers;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<StarShort> writerList = new ArrayList<>();

    @Column(name = "stars")
    private String stars;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<StarShort> starList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<ActorShort> actorList = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private FullCastData fullCast;

    @Column(name = "genres")
    private String genres;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Genre> genreList = new ArrayList<>();

    @Column(name = "companies")
    private String companies;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<CompanyShort> companyList = new ArrayList<>();

    @Column(name = "countries")
    private String countries;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Country> countryList;

    @Column(name = "languages")
    private String languages;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Language> languageList;

    @Column(name = "content_rating")
    private String contentRating;

    @Column(name = "imdb_rating")
    private String iMDbRating;

    @Column(name = "imdb_rating_votes")
    private String iMDbRatingVotes;

    @Column(name = "meta_critic_rating")
    private String metacriticRating;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private RatingData ratings;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private WikipediaData wikipedia;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private PosterData posters;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private ImageData images;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private TrailerData trailer;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private BoxOfficeShort boxOffice;

    @Column(name = "tagline")
    private String tagline;

    @Column(name = "keywords")
    private String keywords;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Keyword> keywordList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<SimilarShort> similars = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private TvSeriesInfo tvSeriesInfo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private TvEpisodeInfo tvEpisodeInfo;

    @Column(name = "error_message")
    private String errorMessage;
}
