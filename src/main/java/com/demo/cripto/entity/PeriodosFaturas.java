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
@Table(name = "periodos_faturas")
@NamedQueries({ @NamedQuery(name = "PeriodosFaturas.findAll", query = "SELECT p FROM PeriodosFaturas p") })
public class PeriodosFaturas implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "id_periodo_fatura")
	private Integer idPeriodoFatura;
	@Column(name = "ds_periodo_fatura")
	private String dsPeriodoFatura;
	@OneToMany(mappedBy = "idPeriodoFatura")
	private List<Credores> credoresList;

	public PeriodosFaturas() {
	}

	public PeriodosFaturas(Integer idPeriodoFatura) {
		this.idPeriodoFatura = idPeriodoFatura;
	}

	public Integer getIdPeriodoFatura() {
		return idPeriodoFatura;
	}

	public void setIdPeriodoFatura(Integer idPeriodoFatura) {
		this.idPeriodoFatura = idPeriodoFatura;
	}

	public String getDsPeriodoFatura() {
		return dsPeriodoFatura;
	}

	public void setDsPeriodoFatura(String dsPeriodoFatura) {
		this.dsPeriodoFatura = dsPeriodoFatura;
	}

	public List<Credores> getCredoresList() {
		return credoresList;
	}

	public void setCredoresList(List<Credores> credoresList) {
		this.credoresList = credoresList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idPeriodoFatura != null ? idPeriodoFatura.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PeriodosFaturas)) {
			return false;
		}
		PeriodosFaturas other = (PeriodosFaturas) object;
		if ((this.idPeriodoFatura == null && other.idPeriodoFatura != null) || (this.idPeriodoFatura != null && !this.idPeriodoFatura.equals(other.idPeriodoFatura))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.PeriodosFaturas[ idPeriodoFatura=" + idPeriodoFatura + " ]";
	}

}
