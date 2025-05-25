package com.demo.cripto.entity;

public enum FlagOperacaoEnum {

	INCLUSAO_REGISTRO_CONTRATO("1"),
	ALTERACAO_REGISTRO_CONTRATO("2"),
	
	INCLUSAO_ADITIVO_CONTRATO("3"),
	ALTERACAO_ADITIVO_CONTRATO("4");

	private String descricao;

	FlagOperacaoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
