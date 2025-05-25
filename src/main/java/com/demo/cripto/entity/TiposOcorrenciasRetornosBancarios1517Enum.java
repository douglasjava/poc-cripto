package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan.souza
 *
 */
public enum TiposOcorrenciasRetornosBancarios1517Enum {

	TITULO_PAGO_COM_DINHEIRO(0, "Título pago com dinheiro"),
	TITULO_PAGO_COM_CHEQUE(15, "Título pago com cheque");

	private TiposOcorrenciasRetornosBancarios1517Enum(int id, String descricao) {
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

	public static TiposOcorrenciasRetornosBancarios1517Enum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TiposOcorrenciasRetornosBancarios1517Enum e : TiposOcorrenciasRetornosBancarios1517Enum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TiposOcorrenciasRetornosBancarios1517Enum obterInstanciaPorId(Integer id) {

		if(id == null) {
			return null;
		}

		List<TiposOcorrenciasRetornosBancarios1517Enum> lista = Arrays.asList(TiposOcorrenciasRetornosBancarios1517Enum.values());
		for (TiposOcorrenciasRetornosBancarios1517Enum l : lista) {
			if (l.getId() == id) {
				return l;
			}
		}
		return null;
	}
}
