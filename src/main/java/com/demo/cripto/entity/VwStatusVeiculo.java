package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vw_status_veiculo")
public class VwStatusVeiculo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_reg_veiculo")
	private Integer idReqVeiculo;
	@Column(name = "ds_retorno")
	private String dsRetorno;

	public Integer getIdReqVeiculo() {
		return idReqVeiculo;
	}

	public void setIdReqVeiculo(Integer idReqVeiculo) {
		this.idReqVeiculo = idReqVeiculo;
	}

	public String getDsRetorno() {
		return dsRetorno;
	}

	public void setDsRetorno(String dsRetorno) {
		this.dsRetorno = dsRetorno;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
