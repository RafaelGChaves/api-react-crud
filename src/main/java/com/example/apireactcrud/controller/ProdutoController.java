package com.example.apireactcrud.controller;

import com.example.apireactcrud.controller.dto.NovoProdutoDto;
import com.example.apireactcrud.model.Produto;
import com.example.apireactcrud.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

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
    public  Produto adicionarProduto(@RequestBody NovoProdutoDto produtoDto){
        return service.adicionaProduto(produtoDto.converter());
    }

    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable Long id, @RequestBody NovoProdutoDto produtoDto) {
        return service.atualizaProduto(id, produtoDto.converter());
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {
        service.deletaProduto(id);
    }

}
