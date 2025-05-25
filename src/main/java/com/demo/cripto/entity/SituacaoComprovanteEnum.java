package com.demo.cripto.entity;

import java.util.stream.Stream;

public enum SituacaoComprovanteEnum {

	NAO_EMITIDO(1, "Não Emitido"),
	AGUARDANDO_PE(2, "Aguardando Comprovante PE"),
	DISPONIVEL(3, "Disponivel Para Emissão"),
	GERANDO(4, "Gerando"),
	EMITIDO(5, "Emitido"),
	ERRO(6, "Erro");
	

	private int id;
	private String descricao;

	SituacaoComprovanteEnum(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	public static SituacaoComprovanteEnum getById(int id) {
		return Stream.of(values()).filter(t-> t.getId() == id).findFirst().get();
	}	
	
	public int getId() {
		return this.id;
	}

	public String getDescricao() {
		return descricao;
	}
}
