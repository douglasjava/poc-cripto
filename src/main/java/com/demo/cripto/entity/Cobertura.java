package com.demo.cripto.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "coberturas")
@NamedQueries({ @NamedQuery(name = "Cobertura.findAll", query = "SELECT c FROM Cobertura c") })
public class Cobertura implements Serializable, Comparable<Cobertura>{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_cobertura")
	private Integer idCobertura;

	@CreationTimestamp
	@Column(name = "dt_cadastro", nullable = false, columnDefinition = "datetime")
	private LocalDateTime dataCadastro;

	@UpdateTimestamp
	@Column(name = "dt_atualizacao", nullable = false, columnDefinition = "datetime")
	private LocalDateTime dataAtualizacao;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@JoinColumn(name = "id_credor", referencedColumnName = "id_credor")
	@ManyToOne(optional = false)
	private Credores idCredor;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idCobertura", fetch = FetchType.EAGER)
	private List<ValorOperacao> valores;

	@Basic(optional = true)
	@Column(name = "intervalo_ini")
	private Integer intervaloIni;

	@Basic(optional = true)
	@Column(name = "intervalo_fim")
	private Integer intervaloFim;

	public Integer getIdCobertura() {
		return idCobertura;
	}

	public void setIdCobertura(Integer idCobertura) {
		this.idCobertura = idCobertura;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public Credores getIdCredor() {
		return idCredor;
	}

	public void setIdCredor(Credores idCredor) {
		this.idCredor = idCredor;
	}

	public List<ValorOperacao> getValores() {
		return valores;
	}

	public void setValores(List<ValorOperacao> valores) {
		this.valores = valores;
	}

	public Integer getIntervaloIni() {
		return intervaloIni;
	}

	public void setIntervaloIni(Integer intervaloIni) {
		this.intervaloIni = intervaloIni;
	}

	public Integer getIntervaloFim() {
		return intervaloFim;
	}

	public void setIntervaloFim(Integer intervaloFim) {
		this.intervaloFim = intervaloFim;
	}

	@Override
	public int compareTo(Cobertura other) {
		return Integer.compare(this.intervaloIni, other.intervaloIni);

	}
}
