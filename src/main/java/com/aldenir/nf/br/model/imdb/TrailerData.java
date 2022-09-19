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
@Table(name = "tb_trailer_data")
public class TrailerData implements Serializable {

    @Id
    @Column(name = "id")
    private String iMDbId;

    @Column(name = "title")
    private String title;

    @Column(name = "full_title")
    private String fullTitle;

    @Column(name = "type")
    private String type;

    @Column(name = "year")
    private String year;

    @Column(name = "video_id")
    private String videoId;

    @Column(name = "video_title")
    private String videoTitle;

    @Column(name = "video_description")
    private String videoDescription;

    @Column(name = "thumbnail_url")
    private String thumbnailUrl;

    @Column(name = "upload_date")
    private String uploadDate;

    @Column(name = "link")
    private String link;

    @Column(name = "link_embed")
    private String linkEmbed;

    @Column(name = "error_message")
    private String errorMessage;

}
