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
@Table(name = "mensagens")
@NamedQueries({ @NamedQuery(name = "Mensagens.findAll", query = "SELECT m FROM Mensagens m") })
public class Mensagens implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_mensagem")
	private Integer idMensagem;

	@Basic(optional = false)
	@Column(name = "tp_mensagem")
	private Short tpMensagem;

	@Basic(optional = false)
	@Column(name = "dt_inicio")
	@Temporal(TemporalType.DATE)
	private Date dtInicio;

	@Basic(optional = false)
	@Column(name = "dt_fim")
	@Temporal(TemporalType.DATE)
	private Date dtFim;

	@Basic(optional = false)
	@Column(name = "ds_msg")
	private String dsMsg;

	@Basic(optional = false)
	@Column(name = "ds_titulo")
	private String dsTitulo;

	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;

	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;

	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@JoinTable(name = "dests_credor", joinColumns = { @JoinColumn(name = "id_mensagem", referencedColumnName = "id_mensagem") }, inverseJoinColumns = { @JoinColumn(name = "id_credor", referencedColumnName = "id_credor") })
	@ManyToMany
	private List<Credores> credoresList;

	@ManyToMany(mappedBy = "mensagensList")
	private List<Ufs> ufsList;

	public Mensagens() {
	}

	public Mensagens(Integer idMensagem) {
		this.idMensagem = idMensagem;
	}

	public Mensagens(Integer idMensagem, short tpMensagem, Date dtInicio, Date dtFim, String dsMsg, String dsTitulo, int idUsuarioAtualiza, Date dtUltAtualiza, boolean inAtivo) {
		this.idMensagem = idMensagem;
		this.tpMensagem = tpMensagem;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.dsMsg = dsMsg;
		this.dsTitulo = dsTitulo;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
		this.inAtivo = inAtivo;
	}

	public Integer getIdMensagem() {
		return idMensagem;
	}

	public void setIdMensagem(Integer idMensagem) {
		this.idMensagem = idMensagem;
	}

	public short getTpMensagem() {
		return tpMensagem;
	}

	public void setTpMensagem(short tpMensagem) {
		this.tpMensagem = tpMensagem;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getDtFim() {
		return dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	public String getDsMsg() {
		return dsMsg;
	}

	public void setDsMsg(String dsMsg) {
		this.dsMsg = dsMsg;
	}

	public String getDsTitulo() {
		return dsTitulo;
	}

	public void setDsTitulo(String dsTitulo) {
		this.dsTitulo = dsTitulo;
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

	public boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public List<Credores> getCredoresList() {
		return credoresList;
	}

	public void setCredoresList(List<Credores> credoresList) {
		this.credoresList = credoresList;
	}

	public List<Ufs> getUfsList() {
		return ufsList;
	}

	public void setUfsList(List<Ufs> ufsList) {
		this.ufsList = ufsList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idMensagem != null ? idMensagem.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Mensagens)) {
			return false;
		}
		Mensagens other = (Mensagens) object;
		if ((this.idMensagem == null && other.idMensagem != null) || (this.idMensagem != null && !this.idMensagem.equals(other.idMensagem))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Mensagens[ idMensagem=" + idMensagem + " ]";
	}

}
