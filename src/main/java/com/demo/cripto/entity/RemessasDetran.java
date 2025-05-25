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
@Table(name = "remessas_detran")
@NamedQueries({ @NamedQuery(name = "RemessasDetran.findAll", query = "SELECT r FROM RemessasDetran r") })
public class RemessasDetran implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_remessa_detran")
	private Integer idRemessaDetran;

	@Basic(optional = false)
	@Column(name = "dt_envio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtEnvio;

	@Column(name = "dt_retorno")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtRetorno;

	@Column(name = "ds_retorno")
	private String dsRetorno;

	@Column(name = "in_retorno")
	private String inRetorno;

	@JoinColumn(name = "id_registro", referencedColumnName = "id_registro")
	@ManyToOne(optional = false)
	private Registros idRegistro;

	public RemessasDetran() {
	}

	public RemessasDetran(Integer idRemessaDetran) {
		this.idRemessaDetran = idRemessaDetran;
	}

	public RemessasDetran(Integer idRemessaDetran, Date dtEnvio) {
		this.idRemessaDetran = idRemessaDetran;
		this.dtEnvio = dtEnvio;
	}

	public Integer getIdRemessaDetran() {
		return idRemessaDetran;
	}

	public void setIdRemessaDetran(Integer idRemessaDetran) {
		this.idRemessaDetran = idRemessaDetran;
	}

	public Date getDtEnvio() {
		return dtEnvio;
	}

	public void setDtEnvio(Date dtEnvio) {
		this.dtEnvio = dtEnvio;
	}

	public Date getDtRetorno() {
		return dtRetorno;
	}

	public void setDtRetorno(Date dtRetorno) {
		this.dtRetorno = dtRetorno;
	}

	public String getDsRetorno() {
		return dsRetorno;
	}

	public void setDsRetorno(String dsRetorno) {
		this.dsRetorno = dsRetorno;
	}

	public String getInRetorno() {
		return inRetorno;
	}

	public void setInRetorno(String inRetorno) {
		this.inRetorno = inRetorno;
	}

	public Registros getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Registros idRegistro) {
		this.idRegistro = idRegistro;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idRemessaDetran != null ? idRemessaDetran.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RemessasDetran)) {
			return false;
		}
		RemessasDetran other = (RemessasDetran) object;
		if ((this.idRemessaDetran == null && other.idRemessaDetran != null) || (this.idRemessaDetran != null && !this.idRemessaDetran.equals(other.idRemessaDetran))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.RemessasDetran[ idRemessaDetran=" + idRemessaDetran + " ]";
	}

}
