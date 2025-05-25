/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "livros")
@NamedQueries({ @NamedQuery(name = "Livros.findAll", query = "SELECT l FROM Livros l") })
public class Livros implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_livro")
	private Integer idLivro;

	@Basic(optional = false)
	@Column(name = "tp_livro")
	private Integer tpLivro;

	@Basic(optional = false)
	@Column(name = "nu_livro")
	private Integer nuLivro;

	@Basic(optional = false)
	@Column(name = "nu_anomes", columnDefinition = "NUMERIC")
	private Integer nuAnomes;

	@Basic(optional = false)
	@Column(name = "nu_ult_pagina")
	private Integer nuUltPagina;

	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;

	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idLivro")
	private List<LivrosItens> livrosItensList;

	public Livros() {
	}

	public Livros(Integer idLivro) {
		this.idLivro = idLivro;
	}

	public Livros(Integer idLivro, int tpLivro, int nuLivro, int nuAnomes, int nuUltPagina, int idUsuarioAtualiza, Date dtUltAtualiza) {
		this.idLivro = idLivro;
		this.tpLivro = tpLivro;
		this.nuLivro = nuLivro;
		this.nuAnomes = nuAnomes;
		this.nuUltPagina = nuUltPagina;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Integer getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}

	public int getTpLivro() {
		return tpLivro;
	}

	public void setTpLivro(int tpLivro) {
		this.tpLivro = tpLivro;
	}

	public int getNuLivro() {
		return nuLivro;
	}

	public void setNuLivro(int nuLivro) {
		this.nuLivro = nuLivro;
	}

	public int getNuAnomes() {
		return nuAnomes;
	}

	public void setNuAnomes(int nuAnomes) {
		this.nuAnomes = nuAnomes;
	}

	public int getNuUltPagina() {
		return nuUltPagina;
	}

	public void setNuUltPagina(int nuUltPagina) {
		this.nuUltPagina = nuUltPagina;
	}

	public int getIdUsuarioAtualiza() {
		return idUsuarioAtualiza;
	}

	public void setIdUsuarioAtualiza(int idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public List<LivrosItens> getLivrosItensList() {
		return livrosItensList;
	}

	public void setLivrosItensList(List<LivrosItens> livrosItensList) {
		this.livrosItensList = livrosItensList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idLivro != null ? idLivro.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Livros)) {
			return false;
		}
		Livros other = (Livros) object;
		if ((this.idLivro == null && other.idLivro != null) || (this.idLivro != null && !this.idLivro.equals(other.idLivro))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Livros[ idLivro=" + idLivro + " ]";
	}

}
