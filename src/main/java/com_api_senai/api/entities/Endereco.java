package com_api_senai.api.entities;

import lombok.Data;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;

import com.google.gson.Gson;



@Data

public class Endereco {

    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String localidade; // cidade / por conta de integração via cep
    private String uf;

public Endereco getEnderecoByCep(String cep){
Endereco endereco = new Endereco();

//Mandar o cep para o via cep
HttpGet request = new HttpGet("https://viacep.com.br/ws/" + cep +"/json/");

try (
    CloseableHttpClient httpClient = HttpClientBuilder.create().build();
    CloseableHttpResponse response = httpClient.execute(request);
    ){
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity);
        System.out.println(result);

        Gson gson = new Gson();
        endereco = gson.fromJson(result);
        }
    }

catch (Exception e ){

    //TODO: handler exception

  // Tratar a resposta do via cep

  // montar o eu Endereço endereco

  return endereco;

  }
}


