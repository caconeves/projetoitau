package br.itau.projetofinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero")
    private long numero;

    @Column(name = "agencia")
    private int agencia;

    @Column(name = "tipo")
    private int tipoConta;

    @Column(name = "saldo")
    private double saldo;

    @OneToOne // uma conta relacionada a 1 Cliente
    @JoinColumn(name = "cod_cliente")
    private Cliente titular;

    
}
