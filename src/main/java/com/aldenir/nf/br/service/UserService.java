package com.aldenir.nf.br.service;

import com.aldenir.nf.br.controller.UserController;
import com.aldenir.nf.br.model.User;
import com.aldenir.nf.br.model.dto.UserDTO;
import com.aldenir.nf.br.repository.AddressRepository;
import com.aldenir.nf.br.repository.UserRepository;
import com.google.gson.Gson;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private AddressRepository addressRepository;

    @Cacheable(value = "User")
    public List<User> findAll() {
        return repository.findAll();
    }

    @Cacheable(value = "User", key = "#id")
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException(""));
    }

    public UserDTO save(UserDTO userDTO) {
//        GeraRgCpfCnpj cpfCnpj = new GeraRgCpfCnpj();
//        if (!cpfCnpj.isCPF(String.valueOf(user.getCpf()))) {
//            throw new RuntimeException("CPF inválido!");
//        }
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        repository.save(user);

        return userDTO;
    }

    @CachePut(value = "User", key = "#id")
    public UserDTO update(Long id) {
        User user = repository.findById(id).orElseThrow(() -> new RuntimeException(""));
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(repository.save(user), userDTO);
        return userDTO;
    }

    @CacheEvict(value = "User", key = "#id")
    public void delete(Long id) {
        User user = repository.findById(id).orElseThrow(() -> new RuntimeException(""));
        repository.delete(user);
    }

}
