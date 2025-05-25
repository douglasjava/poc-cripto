package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vw_menus")
public class VwMenus implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "seq")
	private Integer seq;
	@Column(name = "nm_menu")
	private String nmMenu;
	@Column(name = "level")
	private Integer level;

	@JoinColumn(name = "id_funcionalidade", referencedColumnName = "id_funcionalidade")
	@ManyToOne
	private Funcionalidades idFuncionalidade;

	public VwMenus() {
	}

	public VwMenus(Integer seq, String nmMenu, Integer level, Funcionalidades idFuncionalidade) {
		super();
		this.seq = seq;
		this.nmMenu = nmMenu;
		this.level = level;
		this.idFuncionalidade = idFuncionalidade;
	}

	@Override
	public String toString() {
		return "VwMenus [seq=" + seq + ", nmMenu=" + nmMenu + ", level=" + level + ", idFuncionalidade=" + idFuncionalidade + "]";
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getNmMenu() {
		return nmMenu;
	}

	public void setNmMenu(String nmMenu) {
		this.nmMenu = nmMenu;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Funcionalidades getIdFuncionalidade() {
		return idFuncionalidade;
	}

	public void setIdFuncionalidade(Funcionalidades idFuncionalidade) {
		this.idFuncionalidade = idFuncionalidade;
	}

}
