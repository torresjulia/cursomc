package com.juliatorres.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliatorres.cursomc.domain.Cliente;
import com.juliatorres.cursomc.repositories.ClienteRepository;
import com.juliatorres.cursomc.services.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo; 
	
	public Cliente find (Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		
	}
	
	public List<Cliente> findAll() {
		return repo.findAll();
		
	}

}
