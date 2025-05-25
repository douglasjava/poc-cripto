package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tipo_operacao")
public class TipoOperacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_tipo_operacao")
	private Integer idTipoOperacao;

	@Basic(optional = false)
	@Column(name = "num_tipo_operacao")
	private String numTipoOperacao;

	@Basic(optional = false)
	@Column(name = "nm_tipo_operacao")
	private String nmTipoOperacao;

	public TipoOperacao() {
	}

	public TipoOperacao(Integer idTipoOperacao) {
		this.idTipoOperacao = idTipoOperacao;
	}

	public Integer getIdTipoOperacao() {
		return idTipoOperacao;
	}

	public void setIdTipoOperacao(Integer idTipoOperacao) {
		this.idTipoOperacao = idTipoOperacao;
	}

	public String getNumTipoOperacao() {
		return numTipoOperacao;
	}

	public void setNumTipoOperacao(String numTipoOperacao) {
		this.numTipoOperacao = numTipoOperacao;
	}

	public String getNmTipoOperacao() {
		return nmTipoOperacao;
	}

	public void setNmTipoOperacao(String nmTipoOperacao) {
		this.nmTipoOperacao = nmTipoOperacao;
	}

	@Override
	public String toString() {
		return "TipoOperacao [idTipoOperacao=" + idTipoOperacao + ", numTipoOperacao=" + numTipoOperacao + ", nmTipoOperacao=" + nmTipoOperacao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoOperacao == null) ? 0 : idTipoOperacao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoOperacao other = (TipoOperacao) obj;
		if (idTipoOperacao == null) {
			if (other.idTipoOperacao != null)
				return false;
		} else if (!idTipoOperacao.equals(other.idTipoOperacao))
			return false;
		return true;
	}

}
