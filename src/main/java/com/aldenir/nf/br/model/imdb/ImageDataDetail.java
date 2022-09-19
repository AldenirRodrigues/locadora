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
@Table(name = "tb_image_data_detail")
public class ImageDataDetail implements Serializable {

    @Id
    @Column(name = "title")
    private String title;

    @Column(name = "image")
    private String image;

}
