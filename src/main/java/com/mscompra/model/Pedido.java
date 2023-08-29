package com.mscompra.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

@Entity
@Table(name = "tb_pedidos")
public class Pedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long Id;
	private String nome;
	private  Long produto;
	private BigDecimal valor;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date dataCompra;
	private String cpf_cliente;
	private String cep;
	
	
	
	
	

}
