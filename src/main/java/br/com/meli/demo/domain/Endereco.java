package br.com.meli.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Endereco {
    @Id
    private String id;
    private String cidade;
    private String estado;
}
