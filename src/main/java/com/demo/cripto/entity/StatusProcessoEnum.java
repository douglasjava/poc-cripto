package com.demo.cripto.entity;

public enum StatusProcessoEnum {

	EM_ANDAMENTO("Em andamento"), COM_ERRO("Com erro"), FINALIZADO("Finalizado");

	private final String descricao;

	private StatusProcessoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
