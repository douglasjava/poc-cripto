package com.demo.cripto.entity;

public enum TipoLogGerenciamentoEnum {

	INCLUSAO("Inclusão"), REMOCAO("Remoção"), ALTERAR("Alterar");

	private final String descricao;

	private TipoLogGerenciamentoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
