package com.aldenir.nf.br.model;

import com.aldenir.nf.br.model.imdb.TitleData;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FilmListDataDetail {

    private String id;
    private String index ;
    private String title ;
    private String fullTitle ;
    private String year ;
    private String image ;
    private String iMDbRating ;
    private String iMDbRatingCount ;
    private String description ;

    public FilmListDataDetail(TitleData titleData) {
        this.id = titleData.getId();
        this.title = titleData.getTitle();
        this.fullTitle = titleData.getFullTitle();
        this.year = titleData.getYear();
        this.image = titleData.getImage();
        this.iMDbRating = titleData.getIMDbRating();
        this.iMDbRatingCount = titleData.getIMDbRatingVotes();
        this.description = titleData.getPlotLocal();
    }
}
