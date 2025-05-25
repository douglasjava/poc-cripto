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
@Table(name = "remessas_bancos")
@NamedQueries({ @NamedQuery(name = "RemessasBancos.findAll", query = "SELECT r FROM RemessasBancos r") })
public class RemessasBancos implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_remessa_banco")
	private Long idRemessaBanco;
	@Basic(optional = false)
	@Column(name = "nu_remessa_banco", columnDefinition = "NUMERIC")
	private long nuRemessaBanco;
	@Basic(optional = false)
	@Column(name = "dt_remessa_banco")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtRemessaBanco;
	@Basic(optional = false)
	@Column(name = "nm_arquivo_remessa")
	private String nmArquivoRemessa;
	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private int idUsuarioAtualiza;
	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;
	@OneToMany(mappedBy = "idRemessaBanco")
	private List<BoletosNfs> boletosNfsList;
	@OneToMany(mappedBy = "idRemessaBancoOrigem")
	private List<RemessasBancos> remessasBancosList;
	@JoinColumn(name = "id_remessa_banco_origem", referencedColumnName = "id_remessa_banco")
	@ManyToOne
	private RemessasBancos idRemessaBancoOrigem;

	public RemessasBancos() {
	}

	public RemessasBancos(Long idRemessaBanco) {
		this.idRemessaBanco = idRemessaBanco;
	}

	public RemessasBancos(Long idRemessaBanco, long nuRemessaBanco, Date dtRemessaBanco, String nmArquivoRemessa, int idUsuarioAtualiza, Date dtUltAtualiza) {
		this.idRemessaBanco = idRemessaBanco;
		this.nuRemessaBanco = nuRemessaBanco;
		this.dtRemessaBanco = dtRemessaBanco;
		this.nmArquivoRemessa = nmArquivoRemessa;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Long getIdRemessaBanco() {
		return idRemessaBanco;
	}

	public void setIdRemessaBanco(Long idRemessaBanco) {
		this.idRemessaBanco = idRemessaBanco;
	}

	public long getNuRemessaBanco() {
		return nuRemessaBanco;
	}

	public void setNuRemessaBanco(long nuRemessaBanco) {
		this.nuRemessaBanco = nuRemessaBanco;
	}

	public Date getDtRemessaBanco() {
		return dtRemessaBanco;
	}

	public void setDtRemessaBanco(Date dtRemessaBanco) {
		this.dtRemessaBanco = dtRemessaBanco;
	}

	public String getNmArquivoRemessa() {
		return nmArquivoRemessa;
	}

	public void setNmArquivoRemessa(String nmArquivoRemessa) {
		this.nmArquivoRemessa = nmArquivoRemessa;
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

	public List<RemessasBancos> getRemessasBancosList() {
		return remessasBancosList;
	}

	public void setRemessasBancosList(List<RemessasBancos> remessasBancosList) {
		this.remessasBancosList = remessasBancosList;
	}

	public RemessasBancos getIdRemessaBancoOrigem() {
		return idRemessaBancoOrigem;
	}

	public void setIdRemessaBancoOrigem(RemessasBancos idRemessaBancoOrigem) {
		this.idRemessaBancoOrigem = idRemessaBancoOrigem;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idRemessaBanco != null ? idRemessaBanco.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RemessasBancos)) {
			return false;
		}
		RemessasBancos other = (RemessasBancos) object;
		if ((this.idRemessaBanco == null && other.idRemessaBanco != null) || (this.idRemessaBanco != null && !this.idRemessaBanco.equals(other.idRemessaBanco))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.RemessasBancos[ idRemessaBanco=" + idRemessaBanco + " ]";
	}

}
