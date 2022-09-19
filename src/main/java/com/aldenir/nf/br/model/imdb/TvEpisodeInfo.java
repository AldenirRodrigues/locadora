package com.aldenir.nf.br.model.imdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_tv_episode_info")
public class TvEpisodeInfo implements Serializable {

    @Id
    @Column(name = "id")
    private String seriesId;

    @Column(name = "series_title")
    private String seriesTitle;

    @Column(name = "series_full_title")
    private String seriesFullTitle;

    @Column(name = "series_year")
    private String seriesYear;

    @Column(name = "series_year_end")
    private String seriesYearEnd;

    @Column(name = "season_number")
    private String seasonNumber;

    @Column(name = "episode_number")
    private String episodeNumber;

    @Column(name = "previous_episode_id")
    private String previousEpisodeId;

    @Column(name = "next_episode_id")
    private String nextEpisodeId;
}

