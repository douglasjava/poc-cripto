package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author alan.souza
 *
 */
public enum TipoAditivoEnum {

	SUBSTITUICAO_GARANTIA(1, "Substituição de garantia"), CESSAO_DIREITO(2, "Cessão de Direito"),
	CESSAO_DIREITO_CREDOR(3, "Cessão de Direito do Credor");

	private TipoAditivoEnum(int id, String descricao) {
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

	public static Map<String, String> getListaTipoDocContrato() {
		List<TipoAditivoEnum> lista = Arrays.asList(TipoAditivoEnum.values());
		Map<String, String> mapa = new HashMap<>();

		for (TipoAditivoEnum l : lista) {
			mapa.put(String.valueOf(l.getId()), l.getDescricao());
		}
		return mapa;
	}

	public static TipoAditivoEnum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TipoAditivoEnum e : TipoAditivoEnum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TipoAditivoEnum obterInstanciaPorId(String id) {

		if(id == null || id.equals("")) {
			return null;
		}

		List<TipoAditivoEnum> lista = Arrays.asList(TipoAditivoEnum.values());
		for (TipoAditivoEnum l : lista) {
			if (String.valueOf(l.getId()).equals(id)) {
				return l;
			}
		}
		return null;
	}
}
