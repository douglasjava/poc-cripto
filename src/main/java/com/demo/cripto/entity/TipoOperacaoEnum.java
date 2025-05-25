package com.demo.cripto.entity;

public enum TipoOperacaoEnum {

	INCLUSAO_REGISTRO(1, "Inclusão do registro de contrato"), ALT_REGISTRO(2, "Alteração do registro de contrato"), ADITIVO_REGISTRO(3, "Inclusão do Aditivo de contrato"), ALT_ADITIVO_REGISTRO(4, "Alteração do Aditivo de contrato");

	private TipoOperacaoEnum(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	private final int id;
	private final String descricao;

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

}
