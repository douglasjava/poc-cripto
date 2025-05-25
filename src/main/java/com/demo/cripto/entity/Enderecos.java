/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "enderecos")
@NamedQueries({ @NamedQuery(name = "Enderecos.findAll", query = "SELECT e FROM Enderecos e") })
@EntityListeners(AuditingEntityListener.class)
@DynamicInsert
@DynamicUpdate
public class Enderecos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_endereco")
	private Integer idEndereco;

	@Basic(optional = false)
	@Column(name = "nu_cep", columnDefinition = "NUMERIC")
	private String nuCep;

	@Basic(optional = false)
	@Column(name = "nm_logradouro")
	private String nmLogradouro;

	@Column(name = "tx_complemento")
	private String txComplemento;

	@Column(name = "nm_bairro")
	private String nmBairro;

	@Column(name = "nu_logradouro")
	private String nuLogradouro;

	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;

	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;

	@OneToMany(mappedBy = "idEndereco")
	private List<Registros> registrosList;

	@OneToMany(mappedBy = "idEnderecoGarantidor")
	private List<Registros> registrosList1;

	@OneToMany(mappedBy = "idEndereco")
	private List<Usuarios> usuariosList;

	@JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio")
	@ManyToOne
	private Municipios municipio;

	@OneToMany(mappedBy = "endereco")
	private List<Credores> credoresList;

	@Transient
	private Integer tipoEndereco;

	public Enderecos() {
		Municipios m = new Municipios();
		m.setUf(new Ufs());
		this.municipio = m;
	}

	public Enderecos(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public Enderecos(String nmMunicipio) {
		this.municipio = new Municipios(nmMunicipio);
	}

	public Enderecos(Integer idEndereco, String nuCep, String nmLogradouro, Date dtUltAtualiza, Integer idUsuarioAtualiza) {
		this.idEndereco = idEndereco;
		this.nuCep = nuCep;
		this.nmLogradouro = nmLogradouro;
		this.dtUltAtualiza = dtUltAtualiza;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Enderecos(String nuLogradouro, String txComplemento, Integer tipoEndereco) {
		this.nuLogradouro = nuLogradouro;
		this.txComplemento = txComplemento;
		this.tipoEndereco = tipoEndereco;
	}

	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getNuCep() {
		return nuCep;
	}

	public void setNuCep(String nuCep) {
		this.nuCep = nuCep;
	}

	public String getNmLogradouro() {
		return nmLogradouro;
	}

	public void setNmLogradouro(String nmLogradouro) {
		this.nmLogradouro = nmLogradouro;
	}

	public String getTxComplemento() {
		return txComplemento;
	}

	public void setTxComplemento(String txComplemento) {
		this.txComplemento = txComplemento;
	}

	public String getNmBairro() {
		return nmBairro;
	}

	public void setNmBairro(String nmBairro) {
		this.nmBairro = nmBairro;
	}

	public String getNuLogradouro() {
		return nuLogradouro;
	}

	public void setNuLogradouro(String nuLogradouro) {
		this.nuLogradouro = nuLogradouro;
	}

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Integer getIdUsuarioAtualiza() {
		return idUsuarioAtualiza;
	}

	public void setIdUsuarioAtualiza(Integer idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public List<Registros> getRegistrosList() {
		return registrosList;
	}

	public void setRegistrosList(List<Registros> registrosList) {
		this.registrosList = registrosList;
	}

	public List<Usuarios> getUsuariosList() {
		return usuariosList;
	}

	public void setUsuariosList(List<Usuarios> usuariosList) {
		this.usuariosList = usuariosList;
	}

	public Municipios getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipios municipio) {
		this.municipio = municipio;
	}

	public List<Credores> getCredoresList() {
		return credoresList;
	}

	public void setCredoresList(List<Credores> credoresList) {
		this.credoresList = credoresList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idEndereco != null ? idEndereco.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Enderecos)) {
			return false;
		}
		Enderecos other = (Enderecos) object;
		if ((this.idEndereco == null && other.idEndereco != null) || (this.idEndereco != null && !this.idEndereco.equals(other.idEndereco))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Enderecos[ idEndereco=" + idEndereco + " ]";
	}

	public Integer getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(Integer tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public List<Registros> getRegistrosList1() {
		return registrosList1;
	}

	public void setRegistrosList1(List<Registros> registrosList1) {
		this.registrosList1 = registrosList1;
	}

}
