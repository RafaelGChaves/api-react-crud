package com.example.apireactcrud.controller;

import com.example.apireactcrud.model.Produto;
import com.example.apireactcrud.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public String produto (){
        return "Produto";
    }

    @GetMapping("/todos")
    public List<Produto> listarProdutos() {
        return service.listaProdutos();
    }

    @PostMapping
    public  Produto adicionarProduto(Produto produto){
        return service.adicionaProduto(produto);
    }
}
