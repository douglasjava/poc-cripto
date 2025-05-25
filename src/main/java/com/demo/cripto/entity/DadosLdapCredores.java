package com.demo.cripto.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "dados_ldap_credores")
@NamedQueries({ @NamedQuery(name = "DadosLdapCredores.findAll", query = "SELECT d FROM DadosLdapCredores d") })
@EntityListeners(AuditingEntityListener.class)
public class DadosLdapCredores implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_dados_ldap_credor")
	private Integer idDadosLdapCredores;


	@Basic(optional = false)
	@Column(name = "nm_manager_dn")
	private String nmManagerDn;

	@Column(name = "nm_manager_password")
	private String nmManagerPassword;

	@Column(name = "nm_user_search_filter")
	private String nmUserSearchFilter;

	@Column(name = "nm_search_base")
	private String nmSearchBase;

	@Column(name = "nm_ldap_url")
	private String nmLdapUrl;

	@JoinColumn(name = "id_credor", referencedColumnName = "id_credor")
	@OneToOne
	private Credores credores;

	public Integer getIdDadosLdapCredores() {
		return idDadosLdapCredores;
	}

	public void setIdDadosLdapCredores(Integer idDadosLdapCredores) {
		this.idDadosLdapCredores = idDadosLdapCredores;
	}

	public String getNmManagerDn() {
		return nmManagerDn;
	}

	public void setNmManagerDn(String nmManagerDn) {
		this.nmManagerDn = nmManagerDn;
	}

	public String getNmManagerPassword() {
		return nmManagerPassword;
	}

	public void setNmManagerPassword(String nmManagerPassword) {
		this.nmManagerPassword = nmManagerPassword;
	}

	public String getNmUserSearchFilter() {
		return nmUserSearchFilter;
	}

	public void setNmUserSearchFilter(String nmUserSearchFilter) {
		this.nmUserSearchFilter = nmUserSearchFilter;
	}

	public String getNmSearchBase() {
		return nmSearchBase;
	}

	public void setNmSearchBase(String nmSearchBase) {
		this.nmSearchBase = nmSearchBase;
	}

	public String getNmLdapUrl() {
		return nmLdapUrl;
	}

	public void setNmLdapUrl(String nmLdapUrl) {
		this.nmLdapUrl = nmLdapUrl;
	}

	public Credores getCredores() {
		return credores;
	}

	public void setCredores(Credores credores) {
		this.credores = credores;
	}

	@Override
	public String toString() {
		return "DadosLdapCredores [nmManagerDn=" + nmManagerDn + ", nmManagerPassword=" + nmManagerPassword + ", nmUserSearchFilter=" + nmUserSearchFilter + ", nmSearchBase=" + nmSearchBase
				+ ", nmLdapUrl=" + nmLdapUrl + ", credores=" + credores + "]";
	}


}