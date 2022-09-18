package com.aldenir.nf.br.imdb.desc;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TitleData {
    
    private String id;
    private String title;
    private String originalTitle;
    private String fullTitle;
    private String year;
    private String releaseDate;
    private String runtimeMins;
    private String runtimeStr;
    private String plot; // IMDb Plot allways en, TMDb Plot translate
    private String plotLocal;
    private boolean plotLocalIsRtl;
    private String awards;
    private String image;
    private String type;
    private String directors;
    private List<StarShort> directorList;
    private String writers;
    private List<StarShort> writerList;
    private String stars;
    private List<StarShort> starList;
    private List<ActorShort> actorList;
    private FullCastData fullCast;
    private String genres;
    private List<Object> genreList;
    private String companies;
    private List<CompanyShort> companyList;
    private String countries;
    private List<Object> countryList;
    private String languages;
    private List<Object> languageList;
    private String contentRating;
    private String iMDbRating;
    private String iMDbRatingVotes;
    private String metacriticRating;
    private RatingData ratings;
    private WikipediaData wikipedia;
    private PosterData posters;
    private ImageData images;
    private TrailerData trailer;
    private BoxOfficeShort boxOffice;
    private String tagline;
    private String keywords;
    private List<String> keywordList;
    private List<SimilarShort> similars;
    private TvSeriesInfo tvSeriesInfo;
    private TvEpisodeInfo tvEpisodeInfo;
    private String errorMessage;
}
