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
@Table(name = "arqs_carga")
@NamedQueries({ @NamedQuery(name = "ArqsCarga.findAll", query = "SELECT a FROM ArqsCarga a") })
public class ArqsCarga implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_arq_carga")
	private Integer idArqCarga;

	@Basic(optional = false)
	@Column(name = "nm_arq_carga")
	private String nmArqCarga;

	@Column(name = "qt_regs")
	private Integer qtRegs;

	@Column(name = "qt_regs_erro")
	private Integer qtRegsErro;

	@Column(name = "tp_arquivo")
	private Integer tpArquivo;

	@Column(name = "tp_doc_contrato")
	private Integer tpDocContrato;

	@Basic(optional = false)
	@Column(name = "in_situacao", columnDefinition = "NUMERIC")
	private Short inSituacao;

	@JoinColumn(name = "id_remessa", referencedColumnName = "id_remessa")
	@ManyToOne(optional = false)
	private Remessas idRemessa;

	@OneToMany(mappedBy = "idArqCarga")
	private List<LogRegsCargas> logRegsCargasList;

	public ArqsCarga() {
	}

	public ArqsCarga(Integer idArqCarga) {
		this.idArqCarga = idArqCarga;
	}

	public ArqsCarga(Integer idArqCarga, String nmArqCarga, short inSituacao) {
		this.idArqCarga = idArqCarga;
		this.nmArqCarga = nmArqCarga;
		this.inSituacao = inSituacao;
	}

	public Integer getIdArqCarga() {
		return idArqCarga;
	}

	public void setIdArqCarga(Integer idArqCarga) {
		this.idArqCarga = idArqCarga;
	}

	public String getNmArqCarga() {
		return nmArqCarga;
	}

	public void setNmArqCarga(String nmArqCarga) {
		this.nmArqCarga = nmArqCarga;
	}

	public Integer getQtRegs() {
		return qtRegs;
	}

	public void setQtRegs(Integer qtRegs) {
		this.qtRegs = qtRegs;
	}

	public Integer getQtRegsErro() {
		return qtRegsErro;
	}

	public void setQtRegsErro(Integer qtRegsErro) {
		this.qtRegsErro = qtRegsErro;
	}

	public Integer getTpArquivo() {
		return tpArquivo;
	}

	public void setTpArquivo(Integer tpArquivo) {
		this.tpArquivo = tpArquivo;
	}

	public Integer getTpDocContrato() {
		return tpDocContrato;
	}

	public void setTpDocContrato(Integer tpDocContrato) {
		this.tpDocContrato = tpDocContrato;
	}

	public short getInSituacao() {
		return inSituacao;
	}

	public void setInSituacao(short inSituacao) {
		this.inSituacao = inSituacao;
	}

	public Remessas getIdRemessa() {
		return idRemessa;
	}

	public void setIdRemessa(Remessas idRemessa) {
		this.idRemessa = idRemessa;
	}

	public List<LogRegsCargas> getLogRegsCargasList() {
		return logRegsCargasList;
	}

	public void setLogRegsCargasList(List<LogRegsCargas> logRegsCargasList) {
		this.logRegsCargasList = logRegsCargasList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idArqCarga != null ? idArqCarga.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ArqsCarga)) {
			return false;
		}
		ArqsCarga other = (ArqsCarga) object;
		if ((this.idArqCarga == null && other.idArqCarga != null) || (this.idArqCarga != null && !this.idArqCarga.equals(other.idArqCarga))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.ArqsCarga[ idArqCarga=" + idArqCarga + " ]";
	}

}
