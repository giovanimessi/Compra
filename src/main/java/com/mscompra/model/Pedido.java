package com.mscompra.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Pedido {

	/**
	 * 
	 */


	private String nome;
	private  Long produto;
	private BigDecimal valor;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date dataCompra;
	private String cpf_cliente;
	private String cep;
	
	
	
	
	

}
