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
@Table(name = "retornos_bancos")
@NamedQueries({ @NamedQuery(name = "RetornosBancos.findAll", query = "SELECT r FROM RetornosBancos r") })
public class RetornosBancos implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_retorno_banco")
	private Long idRetornoBanco;
	@Basic(optional = false)
	@Column(name = "nu_aviso_credito", columnDefinition = "NUMERIC")
	private long nuAvisoCredito;
	@Basic(optional = false)
	@Column(name = "dt_credito_banco")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtCreditoBanco;
	@Basic(optional = false)
	@Column(name = "nm_arquivo_retorno")
	private String nmArquivoRetorno;
	@Basic(optional = false)
	@Column(name = "dt_retorno_recepcao")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtRetornoRecepcao;
	@Basic(optional = false)
	@Column(name = "dt_gravacao_banco")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtGravacaoBanco;
	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private int idUsuarioAtualiza;
	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;
	@OneToMany(mappedBy = "idRetornoBanco")
	private List<BoletosNfs> boletosNfsList;

	public RetornosBancos() {
	}

	public RetornosBancos(Long idRetornoBanco) {
		this.idRetornoBanco = idRetornoBanco;
	}

	public RetornosBancos(Long idRetornoBanco, long nuAvisoCredito, Date dtCreditoBanco, String nmArquivoRetorno, Date dtRetornoRecepcao, Date dtGravacaoBanco, int idUsuarioAtualiza, Date dtUltAtualiza) {
		this.idRetornoBanco = idRetornoBanco;
		this.nuAvisoCredito = nuAvisoCredito;
		this.dtCreditoBanco = dtCreditoBanco;
		this.nmArquivoRetorno = nmArquivoRetorno;
		this.dtRetornoRecepcao = dtRetornoRecepcao;
		this.dtGravacaoBanco = dtGravacaoBanco;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Long getIdRetornoBanco() {
		return idRetornoBanco;
	}

	public void setIdRetornoBanco(Long idRetornoBanco) {
		this.idRetornoBanco = idRetornoBanco;
	}

	public long getNuAvisoCredito() {
		return nuAvisoCredito;
	}

	public void setNuAvisoCredito(long nuAvisoCredito) {
		this.nuAvisoCredito = nuAvisoCredito;
	}

	public Date getDtCreditoBanco() {
		return dtCreditoBanco;
	}

	public void setDtCreditoBanco(Date dtCreditoBanco) {
		this.dtCreditoBanco = dtCreditoBanco;
	}

	public String getNmArquivoRetorno() {
		return nmArquivoRetorno;
	}

	public void setNmArquivoRetorno(String nmArquivoRetorno) {
		this.nmArquivoRetorno = nmArquivoRetorno;
	}

	public Date getDtRetornoRecepcao() {
		return dtRetornoRecepcao;
	}

	public void setDtRetornoRecepcao(Date dtRetornoRecepcao) {
		this.dtRetornoRecepcao = dtRetornoRecepcao;
	}

	public Date getDtGravacaoBanco() {
		return dtGravacaoBanco;
	}

	public void setDtGravacaoBanco(Date dtGravacaoBanco) {
		this.dtGravacaoBanco = dtGravacaoBanco;
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

	public List<BoletosNfs> getBoletosNfsList() {
		return boletosNfsList;
	}

	public void setBoletosNfsList(List<BoletosNfs> boletosNfsList) {
		this.boletosNfsList = boletosNfsList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idRetornoBanco != null ? idRetornoBanco.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RetornosBancos)) {
			return false;
		}
		RetornosBancos other = (RetornosBancos) object;
		if ((this.idRetornoBanco == null && other.idRetornoBanco != null) || (this.idRetornoBanco != null && !this.idRetornoBanco.equals(other.idRetornoBanco))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.RetornosBancos[ idRetornoBanco=" + idRetornoBanco + " ]";
	}

}
