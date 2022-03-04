package com.example.apireactcrud.controller.dto;

import com.example.apireactcrud.model.Produto;

import java.time.LocalDate;

public class NovoProdutoDto {
    private String nome;
    private Double valor;
    private String descricao;

    public Produto converter(){
        Produto produto = new Produto();
        produto.setDescricao(descricao);
        produto.setValor(valor);
        produto.setNome(nome);
        produto.setData(LocalDate.now());
        return produto;
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
}
