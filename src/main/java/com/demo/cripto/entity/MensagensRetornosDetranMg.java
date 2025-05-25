package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mensagens_retornos_detran_mg")
public class MensagensRetornosDetranMg implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_mensagem_retorno_detran_mg")
	private Integer idMensagemRetornoDetranMg;

	@Basic(optional = false)
	@Column(name = "nu_retorno")
	private Integer nuRetorno;

	@Basic(optional = false)
	@Column(name = "nu_retorno_send")
	private Integer nuRetornoSend;

	@Basic(optional = false)
	@Column(name = "ds_msg_retorno")
	private String dsMsgRetorno;

	public Integer getIdMensagemRetornoDetranMg() {
		return idMensagemRetornoDetranMg;
	}

	public void setIdMensagemRetornoDetranMg(Integer idMensagemRetornoDetranMg) {
		this.idMensagemRetornoDetranMg = idMensagemRetornoDetranMg;
	}

	public Integer getNuRetorno() {
		return nuRetorno;
	}

	public void setNuRetorno(Integer nuRetorno) {
		this.nuRetorno = nuRetorno;
	}

	public String getDsMsgRetorno() {
		return dsMsgRetorno;
	}

	public void setDsMsgRetorno(String dsMsgRetorno) {
		this.dsMsgRetorno = dsMsgRetorno;
	}

	public Integer getNuRetornoSend() {
		return nuRetornoSend;
	}

	public void setNuRetornoSend(Integer nuRetornoSend) {
		this.nuRetornoSend = nuRetornoSend;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.MensagensRetornosDetranMg[ idMensagemRetornoDetranMg=" + idMensagemRetornoDetranMg
				+ " ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMensagemRetornoDetranMg == null) ? 0 : idMensagemRetornoDetranMg.hashCode());
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
		MensagensRetornosDetranMg other = (MensagensRetornosDetranMg) obj;
		if (idMensagemRetornoDetranMg == null) {
			if (other.idMensagemRetornoDetranMg != null)
				return false;
		} else if (!idMensagemRetornoDetranMg.equals(other.idMensagemRetornoDetranMg))
			return false;
		return true;
	}

}
