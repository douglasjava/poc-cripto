package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan.souza
 *
 */
public enum TiposOcorrenciasRetornosBancarios29Enum {

	PAGADOR_ALEGA_QUE_FATURAMENTO_E_INDEVIDO(78, "Pagador alega que faturamento e indevido"),
	PAGADOR_ACEITA_RECONHECE_O_FATURAMENTO(95, "Pagador aceita/reconhece o faturamento");

	private TiposOcorrenciasRetornosBancarios29Enum(int id, String descricao) {
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

	public static TiposOcorrenciasRetornosBancarios29Enum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TiposOcorrenciasRetornosBancarios29Enum e : TiposOcorrenciasRetornosBancarios29Enum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TiposOcorrenciasRetornosBancarios29Enum obterInstanciaPorId(Integer id) {

		if(id == null) {
			return null;
		}

		List<TiposOcorrenciasRetornosBancarios29Enum> lista = Arrays.asList(TiposOcorrenciasRetornosBancarios29Enum.values());
		for (TiposOcorrenciasRetornosBancarios29Enum l : lista) {
			if (l.getId() == id) {
				return l;
			}
		}
		return null;
	}
}
