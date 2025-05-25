package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "cadastro_processo")
public class CadastroProcesso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cadastro_processo")
	private Integer idCadastroProcesso;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_inicio_processamento")
	private Date dataInicioProcessamento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_fim_processamento")
	private Date dataFimProcessamento;

	@Enumerated(EnumType.STRING)
	@Column(name = "status_processo")
	private StatusProcessoEnum statusProcesso;

	public Integer getIdCadastroProcesso() {
		return idCadastroProcesso;
	}

	public void setIdCadastroProcesso(Integer idCadastroProcesso) {
		this.idCadastroProcesso = idCadastroProcesso;
	}

	public Date getDataInicioProcessamento() {
		return dataInicioProcessamento;
	}

	public void setDataInicioProcessamento(Date dataInicioProcessamento) {
		this.dataInicioProcessamento = dataInicioProcessamento;
	}

	public Date getDataFimProcessamento() {
		return dataFimProcessamento;
	}

	public void setDataFimProcessamento(Date dataFimProcessamento) {
		this.dataFimProcessamento = dataFimProcessamento;
	}

	public StatusProcessoEnum getStatusProcesso() {
		return statusProcesso;
	}

	public void setStatusProcesso(StatusProcessoEnum statusProcesso) {
		this.statusProcesso = statusProcesso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCadastroProcesso == null) ? 0 : idCadastroProcesso.hashCode());
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
		CadastroProcesso other = (CadastroProcesso) obj;
		if (idCadastroProcesso == null) {
			if (other.idCadastroProcesso != null)
				return false;
		} else if (!idCadastroProcesso.equals(other.idCadastroProcesso))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CadastroProcesso [idCadastroProcesso=" + idCadastroProcesso + ", dataInicioProcessamento=" + dataInicioProcessamento + ", dataFimProcessamento=" + dataFimProcessamento + ", statusProcesso=" + statusProcesso + "]";
	}

}
