package com.demo.cripto.entity;

public class Arquivo {

	private String nome;
	private String mimeType;
	private byte[] bytesArquivo;

	public Arquivo() {

	}

	public Arquivo(String nome, String mimeType, byte[] bytesArquivo) {
		this.nome = nome;
		this.mimeType = mimeType;
		this.bytesArquivo = bytesArquivo;
	}

	public String getNome() {
		return nome;
	}

	public String getMimeType() {
		return mimeType;
	}

	public byte[] getBytesArquivo() {
		return bytesArquivo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public void setBytesArquivo(byte[] bytesArquivo) {
		this.bytesArquivo = bytesArquivo;
	}

}
