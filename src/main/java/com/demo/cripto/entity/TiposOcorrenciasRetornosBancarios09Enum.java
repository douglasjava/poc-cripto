package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan.souza
 *
 */
public enum TiposOcorrenciasRetornosBancarios09Enum {

	OCORRENCIA_ACEITA(0, "Ocorrência Aceita"),
	BAIXA_COMANDADA_PELO_CLIENTE(10, "Baixa Comandada pelo cliente");

	private TiposOcorrenciasRetornosBancarios09Enum(int id, String descricao) {
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

	public static TiposOcorrenciasRetornosBancarios09Enum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TiposOcorrenciasRetornosBancarios09Enum e : TiposOcorrenciasRetornosBancarios09Enum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TiposOcorrenciasRetornosBancarios09Enum obterInstanciaPorId(Integer id) {

		if(id == null) {
			return null;
		}

		List<TiposOcorrenciasRetornosBancarios09Enum> lista = Arrays.asList(TiposOcorrenciasRetornosBancarios09Enum.values());
		for (TiposOcorrenciasRetornosBancarios09Enum l : lista) {
			if (l.getId() == id) {
				return l;
			}
		}
		return null;
	}
}
