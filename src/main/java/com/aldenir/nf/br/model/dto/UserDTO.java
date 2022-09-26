package com.aldenir.nf.br.model.dto;

import com.aldenir.nf.br.model.Address;
import com.aldenir.nf.br.model.Filme;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
public class UserDTO extends RepresentationModel<UserDTO> implements Serializable{

    @Id
    @JsonProperty("cpf")
    private Long cpf;

    @JsonProperty("cnpj")
    private Long cnpj;

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
    private Set<Address> address = new HashSet<>();

    @JsonProperty("films")
    private Set<Filme> filmes = new HashSet<>();

}