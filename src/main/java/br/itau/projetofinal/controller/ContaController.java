package br.itau.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.projetofinal.model.Conta;
import br.itau.projetofinal.services.ContaService;


@RestController
@CrossOrigin("*")
@RequestMapping("/contas")

public class ContaController {

    @Autowired
    private ContaService service;

    public List<Conta> getAllContas() {
        return service.listarTodasAsContas();
    }

    @GetMapping("/{numero}")
    public ResponseEntity<Conta> getByNumero(@PathVariable long numero) {
        Conta conta = service.buscarContaPorCodigo(numero);

        if(conta != null) {
            return ResponseEntity.ok(conta);
        }
        return ResponseEntity.notFound().build();
    }
    
    
}
