package com.demo.cripto.entity;

public class Prototipo {

	private String nomeArquivo;
	private String urlArquivo;
	
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public String getUrlArquivo() {
		return urlArquivo;
	}
	
	public void setUrlArquivo(String urlArquivo) {
		this.urlArquivo = urlArquivo;
	}
	
	public Prototipo(String nomeArquivo, String urlArquivo) {
		super();
		this.nomeArquivo = nomeArquivo;
		this.urlArquivo = urlArquivo;
	}
	
	public Prototipo() {
		
	}
	
}
