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

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "perfis_funcionalidades")
@NamedQueries({ @NamedQuery(name = "PerfisFuncionalidades.findAll", query = "SELECT p FROM PerfisFuncionalidades p") })
@DynamicInsert
@DynamicUpdate
public class PerfisFuncionalidades implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_perfil_funcionalidade")
	private Integer idPerfilFuncionalidade;
	
	@Basic(optional = false)
	@Column(name = "tp_acesso", columnDefinition = "NUMERIC")
	private Short tpAcesso;
	
	@JoinColumn(name = "id_funcionalidade", referencedColumnName = "id_funcionalidade")
	@ManyToOne(optional = false)
	private Funcionalidades funcionalidade;
	
	@JoinColumn(name = "id_perfil", referencedColumnName = "id_perfil")
	@ManyToOne(optional = false)
	private Perfis perfil;

	public PerfisFuncionalidades() {
	}

	public PerfisFuncionalidades(Integer idPerfilFuncionalidade) {
		this.idPerfilFuncionalidade = idPerfilFuncionalidade;
	}

	public PerfisFuncionalidades(Integer idPerfilFuncionalidade, short tpAcesso) {
		this.idPerfilFuncionalidade = idPerfilFuncionalidade;
		this.tpAcesso = tpAcesso;
	}

	public Integer getIdPerfilFuncionalidade() {
		return idPerfilFuncionalidade;
	}

	public void setIdPerfilFuncionalidade(Integer idPerfilFuncionalidade) {
		this.idPerfilFuncionalidade = idPerfilFuncionalidade;
	}

	public short getTpAcesso() {
		return tpAcesso;
	}

	public void setTpAcesso(short tpAcesso) {
		this.tpAcesso = tpAcesso;
	}

	public Funcionalidades getFuncionalidade() {
		return funcionalidade;
	}

	public void setFuncionalidade(Funcionalidades funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	public Perfis getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfis perfil) {
		this.perfil = perfil;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idPerfilFuncionalidade != null ? idPerfilFuncionalidade.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PerfisFuncionalidades)) {
			return false;
		}
		PerfisFuncionalidades other = (PerfisFuncionalidades) object;
		if ((this.idPerfilFuncionalidade == null && other.idPerfilFuncionalidade != null) || (this.idPerfilFuncionalidade != null && !this.idPerfilFuncionalidade.equals(other.idPerfilFuncionalidade))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.PerfisFuncionalidades[ idPerfilFuncionalidade=" + idPerfilFuncionalidade + " ]";
	}

}
