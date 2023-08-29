package com.mscompra.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mscompra.model.Pedido;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
	@PostMapping(value ="/")
	public ResponseEntity<Pedido> Salvar(@RequestBody Pedido pedido){
		
		
		return ResponseEntity.ok(pedido);
		
	}

}
