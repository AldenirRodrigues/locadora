package com.aldenir.nf.br.repository;

import com.aldenir.nf.br.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}


