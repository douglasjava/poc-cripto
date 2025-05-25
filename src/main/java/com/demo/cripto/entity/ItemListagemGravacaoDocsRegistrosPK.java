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
 * @author urbano.menegato
 */
@Embeddable
public class ItemListagemGravacaoDocsRegistrosPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_doc_registro")
	private DocsRegistros docsRegistros;

	@ManyToOne(optional = false)
	@JoinColumn(name = "id_listagem_gravacao_docs")
	private ListagemGravacaoDocumentos listagemGravacaoDocumentos;
	

	public ItemListagemGravacaoDocsRegistrosPK() {
		super();
	}
	
	public ItemListagemGravacaoDocsRegistrosPK(DocsRegistros docsRegistros, ListagemGravacaoDocumentos listagemGravacaoDocumentos) {
		super();
		this.docsRegistros = docsRegistros;
		this.listagemGravacaoDocumentos = listagemGravacaoDocumentos;
	}

	public DocsRegistros getDocsRegistros() {
		return docsRegistros;
	}

	public void setDocsRegistros(DocsRegistros docsRegistros) {
		this.docsRegistros = docsRegistros;
	}

	public ListagemGravacaoDocumentos getListagemGravacaoDocumentos() {
		return listagemGravacaoDocumentos;
	}

	public void setListagemGravacaoDocumentos(ListagemGravacaoDocumentos listagemGravacaoDocumentos) {
		this.listagemGravacaoDocumentos = listagemGravacaoDocumentos;
	}

}
