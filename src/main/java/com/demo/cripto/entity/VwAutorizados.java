package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "vw_autorizados")
public class VwAutorizados implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_perfil")
	private Integer idPerfil;
	@Column(name = "nm_perfil")
	private String nmPerfil;

	@JoinTable(name = "perfis_autorizados", joinColumns = {
	@JoinColumn(name = "id_perfil_origem", referencedColumnName = "id_perfil") }, inverseJoinColumns = {
    @JoinColumn(name = "id_perfil_autorizado", referencedColumnName = "id_perfil") })
	@ManyToMany
	private List<Perfis> perfisList;

	public VwAutorizados() {
	}

	public VwAutorizados(Integer idPerfil, String nmPerfil, List<Perfis> perfisList) {
		super();
		this.idPerfil = idPerfil;
		this.nmPerfil = nmPerfil;
		this.perfisList = perfisList;
	}

	@Override
	public String toString() {
		return "VwAutorizados [idPerfil=" + idPerfil + ", nmPerfil=" + nmPerfil + ", perfisList=" + perfisList + "]";
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

	public List<Perfis> getPerfisList() {
		return perfisList;
	}

	public void setPerfisList(List<Perfis> perfisList) {
		this.perfisList = perfisList;
	}
	

}
