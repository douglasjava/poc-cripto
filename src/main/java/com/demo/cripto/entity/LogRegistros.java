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
@Table(name = "log_registros")
@NamedQueries({ @NamedQuery(name = "LogRegistros.findAll", query = "SELECT l FROM LogRegistros l") })
public class LogRegistros implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_log_registro")
	private Integer idLogRegistro;

	@Basic(optional = false)
	@Column(name = "dt_ocorrencia")
	@Temporal(TemporalType.DATE)
	private Date dtOcorrencia;

	@Column(name = "nu_retorno")
	private String nuRetorno;

	@Column(name = "ds_retorno")
	private String dsRetorno;

	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;

	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;

	@Basic(optional = false)
	@Column(name = "tp_resultado")
	private Integer tpResultado;

	@JoinColumn(name = "id_reg_veiculo", referencedColumnName = "id_reg_veiculo")
	@ManyToOne(optional = false)
	private RegsVeiculos idRegVeiculo;

	@JoinColumn(name = "id_registro", referencedColumnName = "id_registro")
	@ManyToOne(optional = false)
	private Registros idRegistro;

	@Column(name = "ds_observacoes")
	private String dsObservacoes;

	public LogRegistros() {
	}

	public LogRegistros(Integer idLogRegistro) {
		this.idLogRegistro = idLogRegistro;
	}

	public LogRegistros(Integer idLogRegistro, Date dtOcorrencia, Date dtUltAtualiza, int idUsuarioAtualiza, int tpResultado) {
		this.idLogRegistro = idLogRegistro;
		this.dtOcorrencia = dtOcorrencia;
		this.dtUltAtualiza = dtUltAtualiza;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.tpResultado = tpResultado;
	}

	public Integer getIdLogRegistro() {
		return idLogRegistro;
	}

	public void setIdLogRegistro(Integer idLogRegistro) {
		this.idLogRegistro = idLogRegistro;
	}

	public Date getDtOcorrencia() {
		return dtOcorrencia;
	}

	public void setDtOcorrencia(Date dtOcorrencia) {
		this.dtOcorrencia = dtOcorrencia;
	}

	public String getNuRetorno() {
		return nuRetorno;
	}

	public void setNuRetorno(String nuRetorno) {
		this.nuRetorno = nuRetorno;
	}

	public String getDsRetorno() {
		return dsRetorno;
	}

	public void setDsRetorno(String dsRetorno) {
		this.dsRetorno = dsRetorno;
	}

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public int getIdUsuarioAtualiza() {
		return idUsuarioAtualiza;
	}

	public void setIdUsuarioAtualiza(int idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public int getTpResultado() {
		return tpResultado;
	}

	public void setTpResultado(int tpResultado) {
		this.tpResultado = tpResultado;
	}

	public RegsVeiculos getIdRegVeiculo() {
		return idRegVeiculo;
	}

	public void setIdRegVeiculo(RegsVeiculos idRegVeiculo) {
		this.idRegVeiculo = idRegVeiculo;
	}

	public Registros getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Registros idRegistro) {
		this.idRegistro = idRegistro;
	}

	public void setIdUsuarioAtualiza(Integer idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public void setTpResultado(Integer tpResultado) {
		this.tpResultado = tpResultado;
	}

	public String getDsObservacoes() {
		return dsObservacoes;
	}

	public void setDsObservacoes(String dsObservacoes) {
		this.dsObservacoes = dsObservacoes;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idLogRegistro != null ? idLogRegistro.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof LogRegistros)) {
			return false;
		}
		LogRegistros other = (LogRegistros) object;
		if ((this.idLogRegistro == null && other.idLogRegistro != null) || (this.idLogRegistro != null && !this.idLogRegistro.equals(other.idLogRegistro))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.LogRegistros[ idLogRegistro=" + idLogRegistro + " nuRetorno=" + nuRetorno + "]";
	}

}
