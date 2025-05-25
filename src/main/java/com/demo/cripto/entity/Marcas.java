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
@Table(name = "marcas")
@NamedQueries({ @NamedQuery(name = "Marcas.findAll", query = "SELECT m FROM Marcas m") })
public class Marcas implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_marca")
	private Integer idMarca;

	@Basic(optional = false)
	@Column(name = "nm_marca")
	private String nmMarca;

	@Column(name = "cd_fipe_marca")
	private Integer cdFipeMarca;

	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;

	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;

	@Basic(optional = false)
	@Column(name = "tp_marca")
	private String tpMarca;

	@Basic(optional = false)
	@Column(name = "tx_marca")
	private String txMarca;

	@OneToMany(mappedBy = "idMarca")
	private List<RegsVeiculos> regsVeiculosList;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idMarca")
	private List<Modelos> modelosList;

	public Marcas() {
	}

	public Marcas(Integer idMarca) {
		this.idMarca = idMarca;
	}

	public Marcas(Integer idMarca, String nmMarca, boolean inAtivo, int idUsuarioAtualiza, Date dtUltAtualiza, String tpMarca, String txMarca) {
		this.idMarca = idMarca;
		this.nmMarca = nmMarca;
		this.inAtivo = inAtivo;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
		this.tpMarca = tpMarca;
		this.txMarca = txMarca;
	}

	public Marcas(String nmMarca, boolean inAtivo, int idUsuarioAtualiza, Date dtUltAtualiza, String tpMarca, String txMarca) {
		this.nmMarca = nmMarca;
		this.inAtivo = inAtivo;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
		this.tpMarca = tpMarca;
		this.txMarca = txMarca;
	}

	public Integer getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	public String getNmMarca() {
		return nmMarca;
	}

	public void setNmMarca(String nmMarca) {
		this.nmMarca = nmMarca;
	}

	public Integer getCdFipeMarca() {
		return cdFipeMarca;
	}

	public void setCdFipeMarca(Integer cdFipeMarca) {
		this.cdFipeMarca = cdFipeMarca;
	}

	public boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(boolean inAtivo) {
		this.inAtivo = inAtivo;
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

	public String getTpMarca() {
		return tpMarca;
	}

	public void setTpMarca(String tpMarca) {
		this.tpMarca = tpMarca;
	}

	public String getTxMarca() {
		return txMarca;
	}

	public void setTxMarca(String txMarca) {
		this.txMarca = txMarca;
	}

	public List<RegsVeiculos> getRegsVeiculosList() {
		return regsVeiculosList;
	}

	public void setRegsVeiculosList(List<RegsVeiculos> regsVeiculosList) {
		this.regsVeiculosList = regsVeiculosList;
	}

	public List<Modelos> getModelosList() {
		return modelosList;
	}

	public void setModelosList(List<Modelos> modelosList) {
		this.modelosList = modelosList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idMarca != null ? idMarca.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Marcas)) {
			return false;
		}
		Marcas other = (Marcas) object;
		if ((this.idMarca == null && other.idMarca != null) || (this.idMarca != null && !this.idMarca.equals(other.idMarca))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Marcas[ idMarca=" + idMarca + " ]";
	}

}
