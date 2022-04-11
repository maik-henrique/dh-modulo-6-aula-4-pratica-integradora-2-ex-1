package br.com.meli.demo.repository;

import br.com.meli.demo.domain.Funcionario;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends ElasticsearchRepository<Funcionario, String> {
}
