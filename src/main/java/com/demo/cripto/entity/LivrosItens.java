/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "livros_itens")
@NamedQueries({ @NamedQuery(name = "LivrosItens.findAll", query = "SELECT l FROM LivrosItens l") })
public class LivrosItens implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_livro_item")
	private Integer idLivroItem;

	@Basic(optional = false)
	@Column(name = "nu_item")
	private int nuItem;

	@Basic(optional = false)
	@Column(name = "nu_pagina")
	private int nuPagina;

	@JoinColumn(name = "id_reg_veiculo", referencedColumnName = "id_reg_veiculo")
	@ManyToOne
	private RegsVeiculos idRegVeiculo;

	@JoinColumn(name = "id_registro", referencedColumnName = "id_registro", nullable = false)
	@ManyToOne(optional = false)
	private Registros idRegistro;

	@JoinColumn(name = "id_livro", referencedColumnName = "id_livro")
	@ManyToOne(optional = false)
	private Livros idLivro;

	@JoinColumn(name = "id_item_nota_fiscal", referencedColumnName = "id_item_nota_fiscal")
	@ManyToOne
	private ItensNotasFiscais idItemNotaFiscal;

	public LivrosItens() {
	}

	public LivrosItens(Integer idLivroItem) {
		this.idLivroItem = idLivroItem;
	}

	public LivrosItens(Integer idLivroItem, int nuItem, int nuPagina) {
		this.idLivroItem = idLivroItem;
		this.nuItem = nuItem;
		this.nuPagina = nuPagina;
	}

	public Integer getIdLivroItem() {
		return idLivroItem;
	}

	public void setIdLivroItem(Integer idLivroItem) {
		this.idLivroItem = idLivroItem;
	}

	public int getNuItem() {
		return nuItem;
	}

	public void setNuItem(int nuItem) {
		this.nuItem = nuItem;
	}

	public int getNuPagina() {
		return nuPagina;
	}

	public void setNuPagina(int nuPagina) {
		this.nuPagina = nuPagina;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idLivroItem != null ? idLivroItem.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof LivrosItens)) {
			return false;
		}
		LivrosItens other = (LivrosItens) object;
		if ((this.idLivroItem == null && other.idLivroItem != null) || (this.idLivroItem != null && !this.idLivroItem.equals(other.idLivroItem))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.LivrosItens[ idLivroItem=" + idLivroItem + " ]";
	}

	public RegsVeiculos getIdRegVeiculo() {
		return idRegVeiculo;
	}

	public void setIdRegVeiculo(RegsVeiculos idRegVeiculo) {
		this.idRegVeiculo = idRegVeiculo;
	}

	public Registros getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Registros idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Livros getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Livros idLivro) {
		this.idLivro = idLivro;
	}

	public ItensNotasFiscais getIdItemNotaFiscal() {
		return idItemNotaFiscal;
	}

	public void setIdItemNotaFiscal(ItensNotasFiscais idItemNotaFiscal) {
		this.idItemNotaFiscal = idItemNotaFiscal;
	}

}
