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
@Table(name = "tipos_financs")
@NamedQueries({ @NamedQuery(name = "TiposFinancs.findAll", query = "SELECT t FROM TiposFinancs t") })
public class TiposFinancs implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_tipo_financ")
	private Integer idTipoFinanc;
	@Basic(optional = false)
	@Column(name = "nm_tipo_financ")
	private String nmTipoFinanc;
	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;
	@OneToMany(mappedBy = "idTipoFinanc")
	private List<Registros> registrosList;

	public TiposFinancs() {
	}

	public TiposFinancs(Integer idTipoFinanc) {
		this.idTipoFinanc = idTipoFinanc;
	}

	public TiposFinancs(Integer idTipoFinanc, String nmTipoFinanc, boolean inAtivo) {
		this.idTipoFinanc = idTipoFinanc;
		this.nmTipoFinanc = nmTipoFinanc;
		this.inAtivo = inAtivo;
	}

	public Integer getIdTipoFinanc() {
		return idTipoFinanc;
	}

	public void setIdTipoFinanc(Integer idTipoFinanc) {
		this.idTipoFinanc = idTipoFinanc;
	}

	public String getNmTipoFinanc() {
		return nmTipoFinanc;
	}

	public void setNmTipoFinanc(String nmTipoFinanc) {
		this.nmTipoFinanc = nmTipoFinanc;
	}

	public boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(boolean inAtivo) {
		this.inAtivo = inAtivo;
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
		hash += (idTipoFinanc != null ? idTipoFinanc.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TiposFinancs)) {
			return false;
		}
		TiposFinancs other = (TiposFinancs) object;
		if ((this.idTipoFinanc == null && other.idTipoFinanc != null) || (this.idTipoFinanc != null && !this.idTipoFinanc.equals(other.idTipoFinanc))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.TiposFinancs[ idTipoFinanc=" + idTipoFinanc + " ]";
	}

}
