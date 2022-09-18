package com.aldenir.nf.br.imdb;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchResult {

    public String id;
    public String resultType;
    public String image;
    public String title;
    public String description;
}
