package br.itau.projetofinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.itau.projetofinal.model.Conta;
import br.itau.projetofinal.repository.ContaRepository;

@Service
public class ContaService {
    
    @Autowired
    private ContaRepository contaRepo;

    public List<Conta> listarTodasAsContas() {
        List<Conta> lista = (List<Conta>) contaRepo.findAll();
        return lista;
    }

    public Conta buscarContaPorCodigo(long numeroConta) {
        Conta conta = contaRepo.findById(numeroConta).orElse(null);
        return conta;
    }
    
}
