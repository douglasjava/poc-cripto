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
@Table(name = "tipos_veiculos")
@NamedQueries({ @NamedQuery(name = "TiposVeiculos.findAll", query = "SELECT t FROM TiposVeiculos t") })
public class TiposVeiculos implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_tipo_veiculo")
	private Integer idTipoVeiculo;
	@Basic(optional = false)
	@Column(name = "nm_tipo_veiculo")
	private String nmTipoVeiculo;
	@OneToMany(mappedBy = "idTipoVeiculo")
	private List<RegsVeiculos> regsVeiculosList;

	public TiposVeiculos() {
	}

	public TiposVeiculos(Integer idTipoVeiculo) {
		this.idTipoVeiculo = idTipoVeiculo;
	}

	public TiposVeiculos(Integer idTipoVeiculo, String nmTipoVeiculo) {
		this.idTipoVeiculo = idTipoVeiculo;
		this.nmTipoVeiculo = nmTipoVeiculo;
	}

	public Integer getIdTipoVeiculo() {
		return idTipoVeiculo;
	}

	public void setIdTipoVeiculo(Integer idTipoVeiculo) {
		this.idTipoVeiculo = idTipoVeiculo;
	}

	public String getNmTipoVeiculo() {
		return nmTipoVeiculo;
	}

	public void setNmTipoVeiculo(String nmTipoVeiculo) {
		this.nmTipoVeiculo = nmTipoVeiculo;
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
		hash += (idTipoVeiculo != null ? idTipoVeiculo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TiposVeiculos)) {
			return false;
		}
		TiposVeiculos other = (TiposVeiculos) object;
		if ((this.idTipoVeiculo == null && other.idTipoVeiculo != null) || (this.idTipoVeiculo != null && !this.idTipoVeiculo.equals(other.idTipoVeiculo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.TiposVeiculos[ idTipoVeiculo=" + idTipoVeiculo + " ]";
	}

}
