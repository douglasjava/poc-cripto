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
@Table(name = "log_regs_cargas")
@NamedQueries({ @NamedQuery(name = "LogRegsCargas.findAll", query = "SELECT l FROM LogRegsCargas l") })
public class LogRegsCargas implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_log_reg_carga")
	private Integer idLogRegCarga;
	@Basic(optional = false)
	@Column(name = "ds_msg_erro")
	private String dsMsgErro;
	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;
	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;
	@Column(name = "nu_seq")
	private Integer nuSeq;
	@Column(name = "vl_campo")
	private String vlCampo;
	@JoinColumn(name = "id_arq_carga", referencedColumnName = "id_arq_carga")
	@ManyToOne
	private ArqsCarga idArqCarga;

	public LogRegsCargas() {
	}

	public LogRegsCargas(Integer idLogRegCarga) {
		this.idLogRegCarga = idLogRegCarga;
	}

	public LogRegsCargas(Integer idLogRegCarga, String dsMsgErro, int idUsuarioAtualiza, Date dtUltAtualiza) {
		this.idLogRegCarga = idLogRegCarga;
		this.dsMsgErro = dsMsgErro;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Integer getIdLogRegCarga() {
		return idLogRegCarga;
	}

	public void setIdLogRegCarga(Integer idLogRegCarga) {
		this.idLogRegCarga = idLogRegCarga;
	}

	public String getDsMsgErro() {
		return dsMsgErro;
	}

	public void setDsMsgErro(String dsMsgErro) {
		this.dsMsgErro = dsMsgErro;
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

	public Integer getNuSeq() {
		return nuSeq;
	}

	public void setNuSeq(Integer nuSeq) {
		this.nuSeq = nuSeq;
	}

	public String getVlCampo() {
		return vlCampo;
	}

	public void setVlCampo(String vlCampo) {
		this.vlCampo = vlCampo;
	}

	public ArqsCarga getIdArqCarga() {
		return idArqCarga;
	}

	public void setIdArqCarga(ArqsCarga idArqCarga) {
		this.idArqCarga = idArqCarga;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idLogRegCarga != null ? idLogRegCarga.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof LogRegsCargas)) {
			return false;
		}
		LogRegsCargas other = (LogRegsCargas) object;
		if ((this.idLogRegCarga == null && other.idLogRegCarga != null) || (this.idLogRegCarga != null && !this.idLogRegCarga.equals(other.idLogRegCarga))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.LogRegsCargas[ idLogRegCarga=" + idLogRegCarga + " ]";
	}

}
