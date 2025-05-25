/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "menus")
@NamedQueries({ @NamedQuery(name = "Menus.findAll", query = "SELECT m FROM Menus m") })
public class Menus implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_menu")
	private Integer idMenu;
	
	@Basic(optional = false)
	@Column(name = "nm_menu")
	private String nmMenu;
	
	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;
	
	@Basic(optional = false)
	@Column(name = "nu_ordem")
	private Integer nuOrdem;
	
	@JoinColumn(name = "id_funcionalidade", referencedColumnName = "id_funcionalidade")
	@ManyToOne(fetch = FetchType.LAZY)
	private Funcionalidades funcionalidade;
	
	@OneToMany(mappedBy = "idMenuPai", fetch = FetchType.LAZY)
	@Fetch(FetchMode.SELECT)
	private List<Menus> menusList;
	
	@JoinColumn(name = "id_menu_pai", referencedColumnName = "id_menu")
	@ManyToOne(fetch = FetchType.LAZY)
	private Menus idMenuPai;

	public Menus() {
	}

	public Menus(Integer idMenu) {
		this.idMenu = idMenu;
	}

	public Menus(Integer idMenu, String nmMenu, boolean inAtivo, int nuOrdem) {
		this.idMenu = idMenu;
		this.nmMenu = nmMenu;
		this.inAtivo = inAtivo;
		this.nuOrdem = nuOrdem;
	}

	public Integer getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}

	public String getNmMenu() {
		return nmMenu;
	}

	public void setNmMenu(String nmMenu) {
		this.nmMenu = nmMenu;
	}

	public boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public int getNuOrdem() {
		return nuOrdem;
	}

	public void setNuOrdem(int nuOrdem) {
		this.nuOrdem = nuOrdem;
	}

	public Funcionalidades getFuncionalidade() {
		return funcionalidade;
	}

	public void setFuncionalidade(Funcionalidades funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	public List<Menus> getMenusList() {
		return menusList;
	}

	public void setMenusList(List<Menus> menusList) {
		this.menusList = menusList;
	}

	public Menus getIdMenuPai() {
		return idMenuPai;
	}

	public void setIdMenuPai(Menus idMenuPai) {
		this.idMenuPai = idMenuPai;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idMenu != null ? idMenu.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Menus)) {
			return false;
		}
		Menus other = (Menus) object;
		if ((this.idMenu == null && other.idMenu != null) || (this.idMenu != null && !this.idMenu.equals(other.idMenu))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return nmMenu;
	}

}
