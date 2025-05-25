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
@Table(name = "ufs")
@NamedQueries({ @NamedQuery(name = "Ufs.findAll", query = "SELECT u FROM Ufs u") })
public class Ufs implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@Column(name = "id_uf")
	private Integer idUf;
	
	@Basic(optional = false)
	@Column(name = "nm_uf")
	private String nmUf;
	
	@Basic(optional = false)
	@Column(name = "sg_uf")
	private String sgUf;
	
	@ManyToMany(mappedBy = "ufsList")
	private List<TiposContratos> tiposContratosList;
	
	@JoinTable(name = "dests_uf", joinColumns = { @JoinColumn(name = "id_uf", referencedColumnName = "id_uf") }, inverseJoinColumns = { @JoinColumn(name = "id_mensagem", referencedColumnName = "id_mensagem") })
	@ManyToMany
	private List<Mensagens> mensagensList;
	
	@OneToMany(mappedBy = "uf")
	private List<Municipios> municipiosList;
	
	@OneToMany(mappedBy = "idUf")
	private List<Registros> registrosList;
	
	@OneToMany(mappedBy = "ufs")
	private List<SeqServDetran> seqServDetranList;

	public Ufs() {
	}

	public Ufs(Integer idUf) {
		this.idUf = idUf;
	}

	public Ufs(Integer idUf, String nmUf, String sgUf) {
		this.idUf = idUf;
		this.nmUf = nmUf;
		this.sgUf = sgUf;
	}

	public Integer getIdUf() {
		return idUf;
	}

	public void setIdUf(Integer idUf) {
		this.idUf = idUf;
	}

	public String getNmUf() {
		return nmUf;
	}

	public void setNmUf(String nmUf) {
		this.nmUf = nmUf;
	}

	public String getSgUf() {
		return sgUf;
	}

	public void setSgUf(String sgUf) {
		this.sgUf = sgUf;
	}

	public List<TiposContratos> getTiposContratosList() {
		return tiposContratosList;
	}

	public void setTiposContratosList(List<TiposContratos> tiposContratosList) {
		this.tiposContratosList = tiposContratosList;
	}

	public List<Mensagens> getMensagensList() {
		return mensagensList;
	}

	public void setMensagensList(List<Mensagens> mensagensList) {
		this.mensagensList = mensagensList;
	}

	public List<Municipios> getMunicipiosList() {
		return municipiosList;
	}

	public void setMunicipiosList(List<Municipios> municipiosList) {
		this.municipiosList = municipiosList;
	}

	public List<Registros> getRegistrosList() {
		return registrosList;
	}

	public void setRegistrosList(List<Registros> registrosList) {
		this.registrosList = registrosList;
	}

	public List<SeqServDetran> getSeqServDetranList() {
		return seqServDetranList;
	}

	public void setSeqServDetranList(List<SeqServDetran> seqServDetranList) {
		this.seqServDetranList = seqServDetranList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idUf != null ? idUf.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Ufs)) {
			return false;
		}
		Ufs other = (Ufs) object;
		if ((this.idUf == null && other.idUf != null) || (this.idUf != null && !this.idUf.equals(other.idUf))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Ufs[ idUf=" + idUf + " ]";
	}

}
