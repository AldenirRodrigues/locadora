package com.aldenir.nf.br.model.dto;

import com.aldenir.nf.br.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class FilmDTO {

    @JsonProperty("film_id")
    private Long id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("classification")
    private Integer classification;

    @JsonProperty("director")
    private String director;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @JsonProperty("launch")
    private Date launch;

    @JsonProperty("price")
    private BigDecimal price;

    @JsonProperty("boxOffice")
    private BigDecimal boxOffice;

}
