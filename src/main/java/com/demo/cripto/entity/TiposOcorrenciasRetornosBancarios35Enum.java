package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan.souza
 *
 */
public enum TiposOcorrenciasRetornosBancarios35Enum {

	TENTATIVAS_ESGOTADAS_BAIXADO(81, "Tentativas esgotadas, baixado"),
	TENTATIVAS_ESGOTADAS_PENDENTE(82, "Tentativas esgotadas, pendente"),
	CANCELADO_PELO_PAGADOR_E_MANTIDO_PENDENTE_CONFORME_NEGOCIACAO(83, "Cancelado pelo Pagador e Mantido Pendente, conforme negociação"),
	CANCELADO_PELO_PAGADOR_E_BAIXADO_CONFORME_NEGOCIACAO(84, "Cancelado pelo pagador e baixado, conforme negociação");

	private TiposOcorrenciasRetornosBancarios35Enum(int id, String descricao) {
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

	public static TiposOcorrenciasRetornosBancarios35Enum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TiposOcorrenciasRetornosBancarios35Enum e : TiposOcorrenciasRetornosBancarios35Enum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TiposOcorrenciasRetornosBancarios35Enum obterInstanciaPorId(Integer id) {

		if(id == null) {
			return null;
		}

		List<TiposOcorrenciasRetornosBancarios35Enum> lista = Arrays.asList(TiposOcorrenciasRetornosBancarios35Enum.values());
		for (TiposOcorrenciasRetornosBancarios35Enum l : lista) {
			if (l.getId() == id) {
				return l;
			}
		}
		return null;
	}
}
