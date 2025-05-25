package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Valores de domínio arqs_cargas.tp_arquivo
 * 
 * @author vanessa.vasconcelos
 *
 */
public enum TipoArquivoEnum {

	CONTRATO_POSICIONAL(1, "Contratos posicional"), 
	CONTRATO_CSV(2, "Contratos CSV"),
	CONTRATO_IMAGEM(3, "Contratos imagem"),
	CONTRATO_BANCO_DO_BRASIL(4, "Contratos Banco do Brasil"),
	CONTRATO_BANCO_DO_BRASIL_CVS(5, "Contratos Banco do Brasil formato CSV");;

	private TipoArquivoEnum(int id, String descricao) {
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

	public static Map<String, String> getListaTipoArquivo() {
		List<TipoArquivoEnum> lista = Arrays.asList(CONTRATO_BANCO_DO_BRASIL, CONTRATO_IMAGEM, CONTRATO_BANCO_DO_BRASIL_CVS);
		Map<String, String> mapa = new HashMap<>();

		for (TipoArquivoEnum l : lista) {
			mapa.put(String.valueOf(l.getId()), l.getDescricao());
		}
		return mapa;
	}

	public static TipoArquivoEnum obterInstanciaPorDesc(String descricao) {

		if (descricao == null) {
			return null;
		}

		for (TipoArquivoEnum e : TipoArquivoEnum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TipoArquivoEnum obterInstanciaPorId(String id) {

		List<TipoArquivoEnum> lista = Arrays.asList(TipoArquivoEnum.values());
		for (TipoArquivoEnum l : lista) {
			if (String.valueOf(l.getId()).equals(id)) {
				return l;
			}
		}
		return null;
	}

}
