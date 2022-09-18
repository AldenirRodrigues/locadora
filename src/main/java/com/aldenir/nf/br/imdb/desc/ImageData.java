package com.aldenir.nf.br.imdb.desc;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ImageData {

    private String iMDbId;
    private String title;
    private String fullTitle;
    private String type;
    private String year;
    private List<ImageDataDetail> items;
    private String errorMessage;

}
