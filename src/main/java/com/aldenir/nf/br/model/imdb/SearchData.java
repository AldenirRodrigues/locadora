package com.aldenir.nf.br.model.imdb;

import com.aldenir.nf.br.model.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class SearchData  extends RepresentationModel<SearchData> implements Serializable {

    public String searchType;
    public String expression;
    public List<SearchResult> results;
    public String errorMessage;
}
