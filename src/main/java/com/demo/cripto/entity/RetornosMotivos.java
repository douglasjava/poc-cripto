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
 * @author peterson.silva
 */
@Entity
@Table(name = "retornos_motivos")
@NamedQueries({ @NamedQuery(name = "RetornosMotivos.findAll", query = "SELECT r FROM RetornosMotivos r") })
public class RetornosMotivos implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_retorno_motivo")
	private Integer idRetornoMotivo;
	@Column(name = "nu_motivo", columnDefinition = "NUMERIC")
	private Short nuMotivo;
	@Column(name = "ds_motivo")
	private String dsMotivo;
	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private int idUsuarioAtualiza;
	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;
	@JoinColumn(name = "id_retorno_ocorrencia", referencedColumnName = "id_retorno_ocorrencia")
	@ManyToOne(optional = false)
	private RetornosOcorrencias idRetornoOcorrencia;

	public RetornosMotivos() {
	}

	public RetornosMotivos(Integer idRetornoMotivo) {
		this.idRetornoMotivo = idRetornoMotivo;
	}

	public RetornosMotivos(Integer idRetornoMotivo, int idUsuarioAtualiza, Date dtUltAtualiza) {
		this.idRetornoMotivo = idRetornoMotivo;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Integer getIdRetornoMotivo() {
		return idRetornoMotivo;
	}

	public void setIdRetornoMotivo(Integer idRetornoMotivo) {
		this.idRetornoMotivo = idRetornoMotivo;
	}

	public Short getNuMotivo() {
		return nuMotivo;
	}

	public void setNuMotivo(Short nuMotivo) {
		this.nuMotivo = nuMotivo;
	}

	public String getDsMotivo() {
		return dsMotivo;
	}

	public void setDsMotivo(String dsMotivo) {
		this.dsMotivo = dsMotivo;
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

	public RetornosOcorrencias getIdRetornoOcorrencia() {
		return idRetornoOcorrencia;
	}

	public void setIdRetornoOcorrencia(RetornosOcorrencias idRetornoOcorrencia) {
		this.idRetornoOcorrencia = idRetornoOcorrencia;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idRetornoMotivo != null ? idRetornoMotivo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RetornosMotivos)) {
			return false;
		}
		RetornosMotivos other = (RetornosMotivos) object;
		if ((this.idRetornoMotivo == null && other.idRetornoMotivo != null) || (this.idRetornoMotivo != null && !this.idRetornoMotivo.equals(other.idRetornoMotivo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.RetornosMotivos[ idRetornoMotivo=" + idRetornoMotivo + " ]";
	}

}
