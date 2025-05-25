package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author urbano.menegato
 */
@Entity
@Table(name = "log_acesso")
@NamedQueries({ @NamedQuery(name = "LogAcesso.findAll", query = "SELECT l FROM LogAcesso l") })
public class LogAcesso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_log_acesso")
	private Integer idLogAcesso;

	@JoinColumn(name = "id_usuario")
	@ManyToOne(optional = false)
	private Usuarios usuario;

	@JoinColumn(name = "id_funcionalidade")
	@ManyToOne(optional = false)
	private Funcionalidades funcionalidade;

	@Basic(optional = false)
	@Column(name = "dt_cadastro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtCadastro;
	
	
	public LogAcesso() {
		super();
	}
	
	public LogAcesso(Usuarios usuario, Funcionalidades funcionalidade, Date dtCadastro) {
		super();
		this.dtCadastro = dtCadastro;
		this.usuario = usuario;
		this.funcionalidade = funcionalidade;
	}

	public Integer getIdLogAcesso() {
		return idLogAcesso;
	}

	public void setIdLogAcesso(Integer idLogAcesso) {
		this.idLogAcesso = idLogAcesso;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public Funcionalidades getFuncionalidade() {
		return funcionalidade;
	}

	public void setFuncionalidade(Funcionalidades funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	
}