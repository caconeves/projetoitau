package br.itau.projetofinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //entidade (objeto) armazenada no BD
@Table(name = "cliente") //criar a tabela chamada "cliente"
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1, 2, 3, ...
    @Column(name = "codigo")
    private long codigo;

    @Column(name = "nome", length = 200, nullable = false)
    private String nome;
    
    @Column(name = "cpf", length = 12, nullable = false, unique = true)
    private String cpf;
    
    @Column(name = "telefone", length = 15)
    private String telefone;

    @Column(name = "email", length = 50, unique = true)
    private String email;

    public Cliente() {

    }

    public Cliente(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }



    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
