package com_api_senai.api.entities;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.UUID;

public class Cliente {

    private UUID id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private String telefone;
    private String email;
    private String login;
    private String senha;




}
