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
@Table(name = "status")
@NamedQueries({ @NamedQuery(name = "Status.findAll", query = "SELECT s FROM Status s") })
public class Status implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_status")
	private Integer idStatus;

	@Basic(optional = false)
	@Column(name = "nm_status")
	private String nmStatus;

	@Basic(optional = false)
	@Column(name = "sg_status")
	private String sgStatus;

	@OneToMany(mappedBy = "idStatus")
	private List<Registros> registrosList;

	@OneToMany(mappedBy = "idStatus")
	private List<RegsVeiculos> regsVeiculosList;

	public Status() {
	}

	public Status(Integer idStatus) {
		this.idStatus = idStatus;
	}

	public Status(Integer idStatus, String nmStatus, String sgStatus) {
		this.idStatus = idStatus;
		this.nmStatus = nmStatus;
		this.sgStatus = sgStatus;
	}

	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}

	public String getNmStatus() {
		return nmStatus;
	}

	public void setNmStatus(String nmStatus) {
		this.nmStatus = nmStatus;
	}

	public String getSgStatus() {
		return sgStatus;
	}

	public void setSgStatus(String sgStatus) {
		this.sgStatus = sgStatus;
	}

	public List<Registros> getRegistrosList() {
		return registrosList;
	}

	public void setRegistrosList(List<Registros> registrosList) {
		this.registrosList = registrosList;
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
		hash += (idStatus != null ? idStatus.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Status)) {
			return false;
		}
		Status other = (Status) object;
		if ((this.idStatus == null && other.idStatus != null) || (this.idStatus != null && !this.idStatus.equals(other.idStatus))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Status[ idStatus=" + idStatus + " ]";
	}

}
