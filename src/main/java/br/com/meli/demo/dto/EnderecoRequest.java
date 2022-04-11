package br.com.meli.demo.dto;

import lombok.Data;

@Data
public class EnderecoRequest {
    private String nome;
    private String sobrenome;
    private String idade;
}
