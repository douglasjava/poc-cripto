package com.demo.cripto.entity;

import java.io.Serializable;

public class MensagemRetornoRemessa implements Serializable {

	private static final long serialVersionUID = 1L;

	private String mensagem;
	private String campo;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	@Override
	public String toString() {
		return mensagem;
	}

}
