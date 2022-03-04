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

    public Produto atualizaProduto(Long id, Produto produto){
        Produto produtoAtualizado = repository.findById(id).get();
        produtoAtualizado.setData(produto.getData());
        produtoAtualizado.setNome(produto.getNome());
        produtoAtualizado.setDescricao(produto.getDescricao());
        produtoAtualizado.setValor(produto.getValor());
        return repository.save(produtoAtualizado);
    }

    public void deletaProduto(Long id) {
        repository.deleteById(id);
    }

}
