package com.demo.cripto.entity;

import java.util.Arrays;

public enum AmbienteEnum {
	
	HOMOLOGACAO(1,"Homologação", "dev"),
	PRODUCAO(3,"Produção", "prod");
	
	Integer id;
	String descricao;
	String profile;
	
	private AmbienteEnum(Integer id, String descricao, String profile) {
		this.id = id;
		this.descricao = descricao;
		this.profile = profile;
	}
	
	public static AmbienteEnum getById(Integer id) {
		
		for(AmbienteEnum ambienteEnum : AmbienteEnum.values()) {
			if(ambienteEnum.id.equals(id)) {
				return ambienteEnum;
			}
		}
		return null;
	}
	public static AmbienteEnum getByProfile(String profile) {

		if (Arrays.asList("dev", "test").contains(profile)) {
			profile = "dev";
		}
		
		for(AmbienteEnum ambienteEnum : AmbienteEnum.values()) {
			if(ambienteEnum.profile.equals(profile)) {
				return ambienteEnum;
			}
		}
		return null;
	}
}
