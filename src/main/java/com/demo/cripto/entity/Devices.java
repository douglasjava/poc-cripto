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
@Table(name = "devices")
@NamedQueries({ @NamedQuery(name = "Devices.findAll", query = "SELECT d FROM Devices d") })
public class Devices implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_device")
	private Integer idDevice;
	@Column(name = "ds_uuid")
	private String dsUuid;
	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;
	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
	@ManyToOne
	private Usuarios idUsuario;

	public Devices() {
	}

	public Devices(Integer idDevice) {
		this.idDevice = idDevice;
	}

	public Devices(Integer idDevice, int idUsuarioAtualiza, Date dtUltAtualiza) {
		this.idDevice = idDevice;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Integer getIdDevice() {
		return idDevice;
	}

	public void setIdDevice(Integer idDevice) {
		this.idDevice = idDevice;
	}

	public String getDsUuid() {
		return dsUuid;
	}

	public void setDsUuid(String dsUuid) {
		this.dsUuid = dsUuid;
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

	public Usuarios getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuarios idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idDevice != null ? idDevice.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Devices)) {
			return false;
		}
		Devices other = (Devices) object;
		if ((this.idDevice == null && other.idDevice != null) || (this.idDevice != null && !this.idDevice.equals(other.idDevice))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Devices[ idDevice=" + idDevice + " ]";
	}

}
