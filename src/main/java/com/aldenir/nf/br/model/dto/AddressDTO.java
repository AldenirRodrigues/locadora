package com.aldenir.nf.br.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class AddressDTO {

    @JsonProperty("zipCode")
    private Long cep;

    @JsonProperty("street")
    private String logradouro;

    @JsonProperty("neighborhood")
    private String bairro;

    @JsonProperty("cit")
    private String localidade;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("state")
    private String uf;

    @JsonProperty("complement")
    private String complemento;

}