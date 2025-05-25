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
 * @author peterson.silva
 */
@Entity
@Table(name = "listagem_gravacao_docs_docs_registros")
@NamedQueries({ @NamedQuery(name = "ItemListagemGravacaoDocsRegistros.findAll", query = "SELECT l FROM ItemListagemGravacaoDocsRegistros l") })
public class ItemListagemGravacaoDocsRegistros implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemListagemGravacaoDocsRegistrosPK id;
	

	public ItemListagemGravacaoDocsRegistros() {
		super();
	}

	public ItemListagemGravacaoDocsRegistros(DocsRegistros docsRegistros, ListagemGravacaoDocumentos listagemGravacaoDocumentos) {
		super();
		this.id = new ItemListagemGravacaoDocsRegistrosPK(docsRegistros, listagemGravacaoDocumentos);
	}


	public ItemListagemGravacaoDocsRegistrosPK getId() {
		return id;
	}

	public void setId(ItemListagemGravacaoDocsRegistrosPK id) {
		this.id = id;
	}
	
	public DocsRegistros getDocsRegistros() {
		return (this.id != null)? this.id.getDocsRegistros() : null;
	}

	public void setDocsRegistros(DocsRegistros docsRegistros) {
		if(this.id == null) {
			this.id = new ItemListagemGravacaoDocsRegistrosPK();
		}
		this.id.setDocsRegistros(docsRegistros);
	}

	public ListagemGravacaoDocumentos getListagemGravacaoDocumentos() {
		return (this.id != null)? this.id.getListagemGravacaoDocumentos() : null;
	}

	public void setListagemGravacaoDocumentos(ListagemGravacaoDocumentos listagemGravacaoDocumentos) {
		if(this.id == null) {
			this.id = new ItemListagemGravacaoDocsRegistrosPK();
		}
		this.id.setListagemGravacaoDocumentos(listagemGravacaoDocumentos);
	}

	
}
