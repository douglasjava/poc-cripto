/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "dashboards")
@NamedQueries({ @NamedQuery(name = "Dashboards.findAll", query = "SELECT d FROM Dashboards d") })
public class Dashboards implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_dashboard")
	private Long idDashboard;

	@Basic(optional = false)
	@Column(name = "tp_dashboard")
	private Integer tpDashboard;

	@Basic(optional = false)
	@Column(name = "dt_dashboard")
	@Temporal(TemporalType.DATE)
	private Date dtDashboard;

	@Basic(optional = false)
	@Column(name = "qt_itens")
	private Integer qtItens;

	@Basic(optional = false)
	@Column(name = "vl_itens")
	private BigDecimal vlItens;

	@JoinColumn(name = "id_credor", referencedColumnName = "id_credor")
	@ManyToOne(optional = false)
	private Credores idCredor;

	public Dashboards() {
	}

	public Dashboards(Long idDashboard) {
		this.idDashboard = idDashboard;
	}

	public Dashboards(Long idDashboard, int tpDashboard, Date dtDashboard, int qtItens, BigDecimal vlItens) {
		this.idDashboard = idDashboard;
		this.tpDashboard = tpDashboard;
		this.dtDashboard = dtDashboard;
		this.qtItens = qtItens;
		this.vlItens = vlItens;
	}

	public Long getIdDashboard() {
		return idDashboard;
	}

	public void setIdDashboard(Long idDashboard) {
		this.idDashboard = idDashboard;
	}

	public int getTpDashboard() {
		return tpDashboard;
	}

	public void setTpDashboard(int tpDashboard) {
		this.tpDashboard = tpDashboard;
	}

	public Date getDtDashboard() {
		return dtDashboard;
	}

	public void setDtDashboard(Date dtDashboard) {
		this.dtDashboard = dtDashboard;
	}

	public int getQtItens() {
		return qtItens;
	}

	public void setQtItens(int qtItens) {
		this.qtItens = qtItens;
	}

	public BigDecimal getVlItens() {
		return vlItens;
	}

	public void setVlItens(BigDecimal vlItens) {
		this.vlItens = vlItens;
	}

	public Credores getIdCredor() {
		return idCredor;
	}

	public void setIdCredor(Credores idCredor) {
		this.idCredor = idCredor;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idDashboard != null ? idDashboard.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Dashboards)) {
			return false;
		}
		Dashboards other = (Dashboards) object;
		if ((this.idDashboard == null && other.idDashboard != null) || (this.idDashboard != null && !this.idDashboard.equals(other.idDashboard))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Dashboards[ idDashboard=" + idDashboard + " ]";
	}

}
