package com.mscompra.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mscompra.model.Pedido;
import com.mscompra.services.PedidoServices;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
	@Autowired
	PedidoServices service;
	
	@PostMapping(value ="/")
	public ResponseEntity<Pedido> Salvar(@RequestBody Pedido pedido){
		
		return ResponseEntity.ok(service.salvar(pedido));
		
	}

}
