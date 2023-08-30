package com.mscompra.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)

    private Long Id;
    
    @NotBlank
	private String nome;
    
    @NotNull
    @Min(1)
	private  Long produto;
    
    @NotNull
    @Min(1)
	private BigDecimal valor;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date dataCompra;
	
    @NotBlank
	private String cpf_cliente;
    
    @NotBlank
	private String cep;
	
	
	
	
	

}
