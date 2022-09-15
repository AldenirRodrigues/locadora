package com.aldenir.nf.br.service;

import com.aldenir.nf.br.model.Address;
import com.aldenir.nf.br.model.dto.AddressDTO;
import com.aldenir.nf.br.repository.AddressRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;


    public List<Address> findAll() {
        return repository.findAll();
    }

    public AddressDTO findById(Long cep) {
        AddressDTO addressDTO = new AddressDTO();
        Address address = repository.findById(cep).orElseThrow(() -> new RuntimeException(""));
        BeanUtils.copyProperties(address, addressDTO);
        return addressDTO;
    }

    public AddressDTO save(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        BeanUtils.copyProperties(repository.save(address), addressDTO);
        return addressDTO;
    }

    public AddressDTO update(Long cep) {
        Address address = repository.findById(cep).orElseThrow(() -> new RuntimeException(""));
        AddressDTO addressdto = new AddressDTO();
        BeanUtils.copyProperties(address, addressdto);
        return addressdto;
    }

    public void delete(Long cep) {
        Address address = repository.findById(cep).orElseThrow(() -> new RuntimeException(""));
        repository.delete(address);
    }

}
