package com.aldenir.nf.br.model.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Mapper extends RepresentationModel<Mapper> implements Serializable {
    private List<Object> mappers = new ArrayList<>();
}
