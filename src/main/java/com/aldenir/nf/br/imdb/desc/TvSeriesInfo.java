package com.aldenir.nf.br.imdb.desc;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TvSeriesInfo {

    private String yearEnd;
    private String creators;
    private List<StarShort> creatorList;
    private List<String> seasons;

}
