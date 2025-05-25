/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author alan.souza
 */
@Entity
@Table(name = "retornos_ocorrencias")
@NamedQueries({
    @NamedQuery(name = "RetornosOcorrencias.findAll", query = "SELECT r FROM RetornosOcorrencias r")})
public class RetornosOcorrencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_retorno_ocorrencia")
    private Long idRetornoOcorrencia;
    @JoinColumn(name = "id_boleto_nf", referencedColumnName = "id_boleto_nf")
    @ManyToOne(optional = false)
    private BoletosNfs idBoletoNf;
    @Basic(optional = false)
    @Column(name = "nu_ocorrencia", columnDefinition="NUMERIC")
    private Short nuOcorrencia;
    @Column(name = "ds_ocorrencia")
    private String dsOcorrencia;
    @Basic(optional = false)
    @Column(name = "id_usuario_atualiza")
    private int idUsuarioAtualiza;
    @Basic(optional = false)
    @Column(name = "dt_ult_atualiza")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltAtualiza;

	public RetornosOcorrencias() {
	}

	public RetornosOcorrencias(Long idRetornoOcorrencia) {
		this.idRetornoOcorrencia = idRetornoOcorrencia;
	}

	public RetornosOcorrencias(Long idRetornoOcorrencia, BoletosNfs idBoletoNf, Short nuOcorrencia, String dsOcorrencia,
			int idUsuarioAtualiza, Date dtUltAtualiza) {
		super();
		this.idRetornoOcorrencia = idRetornoOcorrencia;
		this.idBoletoNf = idBoletoNf;
		this.nuOcorrencia = nuOcorrencia;
		this.dsOcorrencia = dsOcorrencia;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Long getIdRetornoOcorrencia() {
		return idRetornoOcorrencia;
	}

	public void setIdRetornoOcorrencia(Long idRetornoOcorrencia) {
		this.idRetornoOcorrencia = idRetornoOcorrencia;
	}

	public BoletosNfs getIdBoletoNf() {
		return idBoletoNf;
	}

	public void setIdBoletoNf(BoletosNfs idBoletoNf) {
		this.idBoletoNf = idBoletoNf;
	}

	public Short getNuOcorrencia() {
		return nuOcorrencia;
	}

	public void setNuOcorrencia(Short nuOcorrencia) {
		this.nuOcorrencia = nuOcorrencia;
	}

	public String getDsOcorrencia() {
		return dsOcorrencia;
	}

	public void setDsOcorrencia(String dsOcorrencia) {
		this.dsOcorrencia = dsOcorrencia;
	}

	public int getIdUsuarioAtualiza() {
		return idUsuarioAtualiza;
	}

	public void setIdUsuarioAtualiza(int idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dsOcorrencia == null) ? 0 : dsOcorrencia.hashCode());
		result = prime * result + ((dtUltAtualiza == null) ? 0 : dtUltAtualiza.hashCode());
		result = prime * result + ((idBoletoNf == null) ? 0 : idBoletoNf.hashCode());
		result = prime * result + ((idRetornoOcorrencia == null) ? 0 : idRetornoOcorrencia.hashCode());
		result = prime * result + idUsuarioAtualiza;
		result = prime * result + ((nuOcorrencia == null) ? 0 : nuOcorrencia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RetornosOcorrencias other = (RetornosOcorrencias) obj;
		if (dsOcorrencia == null) {
			if (other.dsOcorrencia != null)
				return false;
		} else if (!dsOcorrencia.equals(other.dsOcorrencia))
			return false;
		if (dtUltAtualiza == null) {
			if (other.dtUltAtualiza != null)
				return false;
		} else if (!dtUltAtualiza.equals(other.dtUltAtualiza))
			return false;
		if (idBoletoNf == null) {
			if (other.idBoletoNf != null)
				return false;
		} else if (!idBoletoNf.equals(other.idBoletoNf))
			return false;
		if (idRetornoOcorrencia == null) {
			if (other.idRetornoOcorrencia != null)
				return false;
		} else if (!idRetornoOcorrencia.equals(other.idRetornoOcorrencia))
			return false;
		if (idUsuarioAtualiza != other.idUsuarioAtualiza)
			return false;
		if (nuOcorrencia == null) {
			if (other.nuOcorrencia != null)
				return false;
		} else if (!nuOcorrencia.equals(other.nuOcorrencia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RetornosOcorrencias [idRetornoOcorrencia=" + idRetornoOcorrencia + ", idBoletoNf=" + idBoletoNf
				+ ", nuOcorrencia=" + nuOcorrencia + ", dsOcorrencia=" + dsOcorrencia + ", idUsuarioAtualiza="
				+ idUsuarioAtualiza + ", dtUltAtualiza=" + dtUltAtualiza + "]";
	}
}
