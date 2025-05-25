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
@Table(name = "funcionalidades")
@NamedQueries({ @NamedQuery(name = "Funcionalidades.findAll", query = "SELECT f FROM Funcionalidades f") })
public class Funcionalidades implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_funcionalidade")
	private Integer idFuncionalidade;
	
	@Basic(optional = false)
	@Column(name = "nm_funcionalidade")
	private String nmFuncionalidade;
	
	@Basic(optional = false)
	@Column(name = "in_menu")
	private Boolean inMenu;
	
	@Column(name = "tx_url")
	private String txUrl;
	
	@Basic(optional = false)
	@Column(name = "in_relatorio")
	private Boolean inRelatorio;
	
	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;
	
	@Column(name = "ds_uc")
	private String dsUc;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionalidade", fetch = FetchType.LAZY)
	private List<PerfisFuncionalidades> perfisFuncionalidadesList;
	
	@OneToMany(mappedBy = "funcionalidade")
	private List<Menus> menusList;

	public Funcionalidades() {
	}

	public Funcionalidades(Integer idFuncionalidade) {
		this.idFuncionalidade = idFuncionalidade;
	}

	public Funcionalidades(Integer idFuncionalidade, String nmFuncionalidade, boolean inMenu, boolean inRelatorio, boolean inAtivo) {
		this.idFuncionalidade = idFuncionalidade;
		this.nmFuncionalidade = nmFuncionalidade;
		this.inMenu = inMenu;
		this.inRelatorio = inRelatorio;
		this.inAtivo = inAtivo;
	}

	public Integer getIdFuncionalidade() {
		return idFuncionalidade;
	}

	public void setIdFuncionalidade(Integer idFuncionalidade) {
		this.idFuncionalidade = idFuncionalidade;
	}

	public String getNmFuncionalidade() {
		return nmFuncionalidade;
	}

	public void setNmFuncionalidade(String nmFuncionalidade) {
		this.nmFuncionalidade = nmFuncionalidade;
	}

	public boolean getInMenu() {
		return inMenu;
	}

	public void setInMenu(boolean inMenu) {
		this.inMenu = inMenu;
	}

	public String getTxUrl() {
		return txUrl;
	}

	public void setTxUrl(String txUrl) {
		this.txUrl = txUrl;
	}

	public boolean getInRelatorio() {
		return inRelatorio;
	}

	public void setInRelatorio(boolean inRelatorio) {
		this.inRelatorio = inRelatorio;
	}

	public boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public String getDsUc() {
		return dsUc;
	}

	public void setDsUc(String dsUc) {
		this.dsUc = dsUc;
	}

	public List<PerfisFuncionalidades> getPerfisFuncionalidadesList() {
		return perfisFuncionalidadesList;
	}

	public void setPerfisFuncionalidadesList(List<PerfisFuncionalidades> perfisFuncionalidadesList) {
		this.perfisFuncionalidadesList = perfisFuncionalidadesList;
	}

	public List<Menus> getMenusList() {
		return menusList;
	}

	public void setMenusList(List<Menus> menusList) {
		this.menusList = menusList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idFuncionalidade != null ? idFuncionalidade.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Funcionalidades)) {
			return false;
		}
		Funcionalidades other = (Funcionalidades) object;
		if ((this.idFuncionalidade == null && other.idFuncionalidade != null) || (this.idFuncionalidade != null && !this.idFuncionalidade.equals(other.idFuncionalidade))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Funcionalidades[ idFuncionalidade=" + idFuncionalidade + " ]";
	}

}
