package br.com.meli.demo.controller;

import br.com.meli.demo.domain.Funcionario;
import br.com.meli.demo.dto.FuncionarioRequest;
import br.com.meli.demo.service.FuncionarioService;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
@AllArgsConstructor
public class FuncionarioController {

    private final FuncionarioService funcionarioService;
    private final ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<?> storeArticle(@RequestBody FuncionarioRequest article) {
        Funcionario mappedArticle = modelMapper.map(article, Funcionario.class);
        return ResponseEntity.ok(funcionarioService.save(mappedArticle));
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(funcionarioService.findAll());
    }
}
