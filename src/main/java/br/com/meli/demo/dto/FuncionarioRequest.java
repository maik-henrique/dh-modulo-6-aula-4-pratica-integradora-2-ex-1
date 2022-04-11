package br.com.meli.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioRequest {
    private String title;

    EnderecoRequest enderecos;
}
