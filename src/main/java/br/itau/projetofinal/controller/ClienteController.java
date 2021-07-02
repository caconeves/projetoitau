package br.itau.projetofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.projetofinal.model.Cliente;
import br.itau.projetofinal.services.ClienteService;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")

public class ClienteController {
    @Autowired
    private ClienteService service;

    @PostMapping("/novo")
    public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente) {
        Cliente clienteInserido = service.inserirCliente(cliente);
        return ResponseEntity.ok(clienteInserido);
    }
}
