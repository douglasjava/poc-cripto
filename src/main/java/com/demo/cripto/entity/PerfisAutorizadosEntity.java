/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author alan.souza
 */
@Embeddable
public class PerfisAutorizadosEntity implements Serializable {

	private static final long serialVersionUID = 1L;

    @JoinColumn(name = "id_perfil_origem", referencedColumnName = "id_perfil")
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Perfis idPerfilOrigem;
    
    @JoinColumn(name = "id_perfil_autorizado", referencedColumnName = "id_perfil")
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Perfis idPerfilAutorizado;

	public PerfisAutorizadosEntity() {
		super();
	}

	public Perfis getIdPerfilOrigem() {
		return idPerfilOrigem;
	}

	public void setIdPerfilOrigem(Perfis idPerfilOrigem) {
		this.idPerfilOrigem = idPerfilOrigem;
	}

	public Perfis getIdPerfilAutorizado() {
		return idPerfilAutorizado;
	}

	public void setIdPerfilAutorizado(Perfis idPerfilAutorizado) {
		this.idPerfilAutorizado = idPerfilAutorizado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPerfilAutorizado == null) ? 0 : idPerfilAutorizado.hashCode());
		result = prime * result + ((idPerfilOrigem == null) ? 0 : idPerfilOrigem.hashCode());
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
		PerfisAutorizadosEntity other = (PerfisAutorizadosEntity) obj;
		if (idPerfilAutorizado == null) {
			if (other.idPerfilAutorizado != null)
				return false;
		} else if (!idPerfilAutorizado.equals(other.idPerfilAutorizado))
			return false;
		if (idPerfilOrigem == null) {
			if (other.idPerfilOrigem != null)
				return false;
		} else if (!idPerfilOrigem.equals(other.idPerfilOrigem))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PerfisAutorizadosEntity [idPerfilOrigem=" + idPerfilOrigem + ", idPerfilAutorizado="
				+ idPerfilAutorizado + "]";
	}


}
