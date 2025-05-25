package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan.souza
 *
 */
public enum TiposOcorrenciasRetornosBancarios06Enum {

	TITULO_PAGO_COM_DINHEIRO(0, "Título pago com dinheiro"),
	TITULO_PAGO_COM_CHEQUE(15, "Título pago com cheque"),
	RATEIO_NAO_EFETUADO_COD_CALCULO_2_VLR_REGISTRO_E_V_NOVO(42, "Rateio não efetuado, cód. Calculo 2 (VLR. Registro) e v (NOVO)");

	private TiposOcorrenciasRetornosBancarios06Enum(int id, String descricao) {
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

	public static TiposOcorrenciasRetornosBancarios06Enum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TiposOcorrenciasRetornosBancarios06Enum e : TiposOcorrenciasRetornosBancarios06Enum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TiposOcorrenciasRetornosBancarios06Enum obterInstanciaPorId(Integer id) {

		if(id == null) {
			return null;
		}

		List<TiposOcorrenciasRetornosBancarios06Enum> lista = Arrays.asList(TiposOcorrenciasRetornosBancarios06Enum.values());
		for (TiposOcorrenciasRetornosBancarios06Enum l : lista) {
			if (l.getId() == id) {
				return l;
			}
		}
		return null;
	}
}
