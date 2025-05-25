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
@Table(name = "modelos")
@NamedQueries({ @NamedQuery(name = "Modelos.findAll", query = "SELECT m FROM Modelos m") })
public class Modelos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_modelo")
	private Integer idModelo;

	@Basic(optional = false)
	@Column(name = "nm_modelo")
	private String nmModelo;

	@Column(name = "cd_fipe_modelo")
	private Integer cdFipeModelo;

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
	@Column(name = "tx_modelo")
	private String txModelo;

	@OneToMany(mappedBy = "idModelo")
	private List<RegsVeiculos> regsVeiculosList;

	@JoinColumn(name = "id_marca", referencedColumnName = "id_marca")
	@ManyToOne(optional = false)
	private Marcas idMarca;

	public Modelos() {
	}

	public Modelos(Integer idModelo) {
		this.idModelo = idModelo;
	}

	public Modelos(Integer idModelo, String nmModelo, boolean inAtivo, int idUsuarioAtualiza, Date dtUltAtualiza, String txModelo) {
		this.idModelo = idModelo;
		this.nmModelo = nmModelo;
		this.inAtivo = inAtivo;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
		this.txModelo = txModelo;
	}

	public Modelos(String nmModelo, boolean inAtivo, int idUsuarioAtualiza, Date dtUltAtualiza, String txModelo) {
		this.nmModelo = nmModelo;
		this.inAtivo = inAtivo;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
		this.txModelo = txModelo;
	}

	public Integer getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(Integer idModelo) {
		this.idModelo = idModelo;
	}

	public String getNmModelo() {
		return nmModelo;
	}

	public void setNmModelo(String nmModelo) {
		this.nmModelo = nmModelo;
	}

	public Integer getCdFipeModelo() {
		return cdFipeModelo;
	}

	public void setCdFipeModelo(Integer cdFipeModelo) {
		this.cdFipeModelo = cdFipeModelo;
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

	public String getTxModelo() {
		return txModelo;
	}

	public void setTxModelo(String txModelo) {
		this.txModelo = txModelo;
	}

	public List<RegsVeiculos> getRegsVeiculosList() {
		return regsVeiculosList;
	}

	public void setRegsVeiculosList(List<RegsVeiculos> regsVeiculosList) {
		this.regsVeiculosList = regsVeiculosList;
	}

	public Marcas getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Marcas idMarca) {
		this.idMarca = idMarca;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idModelo != null ? idModelo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Modelos)) {
			return false;
		}
		Modelos other = (Modelos) object;
		if ((this.idModelo == null && other.idModelo != null) || (this.idModelo != null && !this.idModelo.equals(other.idModelo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Modelos[ idModelo=" + idModelo + " ]";
	}

}
