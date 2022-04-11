package br.com.meli.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

@Document(indexName = "blog")
@Data
public class Funcionario {
    @Id
    private String id;
    private String nome;
    private String sobrenome;
    private String idade;

    @Field(type = FieldType.Nested, includeInParent = true)
    private Endereco enderecos;

}
