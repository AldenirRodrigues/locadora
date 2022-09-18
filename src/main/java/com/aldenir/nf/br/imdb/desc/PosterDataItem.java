package com.aldenir.nf.br.imdb.desc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PosterDataItem {

    private String id;
    private String link;
    private double aspectRatio;
    private String language;
    private int width;
    private int height;
}
