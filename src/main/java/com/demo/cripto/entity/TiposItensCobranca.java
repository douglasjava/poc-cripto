/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "tipos_itens_cobranca")
@NamedQueries({ @NamedQuery(name = "TiposItensCobranca.findAll", query = "SELECT t FROM TiposItensCobranca t ORDER BY t.cdTipoItemCobranca ASC") })
public class TiposItensCobranca implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_tipo_item_cobranca")
	private Integer idTipoItemCobranca;
	
	@Basic(optional = false)
	@Column(name = "ds_tipo_item_cobranca")
	private String dsTipoItemCobranca;
	
	@Basic(optional = false)
	@Column(name = "sg_tipo_item_cobranca")
	private String sgTipoItemCobranca;
	
	@Basic(optional = false)
	@Column(name = "cd_tipo_item_cobranca")
	private String cdTipoItemCobranca;
	
	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;
	
	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;
	
	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;
	
	@OneToMany(mappedBy = "idTipoItemCobranca")
	private List<ParamItensCobranca> paramItensCobrancaList;

	public TiposItensCobranca() {
	}

	public TiposItensCobranca(Integer idTipoItemCobranca) {
		this.idTipoItemCobranca = idTipoItemCobranca;
	}

	public TiposItensCobranca(Integer idTipoItemCobranca, String dsTipoItemCobranca, String sgTipoItemCobranca, String cdTipoItemCobranca, boolean inAtivo, int idUsuarioAtualiza, Date dtUltAtualiza) {
		this.idTipoItemCobranca = idTipoItemCobranca;
		this.dsTipoItemCobranca = dsTipoItemCobranca;
		this.sgTipoItemCobranca = sgTipoItemCobranca;
		this.cdTipoItemCobranca = cdTipoItemCobranca;
		this.inAtivo = inAtivo;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Integer getIdTipoItemCobranca() {
		return idTipoItemCobranca;
	}

	public void setIdTipoItemCobranca(Integer idTipoItemCobranca) {
		this.idTipoItemCobranca = idTipoItemCobranca;
	}

	public String getDsTipoItemCobranca() {
		return dsTipoItemCobranca;
	}

	public void setDsTipoItemCobranca(String dsTipoItemCobranca) {
		this.dsTipoItemCobranca = dsTipoItemCobranca;
	}

	public String getSgTipoItemCobranca() {
		return sgTipoItemCobranca;
	}

	public void setSgTipoItemCobranca(String sgTipoItemCobranca) {
		this.sgTipoItemCobranca = sgTipoItemCobranca;
	}

	public String getCdTipoItemCobranca() {
		return cdTipoItemCobranca;
	}

	public void setCdTipoItemCobranca(String cdTipoItemCobranca) {
		this.cdTipoItemCobranca = cdTipoItemCobranca;
	}

	public boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(boolean inAtivo) {
		this.inAtivo = inAtivo;
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

	public List<ParamItensCobranca> getParamItensCobrancaList() {
		return paramItensCobrancaList;
	}

	public void setParamItensCobrancaList(List<ParamItensCobranca> paramItensCobrancaList) {
		this.paramItensCobrancaList = paramItensCobrancaList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idTipoItemCobranca != null ? idTipoItemCobranca.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TiposItensCobranca)) {
			return false;
		}
		TiposItensCobranca other = (TiposItensCobranca) object;
		if ((this.idTipoItemCobranca == null && other.idTipoItemCobranca != null) || (this.idTipoItemCobranca != null && !this.idTipoItemCobranca.equals(other.idTipoItemCobranca))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.TiposItensCobranca[ idTipoItemCobranca=" + idTipoItemCobranca + " ]";
	}

}
