package com.aldenir.nf.br.model.dto;

import com.aldenir.nf.br.model.Address;
import com.aldenir.nf.br.model.Film;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.*;

import static org.mockito.Mockito.*;

class UserDTOTest {

    @Mock
    Set<Address> address = new HashSet<>();
    @Mock
    Set<Film> films;
    @InjectMocks
    UserDTO userDTO;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testUserDTO() {

        UserDTO userDTO = Mockito.spy(new UserDTO());

        when(userDTO.getId()).thenReturn(0L);
        when(userDTO.getCnpj()).thenReturn(0L);
        when(userDTO.getCpf()).thenReturn(0L);
        when(userDTO.getRg()).thenReturn(0L);
        when(userDTO.getCep()).thenReturn("");
        when(userDTO.getName()).thenReturn("");
        when(userDTO.getLastName()).thenReturn("");
        when(userDTO.getEmail()).thenReturn("");
        when(userDTO.getPhone()).thenReturn("");
        when(userDTO.getGender()).thenReturn('M');
        when(userDTO.isChildren()).thenReturn(true);
        when(userDTO.isSingle()).thenReturn(true);
        when(userDTO.getAddress()).thenReturn(new HashSet<>());
        when(userDTO.getFilms()).thenReturn(new HashSet<>());

        Assertions.assertEquals(0L,userDTO.getId(),"");
        Assertions.assertEquals(0L,userDTO.getCnpj(),"");
        Assertions.assertEquals(0L,userDTO.getCpf(),"");
        Assertions.assertEquals(0L,userDTO.getRg(),"");
        Assertions.assertEquals("",userDTO.getCep(),"");
        Assertions.assertEquals("",userDTO.getName(),"");
        Assertions.assertEquals("",userDTO.getLastName(),"");
        Assertions.assertEquals("",userDTO.getEmail(),"");
        Assertions.assertEquals("",userDTO.getPhone(),"");
        Assertions.assertEquals('M',userDTO.getGender(),"");
        Assertions.assertTrue(userDTO.isChildren(),"");
        Assertions.assertFalse(userDTO.isSingle(),"");
        Assertions.assertAll("address ok",userDTO::getAddress);
        Assertions.assertAll("films ok",userDTO::getFilms);
    }


}

