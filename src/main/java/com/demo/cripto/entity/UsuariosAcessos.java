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
@Table(name = "usuarios_acessos")
@NamedQueries({ @NamedQuery(name = "UsuariosAcessos.findAll", query = "SELECT u FROM UsuariosAcessos u") })
public class UsuariosAcessos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_usuario_acesso")
	private Long idUsuarioAcesso;

	@Basic(optional = false)
	@Column(name = "dt_acesso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtAcesso;

	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
	@ManyToOne(optional = false)
	private Usuarios usuario;

	public UsuariosAcessos() {
	}

	public UsuariosAcessos(Long idUsuarioAcesso) {
		this.idUsuarioAcesso = idUsuarioAcesso;
	}

	public UsuariosAcessos(Long idUsuarioAcesso, Date dtAcesso) {
		this.idUsuarioAcesso = idUsuarioAcesso;
		this.dtAcesso = dtAcesso;
	}

	public Long getIdUsuarioAcesso() {
		return idUsuarioAcesso;
	}

	public void setIdUsuarioAcesso(Long idUsuarioAcesso) {
		this.idUsuarioAcesso = idUsuarioAcesso;
	}

	public Date getDtAcesso() {
		return dtAcesso;
	}

	public void setDtAcesso(Date dtAcesso) {
		this.dtAcesso = dtAcesso;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idUsuarioAcesso != null ? idUsuarioAcesso.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof UsuariosAcessos)) {
			return false;
		}
		UsuariosAcessos other = (UsuariosAcessos) object;
		if ((this.idUsuarioAcesso == null && other.idUsuarioAcesso != null) || (this.idUsuarioAcesso != null && !this.idUsuarioAcesso.equals(other.idUsuarioAcesso))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.UsuariosAcessos[ idUsuarioAcesso=" + idUsuarioAcesso + " ]";
	}

}
