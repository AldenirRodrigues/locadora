package com.aldenir.nf.br.imdb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum SearchType {

    TITLE(1),
    MOVIE(2),
    SERIES(4),
    NAME(8),
    EPISODE(16),
    COMPANY(32),
    KEYWORD(64),
    ALL(128);

    public final int value;
}
