/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "usuarios")
@NamedQueries({ @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u") })
@DynamicUpdate
@DynamicInsert
public class Usuarios implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_usuario")
	private Integer idUsuario;
	
	@Basic(optional = false)
	@Column(name = "nm_usuario")
	private String nmUsuario;
	
	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;
	
	@Basic(optional = false)
	@Column(name = "nu_cpf", columnDefinition = "bpchar")
	private String nuCpf;
	
	@Basic(optional = false)
	@Column(name = "ds_email")
	private String dsEmail;
	
	@Basic(optional = false)
	@Column(name = "nm_login")
	private String nmLogin;
	
	@Column(name = "nm_senha")
	private String nmSenha;
	
	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;
	
	@Column(name = "nu_ddd_1", columnDefinition = "NUMERIC")
	private Short nuDdd1;
	
	@Column(name = "nu_telefone_1", columnDefinition = "NUMERIC")
	private Long nuTelefone1;
	
	@Column(name = "nu_ddd_2", columnDefinition = "NUMERIC")
	private Short nuDdd2;
	
	@Column(name = "nu_telefone_2", columnDefinition = "NUMERIC")
	private Long nuTelefone2;
	
	@Column(name = "nu_ddi_1", columnDefinition = "NUMERIC")
	private Integer nuDdi1;
	
	@Column(name = "nu_ddi_2", columnDefinition = "NUMERIC")
	private Integer nuDdi2;
	
	@Column(name = "nu_token")
	private String nuToken;
	
	@Column(name = "dt_token")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtToken;
	
	@Column(name = "im_biometria_1", columnDefinition = "bytea")
	private byte[] imBiometria1;
	
	@Column(name = "im_biometria_2", columnDefinition = "bytea")
	private byte[] imBiometria2;
	
	@Basic(optional = false)
	@Column(name = "in_registradora")
	private Boolean inRegistradora;
	
	@Basic(optional = false)
	@Column(name = "in_credor")
	private Boolean inCredor;
	
	@Basic(optional = false)
	@Column(name = "in_devedor")
	private Boolean inDevedor;
	
	@Basic(optional = false)
	@Column(name = "in_despachante")
	private Boolean inDespachante;
	
	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;
	
	@Basic(optional = false)
	@Column(name = "in_detran")
	private Boolean inDetran;
	
	@Column(name = "nu_matricula")
	private String nuMatricula;
	
	@Column(name = "ds_alocado")
	private String dsAlocado;
	
	@OneToMany(mappedBy = "idDestinatario")
	private List<Notificacoes> notificacoesList;
	
	@OneToMany(mappedBy = "idUsuarioRegistro")
	private List<Registros> registrosList;
	
	@JoinColumn(name = "id_credor", referencedColumnName = "id_credor")
	@ManyToOne
	private Credores idCredor;
	
	@JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
	@ManyToOne
	private Enderecos idEndereco;
	
	@OneToMany(mappedBy = "idUsuario")
	private List<DocsRegistros> docsRegistrosList;
	
	@OneToMany(mappedBy = "idUsuario")
	private List<Devices> devicesList;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
	private List<PerfisUsuarios> perfisUsuariosList;
	
	@OneToMany(mappedBy = "usuario")
	private List<UsuariosAcessos> usuariosAcessosList;
	
	@OneToMany(mappedBy = "idUsuarioResp")
	private List<Credores> credoresList;
	
	@OneToMany(mappedBy = "idUsuario")
	private List<Remessas> remessasList;

	
	public Usuarios() {
	}

	public Usuarios(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Usuarios(String nmUsuario, boolean inAtivo) {
		this.inAtivo = inAtivo;
		this.nmUsuario = nmUsuario;
	}

	public Usuarios(boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public Usuarios(Integer idUsuario, String nmUsuario, boolean inAtivo, String nuCpf, String dsEmail, String nmLogin, Date dtUltAtualiza, Boolean inRegistradora, Boolean inCredor, Boolean inDevedor, Boolean inDespachante, Integer idUsuarioAtualiza,
			Boolean inDetran) {
		this.idUsuario = idUsuario;
		this.nmUsuario = nmUsuario;
		this.inAtivo = inAtivo;
		this.nuCpf = nuCpf;
		this.dsEmail = dsEmail;
		this.nmLogin = nmLogin;
		this.dtUltAtualiza = dtUltAtualiza;
		this.inRegistradora = inRegistradora;
		this.inCredor = inCredor;
		this.inDevedor = inDevedor;
		this.inDespachante = inDespachante;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.inDetran = inDetran;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public String getNuCpf() {
		return nuCpf;
	}

	public void setNuCpf(String nuCpf) {
		this.nuCpf = nuCpf;
	}

	public String getDsEmail() {
		return dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}

	public String getNmLogin() {
		return nmLogin;
	}

	public void setNmLogin(String nmLogin) {
		this.nmLogin = nmLogin;
	}

	public String getNmSenha() {
		return nmSenha;
	}

	public void setNmSenha(String nmSenha) {
		this.nmSenha = nmSenha;
	}

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
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

	public String getNuToken() {
		return nuToken;
	}

	public void setNuToken(String nuToken) {
		this.nuToken = nuToken;
	}

	public Date getDtToken() {
		return dtToken;
	}

	public void setDtToken(Date dtToken) {
		this.dtToken = dtToken;
	}

	public byte[] getImBiometria1() {
		return imBiometria1;
	}

	public void setImBiometria1(byte[] imBiometria1) {
		this.imBiometria1 = imBiometria1;
	}

	public byte[] getImBiometria2() {
		return imBiometria2;
	}

	public void setImBiometria2(byte[] imBiometria2) {
		this.imBiometria2 = imBiometria2;
	}

	public Boolean getInRegistradora() {
		return inRegistradora;
	}

	public void setInRegistradora(Boolean inRegistradora) {
		this.inRegistradora = inRegistradora;
	}

	public Boolean getInCredor() {
		return inCredor;
	}

	public void setInCredor(Boolean inCredor) {
		this.inCredor = inCredor;
	}

	public Boolean getInDevedor() {
		return inDevedor;
	}

	public void setInDevedor(Boolean inDevedor) {
		this.inDevedor = inDevedor;
	}

	public Boolean getInDespachante() {
		return inDespachante;
	}

	public void setInDespachante(Boolean inDespachante) {
		this.inDespachante = inDespachante;
	}

	public Integer getIdUsuarioAtualiza() {
		return idUsuarioAtualiza;
	}

	public void setIdUsuarioAtualiza(Integer idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Boolean getInDetran() {
		return inDetran;
	}

	public void setInDetran(Boolean inDetran) {
		this.inDetran = inDetran;
	}

	public String getNuMatricula() {
		return nuMatricula;
	}

	public void setNuMatricula(String nuMatricula) {
		this.nuMatricula = nuMatricula;
	}

	public String getDsAlocado() {
		return dsAlocado;
	}

	public void setDsAlocado(String dsAlocado) {
		this.dsAlocado = dsAlocado;
	}

	public List<Notificacoes> getNotificacoesList() {
		return notificacoesList;
	}

	public void setNotificacoesList(List<Notificacoes> notificacoesList) {
		this.notificacoesList = notificacoesList;
	}

	public List<Registros> getRegistrosList() {
		return registrosList;
	}

	public void setRegistrosList(List<Registros> registrosList) {
		this.registrosList = registrosList;
	}

	public Credores getIdCredor() {
		return idCredor;
	}

	public void setIdCredor(Credores idCredor) {
		this.idCredor = idCredor;
	}

	public Enderecos getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Enderecos idEndereco) {
		this.idEndereco = idEndereco;
	}

	public List<DocsRegistros> getDocsRegistrosList() {
		return docsRegistrosList;
	}

	public void setDocsRegistrosList(List<DocsRegistros> docsRegistrosList) {
		this.docsRegistrosList = docsRegistrosList;
	}

	public List<Devices> getDevicesList() {
		return devicesList;
	}

	public void setDevicesList(List<Devices> devicesList) {
		this.devicesList = devicesList;
	}

	public List<PerfisUsuarios> getPerfisUsuariosList() {
		return perfisUsuariosList;
	}

	public void setPerfisUsuariosList(List<PerfisUsuarios> perfisUsuariosList) {
		this.perfisUsuariosList = perfisUsuariosList;
	}

	public List<UsuariosAcessos> getUsuariosAcessosList() {
		return usuariosAcessosList;
	}

	public void setUsuariosAcessosList(List<UsuariosAcessos> usuariosAcessosList) {
		this.usuariosAcessosList = usuariosAcessosList;
	}

	public List<Credores> getCredoresList() {
		return credoresList;
	}

	public void setCredoresList(List<Credores> credoresList) {
		this.credoresList = credoresList;
	}

	public List<Remessas> getRemessasList() {
		return remessasList;
	}

	public void setRemessasList(List<Remessas> remessasList) {
		this.remessasList = remessasList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idUsuario != null ? idUsuario.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Usuarios)) {
			return false;
		}
		Usuarios other = (Usuarios) object;
		if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.Usuarios[ idUsuario=" + idUsuario + " ]";
	}

}
