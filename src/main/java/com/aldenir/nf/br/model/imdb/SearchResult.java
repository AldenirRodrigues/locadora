package com.aldenir.nf.br.model.imdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_search_result")
public class SearchResult implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "result_type")
    public String resultType;

    @Column(name = "image")
    public String image;

    @Column(name = "title")
    public String title;

    @Column(name = "description")
    public String description;
}
