package com.aldenir.nf.br.imdb.desc;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FullCastData {

    private String iMDbId;
    private String title;
    private String fullTitle;
    private String type;
    private String year;
    private CastShort Directors;
    private CastShort Writers;
    private List<ActorShort> actors;
    private List<CastShort> others;
    private String errorMessage;
    
}
