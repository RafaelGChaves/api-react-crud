package com.example.apireactcrud.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "produto")
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "valor")
    private Double valor;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "data")
    private LocalDate data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
