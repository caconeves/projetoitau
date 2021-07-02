package br.itau.projetofinal.repository;

import org.springframework.data.repository.CrudRepository;

import br.itau.projetofinal.model.Conta;

public interface ContaRepository extends CrudRepository<Conta, Long> {
    
}
