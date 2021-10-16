package com.juliatorres.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juliatorres.cursomc.domain.Produto;

@Repository 
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {


}


