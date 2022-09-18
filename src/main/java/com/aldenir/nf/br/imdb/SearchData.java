package com.aldenir.nf.br.imdb;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchData {

    public String searchType;
    public String expression;
    public List<SearchResult> results;
    public String errorMessage;
}
