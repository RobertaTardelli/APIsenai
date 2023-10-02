package com_api_senai.api.entities;

import lombok.Data;

@Data
public class Endereco {

    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;




}
