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
@Table(name = "notificacoes")
@NamedQueries({ @NamedQuery(name = "Notificacoes.findAll", query = "SELECT n FROM Notificacoes n") })
public class Notificacoes implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_notificacao")
	private Integer idNotificacao;
	@Column(name = "ds_msg")
	private String dsMsg;
	@Column(name = "ds_titulo")
	private String dsTitulo;
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;
	@Column(name = "in_ativo")
	private Boolean inAtivo;
	@Basic(optional = false)
	@Column(name = "dt_envio")
	@Temporal(TemporalType.DATE)
	private Date dtEnvio;
	@JoinColumn(name = "id_destinatario", referencedColumnName = "id_usuario")
	@ManyToOne
	private Usuarios idDestinatario;

	public Notificacoes() {
	}

	public Notificacoes(Integer idNotificacao) {
		this.idNotificacao = idNotificacao;
	}

	public Notificacoes(Integer idNotificacao, Date dtEnvio) {
		this.idNotificacao = idNotificacao;
		this.dtEnvio = dtEnvio;
	}

	public Integer getIdNotificacao() {
		return idNotificacao;
	}

	public void setIdNotificacao(Integer idNotificacao) {
		this.idNotificacao = idNotificacao;
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

	public Integer getIdUsuarioAtualiza() {
		return idUsuarioAtualiza;
	}

	public void setIdUsuarioAtualiza(Integer idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public Date getDtEnvio() {
		return dtEnvio;
	}

	public void setDtEnvio(Date dtEnvio) {
		this.dtEnvio = dtEnvio;
	}

	public Usuarios getIdDestinatario() {
		return idDestinatario;
	}

	public void setIdDestinatario(Usuarios idDestinatario) {
		this.idDestinatario = idDestinatario;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idNotificacao != null ? idNotificacao.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Notificacoes)) {
			return false;
		}
		Notificacoes other = (Notificacoes) object;
		if ((this.idNotificacao == null && other.idNotificacao != null) || (this.idNotificacao != null && !this.idNotificacao.equals(other.idNotificacao))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Notificacoes[ idNotificacao=" + idNotificacao + " ]";
	}

}
