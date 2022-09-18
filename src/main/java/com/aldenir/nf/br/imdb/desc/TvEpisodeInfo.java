package com.aldenir.nf.br.imdb.desc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TvEpisodeInfo {

    private String seriesId;
    private String seriesTitle;
    private String seriesFullTitle;
    private String seriesYear;
    private String seriesYearEnd;
    private String seasonNumber;
    private String episodeNumber;
    private String previousEpisodeId;
    private String nextEpisodeId;
}
