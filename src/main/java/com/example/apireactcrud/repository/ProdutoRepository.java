package com.example.apireactcrud.repository;

import com.example.apireactcrud.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
