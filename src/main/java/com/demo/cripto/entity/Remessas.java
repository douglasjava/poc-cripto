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
@Table(name = "remessas")
@NamedQueries({ @NamedQuery(name = "Remessas.findAll", query = "SELECT r FROM Remessas r") })
public class Remessas implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_remessa")
	private Integer idRemessa;

	@Basic(optional = false)
	@Column(name = "dt_remessa")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtRemessa;

	@Column(name = "qt_arqs_contrato")
	private Integer qtArqsContrato;

	@Column(name = "qt_arqs_imagem")
	private Integer qtArqsImagem;

	@Column(name = "in_cdigital")
	private Boolean inCdigital;

	@Basic(optional = false)
	@Column(name = "in_situacao", columnDefinition = "NUMERIC")
	private Short inSituacao;

	@Column(name = "tp_origem")
	private Integer tpOrigem;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idRemessa", fetch = FetchType.EAGER)
	private List<ArqsCarga> arqsCargaList;

	@JoinColumn(name = "id_credor", referencedColumnName = "id_credor")
	@ManyToOne(optional = true)
	private Credores idCredor;

	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
	@ManyToOne(optional = false)
	private Usuarios idUsuario;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "situacao_comprovante")
	private SituacaoComprovanteEnum situacaoComprovante;

	public Remessas() {
	}

	public Remessas(Integer idRemessa) {
		this.idRemessa = idRemessa;
	}

	public Remessas(Integer idRemessa, Date dtRemessa, short inSituacao) {
		this.idRemessa = idRemessa;
		this.dtRemessa = dtRemessa;
		this.inSituacao = inSituacao;
	}

	public Integer getIdRemessa() {
		return idRemessa;
	}

	public void setIdRemessa(Integer idRemessa) {
		this.idRemessa = idRemessa;
	}

	public Date getDtRemessa() {
		return dtRemessa;
	}

	public void setDtRemessa(Date dtRemessa) {
		this.dtRemessa = dtRemessa;
	}

	public Integer getQtArqsContrato() {
		return qtArqsContrato;
	}

	public void setQtArqsContrato(Integer qtArqsContrato) {
		this.qtArqsContrato = qtArqsContrato;
	}

	public Integer getQtArqsImagem() {
		return qtArqsImagem;
	}

	public void setQtArqsImagem(Integer qtArqsImagem) {
		this.qtArqsImagem = qtArqsImagem;
	}

	public Boolean getInCdigital() {
		return inCdigital;
	}

	public void setInCdigital(Boolean inCdigital) {
		this.inCdigital = inCdigital;
	}

	public short getInSituacao() {
		return inSituacao;
	}

	public void setInSituacao(short inSituacao) {
		this.inSituacao = inSituacao;
	}

	public Integer getTpOrigem() {
		return tpOrigem;
	}

	public void setTpOrigem(Integer tpOrigem) {
		this.tpOrigem = tpOrigem;
	}

	public List<ArqsCarga> getArqsCargaList() {
		return arqsCargaList;
	}

	public void setArqsCargaList(List<ArqsCarga> arqsCargaList) {
		this.arqsCargaList = arqsCargaList;
	}

	public Credores getIdCredor() {
		return idCredor;
	}

	public void setIdCredor(Credores idCredor) {
		this.idCredor = idCredor;
	}

	public Usuarios getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuarios idUsuario) {
		this.idUsuario = idUsuario;
	}

	public SituacaoComprovanteEnum getSituacaoComprovante() {
		return situacaoComprovante;
	}

	public void setSituacaoComprovante(SituacaoComprovanteEnum situacaoComprovante) {
		this.situacaoComprovante = situacaoComprovante;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idRemessa != null ? idRemessa.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Remessas)) {
			return false;
		}
		Remessas other = (Remessas) object;
		if ((this.idRemessa == null && other.idRemessa != null) || (this.idRemessa != null && !this.idRemessa.equals(other.idRemessa))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Remessas[ idRemessa=" + idRemessa + " ]";
	}

}
