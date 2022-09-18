package com.aldenir.nf.br.imdb.desc;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PosterData {

    private String iMDbId;
    private String title;
    private String fullTitle;
    private String type;
    private String year;
    private List<PosterDataItem> posters;
    private List<PosterDataItem> backdors;
    private String errorMessage;

}
