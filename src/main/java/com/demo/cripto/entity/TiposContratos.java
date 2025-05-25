/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "tipos_contratos")
@NamedQueries({ @NamedQuery(name = "TiposContratos.findAll", query = "SELECT t FROM TiposContratos t") })
public class TiposContratos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@Column(name = "id_tipo_contrato")
	private Integer idTipoContrato;
	
	@Basic(optional = false)
	@Column(name = "nm_tipo_contrato")
	private String nmTipoContrato;
	
	@JoinTable(name = "ufs_tp_contrato", joinColumns = { @JoinColumn(name = "id_tipo_contrato", referencedColumnName = "id_tipo_contrato") }, inverseJoinColumns = { @JoinColumn(name = "id_uf", referencedColumnName = "id_uf") })
	@ManyToMany
	private List<Ufs> ufsList;
	
	@OneToMany(mappedBy = "idTipoContrato")
	private List<Registros> registrosList;

	public TiposContratos() {
	}

	public TiposContratos(Integer idTipoContrato) {
		this.idTipoContrato = idTipoContrato;
	}

	public TiposContratos(Integer idTipoContrato, String nmTipoContrato) {
		this.idTipoContrato = idTipoContrato;
		this.nmTipoContrato = nmTipoContrato;
	}

	public Integer getIdTipoContrato() {
		return idTipoContrato;
	}

	public void setIdTipoContrato(Integer idTipoContrato) {
		this.idTipoContrato = idTipoContrato;
	}

	public String getNmTipoContrato() {
		return nmTipoContrato;
	}

	public void setNmTipoContrato(String nmTipoContrato) {
		this.nmTipoContrato = nmTipoContrato;
	}

	public List<Ufs> getUfsList() {
		return ufsList;
	}

	public void setUfsList(List<Ufs> ufsList) {
		this.ufsList = ufsList;
	}

	public List<Registros> getRegistrosList() {
		return registrosList;
	}

	public void setRegistrosList(List<Registros> registrosList) {
		this.registrosList = registrosList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idTipoContrato != null ? idTipoContrato.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TiposContratos)) {
			return false;
		}
		TiposContratos other = (TiposContratos) object;
		if ((this.idTipoContrato == null && other.idTipoContrato != null) || (this.idTipoContrato != null && !this.idTipoContrato.equals(other.idTipoContrato))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.TiposContratos[ idTipoContrato=" + idTipoContrato + " ]";
	}

}
