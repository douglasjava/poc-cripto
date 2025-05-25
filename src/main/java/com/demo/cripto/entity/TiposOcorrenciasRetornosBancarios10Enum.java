package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan.souza
 *
 */
public enum TiposOcorrenciasRetornosBancarios10Enum {

	BAIXADO_CONFORME_INSTRUCOES_DA_AGENCIA(0, "Baixado Conforme Instruções da Agência"),
	TITULO_PROTESTADO(14, "Título Protestado"),
	TITULO_EXCLUIDO(15, "Título excluído"),
	TITULO_BAIXADO_PELO_BANCO_POR_DECURSO_PRAZO(16, "Título Baixado pelo Banco por decurso Prazo"),
	TITULO_BAIXADO_TRANSFERIDO_CARTEIRA(17, "Titulo Baixado Transferido Carteira"),
	TITULO_BAIXADO_E_TRANSFERIDO_PARA_DESCONTO(20, "Titulo Baixado e Transferido para Desconto");

	private TiposOcorrenciasRetornosBancarios10Enum(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	private final int id;
	private final String descricao;

	public int id() {
		return this.id;
	}

	public int getId() {
		return this.id;
	}

	public String descricao() {
		return this.descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public static TiposOcorrenciasRetornosBancarios10Enum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TiposOcorrenciasRetornosBancarios10Enum e : TiposOcorrenciasRetornosBancarios10Enum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TiposOcorrenciasRetornosBancarios10Enum obterInstanciaPorId(Integer id) {

		if(id == null) {
			return null;
		}

		List<TiposOcorrenciasRetornosBancarios10Enum> lista = Arrays.asList(TiposOcorrenciasRetornosBancarios10Enum.values());
		for (TiposOcorrenciasRetornosBancarios10Enum l : lista) {
			if (l.getId() == id) {
				return l;
			}
		}
		return null;
	}
}
