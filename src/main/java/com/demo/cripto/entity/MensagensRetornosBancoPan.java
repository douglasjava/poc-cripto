package com.demo.cripto.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mensagens_retorno_banco_pan")
@Getter
@Setter
public class MensagensRetornosBancoPan implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "id_mensagem_retorno_banco_pan")
	private Integer idMensagemRetornoBancoPan;


	@Basic(optional = true)
	@Column(name = "id_mensagem_retorno_detran_mg")
	private Integer idMensagemRetornoDetranMg;

	@Basic(optional = false)
	@Column(name = "descricao")
	private String descricao;

}
