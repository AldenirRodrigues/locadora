package com.aldenir.nf.br.model.imdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_poster_data_item")
public class PosterDataItem implements Serializable {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "link")
    private String link;

    @Column(name = "aspect_ratio")
    private double aspectRatio;

    @Column(name = "language")
    private String language;

    @Column(name = "width")
    private int width;

    @Column(name = "height")
    private int height;
}

