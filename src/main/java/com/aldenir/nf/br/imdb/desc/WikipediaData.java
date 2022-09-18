package com.aldenir.nf.br.imdb.desc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WikipediaData {

    private String iMDbId;
    private String title;
    private String fullTitle;
    private String type;
    private String year;
    private String language;
    private String titleInLanguage;
    private String url;
    private WikipediaDataPlot PlotShort;
    private WikipediaDataPlot PlotFull;
    private String errorMessage;
    
}
