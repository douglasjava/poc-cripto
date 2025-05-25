package com.demo.cripto.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

//@Entity
//@Table(name = "processo")
@Getter
@Setter
@EqualsAndHashCode
public class Processo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "id_processo")
	private Integer idProcesso;

	@Column(name = "num_processo")
	private Integer numProcesso;

	@Basic(optional = false)
	@Column(name = "dt_data_processo")
	@Temporal(TemporalType.DATE)
	private Date dataProcesso;

	@Column(name = "dt_processo")
	private StatusEnum statusProcesso;

	@Override
	public String toString() {
		return "montreal.rcf.entity.Processo[ idProcesso = " + idProcesso + " ]";
	}
}
