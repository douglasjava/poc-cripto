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
@Table(name = "listagem_gravacao_docs")
@NamedQueries({ @NamedQuery(name = "ListagemGravacaoDocumentos.findAll", query = "SELECT l FROM ListagemGravacaoDocumentos l") })
public class ListagemGravacaoDocumentos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_listagem_gravacao_docs")
	private Integer idListagemGravacaoDocumentos;

	@Basic(optional = true)
	@Column(name = "dt_inicio_cadastros")
	@Temporal(TemporalType.DATE)
	private Date dtInicioCadastros;

	@Basic(optional = false)
	@Column(name = "dt_fim_cadastros")
	@Temporal(TemporalType.DATE)
	private Date dtFimCadastros;

	@Basic(optional = false)
	@Column(name = "dt_geracao_listagem")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtGeracaoListagem;

	@Basic(optional = false)
	@Column(name = "status_gravacao_docs")
	@Enumerated(value = EnumType.STRING)
	private StatusGravacaoDocumento statusGravacaoDocumento;
	
	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;
	
	@Basic(optional = true)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;
	
	@Column(name = "qtd_contratos")
	private Integer qtdContratos;
	
	@Column(name = "qtd_arquivos_imagens")
	private Integer qtdArquivosImagens;
	
	@Transient
	private List<ItemListagemGravacaoDocsRegistros> itemListagemGravacaoDocsRegistros;

	public Integer getIdListagemGravacaoDocumentos() {
		return idListagemGravacaoDocumentos;
	}

	public void setIdListagemGravacaoDocumentos(Integer idListagemGravacaoDocumentos) {
		this.idListagemGravacaoDocumentos = idListagemGravacaoDocumentos;
	}

	public Date getDtInicioCadastros() {
		return dtInicioCadastros;
	}

	public void setDtInicioCadastros(Date dtInicioCadastros) {
		this.dtInicioCadastros = dtInicioCadastros;
	}

	public Date getDtFimCadastros() {
		return dtFimCadastros;
	}

	public void setDtFimCadastros(Date dtFimCadastros) {
		this.dtFimCadastros = dtFimCadastros;
	}

	public Date getDtGeracaoListagem() {
		return dtGeracaoListagem;
	}

	public void setDtGeracaoListagem(Date dtGeracaoListagem) {
		this.dtGeracaoListagem = dtGeracaoListagem;
	}

	public StatusGravacaoDocumento getStatusGravacaoDocumento() {
		return statusGravacaoDocumento;
	}

	public void setStatusGravacaoDocumento(StatusGravacaoDocumento statusGravacao) {
		this.statusGravacaoDocumento = statusGravacao;
	}

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Integer getIdUsuarioAtualiza() {
		return idUsuarioAtualiza;
	}

	public void setIdUsuarioAtualiza(Integer idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Integer getQtdContratos() {
		return qtdContratos;
	}

	public void setQtdContratos(Integer qtdDocsRegistros) {
		this.qtdContratos = qtdDocsRegistros;
	}

	public Integer getQtdArquivosImagens() {
		return qtdArquivosImagens;
	}

	public void setQtdArquivosImagens(Integer qtdArquivosImagens) {
		this.qtdArquivosImagens = qtdArquivosImagens;
	}

	public List<ItemListagemGravacaoDocsRegistros> getItemListagemGravacaoDocsRegistros() {
		return itemListagemGravacaoDocsRegistros;
	}

	public void setItemListagemGravacaoDocsRegistros(List<ItemListagemGravacaoDocsRegistros> itemListagemGravacaoDocsRegistros) {
		this.itemListagemGravacaoDocsRegistros = itemListagemGravacaoDocsRegistros;
	}

}
