package com.aldenir.nf.br.model.dto;

import com.aldenir.nf.br.model.Address;
import com.aldenir.nf.br.model.Film;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class UserDTO  {

    @JsonProperty("user_id")
    private Long id;

    @JsonProperty("cpf")
    private Long cpf;

    @JsonProperty("cnpj")
    private Long cnpj;

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("rg")
    private Long rg;

    @JsonProperty("name")
    private String name;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("gender")
    private Character gender;

    @JsonProperty("children")
    private boolean children;

    @JsonProperty("single")
    private boolean single;

    @JsonProperty("address")
    private Set<Address> address;

    @JsonProperty("films")
    private Set<Film> films;


}