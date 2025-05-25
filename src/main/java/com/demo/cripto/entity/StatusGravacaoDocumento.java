package com.demo.cripto.entity;

public enum StatusGravacaoDocumento {
	
	EM_PROCESSAMENTO("Em processamento"),
	LIBERADO_PARA_GRAVACAO("Liberado para gravação"),
	GRAVADO_PARA_ENTREGA("Gravado para entrega"),
	ENTREGUE_DETRAN("Entregue no DETRAN");
	
	private String nome;
	
	private StatusGravacaoDocumento(String nome){
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}

	public String getNome() {
		return nome;
	}
}


