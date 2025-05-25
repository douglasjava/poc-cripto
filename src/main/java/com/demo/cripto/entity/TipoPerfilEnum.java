package com.demo.cripto.entity;

public enum TipoPerfilEnum {

	PERFIL_ADM_MI("ADM-MI"),
	PERFIL_USU_MI("USU-MI"),
	
	PERFIL_USU_AGENTE("USU-AGENTE"),
	PERFIL_ADM_AGENTE("ADM-AGENTE"),
	
	PERFIL_ADM_DETRAN("ADM-DETRAN"),
	PERFIL_USU_DETRAN("USU-DETRAN"), 
	PERFIL_MON_OP("MON_OP");
	

	private String descricao;

	private TipoPerfilEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
