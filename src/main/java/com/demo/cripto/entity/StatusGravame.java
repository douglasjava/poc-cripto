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
@Table(name = "status_gravame")
@NamedQueries({ @NamedQuery(name = "StatusGravame.findAll", query = "SELECT s FROM StatusGravame s") })
public class StatusGravame implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "id_status_gravame")
	private Integer idStatusGravame;

	@Basic(optional = false)
	@Column(name = "ds_status_gravame")
	private String dsStatusGravame;

	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@OneToMany(mappedBy = "idStatusGravame")
	private List<RegsVeiculos> regsVeiculosList;

	public StatusGravame() {
	}

	public StatusGravame(Integer idStatusGravame) {
		this.idStatusGravame = idStatusGravame;
	}

	public StatusGravame(Integer idStatusGravame, String dsStatusGravame, boolean inAtivo) {
		this.idStatusGravame = idStatusGravame;
		this.dsStatusGravame = dsStatusGravame;
		this.inAtivo = inAtivo;
	}

	public Integer getIdStatusGravame() {
		return idStatusGravame;
	}

	public void setIdStatusGravame(Integer idStatusGravame) {
		this.idStatusGravame = idStatusGravame;
	}

	public String getDsStatusGravame() {
		return dsStatusGravame;
	}

	public void setDsStatusGravame(String dsStatusGravame) {
		this.dsStatusGravame = dsStatusGravame;
	}

	public boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public List<RegsVeiculos> getRegsVeiculosList() {
		return regsVeiculosList;
	}

	public void setRegsVeiculosList(List<RegsVeiculos> regsVeiculosList) {
		this.regsVeiculosList = regsVeiculosList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idStatusGravame != null ? idStatusGravame.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof StatusGravame)) {
			return false;
		}
		StatusGravame other = (StatusGravame) object;
		if ((this.idStatusGravame == null && other.idStatusGravame != null) || (this.idStatusGravame != null && !this.idStatusGravame.equals(other.idStatusGravame))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.StatusGravame[ idStatusGravame=" + idStatusGravame + " ]";
	}

}
