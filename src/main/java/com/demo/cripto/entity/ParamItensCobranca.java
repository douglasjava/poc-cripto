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
@Table(name = "param_itens_cobranca")
@NamedQueries({ @NamedQuery(name = "ParamItensCobranca.findAll", query = "SELECT p FROM ParamItensCobranca p ORDER BY p.dtIniValidade DESC") })
public class ParamItensCobranca implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_param_item_cobranca")
	private Integer idParamItemCobranca;
	
	@Basic(optional = false)
	@Column(name = "vl_param")
	private BigDecimal vlParam;
	
	@Basic(optional = false)
	@Column(name = "dt_ini_validade")
	@Temporal(TemporalType.DATE)
	private Date dtIniValidade;
	
	@Column(name = "dt_fim_validade")
	@Temporal(TemporalType.DATE)
	private Date dtFimValidade;
	
	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;
	
	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idParamItemCobranca")
	private List<ItensNotasFiscais> itensNotasFiscaisList;
	
	@JoinColumn(name = "id_tipo_item_cobranca", referencedColumnName = "id_tipo_item_cobranca")
	@ManyToOne(optional = false)
	private TiposItensCobranca idTipoItemCobranca;

	public ParamItensCobranca() {
	}

	public ParamItensCobranca(Integer idParamItemCobranca) {
		this.idParamItemCobranca = idParamItemCobranca;
	}

	public ParamItensCobranca(Integer idParamItemCobranca, BigDecimal vlParam, Date dtIniValidade, int idUsuarioAtualiza, Date dtUltAtualiza) {
		this.idParamItemCobranca = idParamItemCobranca;
		this.vlParam = vlParam;
		this.dtIniValidade = dtIniValidade;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Integer getIdParamItemCobranca() {
		return idParamItemCobranca;
	}

	public void setIdParamItemCobranca(Integer idParamItemCobranca) {
		this.idParamItemCobranca = idParamItemCobranca;
	}

	public BigDecimal getVlParam() {
		return vlParam;
	}

	public void setVlParam(BigDecimal vlParam) {
		this.vlParam = vlParam;
	}

	public Date getDtIniValidade() {
		return dtIniValidade;
	}

	public void setDtIniValidade(Date dtIniValidade) {
		this.dtIniValidade = dtIniValidade;
	}

	public Date getDtFimValidade() {
		return dtFimValidade;
	}

	public void setDtFimValidade(Date dtFimValidade) {
		this.dtFimValidade = dtFimValidade;
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

	public List<ItensNotasFiscais> getItensNotasFiscaisList() {
		return itensNotasFiscaisList;
	}

	public void setItensNotasFiscaisList(List<ItensNotasFiscais> itensNotasFiscaisList) {
		this.itensNotasFiscaisList = itensNotasFiscaisList;
	}

	public TiposItensCobranca getIdTipoItemCobranca() {
		return idTipoItemCobranca;
	}

	public void setIdTipoItemCobranca(TiposItensCobranca idTipoItemCobranca) {
		this.idTipoItemCobranca = idTipoItemCobranca;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idParamItemCobranca != null ? idParamItemCobranca.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ParamItensCobranca)) {
			return false;
		}
		ParamItensCobranca other = (ParamItensCobranca) object;
		if ((this.idParamItemCobranca == null && other.idParamItemCobranca != null) || (this.idParamItemCobranca != null && !this.idParamItemCobranca.equals(other.idParamItemCobranca))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.ParamItensCobranca[ idParamItemCobranca=" + idParamItemCobranca + " ]";
	}

}
