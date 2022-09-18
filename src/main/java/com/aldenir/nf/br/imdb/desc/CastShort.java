package com.aldenir.nf.br.imdb.desc;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CastShort {

    private String job;
    private List<CastShortItem> items;
}
