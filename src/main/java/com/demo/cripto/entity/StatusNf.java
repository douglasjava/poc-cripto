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
@Table(name = "status_nf")
@NamedQueries({ @NamedQuery(name = "StatusNf.findAll", query = "SELECT s FROM StatusNf s") })
public class StatusNf implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_status_nf")
	private Integer idStatusNf;
	@Basic(optional = false)
	@Column(name = "nm_status_nf")
	private String nmStatusNf;
	@Basic(optional = false)
	@Column(name = "sg_status_nf")
	private String sgStatusNf;
	@OneToMany(mappedBy = "idStatusNf")
	private List<NotasFiscais> notasFiscaisList;

	public StatusNf() {
	}

	public StatusNf(Integer idStatusNf) {
		this.idStatusNf = idStatusNf;
	}

	public StatusNf(Integer idStatusNf, String nmStatusNf, String sgStatusNf) {
		this.idStatusNf = idStatusNf;
		this.nmStatusNf = nmStatusNf;
		this.sgStatusNf = sgStatusNf;
	}

	public Integer getIdStatusNf() {
		return idStatusNf;
	}

	public void setIdStatusNf(Integer idStatusNf) {
		this.idStatusNf = idStatusNf;
	}

	public String getNmStatusNf() {
		return nmStatusNf;
	}

	public void setNmStatusNf(String nmStatusNf) {
		this.nmStatusNf = nmStatusNf;
	}

	public String getSgStatusNf() {
		return sgStatusNf;
	}

	public void setSgStatusNf(String sgStatusNf) {
		this.sgStatusNf = sgStatusNf;
	}

	public List<NotasFiscais> getNotasFiscaisList() {
		return notasFiscaisList;
	}

	public void setNotasFiscaisList(List<NotasFiscais> notasFiscaisList) {
		this.notasFiscaisList = notasFiscaisList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idStatusNf != null ? idStatusNf.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof StatusNf)) {
			return false;
		}
		StatusNf other = (StatusNf) object;
		if ((this.idStatusNf == null && other.idStatusNf != null) || (this.idStatusNf != null && !this.idStatusNf.equals(other.idStatusNf))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.StatusNf[ idStatusNf=" + idStatusNf + " ]";
	}

}
