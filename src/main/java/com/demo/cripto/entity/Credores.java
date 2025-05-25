/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "credores")
@NamedQueries({ @NamedQuery(name = "Credores.findAll", query = "SELECT c FROM Credores c") })
public class Credores implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_credor")
	private Integer idCredor;

	@Basic(optional = false)
	@Column(name = "tp_credor", columnDefinition = "NUMERIC")
	private Short tpCredor;

	@Column(name = "nu_cnpj", columnDefinition = "bpchar")
	private String nuCnpj;

	@Column(name = "nu_cpf", columnDefinition = "bpchar")
	private String nuCpf;

	@Basic(optional = false)
	@Column(name = "nm_credor")
	private String nmCredor;

	@Basic(optional = false)
	@Column(name = "ds_email")
	private String dsEmail;

	@Column(name = "nu_ddd_1", columnDefinition = "NUMERIC")
	private Short nuDdd1;

	@Column(name = "nu_telefone_1", columnDefinition = "NUMERIC")
	private Long nuTelefone1;

	@Column(name = "nu_ddd_2", columnDefinition = "NUMERIC")
	private Short nuDdd2;

	@Column(name = "nu_telefone_2", columnDefinition = "NUMERIC")
	private Long nuTelefone2;

	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;

	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Column(name = "nu_ddi_1", columnDefinition = "NUMERIC")
	private Integer nuDdi1;

	@Column(name = "nu_ddi_2", columnDefinition = "NUMERIC")
	private Integer nuDdi2;

	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;

	@Column(name = "cd_credencial")
	private String cdCredencial;

	@Column(name = "dt_vigencia_ini")
	@Temporal(TemporalType.DATE)
	private Date dtVigenciaIni;

	@Column(name = "dt_vigencia_fim")
	@Temporal(TemporalType.DATE)
	private Date dtVigenciaFim;

	@Column(name = "nm_funcao")
	private String nmFuncao;

	@ManyToMany(mappedBy = "credoresList", fetch = FetchType.LAZY)
	private List<Mensagens> mensagensList;

	@OneToMany(mappedBy = "idCredor", fetch = FetchType.LAZY)
	private List<Registros> registrosList;

	@OneToMany(mappedBy = "idCredor")
	private List<Usuarios> usuariosList;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idCredor")
	private List<Dashboards> dashboardsList;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idCredor")
	private List<DocsCredores> docsCredoresList;

	@OneToMany(mappedBy = "idCredor")
	private List<NotasFiscais> notasFiscaisList;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idCredor")
	private List<ItensNotasFiscais> itensNotasFiscaisList;

	@JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
	@ManyToOne(optional = false, cascade = { CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH })
	private Enderecos endereco;

	@JoinColumn(name = "id_periodo_fatura", referencedColumnName = "id_periodo_fatura")
	@ManyToOne
	private PeriodosFaturas idPeriodoFatura;

	@JoinColumn(name = "id_usuario_resp", referencedColumnName = "id_usuario")
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	private Usuarios idUsuarioResp;

	@OneToMany(mappedBy = "idCredor", fetch = FetchType.LAZY)
	private List<Remessas> remessasList;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "credores")
	private DadosLdapCredores dadosLdapCredores;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idCredor")
	private List<Cobertura> coberturas;
	
	
	public Credores() {
	}

	public Credores(Integer idCredor) {
		this.idCredor = idCredor;
	}

	public Credores(Integer idCredor, Short tpCredor, String nmCredor, String dsEmail, Date dtUltAtualiza, Boolean inAtivo, Integer idUsuarioAtualiza) {
		this.idCredor = idCredor;
		this.tpCredor = tpCredor;
		this.nmCredor = nmCredor;
		this.dsEmail = dsEmail;
		this.dtUltAtualiza = dtUltAtualiza;
		this.inAtivo = inAtivo;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Integer getIdCredor() {
		return idCredor;
	}

	public void setIdCredor(Integer idCredor) {
		this.idCredor = idCredor;
	}

	public Short getTpCredor() {
		return tpCredor;
	}

	public void setTpCredor(Short tpCredor) {
		this.tpCredor = tpCredor;
	}

	public String getNuCnpj() {
		return nuCnpj;
	}

	public void setNuCnpj(String nuCnpj) {
		this.nuCnpj = nuCnpj;
	}

	public String getNuCpf() {
		return nuCpf;
	}

	public void setNuCpf(String nuCpf) {
		this.nuCpf = nuCpf;
	}

	public String getNmCredor() {
		return nmCredor;
	}

	public void setNmCredor(String nmCredor) {
		this.nmCredor = nmCredor;
	}

	public String getDsEmail() {
		return dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}

	public Short getNuDdd1() {
		return nuDdd1;
	}

	public void setNuDdd1(Short nuDdd1) {
		this.nuDdd1 = nuDdd1;
	}

	public Long getNuTelefone1() {
		return nuTelefone1;
	}

	public void setNuTelefone1(Long nuTelefone1) {
		this.nuTelefone1 = nuTelefone1;
	}

	public Short getNuDdd2() {
		return nuDdd2;
	}

	public void setNuDdd2(Short nuDdd2) {
		this.nuDdd2 = nuDdd2;
	}

	public Long getNuTelefone2() {
		return nuTelefone2;
	}

	public void setNuTelefone2(Long nuTelefone2) {
		this.nuTelefone2 = nuTelefone2;
	}

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public Integer getNuDdi1() {
		return nuDdi1;
	}

	public void setNuDdi1(Integer nuDdi1) {
		this.nuDdi1 = nuDdi1;
	}

	public Integer getNuDdi2() {
		return nuDdi2;
	}

	public void setNuDdi2(Integer nuDdi2) {
		this.nuDdi2 = nuDdi2;
	}

	public Integer getIdUsuarioAtualiza() {
		return idUsuarioAtualiza;
	}

	public void setIdUsuarioAtualiza(Integer idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public String getCdCredencial() {
		return cdCredencial;
	}

	public void setCdCredencial(String cdCredencial) {
		this.cdCredencial = cdCredencial;
	}

	public Date getDtVigenciaIni() {
		return dtVigenciaIni;
	}

	public void setDtVigenciaIni(Date dtVigenciaIni) {
		this.dtVigenciaIni = dtVigenciaIni;
	}

	public Date getDtVigenciaFim() {
		return dtVigenciaFim;
	}

	public void setDtVigenciaFim(Date dtVigenciaFim) {
		this.dtVigenciaFim = dtVigenciaFim;
	}

	public String getNmFuncao() {
		return nmFuncao;
	}

	public void setNmFuncao(String nmFuncao) {
		this.nmFuncao = nmFuncao;
	}

	public List<Mensagens> getMensagensList() {
		return mensagensList;
	}

	public void setMensagensList(List<Mensagens> mensagensList) {
		this.mensagensList = mensagensList;
	}

	public List<Registros> getRegistrosList() {
		return registrosList;
	}

	public void setRegistrosList(List<Registros> registrosList) {
		this.registrosList = registrosList;
	}

	public List<Usuarios> getUsuariosList() {
		return usuariosList;
	}

	public void setUsuariosList(List<Usuarios> usuariosList) {
		this.usuariosList = usuariosList;
	}

	public List<Dashboards> getDashboardsList() {
		return dashboardsList;
	}

	public void setDashboardsList(List<Dashboards> dashboardsList) {
		this.dashboardsList = dashboardsList;
	}

	public List<DocsCredores> getDocsCredoresList() {
		return docsCredoresList;
	}

	public void setDocsCredoresList(List<DocsCredores> docsCredoresList) {
		this.docsCredoresList = docsCredoresList;
	}

	public List<NotasFiscais> getNotasFiscaisList() {
		return notasFiscaisList;
	}

	public void setNotasFiscaisList(List<NotasFiscais> notasFiscaisList) {
		this.notasFiscaisList = notasFiscaisList;
	}

	public List<ItensNotasFiscais> getItensNotasFiscaisList() {
		return itensNotasFiscaisList;
	}

	public void setItensNotasFiscaisList(List<ItensNotasFiscais> itensNotasFiscaisList) {
		this.itensNotasFiscaisList = itensNotasFiscaisList;
	}

	public Enderecos getEndereco() {
		return endereco;
	}

	public void setEndereco(Enderecos endereco) {
		this.endereco = endereco;
	}

	public PeriodosFaturas getIdPeriodoFatura() {
		return idPeriodoFatura;
	}

	public void setIdPeriodoFatura(PeriodosFaturas idPeriodoFatura) {
		this.idPeriodoFatura = idPeriodoFatura;
	}

	public Usuarios getIdUsuarioResp() {
		return idUsuarioResp;
	}

	public void setIdUsuarioResp(Usuarios idUsuarioResp) {
		this.idUsuarioResp = idUsuarioResp;
	}

	public List<Remessas> getRemessasList() {
		return remessasList;
	}

	public void setRemessasList(List<Remessas> remessasList) {
		this.remessasList = remessasList;
	}

	public DadosLdapCredores getDadosLdapCredores() {
		return dadosLdapCredores;
	}

	public void setDadosLdapCredores(DadosLdapCredores dadosLdapCredores) {
		this.dadosLdapCredores = dadosLdapCredores;
	}

	public List<Cobertura> getCoberturas() {
		return coberturas;
	}

	public void setCoberturas(List<Cobertura> coberturas) {
		this.coberturas = coberturas;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idCredor != null ? idCredor.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Credores)) {
			return false;
		}
		Credores other = (Credores) object;
		if ((this.idCredor == null && other.idCredor != null) || (this.idCredor != null && !this.idCredor.equals(other.idCredor))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Credores[ idCredor=" + idCredor + " ]";
	}

}
