package com.aldenir.nf.br.service;

import com.aldenir.nf.br.model.Address;
import com.aldenir.nf.br.model.dto.AddressDTO;
import com.aldenir.nf.br.repository.AddressRepository;
import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Set;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    public List<Address> findAll() {
        return repository.findAll();
    }

    public Address findById(String cep) {
        return repository.findById(Long.valueOf(cep)).orElseThrow(() -> new RuntimeException(""));
    }

    public Address save(Address address) throws Exception {

        ViaCEPClient client = new ViaCEPClient();
        ViaCEPEndereco endereco = client.getEndereco(address.getCep());

        Address add = new Address();
        add.setCep(address.getCep());
        add.setNumber(address.getNumber());
        add.setComplemento(address.getComplemento());
        add.setUf(endereco.getUf());
        add.setBairro(endereco.getBairro());
        add.setLocalidade(endereco.getLocalidade());
        add.setLogradouro(endereco.getLogradouro());

        return repository.save(add);
    }

    public Address update(String cep) {
        return repository.findById(Long.valueOf(cep)).orElseThrow(() -> new RuntimeException(""));
    }

    public void delete(String  cep) {
        Address address = repository.findById(Long.valueOf(cep)).orElseThrow(() -> new RuntimeException(""));
        repository.delete(address);
    }

}
