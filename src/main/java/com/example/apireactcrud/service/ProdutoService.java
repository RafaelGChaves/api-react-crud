package com.example.apireactcrud.service;

import com.example.apireactcrud.model.Produto;
import com.example.apireactcrud.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private  ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listaProdutos() {
        return (List<Produto>) repository.findAll();
    }

    public Produto adicionaProduto(Produto produto){
        return repository.save(produto);
    }



}
