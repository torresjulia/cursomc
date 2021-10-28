package com.juliatorres.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliatorres.cursomc.domain.Pedido;
import com.juliatorres.cursomc.repositories.PedidoRepository;
import com.juliatorres.cursomc.services.services.exceptions.ObjectNotFoundException;

@Service	
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo; 
	
	public Pedido find (Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		
	}
	
	public List<Pedido> findAll() {
		return repo.findAll();
		
	}

}
