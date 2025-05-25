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
@Embeddable
public class SeqServDetranPK implements Serializable {

	@Basic(optional = false)
	@Column(name = "dt_transacao")
	@Temporal(TemporalType.DATE)
	private Date dtTransacao;
	@Basic(optional = false)
	@Column(name = "cd_transacao")
	private int cdTransacao;
	@Basic(optional = false)
	@Column(name = "nu_sequencial")
	private int nuSequencial;
	@Basic(optional = false)
	@Column(name = "id_uf")
	private int idUf;

	public SeqServDetranPK() {
	}

	public SeqServDetranPK(Date dtTransacao, int cdTransacao, int nuSequencial, int idUf) {
		this.dtTransacao = dtTransacao;
		this.cdTransacao = cdTransacao;
		this.nuSequencial = nuSequencial;
		this.idUf = idUf;
	}

	public Date getDtTransacao() {
		return dtTransacao;
	}

	public void setDtTransacao(Date dtTransacao) {
		this.dtTransacao = dtTransacao;
	}

	public int getCdTransacao() {
		return cdTransacao;
	}

	public void setCdTransacao(int cdTransacao) {
		this.cdTransacao = cdTransacao;
	}

	public int getNuSequencial() {
		return nuSequencial;
	}

	public void setNuSequencial(int nuSequencial) {
		this.nuSequencial = nuSequencial;
	}

	public int getIdUf() {
		return idUf;
	}

	public void setIdUf(int idUf) {
		this.idUf = idUf;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (dtTransacao != null ? dtTransacao.hashCode() : 0);
		hash += (int) cdTransacao;
		hash += (int) nuSequencial;
		hash += (int) idUf;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof SeqServDetranPK)) {
			return false;
		}
		SeqServDetranPK other = (SeqServDetranPK) object;
		if ((this.dtTransacao == null && other.dtTransacao != null) || (this.dtTransacao != null && !this.dtTransacao.equals(other.dtTransacao))) {
			return false;
		}
		if (this.cdTransacao != other.cdTransacao) {
			return false;
		}
		if (this.nuSequencial != other.nuSequencial) {
			return false;
		}
		if (this.idUf != other.idUf) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.SeqServDetranPK[ dtTransacao=" + dtTransacao + ", cdTransacao=" + cdTransacao + ", nuSequencial=" + nuSequencial + ", idUf=" + idUf + " ]";
	}

}
