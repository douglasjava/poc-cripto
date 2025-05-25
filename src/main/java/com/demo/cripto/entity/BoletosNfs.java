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
@Table(name = "boletos_nfs")
@NamedQueries({ @NamedQuery(name = "BoletosNfs.findAll", query = "SELECT b FROM BoletosNfs b") })
public class BoletosNfs implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_boleto_nf")
	private Integer idBoletoNf;
	
	@Basic(optional = false)
	@Column(name = "nu_nosso_numero")
	private String nuNossoNumero;
	
	@Basic(optional = false)
	@Column(name = "nu_nosso_numero_dv")
	private Character nuNossoNumeroDv;
	
	@Basic(optional = false)
	@Column(name = "nu_documento")
	private String nuDocumento;
	
	@Basic(optional = false)
	@Column(name = "nu_linha_digitavel", columnDefinition = "bpchar")
	private String nuLinhaDigitavel;
	
	@Basic(optional = false)
	@Column(name = "nu_codigo_barras", columnDefinition = "bpchar")
	private String nuCodigoBarras;
	
	@Basic(optional = false)
	@Column(name = "dt_emissao_boleto")
	@Temporal(TemporalType.DATE)
	private Date dtEmissaoBoleto;
	

	@Basic(optional = false)
	@Column(name = "vl_documento_boleto")
	private BigDecimal vlDocumentoBoleto;
	
	@Basic(optional = false)
	@Column(name = "dt_vencto_boleto")
	@Temporal(TemporalType.DATE)
	private Date dtVenctoBoleto;
	
	@Basic(optional = false)
	@Column(name = "im_boleto", columnDefinition = "bytea")
	private byte[] imBoleto;
	
	@Column(name = "dt_pagto_boleto")
	@Temporal(TemporalType.DATE)
	private Date dtPagtoBoleto;
	
	@Column(name = "vl_pagto_boleto")
	private BigDecimal vlPagtoBoleto;
	
	@Column(name = "dt_cred_banco")
	@Temporal(TemporalType.DATE)
	private Date dtCredBanco;
	
	@Column(name = "vl_desconto")
	private BigDecimal vlDesconto;
	
	@Column(name = "vl_acrescimo")
	private BigDecimal vlAcrescimo;
	
	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private int idUsuarioAtualiza;
	
	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;
	
	@Basic(optional = false)
	@Column(name = "nu_ano_boleto", columnDefinition = "NUMERIC")
	private Integer nuAnoBoleto;
	
	@Basic(optional = false)
	@Column(name = "nu_seq_boleto", columnDefinition = "NUMERIC")
	private Integer nuSeqBoleto;
	
	@JoinColumn(name = "id_nota_fiscal", referencedColumnName = "id_nota_fiscal")
	@ManyToOne(optional = false)
	private NotasFiscais idNotaFiscal;
	
	@JoinColumn(name = "id_remessa_banco", referencedColumnName = "id_remessa_banco")
	@ManyToOne
	private RemessasBancos idRemessaBanco;
	
	@JoinColumn(name = "id_retorno_banco", referencedColumnName = "id_retorno_banco")
	@ManyToOne
	private RetornosBancos idRetornoBanco;
	
	@JoinColumn(name = "id_status_nf", referencedColumnName = "id_status_nf")
	@ManyToOne(optional = false)
	private StatusNf idStatusNf;

	public BoletosNfs() {
	}

	public BoletosNfs(Integer idBoletoNf) {
		this.idBoletoNf = idBoletoNf;
	}

	public BoletosNfs(Integer idBoletoNf, String nuNossoNumero, Character nuNossoNumeroDv, String nuDocumento, String nuLinhaDigitavel, String nuCodigoBarras, Date dtEmissaoBoleto, BigDecimal vlDocumentoBoleto, Date dtVenctoBoleto, byte[] imBoleto,
			int idUsuarioAtualiza, Date dtUltAtualiza, Integer nuAnoBoleto, Integer nuSeqBoleto) {
		this.idBoletoNf = idBoletoNf;
		this.nuNossoNumero = nuNossoNumero;
		this.nuNossoNumeroDv = nuNossoNumeroDv;
		this.nuDocumento = nuDocumento;
		this.nuLinhaDigitavel = nuLinhaDigitavel;
		this.nuCodigoBarras = nuCodigoBarras;
		this.dtEmissaoBoleto = dtEmissaoBoleto;
		this.vlDocumentoBoleto = vlDocumentoBoleto;
		this.dtVenctoBoleto = dtVenctoBoleto;
		this.imBoleto = imBoleto;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
		this.nuAnoBoleto = nuAnoBoleto;
		this.nuSeqBoleto = nuSeqBoleto;
	}

	public Integer getIdBoletoNf() {
		return idBoletoNf;
	}

	public void setIdBoletoNf(Integer idBoletoNf) {
		this.idBoletoNf = idBoletoNf;
	}

	public String getNuNossoNumero() {
		return nuNossoNumero;
	}

	public void setNuNossoNumero(String nuNossoNumero) {
		this.nuNossoNumero = nuNossoNumero;
	}

	public Character getNuNossoNumeroDv() {
		return nuNossoNumeroDv;
	}

	public void setNuNossoNumeroDv(Character nuNossoNumeroDv) {
		this.nuNossoNumeroDv = nuNossoNumeroDv;
	}

	public String getNuDocumento() {
		return nuDocumento;
	}

	public void setNuDocumento(String nuDocumento) {
		this.nuDocumento = nuDocumento;
	}

	public String getNuLinhaDigitavel() {
		return nuLinhaDigitavel;
	}

	public void setNuLinhaDigitavel(String nuLinhaDigitavel) {
		this.nuLinhaDigitavel = nuLinhaDigitavel;
	}

	public String getNuCodigoBarras() {
		return nuCodigoBarras;
	}

	public void setNuCodigoBarras(String nuCodigoBarras) {
		this.nuCodigoBarras = nuCodigoBarras;
	}

	public Date getDtEmissaoBoleto() {
		return dtEmissaoBoleto;
	}

	public void setDtEmissaoBoleto(Date dtEmissaoBoleto) {
		this.dtEmissaoBoleto = dtEmissaoBoleto;
	}

	public BigDecimal getVlDocumentoBoleto() {
		return vlDocumentoBoleto;
	}

	public void setVlDocumentoBoleto(BigDecimal vlDocumentoBoleto) {
		this.vlDocumentoBoleto = vlDocumentoBoleto;
	}

	public Date getDtVenctoBoleto() {
		return dtVenctoBoleto;
	}

	public void setDtVenctoBoleto(Date dtVenctoBoleto) {
		this.dtVenctoBoleto = dtVenctoBoleto;
	}

	public byte[] getImBoleto() {
		return imBoleto;
	}

	public void setImBoleto(byte[] imBoleto) {
		this.imBoleto = imBoleto;
	}

	public Date getDtPagtoBoleto() {
		return dtPagtoBoleto;
	}

	public void setDtPagtoBoleto(Date dtPagtoBoleto) {
		this.dtPagtoBoleto = dtPagtoBoleto;
	}

	public BigDecimal getVlPagtoBoleto() {
		return vlPagtoBoleto;
	}

	public void setVlPagtoBoleto(BigDecimal vlPagtoBoleto) {
		this.vlPagtoBoleto = vlPagtoBoleto;
	}

	public Date getDtCredBanco() {
		return dtCredBanco;
	}

	public void setDtCredBanco(Date dtCredBanco) {
		this.dtCredBanco = dtCredBanco;
	}

	public BigDecimal getVlDesconto() {
		return vlDesconto;
	}

	public void setVlDesconto(BigDecimal vlDesconto) {
		this.vlDesconto = vlDesconto;
	}

	public BigDecimal getVlAcrescimo() {
		return vlAcrescimo;
	}

	public void setVlAcrescimo(BigDecimal vlAcrescimo) {
		this.vlAcrescimo = vlAcrescimo;
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

	public NotasFiscais getIdNotaFiscal() {
		return idNotaFiscal;
	}

	public void setIdNotaFiscal(NotasFiscais idNotaFiscal) {
		this.idNotaFiscal = idNotaFiscal;
	}

	public RemessasBancos getIdRemessaBanco() {
		return idRemessaBanco;
	}

	public void setIdRemessaBanco(RemessasBancos idRemessaBanco) {
		this.idRemessaBanco = idRemessaBanco;
	}

	public RetornosBancos getIdRetornoBanco() {
		return idRetornoBanco;
	}

	public void setIdRetornoBanco(RetornosBancos idRetornoBanco) {
		this.idRetornoBanco = idRetornoBanco;
	}

	public StatusNf getIdStatusNf() {
		return idStatusNf;
	}

	public void setIdStatusNf(StatusNf idStatusNf) {
		this.idStatusNf = idStatusNf;
	}

	public Integer getNuAnoBoleto() {
		return nuAnoBoleto;
	}

	public void setNuAnoBoleto(Integer nuAnoBoleto) {
		this.nuAnoBoleto = nuAnoBoleto;
	}

	public Integer getNuSeqBoleto() {
		return nuSeqBoleto;
	}

	public void setNuSeqBoleto(Integer nuSeqBoleto) {
		this.nuSeqBoleto = nuSeqBoleto;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idBoletoNf != null ? idBoletoNf.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof BoletosNfs)) {
			return false;
		}
		BoletosNfs other = (BoletosNfs) object;
		if ((this.idBoletoNf == null && other.idBoletoNf != null) || (this.idBoletoNf != null && !this.idBoletoNf.equals(other.idBoletoNf))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.BoletosNfs[ idBoletoNf=" + idBoletoNf + " ]";
	}

}
