package br.com.meli.demo.service;

import br.com.meli.demo.domain.Funcionario;
import br.com.meli.demo.repository.FuncionarioRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;


    public Funcionario save(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public Iterable<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }
}
