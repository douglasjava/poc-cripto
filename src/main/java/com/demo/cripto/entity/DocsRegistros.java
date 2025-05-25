/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "docs_registros")
@NamedQueries({ @NamedQuery(name = "DocsRegistros.findAll", query = "SELECT d FROM DocsRegistros d") })
@DynamicUpdate
public class DocsRegistros implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_doc_registro")
	private Integer idDocRegistro;
	
	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;
	
	@Column(name = "ds_doc_registro")
	private String dsDocRegistro;
	
	@Basic(optional = false)
	@Column(name = "nm_arquivo")
	private String nmArquivo;
	
	@Basic(optional = false)
	@Column(name = "im_doc_registro", columnDefinition = "bytea")
	private byte[] imDocRegistro;
	
	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;
	
	@Column(name = "tp_aprovacao", columnDefinition = "NUMERIC")
	private Short tpAprovacao;
	
	@Basic(optional = false)
	@Column(name = "tp_doc_registro")
	private Integer tpDocRegistro;
	
	@JoinColumn(name = "id_registro", referencedColumnName = "id_registro")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Registros idRegistro;
	
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Usuarios idUsuario;

	
	public DocsRegistros() {
	}

	public DocsRegistros(Integer idDocRegistro) {
		this.idDocRegistro = idDocRegistro;
	}

	public DocsRegistros(Integer idDocRegistro, boolean inAtivo, String nmArquivo, byte[] imDocRegistro, Date dtUltAtualiza, int tpDocRegistro) {
		this.idDocRegistro = idDocRegistro;
		this.inAtivo = inAtivo;
		this.nmArquivo = nmArquivo;
		this.imDocRegistro = imDocRegistro;
		this.dtUltAtualiza = dtUltAtualiza;
		this.tpDocRegistro = tpDocRegistro;
	}

	public Integer getIdDocRegistro() {
		return idDocRegistro;
	}

	public void setIdDocRegistro(Integer idDocRegistro) {
		this.idDocRegistro = idDocRegistro;
	}

	public boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public String getDsDocRegistro() {
		return dsDocRegistro;
	}

	public void setDsDocRegistro(String dsDocRegistro) {
		this.dsDocRegistro = dsDocRegistro;
	}

	public String getNmArquivo() {
		return nmArquivo;
	}

	public void setNmArquivo(String nmArquivo) {
		this.nmArquivo = nmArquivo;
	}

	public byte[] getImDocRegistro() {
		return imDocRegistro;
	}

	public void setImDocRegistro(byte[] imDocRegistro) {
		this.imDocRegistro = imDocRegistro;
	}

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Short getTpAprovacao() {
		return tpAprovacao;
	}

	public void setTpAprovacao(Short tpAprovacao) {
		this.tpAprovacao = tpAprovacao;
	}

	public int getTpDocRegistro() {
		return tpDocRegistro;
	}

	public void setTpDocRegistro(int tpDocRegistro) {
		this.tpDocRegistro = tpDocRegistro;
	}

	public Registros getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Registros idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Usuarios getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuarios idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idDocRegistro != null ? idDocRegistro.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof DocsRegistros)) {
			return false;
		}
		DocsRegistros other = (DocsRegistros) object;
		if ((this.idDocRegistro == null && other.idDocRegistro != null) || (this.idDocRegistro != null && !this.idDocRegistro.equals(other.idDocRegistro))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.DocsRegistros[ idDocRegistro=" + idDocRegistro + " ]";
	}

}
