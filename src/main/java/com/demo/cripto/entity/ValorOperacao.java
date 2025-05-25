package com.demo.cripto.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "valor_operacao")
@DynamicInsert
@DynamicUpdate
public class ValorOperacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_valor")
	private Integer idValor;

	@CreationTimestamp
	@Column(name = "dt_cadastro", nullable = false, columnDefinition = "datetime")
	private LocalDateTime dataCadastro;

	@UpdateTimestamp
	@Column(name = "dt_atualizacao", nullable = false, columnDefinition = "datetime")
	private LocalDateTime dataAtualizacao;

	@Deprecated
	@JoinColumn(name = "id_credor", referencedColumnName = "id_credor")
	@ManyToOne(optional = false)
	private Credores idCredor;
	
	@JoinColumn(name = "id_cobertura", referencedColumnName = "id_cobertura")
	@ManyToOne(optional = false)
	private Cobertura idCobertura;

	@JoinColumn(name = "id_tipo_item_cobranca", referencedColumnName = "id_tipo_item_cobranca")
	@ManyToOne(optional = false)
	private TiposItensCobranca idTipoItemCobranca;

	@Column(nullable = false, name = "vl_param")
	private BigDecimal valor;

	public Integer getIdValor() {
		return idValor;
	}

	public void setIdValor(Integer idValor) {
		this.idValor = idValor;
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

	public Credores getIdCredor() {
		return idCredor;
	}

	public void setIdCredor(Credores idCredor) {
		this.idCredor = idCredor;
	}

	public Cobertura getIdCobertura() {
		return idCobertura;
	}

	public void setIdCobertura(Cobertura idCobertura) {
		this.idCobertura = idCobertura;
	}

	public TiposItensCobranca getIdTipoItemCobranca() {
		return idTipoItemCobranca;
	}

	public void setIdTipoItemCobranca(TiposItensCobranca idTipoItemCobranca) {
		this.idTipoItemCobranca = idTipoItemCobranca;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ValorOperacao [idValor=" + idValor + ", idCredor=" + idCredor + ", idTipoItemCobranca=" + idTipoItemCobranca + ", valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idValor == null) ? 0 : idValor.hashCode());
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
		ValorOperacao other = (ValorOperacao) obj;
		if (idValor == null) {
			if (other.idValor != null)
				return false;
		} else if (!idValor.equals(other.idValor))
			return false;
		return true;
	}

}
