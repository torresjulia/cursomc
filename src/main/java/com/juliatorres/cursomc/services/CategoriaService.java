package com.juliatorres.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliatorres.cursomc.domain.Categoria;
import com.juliatorres.cursomc.repositories.CategoriaRepository;

@Service	
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo; 
	
	public Categoria find (Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null); 
		
	}
	
	public List<Categoria> findAll() {
		return repo.findAll();
		
	}

}
