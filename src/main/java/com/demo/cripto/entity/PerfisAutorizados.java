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
@Entity
@Table(name = "perfis_autorizados")
@NamedQueries({
    @NamedQuery(name = "PerfisAutorizados.findAll", query = "SELECT pa FROM PerfisAutorizados pa")})
public class PerfisAutorizados implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private PerfisAutorizadosEntity data = new PerfisAutorizadosEntity();

    public PerfisAutorizados() {
    }

	public PerfisAutorizados(PerfisAutorizadosEntity data) {
		super();
		this.data = data;
	}

	public PerfisAutorizadosEntity getPerfisAutorizados() {
		return data;
	}

	public PerfisAutorizadosEntity getData() {
		return data;
	}

	public void setData(PerfisAutorizadosEntity data) {
		this.data = data;
	}
}
