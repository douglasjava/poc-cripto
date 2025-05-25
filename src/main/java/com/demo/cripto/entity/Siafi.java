package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author douglas.dias
 */
@Entity
@Table(name = "siafi")
public class Siafi implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_siafi")
	private Integer idSiafi;

	@Basic(optional = false)
	@Column(name = "nm_municipio")
	private String nmMunicipio;

	@Basic(optional = false)
	@Column(name = "uf")
	private String uf;

	@Basic(optional = false)
	@Column(name = "codigo_siafi")
	private String codigoSiafi;

	public Integer getIdSiafi() {
		return idSiafi;
	}

	public void setIdSiafi(Integer idSiafi) {
		this.idSiafi = idSiafi;
	}

	public String getNmMunicipio() {
		return nmMunicipio;
	}

	public void setNmMunicipio(String nmMunicipio) {
		this.nmMunicipio = nmMunicipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCodigoSiafi() {
		return codigoSiafi;
	}

	public void setCodigoSiafi(String codigoSiafi) {
		this.codigoSiafi = codigoSiafi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSiafi == null) ? 0 : idSiafi.hashCode());
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
		Siafi other = (Siafi) obj;
		if (idSiafi == null) {
			if (other.idSiafi != null)
				return false;
		} else if (!idSiafi.equals(other.idSiafi))
			return false;
		return true;
	}

}
