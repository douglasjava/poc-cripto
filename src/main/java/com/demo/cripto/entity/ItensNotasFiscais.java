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
import java.util.List;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "itens_notas_fiscais")
@NamedQueries({ @NamedQuery(name = "ItensNotasFiscais.findAll", query = "SELECT i FROM ItensNotasFiscais i") })
public class ItensNotasFiscais implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_item_nota_fiscal")
	private Integer idItemNotaFiscal;
	
	@Basic(optional = false)
	@Column(name = "qt_itens")
	private Integer qtItens;
	

	@Column(name = "vl_unitario")
	private BigDecimal vlUnitario;
	
	@Column(name = "vl_total")
	private BigDecimal vlTotal;
	
	@Column(name = "in_pagamento")
	private Boolean inPagamento;
	
	@Column(name = "ds_baixa_pagto")
	private String dsBaixaPagto;
	
	@Column(name = "dt_ult_envio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltEnvio;
	
	@JoinColumn(name = "id_credor", referencedColumnName = "id_credor")
	@ManyToOne(optional = false)
	private Credores idCredor;
	
	@JoinColumn(name = "id_nota_fiscal", referencedColumnName = "id_nota_fiscal")
	@ManyToOne
	private NotasFiscais idNotaFiscal;
	
	@JoinColumn(name = "id_param_item_cobranca", referencedColumnName = "id_param_item_cobranca")
	@ManyToOne(optional = false)
	private ParamItensCobranca idParamItemCobranca;
	
	@OneToMany(mappedBy = "idItemNotaFiscal")
	private List<LivrosItens> livrosItensList;

	public ItensNotasFiscais() {
	}

	public ItensNotasFiscais(Integer idItemNotaFiscal) {
		this.idItemNotaFiscal = idItemNotaFiscal;
	}

	public ItensNotasFiscais(Integer idItemNotaFiscal, int qtItens) {
		this.idItemNotaFiscal = idItemNotaFiscal;
		this.qtItens = qtItens;
	}

	public Integer getIdItemNotaFiscal() {
		return idItemNotaFiscal;
	}

	public void setIdItemNotaFiscal(Integer idItemNotaFiscal) {
		this.idItemNotaFiscal = idItemNotaFiscal;
	}

	public int getQtItens() {
		return qtItens;
	}

	public void setQtItens(int qtItens) {
		this.qtItens = qtItens;
	}

	public BigDecimal getVlUnitario() {
		return vlUnitario;
	}

	public void setVlUnitario(BigDecimal vlUnitario) {
		this.vlUnitario = vlUnitario;
	}

	public BigDecimal getVlTotal() {
		return vlTotal;
	}

	public void setVlTotal(BigDecimal vlTotal) {
		this.vlTotal = vlTotal;
	}

	public Boolean getInPagamento() {
		return inPagamento;
	}

	public void setInPagamento(Boolean inPagamento) {
		this.inPagamento = inPagamento;
	}

	public String getDsBaixaPagto() {
		return dsBaixaPagto;
	}

	public void setDsBaixaPagto(String dsBaixaPagto) {
		this.dsBaixaPagto = dsBaixaPagto;
	}

	public Date getDtUltEnvio() {
		return dtUltEnvio;
	}

	public void setDtUltEnvio(Date dtUltEnvio) {
		this.dtUltEnvio = dtUltEnvio;
	}

	public Credores getIdCredor() {
		return idCredor;
	}

	public void setIdCredor(Credores idCredor) {
		this.idCredor = idCredor;
	}

	public NotasFiscais getIdNotaFiscal() {
		return idNotaFiscal;
	}

	public void setIdNotaFiscal(NotasFiscais idNotaFiscal) {
		this.idNotaFiscal = idNotaFiscal;
	}

	public ParamItensCobranca getIdParamItemCobranca() {
		return idParamItemCobranca;
	}

	public void setIdParamItemCobranca(ParamItensCobranca idParamItemCobranca) {
		this.idParamItemCobranca = idParamItemCobranca;
	}

	public List<LivrosItens> getLivrosItensList() {
		return livrosItensList;
	}

	public void setLivrosItensList(List<LivrosItens> livrosItensList) {
		this.livrosItensList = livrosItensList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idItemNotaFiscal != null ? idItemNotaFiscal.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ItensNotasFiscais)) {
			return false;
		}
		ItensNotasFiscais other = (ItensNotasFiscais) object;
		if ((this.idItemNotaFiscal == null && other.idItemNotaFiscal != null) || (this.idItemNotaFiscal != null && !this.idItemNotaFiscal.equals(other.idItemNotaFiscal))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.ItensNotasFiscais[ idItemNotaFiscal=" + idItemNotaFiscal + " ]";
	}

}
