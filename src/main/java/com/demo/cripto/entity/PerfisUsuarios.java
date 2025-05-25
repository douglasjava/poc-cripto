/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "perfis_usuarios")
@NamedQueries({ @NamedQuery(name = "PerfisUsuarios.findAll", query = "SELECT p FROM PerfisUsuarios p") })
public class PerfisUsuarios implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_perfil_usuario")
	private Integer idPerfilUsuario;
	
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date dtUltAtualiza;
	
	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;
	
	@JoinColumn(name = "id_perfil", referencedColumnName = "id_perfil")
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	private Perfis idPerfil;
	
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
	@ManyToOne(optional = false, cascade = CascadeType.MERGE)
	private Usuarios idUsuario;

	public PerfisUsuarios() {
	}

	public PerfisUsuarios(Integer idPerfilUsuario) {
		this.idPerfilUsuario = idPerfilUsuario;
	}

	public PerfisUsuarios(Integer idPerfilUsuario, int idUsuarioAtualiza) {
		this.idPerfilUsuario = idPerfilUsuario;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Integer getIdPerfilUsuario() {
		return idPerfilUsuario;
	}

	public void setIdPerfilUsuario(Integer idPerfilUsuario) {
		this.idPerfilUsuario = idPerfilUsuario;
	}

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public int getIdUsuarioAtualiza() {
		return idUsuarioAtualiza;
	}

	public void setIdUsuarioAtualiza(int idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Perfis getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Perfis idPerfil) {
		this.idPerfil = idPerfil;
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
		hash += (idPerfilUsuario != null ? idPerfilUsuario.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PerfisUsuarios)) {
			return false;
		}
		PerfisUsuarios other = (PerfisUsuarios) object;
		if ((this.idPerfilUsuario == null && other.idPerfilUsuario != null) || (this.idPerfilUsuario != null && !this.idPerfilUsuario.equals(other.idPerfilUsuario))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.PerfisUsuarios[ idPerfilUsuario=" + idPerfilUsuario + " ]";
	}

}
