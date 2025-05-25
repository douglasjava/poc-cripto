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
@Table(name = "seq_serv_detran")
@NamedQueries({ @NamedQuery(name = "SeqServDetran.findAll", query = "SELECT s FROM SeqServDetran s") })
public class SeqServDetran implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected SeqServDetranPK seqServDetranPK;
	@JoinColumn(name = "id_uf", referencedColumnName = "id_uf", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Ufs ufs;

	public SeqServDetran() {
	}

	public SeqServDetran(SeqServDetranPK seqServDetranPK) {
		this.seqServDetranPK = seqServDetranPK;
	}

	public SeqServDetran(Date dtTransacao, int cdTransacao, int nuSequencial, int idUf) {
		this.seqServDetranPK = new SeqServDetranPK(dtTransacao, cdTransacao, nuSequencial, idUf);
	}

	public SeqServDetranPK getSeqServDetranPK() {
		return seqServDetranPK;
	}

	public void setSeqServDetranPK(SeqServDetranPK seqServDetranPK) {
		this.seqServDetranPK = seqServDetranPK;
	}

	public Ufs getUfs() {
		return ufs;
	}

	public void setUfs(Ufs ufs) {
		this.ufs = ufs;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (seqServDetranPK != null ? seqServDetranPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof SeqServDetran)) {
			return false;
		}
		SeqServDetran other = (SeqServDetran) object;
		if ((this.seqServDetranPK == null && other.seqServDetranPK != null) || (this.seqServDetranPK != null && !this.seqServDetranPK.equals(other.seqServDetranPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.SeqServDetran[ seqServDetranPK=" + seqServDetranPK + " ]";
	}

}
