package com.aldenir.nf.br.model.imdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tb_image_data")
public class ImageData implements Serializable {

    @Id
    @Column(name = "id")
    private String iMDbId;

    @Column(name = "title")
    private String title;

    @Column(name = "fullTitle")
    private String fullTitle;

    @Column(name = "type")
    private String type;

    @Column(name = "year")
    private String year;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "title")
    private Set<ImageDataDetail> items = new HashSet<>();

    @Column(name = "errorMessage")
    private String errorMessage;


}
