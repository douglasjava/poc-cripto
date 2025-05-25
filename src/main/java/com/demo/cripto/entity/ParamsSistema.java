/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "params_sistema")
@NamedQueries({ @NamedQuery(name = "ParamsSistema.findAll", query = "SELECT p FROM ParamsSistema p") })
public class ParamsSistema implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
	@Column(name = "pc_repasse_detran")
	private BigDecimal pcRepasseDetran;
	@Column(name = "pc_repasse_registradora")
	private BigDecimal pcRepasseRegistradora;
	@Column(name = "nm_diretorio_remessa")
	private String nmDiretorioRemessa;
	@Column(name = "nm_registradora")
	private String nmRegistradora;
	@Column(name = "nu_cnpj_registradora")
	private String nuCnpjRegistradora;
	@Column(name = "nu_cnpj_cobranca")
	private String nuCnpjCobranca;
	@Column(name = "nm_cobranca")
	private String nmCobranca;
	@Column(name = "nm_fantasia")
	private String nmFantasia;
	@Column(name = "nm_logradouro")
	private String nmLogradouro;
	@Column(name = "nu_logradouro")
	private String nuLogradouro;
	@Column(name = "tx_complemento")
	private String txComplemento;
	@Column(name = "nm_bairro")
	private String nmBairro;
	@Column(name = "nm_municipio")
	private String nmMunicipio;
	@Column(name = "nu_cep")
	private String nuCep;
	@Id
	@Basic(optional = false)
	@Column(name = "sg_uf")
	private String sgUf;
	@Column(name = "ds_email")
	private String dsEmail;
	@Column(name = "nu_telefone")
	private String nuTelefone;
	@Column(name = "qt_ufir_contrato")
	private Integer qtUfirContrato;
	@Column(name = "pc_aliq_iss")
	private BigDecimal pcAliqIss;
	@Column(name = "pc_ret_fed")
	private BigDecimal pcRetFed;
	@Column(name = "vl_servico_credora")
	private BigDecimal vlServicoCredora;
	@Basic(optional = false)
	@Column(name = "sg_uf_registradora")
	private String sgUfRegistradora;
	@Column(name = "im_banco_boleto", columnDefinition = "bytea")
	private byte[] imBancoBoleto;
	@Column(name = "nm_imagem_boleto")
	private String nmImagemBoleto;
	@Column(name = "nm_mime_type")
	private String nmMimeType;
	@Column(name = "nm_banco")
	private String nmBanco;
	@Column(name = "nu_agencia_banco", columnDefinition = "bpchar")
	private String nuAgenciaBanco;
	@Column(name = "nu_agencia_banco_dv")
	private Character nuAgenciaBancoDv;
	@Column(name = "nu_banco", columnDefinition = "bpchar")
	private String nuBanco;
	@Column(name = "nu_banco_dv")
	private Character nuBancoDv;
	@Column(name = "nu_carteira_cobranca", columnDefinition = "NUMERIC")
	private Short nuCarteiraCobranca;
	@Column(name = "nu_ccorrente_banco", columnDefinition = "bpchar")
	private String nuCcorrenteBanco;
	@Column(name = "nu_ccorrente_banco_dv")
	private Character nuCcorrenteBancoDv;
	@Column(name = "qt_prazo_venc_boleto", columnDefinition = "NUMERIC")
	private Short qtPrazoVencBoleto;
	@Column(name = "ds_inf_comp")
	private String dsInfComp;
	@Column(name = "vl_preco_publico_alt")
	private BigDecimal vlPrecoPublicoAlt;
	@Column(name = "vl_preco_publico_inc")
	private BigDecimal vlPrecoPublicoInc;

	@Column(name = "in_banco_pan_contratos")
	private Boolean inBancoPanContratos;

	@Column(name = "in_banco_pan_imagens")
	private Boolean inBancoPanImagens;

	public ParamsSistema() {
	}

	public ParamsSistema(String sgUf) {
		this.sgUf = sgUf;
	}

	public ParamsSistema(String sgUf, String sgUfRegistradora) {
		this.sgUf = sgUf;
		this.sgUfRegistradora = sgUfRegistradora;
	}

	public BigDecimal getPcRepasseDetran() {
		return pcRepasseDetran;
	}

	public void setPcRepasseDetran(BigDecimal pcRepasseDetran) {
		this.pcRepasseDetran = pcRepasseDetran;
	}

	public BigDecimal getPcRepasseRegistradora() {
		return pcRepasseRegistradora;
	}

	public void setPcRepasseRegistradora(BigDecimal pcRepasseRegistradora) {
		this.pcRepasseRegistradora = pcRepasseRegistradora;
	}

	public String getNmDiretorioRemessa() {
		return nmDiretorioRemessa;
	}

	public void setNmDiretorioRemessa(String nmDiretorioRemessa) {
		this.nmDiretorioRemessa = nmDiretorioRemessa;
	}

	public String getNmRegistradora() {
		return nmRegistradora;
	}

	public void setNmRegistradora(String nmRegistradora) {
		this.nmRegistradora = nmRegistradora;
	}

	public String getNuCnpjRegistradora() {
		return nuCnpjRegistradora;
	}

	public void setNuCnpjRegistradora(String nuCnpjRegistradora) {
		this.nuCnpjRegistradora = nuCnpjRegistradora;
	}

	public String getNuCnpjCobranca() {
		return nuCnpjCobranca;
	}

	public void setNuCnpjCobranca(String nuCnpjCobranca) {
		this.nuCnpjCobranca = nuCnpjCobranca;
	}

	public String getNmCobranca() {
		return nmCobranca;
	}

	public void setNmCobranca(String nmCobranca) {
		this.nmCobranca = nmCobranca;
	}

	public String getNmFantasia() {
		return nmFantasia;
	}

	public void setNmFantasia(String nmFantasia) {
		this.nmFantasia = nmFantasia;
	}

	public String getNmLogradouro() {
		return nmLogradouro;
	}

	public void setNmLogradouro(String nmLogradouro) {
		this.nmLogradouro = nmLogradouro;
	}

	public String getNuLogradouro() {
		return nuLogradouro;
	}

	public void setNuLogradouro(String nuLogradouro) {
		this.nuLogradouro = nuLogradouro;
	}

	public String getTxComplemento() {
		return txComplemento;
	}

	public void setTxComplemento(String txComplemento) {
		this.txComplemento = txComplemento;
	}

	public String getNmBairro() {
		return nmBairro;
	}

	public void setNmBairro(String nmBairro) {
		this.nmBairro = nmBairro;
	}

	public String getNmMunicipio() {
		return nmMunicipio;
	}

	public void setNmMunicipio(String nmMunicipio) {
		this.nmMunicipio = nmMunicipio;
	}

	public String getNuCep() {
		return nuCep;
	}

	public void setNuCep(String nuCep) {
		this.nuCep = nuCep;
	}

	public String getSgUf() {
		return sgUf;
	}

	public void setSgUf(String sgUf) {
		this.sgUf = sgUf;
	}

	public String getDsEmail() {
		return dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}

	public String getNuTelefone() {
		return nuTelefone;
	}

	public void setNuTelefone(String nuTelefone) {
		this.nuTelefone = nuTelefone;
	}

	public Integer getQtUfirContrato() {
		return qtUfirContrato;
	}

	public void setQtUfirContrato(Integer qtUfirContrato) {
		this.qtUfirContrato = qtUfirContrato;
	}

	public BigDecimal getPcAliqIss() {
		return pcAliqIss;
	}

	public void setPcAliqIss(BigDecimal pcAliqIss) {
		this.pcAliqIss = pcAliqIss;
	}

	public BigDecimal getPcRetFed() {
		return pcRetFed;
	}

	public void setPcRetFed(BigDecimal pcRetFed) {
		this.pcRetFed = pcRetFed;
	}

	public BigDecimal getVlServicoCredora() {
		return vlServicoCredora;
	}

	public void setVlServicoCredora(BigDecimal vlServicoCredora) {
		this.vlServicoCredora = vlServicoCredora;
	}

	public String getSgUfRegistradora() {
		return sgUfRegistradora;
	}

	public void setSgUfRegistradora(String sgUfRegistradora) {
		this.sgUfRegistradora = sgUfRegistradora;
	}

	public byte[] getImBancoBoleto() {
		return imBancoBoleto;
	}

	public void setImBancoBoleto(byte[] imBancoBoleto) {
		this.imBancoBoleto = imBancoBoleto;
	}

	public String getNmImagemBoleto() {
		return nmImagemBoleto;
	}

	public void setNmImagemBoleto(String nmImagemBoleto) {
		this.nmImagemBoleto = nmImagemBoleto;
	}

	public String getNmMimeType() {
		return nmMimeType;
	}

	public void setNmMimeType(String nmMimeType) {
		this.nmMimeType = nmMimeType;
	}

	public String getNmBanco() {
		return nmBanco;
	}

	public void setNmBanco(String nmBanco) {
		this.nmBanco = nmBanco;
	}

	public String getNuAgenciaBanco() {
		return nuAgenciaBanco;
	}

	public void setNuAgenciaBanco(String nuAgenciaBanco) {
		this.nuAgenciaBanco = nuAgenciaBanco;
	}

	public Character getNuAgenciaBancoDv() {
		return nuAgenciaBancoDv;
	}

	public void setNuAgenciaBancoDv(Character nuAgenciaBancoDv) {
		this.nuAgenciaBancoDv = nuAgenciaBancoDv;
	}

	public String getNuBanco() {
		return nuBanco;
	}

	public void setNuBanco(String nuBanco) {
		this.nuBanco = nuBanco;
	}

	public Character getNuBancoDv() {
		return nuBancoDv;
	}

	public void setNuBancoDv(Character nuBancoDv) {
		this.nuBancoDv = nuBancoDv;
	}

	public Short getNuCarteiraCobranca() {
		return nuCarteiraCobranca;
	}

	public void setNuCarteiraCobranca(Short nuCarteiraCobranca) {
		this.nuCarteiraCobranca = nuCarteiraCobranca;
	}

	public String getNuCcorrenteBanco() {
		return nuCcorrenteBanco;
	}

	public void setNuCcorrenteBanco(String nuCcorrenteBanco) {
		this.nuCcorrenteBanco = nuCcorrenteBanco;
	}

	public Character getNuCcorrenteBancoDv() {
		return nuCcorrenteBancoDv;
	}

	public void setNuCcorrenteBancoDv(Character nuCcorrenteBancoDv) {
		this.nuCcorrenteBancoDv = nuCcorrenteBancoDv;
	}

	public Short getQtPrazoVencBoleto() {
		return qtPrazoVencBoleto;
	}

	public void setQtPrazoVencBoleto(Short qtPrazoVencBoleto) {
		this.qtPrazoVencBoleto = qtPrazoVencBoleto;
	}

	public String getDsInfComp() {
		return dsInfComp;
	}

	public void setDsInfComp(String dsInfComp) {
		this.dsInfComp = dsInfComp;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (sgUf != null ? sgUf.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ParamsSistema)) {
			return false;
		}
		ParamsSistema other = (ParamsSistema) object;
		if ((this.sgUf == null && other.sgUf != null) || (this.sgUf != null && !this.sgUf.equals(other.sgUf))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.ParamsSistema[ sgUf=" + sgUf + " ]";
	}

	public BigDecimal getVlPrecoPublicoAlt() {
		return vlPrecoPublicoAlt;
	}

	public BigDecimal getVlPrecoPublicoInc() {
		return vlPrecoPublicoInc;
	}

	public void setVlPrecoPublicoAlt(BigDecimal vlPrecoPublicoAlt) {
		this.vlPrecoPublicoAlt = vlPrecoPublicoAlt;
	}

	public void setVlPrecoPublicoInc(BigDecimal vlPrecoPublicoInc) {
		this.vlPrecoPublicoInc = vlPrecoPublicoInc;
	}

	public Boolean getInBancoPanContratos() {
		return inBancoPanContratos;
	}

	public void setInBancoPanContratos(Boolean inBancoPanContratos) {
		this.inBancoPanContratos = inBancoPanContratos;
	}

	public Boolean getInBancoPanImagens() {
		return inBancoPanImagens;
	}

	public void setInBancoPanImagens(Boolean inBancoPanImagens) {
		this.inBancoPanImagens = inBancoPanImagens;
	}
}
