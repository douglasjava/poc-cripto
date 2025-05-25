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
@Table(name = "perfis")
@NamedQueries({ @NamedQuery(name = "Perfis.findAll", query = "SELECT p FROM Perfis p") })
public class Perfis implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_perfil")
	private Integer idPerfil;

	@Basic(optional = false)
	@Column(name = "nm_perfil")
	private String nmPerfil;

	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@JoinTable(name = "perfis_autorizados", joinColumns = { @JoinColumn(name = "id_perfil_origem", referencedColumnName = "id_perfil") }, inverseJoinColumns = { @JoinColumn(name = "id_perfil_autorizado", referencedColumnName = "id_perfil") })
	@ManyToMany
	private List<Perfis> perfisList;

	@ManyToMany(mappedBy = "perfisList")
	private List<Perfis> perfisList1;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "perfil")
	private List<PerfisFuncionalidades> perfisFuncionalidadesList;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPerfil")
	private List<PerfisUsuarios> perfisUsuariosList;

	public Perfis() {
	}

	public Perfis(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	public Perfis(Integer idPerfil, String nmPerfil, boolean inAtivo) {
		this.idPerfil = idPerfil;
		this.nmPerfil = nmPerfil;
		this.inAtivo = inAtivo;
	}

	public Integer getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNmPerfil() {
		return nmPerfil;
	}

	public void setNmPerfil(String nmPerfil) {
		this.nmPerfil = nmPerfil;
	}

	public boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public List<Perfis> getPerfisList() {
		return perfisList;
	}

	public void setPerfisList(List<Perfis> perfisList) {
		this.perfisList = perfisList;
	}

	public List<Perfis> getPerfisList1() {
		return perfisList1;
	}

	public void setPerfisList1(List<Perfis> perfisList1) {
		this.perfisList1 = perfisList1;
	}

	public List<PerfisFuncionalidades> getPerfisFuncionalidadesList() {
		return perfisFuncionalidadesList;
	}

	public void setPerfisFuncionalidadesList(List<PerfisFuncionalidades> perfisFuncionalidadesList) {
		this.perfisFuncionalidadesList = perfisFuncionalidadesList;
	}

	public List<PerfisUsuarios> getPerfisUsuariosList() {
		return perfisUsuariosList;
	}

	public void setPerfisUsuariosList(List<PerfisUsuarios> perfisUsuariosList) {
		this.perfisUsuariosList = perfisUsuariosList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idPerfil != null ? idPerfil.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Perfis)) {
			return false;
		}
		Perfis other = (Perfis) object;
		if ((this.idPerfil == null && other.idPerfil != null) || (this.idPerfil != null && !this.idPerfil.equals(other.idPerfil))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return nmPerfil;
	}

}
