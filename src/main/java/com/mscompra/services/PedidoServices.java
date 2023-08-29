package com.mscompra.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mscompra.model.Pedido;
import com.mscompra.repository.PedidoRepository;

@Service
public class PedidoServices {
	
	   @Autowired
	 PedidoRepository repository;

	public Pedido salvar(Pedido pedido) {
		
		return repository.save(pedido);
		
	}
	
	
}
