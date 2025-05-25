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
@Table(name = "indices_correcao")
@NamedQueries({ @NamedQuery(name = "IndicesCorrecao.findAll", query = "SELECT i FROM IndicesCorrecao i") })
public class IndicesCorrecao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_indice_correcao")
	private Integer idIndiceCorrecao;
	@Column(name = "ds_indice_correcao")
	private String dsIndiceCorrecao;
	@Column(name = "in_ativo")
	private Boolean inAtivo;
	@OneToMany(mappedBy = "idIndiceCorrecao")
	private List<Registros> registrosList;

	public IndicesCorrecao() {
	}

	public IndicesCorrecao(Integer idIndiceCorrecao) {
		this.idIndiceCorrecao = idIndiceCorrecao;
	}

	public Integer getIdIndiceCorrecao() {
		return idIndiceCorrecao;
	}

	public void setIdIndiceCorrecao(Integer idIndiceCorrecao) {
		this.idIndiceCorrecao = idIndiceCorrecao;
	}

	public String getDsIndiceCorrecao() {
		return dsIndiceCorrecao;
	}

	public void setDsIndiceCorrecao(String dsIndiceCorrecao) {
		this.dsIndiceCorrecao = dsIndiceCorrecao;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
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
		hash += (idIndiceCorrecao != null ? idIndiceCorrecao.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof IndicesCorrecao)) {
			return false;
		}
		IndicesCorrecao other = (IndicesCorrecao) object;
		if ((this.idIndiceCorrecao == null && other.idIndiceCorrecao != null) || (this.idIndiceCorrecao != null && !this.idIndiceCorrecao.equals(other.idIndiceCorrecao))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.IndicesCorrecao[ idIndiceCorrecao=" + idIndiceCorrecao + " ]";
	}

}
