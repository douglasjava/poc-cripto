/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "hst_notas_fiscais")
@NamedQueries({ @NamedQuery(name = "HstNotasFiscais.findAll", query = "SELECT h FROM HstNotasFiscais h") })
public class HstNotasFiscais implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_hst_nota_fiscal")
	private Integer idHstNotaFiscal;
	@Basic(optional = false)
	@Column(name = "id_nota_fiscal")
	private int idNotaFiscal;
	@Column(name = "nu_nf", columnDefinition = "NUMERIC")
	private Long nuNf;
	@Column(name = "nu_serie_nf", columnDefinition = "NUMERIC")
	private Short nuSerieNf;
	@Column(name = "nu_chave_acesso")
	private String nuChaveAcesso;
	@Column(name = "dt_emissao_nf")
	@Temporal(TemporalType.DATE)
	private Date dtEmissaoNf;
	@Column(name = "nu_fatura_nf")
	private String nuFaturaNf;
	@Column(name = "dt_venc_fatura")
	@Temporal(TemporalType.DATE)
	private Date dtVencFatura;
	@Column(name = "vl_nf")
	private BigDecimal vlNf;
	@Column(name = "im_nf", columnDefinition = "bytea")
	private byte[] imNf;
	@Column(name = "id_status_nf")
	private Integer idStatusNf;
	@Column(name = "id_credor")
	private Integer idCredor;
	@Column(name = "ds_inf_comp")
	private String dsInfComp;
	@Column(name = "mes_ano_base_nf")
	private String mesAnoBaseNf;
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;
	@Column(name = "dt_pagto_bol")
	@Temporal(TemporalType.DATE)
	private Date dtPagtoBol;
	@Column(name = "vl_pago")
	private BigDecimal vlPago;
	@Column(name = "dt_corte")
	@Temporal(TemporalType.DATE)
	private Date dtCorte;
	@Column(name = "im_solicita_nf", columnDefinition = "bytea")
	private byte[] imSolicitaNf;

	public HstNotasFiscais() {
	}

	public HstNotasFiscais(Integer idHstNotaFiscal) {
		this.idHstNotaFiscal = idHstNotaFiscal;
	}

	public HstNotasFiscais(Integer idHstNotaFiscal, int idNotaFiscal) {
		this.idHstNotaFiscal = idHstNotaFiscal;
		this.idNotaFiscal = idNotaFiscal;
	}

	public Integer getIdHstNotaFiscal() {
		return idHstNotaFiscal;
	}

	public void setIdHstNotaFiscal(Integer idHstNotaFiscal) {
		this.idHstNotaFiscal = idHstNotaFiscal;
	}

	public int getIdNotaFiscal() {
		return idNotaFiscal;
	}

	public void setIdNotaFiscal(int idNotaFiscal) {
		this.idNotaFiscal = idNotaFiscal;
	}

	public Long getNuNf() {
		return nuNf;
	}

	public void setNuNf(Long nuNf) {
		this.nuNf = nuNf;
	}

	public Short getNuSerieNf() {
		return nuSerieNf;
	}

	public void setNuSerieNf(Short nuSerieNf) {
		this.nuSerieNf = nuSerieNf;
	}

	public String getNuChaveAcesso() {
		return nuChaveAcesso;
	}

	public void setNuChaveAcesso(String nuChaveAcesso) {
		this.nuChaveAcesso = nuChaveAcesso;
	}

	public Date getDtEmissaoNf() {
		return dtEmissaoNf;
	}

	public void setDtEmissaoNf(Date dtEmissaoNf) {
		this.dtEmissaoNf = dtEmissaoNf;
	}

	public String getNuFaturaNf() {
		return nuFaturaNf;
	}

	public void setNuFaturaNf(String nuFaturaNf) {
		this.nuFaturaNf = nuFaturaNf;
	}

	public Date getDtVencFatura() {
		return dtVencFatura;
	}

	public void setDtVencFatura(Date dtVencFatura) {
		this.dtVencFatura = dtVencFatura;
	}

	public BigDecimal getVlNf() {
		return vlNf;
	}

	public void setVlNf(BigDecimal vlNf) {
		this.vlNf = vlNf;
	}

	public byte[] getImNf() {
		return imNf;
	}

	public void setImNf(byte[] imNf) {
		this.imNf = imNf;
	}

	public Integer getIdStatusNf() {
		return idStatusNf;
	}

	public void setIdStatusNf(Integer idStatusNf) {
		this.idStatusNf = idStatusNf;
	}

	public Integer getIdCredor() {
		return idCredor;
	}

	public void setIdCredor(Integer idCredor) {
		this.idCredor = idCredor;
	}

	public String getDsInfComp() {
		return dsInfComp;
	}

	public void setDsInfComp(String dsInfComp) {
		this.dsInfComp = dsInfComp;
	}

	public String getMesAnoBaseNf() {
		return mesAnoBaseNf;
	}

	public void setMesAnoBaseNf(String mesAnoBaseNf) {
		this.mesAnoBaseNf = mesAnoBaseNf;
	}

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Integer getIdUsuarioAtualiza() {
		return idUsuarioAtualiza;
	}

	public void setIdUsuarioAtualiza(Integer idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Date getDtPagtoBol() {
		return dtPagtoBol;
	}

	public void setDtPagtoBol(Date dtPagtoBol) {
		this.dtPagtoBol = dtPagtoBol;
	}

	public BigDecimal getVlPago() {
		return vlPago;
	}

	public void setVlPago(BigDecimal vlPago) {
		this.vlPago = vlPago;
	}

	public Date getDtCorte() {
		return dtCorte;
	}

	public void setDtCorte(Date dtCorte) {
		this.dtCorte = dtCorte;
	}

	public byte[] getImSolicitaNf() {
		return imSolicitaNf;
	}

	public void setImSolicitaNf(byte[] imSolicitaNf) {
		this.imSolicitaNf = imSolicitaNf;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idHstNotaFiscal != null ? idHstNotaFiscal.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof HstNotasFiscais)) {
			return false;
		}
		HstNotasFiscais other = (HstNotasFiscais) object;
		if ((this.idHstNotaFiscal == null && other.idHstNotaFiscal != null) || (this.idHstNotaFiscal != null && !this.idHstNotaFiscal.equals(other.idHstNotaFiscal))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.HstNotasFiscais[ idHstNotaFiscal=" + idHstNotaFiscal + " ]";
	}

}
