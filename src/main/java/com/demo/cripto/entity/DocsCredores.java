/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "docs_credores")
@NamedQueries({ @NamedQuery(name = "DocsCredores.findAll", query = "SELECT d FROM DocsCredores d") })
public class DocsCredores implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_doc_credor")
	private Integer idDocCredor;

	@Basic(optional = false)
	@Column(name = "ds_doc_credor")
	private String dsDocCredor;

	@Basic(optional = false)
	@Column(name = "im_doc_credor", columnDefinition = "bytea")
	private byte[] imDocCredor;

	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;

	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;

	@Column(name = "nm_arquivo")
	private String nmArquivo;

	@JoinColumn(name = "id_credor", referencedColumnName = "id_credor")
	@ManyToOne(optional = false)
	private Credores idCredor;

	public DocsCredores() {
	}

	public DocsCredores(Integer idDocCredor) {
		this.idDocCredor = idDocCredor;
	}

	public DocsCredores(Integer idDocCredor, String dsDocCredor, byte[] imDocCredor, boolean inAtivo, Date dtUltAtualiza, int idUsuarioAtualiza) {
		this.idDocCredor = idDocCredor;
		this.dsDocCredor = dsDocCredor;
		this.imDocCredor = imDocCredor;
		this.inAtivo = inAtivo;
		this.dtUltAtualiza = dtUltAtualiza;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Integer getIdDocCredor() {
		return idDocCredor;
	}

	public void setIdDocCredor(Integer idDocCredor) {
		this.idDocCredor = idDocCredor;
	}

	public String getDsDocCredor() {
		return dsDocCredor;
	}

	public void setDsDocCredor(String dsDocCredor) {
		this.dsDocCredor = dsDocCredor;
	}

	public byte[] getImDocCredor() {
		return imDocCredor;
	}

	public void setImDocCredor(byte[] imDocCredor) {
		this.imDocCredor = imDocCredor;
	}

	public boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public int getIdUsuarioAtualiza() {
		return idUsuarioAtualiza;
	}

	public void setIdUsuarioAtualiza(int idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public String getNmArquivo() {
		return nmArquivo;
	}

	public void setNmArquivo(String nmArquivo) {
		this.nmArquivo = nmArquivo;
	}

	public Credores getIdCredor() {
		return idCredor;
	}

	public void setIdCredor(Credores idCredor) {
		this.idCredor = idCredor;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idDocCredor != null ? idDocCredor.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof DocsCredores)) {
			return false;
		}
		DocsCredores other = (DocsCredores) object;
		if ((this.idDocCredor == null && other.idDocCredor != null) || (this.idDocCredor != null && !this.idDocCredor.equals(other.idDocCredor))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.DocsCredores[ idDocCredor=" + idDocCredor + " ]";
	}

}
