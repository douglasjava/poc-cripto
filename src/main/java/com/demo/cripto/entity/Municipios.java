/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "municipios")
@NamedQueries({ @NamedQuery(name = "Municipios.findAll", query = "SELECT m FROM Municipios m") })
@DynamicInsert
@DynamicUpdate
public class Municipios implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "id_municipio")
	private Integer idMunicipio;

	@Basic(optional = false)
	@Column(name = "nm_municipio")
	private String nmMunicipio;

	@Basic(optional = false)
	@Column(name = "nm_municipio_b3")
	private String nmMunicipioB3;

	@Column(name = "id_siafi")
	private Integer idSiafi;

	@JoinColumn(name = "id_uf", referencedColumnName = "id_uf")
	@ManyToOne(optional = false)
	private Ufs uf;

	@OneToMany(mappedBy = "idMunicipioContrato", fetch = FetchType.LAZY)
	private List<Registros> registrosList;

	@OneToMany(mappedBy = "idMunicipioPlaca", fetch = FetchType.LAZY)
	private List<RegsVeiculos> regsVeiculosList;

	@Transient
	@OneToMany(mappedBy = "municipio")
	private List<Enderecos> enderecosList;

	public Municipios() {
	}

	public Municipios(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public Municipios(String nmMunicipio) {
		this.nmMunicipio = nmMunicipio;
	}

	public Municipios(Integer idMunicipio, String nmMunicipio) {
		this.idMunicipio = idMunicipio;
		this.nmMunicipio = nmMunicipio;
	}

	public Integer getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public String getNmMunicipio() {
		return nmMunicipio;
	}

	public void setNmMunicipio(String nmMunicipio) {
		this.nmMunicipio = nmMunicipio;
	}

	public Integer getIdSiafi() {
		return idSiafi;
	}

	public void setIdSiafi(Integer idSiafi) {
		this.idSiafi = idSiafi;
	}

	public Ufs getUf() {
		return uf;
	}

	public void setUf(Ufs uf) {
		this.uf = uf;
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

	public List<Enderecos> getEnderecosList() {
		return enderecosList;
	}

	public void setEnderecosList(List<Enderecos> enderecosList) {
		this.enderecosList = enderecosList;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Municipios)) {
			return false;
		}
		Municipios other = (Municipios) object;
		if ((this.idMunicipio == null && other.idMunicipio != null) || (this.idMunicipio != null && !this.idMunicipio.equals(other.idMunicipio))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Municipios[ idMunicipio=" + idMunicipio + " ]";
	}

}
