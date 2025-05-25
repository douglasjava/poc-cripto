package com.demo.cripto.entity;

public enum StatusEnum {
	
	PreRegistro ("1"),
	Registrado("2"),
	Cancelado("3"),
	ComErroNoDetran("4"),
	Anulado("5"),
	Baixado("6"), 	
	LiberadoParaDetran("8"), 
	EnviadoParaDetranP1("9"), 
	EnviadoParaDetranP2("10"),
	SolicitaBaixa("11"), 
	SolicitaAnulacao("12"), 
	BaixaComErro("14"),
	AnulacaoComErro("15"),
	RegistradoPorOutraEmpresa("16");

	private final String valor;

	private StatusEnum(String s) {
		valor = s;
	}

	public String getValor() {
		return this.valor;
	}

	@Override
	public String toString() {
		return this.valor;
	}
}
