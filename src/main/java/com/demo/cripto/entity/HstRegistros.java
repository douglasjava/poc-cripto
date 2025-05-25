/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "hst_registros")
@NamedQueries({ @NamedQuery(name = "HstRegistros.findAll", query = "SELECT h FROM HstRegistros h") })
public class HstRegistros implements Serializable {

	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
	@Column(name = "id_registro")
	private int idRegistro;
	@Basic(optional = false)
	@Column(name = "dt_cadastro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtCadastro;
	@Basic(optional = false)
	@Column(name = "tp_devedor", columnDefinition = "NUMERIC")
	private short tpDevedor;
	@Column(name = "nu_cnpj", columnDefinition = "bpchar")
	private String nuCnpj;
	@Column(name = "nu_cpf", columnDefinition = "bpchar")
	private String nuCpf;
	@Column(name = "ds_email")
	private String dsEmail;
	@Column(name = "nu_ddd_1", columnDefinition = "NUMERIC")
	private Short nuDdd1;
	@Column(name = "nu_telefone_1", columnDefinition = "NUMERIC")
	private Long nuTelefone1;
	@Column(name = "nu_ddd_2", columnDefinition = "NUMERIC")
	private Short nuDdd2;
	@Column(name = "nu_telefone_2", columnDefinition = "NUMERIC")
	private Long nuTelefone2;
	@Basic(optional = false)
	@Column(name = "tp_origem", columnDefinition = "NUMERIC")
	private Short tpOrigem;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
	@Basic(optional = false)
	@Column(name = "vl_divida")
	private BigDecimal vlDivida;
	@Basic(optional = false)
	@Column(name = "vl_encargos")
	private BigDecimal vlEncargos;
	@Basic(optional = false)
	@Column(name = "pc_juros_ano")
	private BigDecimal pcJurosAno;
	@Basic(optional = false)
	@Column(name = "pc_correcao")
	private BigDecimal pcCorrecao;
	@Basic(optional = false)
	@Column(name = "dt_contrato")
	@Temporal(TemporalType.DATE)
	private Date dtContrato;
	@Column(name = "id_usuario_registro")
	private Integer idUsuarioRegistro;
	@Column(name = "id_status")
	private Integer idStatus;
	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;
	@Column(name = "id_endereco")
	private Integer idEndereco;
	@Column(name = "id_municipio_contrato")
	private Integer idMunicipioContrato;
	@Column(name = "nu_ddi_1", columnDefinition = "NUMERIC")
	private Integer nuDdi1;
	@Column(name = "nu_ddi_2", columnDefinition = "NUMERIC")
	private Integer nuDdi2;
	@Basic(optional = false)
	@Column(name = "nu_contrato")
	private String nuContrato;
	@Basic(optional = false)
	@Column(name = "dt_fim_contrato")
	@Temporal(TemporalType.DATE)
	private Date dtFimContrato;
	@Basic(optional = false)
	@Column(name = "nm_devedor")
	private String nmDevedor;
	@Column(name = "id_tipo_contrato")
	private Integer idTipoContrato;
	@Column(name = "vl_contrato")
	private BigDecimal vlContrato;
	@Column(name = "vl_iof")
	private BigDecimal vlIof;
	@Column(name = "in_multa")
	private Boolean inMulta;
	@Column(name = "in_mora")
	private Boolean inMora;
	@Column(name = "id_uf")
	private Integer idUf;
	@Column(name = "id_credor")
	private Integer idCredor;
	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private int idUsuarioAtualiza;
	@Column(name = "dt_anulacao")
	@Temporal(TemporalType.DATE)
	private Date dtAnulacao;
	@Basic(optional = false)
	@Column(name = "in_ativo")
	private boolean inAtivo;
	@Column(name = "ds_mensagem")
	private String dsMensagem;
	@Column(name = "im_xml_espelho", columnDefinition = "bytea")
	private byte[] imXmlEspelho;
	@Column(name = "vl_registro")
	private BigDecimal vlRegistro;
	@Column(name = "id_tipo_financ")
	private Integer idTipoFinanc;
	@Basic(optional = false)
	@Column(name = "qt_total_parcelas")
	private int qtTotalParcelas;
	@Basic(optional = false)
	@Column(name = "qt_total_meses")
	private int qtTotalMeses;
	@Basic(optional = false)
	@Column(name = "pc_juros_mes_cont")
	private BigDecimal pcJurosMesCont;
	@Basic(optional = false)
	@Column(name = "vl_comissao")
	private BigDecimal vlComissao;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_hst_registro")
	private Long idHstRegistro;
	@Basic(optional = false)
	@Column(name = "tp_operacao")
	private String tpOperacao;
	@Column(name = "id_registro_pai")
	private Integer idRegistroPai;
	@Column(name = "dt_emis_certidao")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtEmisCertidao;
	@Column(name = "im_certidao", columnDefinition = "bytea")
	private byte[] imCertidao;
	@Column(name = "dt_baixa")
	@Temporal(TemporalType.DATE)
	private Date dtBaixa;
	@Column(name = "vl_parcela")
	private BigDecimal vlParcela;
	@Column(name = "dt_parcela_1")
	@Temporal(TemporalType.DATE)
	private Date dtParcela1;
	@Column(name = "dt_libera_credito")
	@Temporal(TemporalType.DATE)
	private Date dtLiberaCredito;
	@Column(name = "nu_grupo_consorcio")
	private String nuGrupoConsorcio;
	@Column(name = "nu_cota_consorcio")
	private Integer nuCotaConsorcio;
	@Column(name = "vl_tx_multa")
	private BigDecimal vlTxMulta;
	@Column(name = "vl_tx_mora")
	private BigDecimal vlTxMora;
	@Column(name = "nu_ip")
	private String nuIp;
	@Column(name = "ds_clausula_legal")
	private String dsClausulaLegal;
	@Column(name = "ds_email_garantidor")
	private String dsEmailGarantidor;
	@Column(name = "dt_compra")
	@Temporal(TemporalType.DATE)
	private Date dtCompra;
	@Column(name = "id_indice_correcao")
	private Integer idIndiceCorrecao;
	@Column(name = "in_penalidade")
	private Boolean inPenalidade;
	@Column(name = "nm_garantidor")
	private String nmGarantidor;
	@Column(name = "nu_cnpj_garantidor", columnDefinition = "bpchar")
	private String nuCnpjGarantidor;
	@Column(name = "nu_cpf_garantidor", columnDefinition = "bpchar")
	private String nuCpfGarantidor;
	@Column(name = "nu_ddd_1_garantidor", columnDefinition = "NUMERIC")
	private Short nuDdd1Garantidor;
	@Column(name = "nu_ddd_2_garantidor", columnDefinition = "NUMERIC")
	private Short nuDdd2Garantidor;
	@Column(name = "nu_telefone_1_garantidor", columnDefinition = "NUMERIC")
	private Long nuTelefone1Garantidor;
	@Column(name = "nu_telefone_2_garantidor", columnDefinition = "NUMERIC")
	private Long nuTelefone2Garantidor;
	@Column(name = "tp_aditivo", columnDefinition = "NUMERIC")
	private Short tpAditivo;
	@Column(name = "nu_ddi_1_garantidor", columnDefinition = "NUMERIC")
	private Short nuDdi1Garantidor;
	@Column(name = "nu_ddi_2_garantidor", columnDefinition = "NUMERIC")
	private Short nuDdi2Garantidor;
	@Column(name = "tp_garantidor")
	private Integer tpGarantidor;
	@Column(name = "id_endereco_garantidor")
	private Integer idEnderecoGarantidor;

	public HstRegistros() {
	}

	public HstRegistros(Long idHstRegistro) {
		this.idHstRegistro = idHstRegistro;
	}

	public HstRegistros(Long idHstRegistro, int idRegistro, Date dtCadastro, short tpDevedor, Short tpOrigem, BigDecimal vlDivida, BigDecimal vlEncargos, BigDecimal pcJurosAno, BigDecimal pcCorrecao, Date dtContrato, Date dtUltAtualiza,
			String nuContrato, Date dtFimContrato, String nmDevedor, int idUsuarioAtualiza, boolean inAtivo, int qtTotalParcelas, int qtTotalMeses, BigDecimal pcJurosMesCont, BigDecimal vlComissao, String tpOperacao) {
		this.idHstRegistro = idHstRegistro;
		this.idRegistro = idRegistro;
		this.dtCadastro = dtCadastro;
		this.tpDevedor = tpDevedor;
		this.tpOrigem = tpOrigem;
		this.vlDivida = vlDivida;
		this.vlEncargos = vlEncargos;
		this.pcJurosAno = pcJurosAno;
		this.pcCorrecao = pcCorrecao;
		this.dtContrato = dtContrato;
		this.dtUltAtualiza = dtUltAtualiza;
		this.nuContrato = nuContrato;
		this.dtFimContrato = dtFimContrato;
		this.nmDevedor = nmDevedor;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.inAtivo = inAtivo;
		this.qtTotalParcelas = qtTotalParcelas;
		this.qtTotalMeses = qtTotalMeses;
		this.pcJurosMesCont = pcJurosMesCont;
		this.vlComissao = vlComissao;
		this.tpOperacao = tpOperacao;
	}

	public int getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(int idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public short getTpDevedor() {
		return tpDevedor;
	}

	public void setTpDevedor(short tpDevedor) {
		this.tpDevedor = tpDevedor;
	}

	public String getNuCnpj() {
		return nuCnpj;
	}

	public void setNuCnpj(String nuCnpj) {
		this.nuCnpj = nuCnpj;
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

	public Short getTpOrigem() {
		return tpOrigem;
	}

	public void setTpOrigem(Short tpOrigem) {
		this.tpOrigem = tpOrigem;
	}

	public BigDecimal getVlDivida() {
		return vlDivida;
	}

	public void setVlDivida(BigDecimal vlDivida) {
		this.vlDivida = vlDivida;
	}

	public BigDecimal getVlEncargos() {
		return vlEncargos;
	}

	public void setVlEncargos(BigDecimal vlEncargos) {
		this.vlEncargos = vlEncargos;
	}

	public BigDecimal getPcJurosAno() {
		return pcJurosAno;
	}

	public void setPcJurosAno(BigDecimal pcJurosAno) {
		this.pcJurosAno = pcJurosAno;
	}

	public BigDecimal getPcCorrecao() {
		return pcCorrecao;
	}

	public void setPcCorrecao(BigDecimal pcCorrecao) {
		this.pcCorrecao = pcCorrecao;
	}

	public Date getDtContrato() {
		return dtContrato;
	}

	public void setDtContrato(Date dtContrato) {
		this.dtContrato = dtContrato;
	}

	public Integer getIdUsuarioRegistro() {
		return idUsuarioRegistro;
	}

	public void setIdUsuarioRegistro(Integer idUsuarioRegistro) {
		this.idUsuarioRegistro = idUsuarioRegistro;
	}

	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public Integer getIdMunicipioContrato() {
		return idMunicipioContrato;
	}

	public void setIdMunicipioContrato(Integer idMunicipioContrato) {
		this.idMunicipioContrato = idMunicipioContrato;
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

	public String getNuContrato() {
		return nuContrato;
	}

	public void setNuContrato(String nuContrato) {
		this.nuContrato = nuContrato;
	}

	public Date getDtFimContrato() {
		return dtFimContrato;
	}

	public void setDtFimContrato(Date dtFimContrato) {
		this.dtFimContrato = dtFimContrato;
	}

	public String getNmDevedor() {
		return nmDevedor;
	}

	public void setNmDevedor(String nmDevedor) {
		this.nmDevedor = nmDevedor;
	}

	public Integer getIdTipoContrato() {
		return idTipoContrato;
	}

	public void setIdTipoContrato(Integer idTipoContrato) {
		this.idTipoContrato = idTipoContrato;
	}

	public BigDecimal getVlContrato() {
		return vlContrato;
	}

	public void setVlContrato(BigDecimal vlContrato) {
		this.vlContrato = vlContrato;
	}

	public BigDecimal getVlIof() {
		return vlIof;
	}

	public void setVlIof(BigDecimal vlIof) {
		this.vlIof = vlIof;
	}

	public Boolean getInMulta() {
		return inMulta;
	}

	public void setInMulta(Boolean inMulta) {
		this.inMulta = inMulta;
	}

	public Boolean getInMora() {
		return inMora;
	}

	public void setInMora(Boolean inMora) {
		this.inMora = inMora;
	}

	public Integer getIdUf() {
		return idUf;
	}

	public void setIdUf(Integer idUf) {
		this.idUf = idUf;
	}

	public Integer getIdCredor() {
		return idCredor;
	}

	public void setIdCredor(Integer idCredor) {
		this.idCredor = idCredor;
	}

	public int getIdUsuarioAtualiza() {
		return idUsuarioAtualiza;
	}

	public void setIdUsuarioAtualiza(int idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Date getDtAnulacao() {
		return dtAnulacao;
	}

	public void setDtAnulacao(Date dtAnulacao) {
		this.dtAnulacao = dtAnulacao;
	}

	public boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public String getDsMensagem() {
		return dsMensagem;
	}

	public void setDsMensagem(String dsMensagem) {
		this.dsMensagem = dsMensagem;
	}

	public byte[] getImXmlEspelho() {
		return imXmlEspelho;
	}

	public void setImXmlEspelho(byte[] imXmlEspelho) {
		this.imXmlEspelho = imXmlEspelho;
	}

	public BigDecimal getVlRegistro() {
		return vlRegistro;
	}

	public void setVlRegistro(BigDecimal vlRegistro) {
		this.vlRegistro = vlRegistro;
	}

	public Integer getIdTipoFinanc() {
		return idTipoFinanc;
	}

	public void setIdTipoFinanc(Integer idTipoFinanc) {
		this.idTipoFinanc = idTipoFinanc;
	}

	public int getQtTotalParcelas() {
		return qtTotalParcelas;
	}

	public void setQtTotalParcelas(int qtTotalParcelas) {
		this.qtTotalParcelas = qtTotalParcelas;
	}

	public int getQtTotalMeses() {
		return qtTotalMeses;
	}

	public void setQtTotalMeses(int qtTotalMeses) {
		this.qtTotalMeses = qtTotalMeses;
	}

	public BigDecimal getPcJurosMesCont() {
		return pcJurosMesCont;
	}

	public void setPcJurosMesCont(BigDecimal pcJurosMesCont) {
		this.pcJurosMesCont = pcJurosMesCont;
	}

	public BigDecimal getVlComissao() {
		return vlComissao;
	}

	public void setVlComissao(BigDecimal vlComissao) {
		this.vlComissao = vlComissao;
	}

	public Long getIdHstRegistro() {
		return idHstRegistro;
	}

	public void setIdHstRegistro(Long idHstRegistro) {
		this.idHstRegistro = idHstRegistro;
	}

	public String getTpOperacao() {
		return tpOperacao;
	}

	public void setTpOperacao(String tpOperacao) {
		this.tpOperacao = tpOperacao;
	}

	public Integer getIdRegistroPai() {
		return idRegistroPai;
	}

	public void setIdRegistroPai(Integer idRegistroPai) {
		this.idRegistroPai = idRegistroPai;
	}

	public Date getDtEmisCertidao() {
		return dtEmisCertidao;
	}

	public void setDtEmisCertidao(Date dtEmisCertidao) {
		this.dtEmisCertidao = dtEmisCertidao;
	}

	public byte[] getImCertidao() {
		return imCertidao;
	}

	public void setImCertidao(byte[] imCertidao) {
		this.imCertidao = imCertidao;
	}

	public Date getDtBaixa() {
		return dtBaixa;
	}

	public void setDtBaixa(Date dtBaixa) {
		this.dtBaixa = dtBaixa;
	}

	public BigDecimal getVlParcela() {
		return vlParcela;
	}

	public void setVlParcela(BigDecimal vlParcela) {
		this.vlParcela = vlParcela;
	}

	public Date getDtParcela1() {
		return dtParcela1;
	}

	public void setDtParcela1(Date dtParcela1) {
		this.dtParcela1 = dtParcela1;
	}

	public Date getDtLiberaCredito() {
		return dtLiberaCredito;
	}

	public void setDtLiberaCredito(Date dtLiberaCredito) {
		this.dtLiberaCredito = dtLiberaCredito;
	}

	public String getNuGrupoConsorcio() {
		return nuGrupoConsorcio;
	}

	public void setNuGrupoConsorcio(String nuGrupoConsorcio) {
		this.nuGrupoConsorcio = nuGrupoConsorcio;
	}

	public Integer getNuCotaConsorcio() {
		return nuCotaConsorcio;
	}

	public void setNuCotaConsorcio(Integer nuCotaConsorcio) {
		this.nuCotaConsorcio = nuCotaConsorcio;
	}

	public BigDecimal getVlTxMulta() {
		return vlTxMulta;
	}

	public void setVlTxMulta(BigDecimal vlTxMulta) {
		this.vlTxMulta = vlTxMulta;
	}

	public BigDecimal getVlTxMora() {
		return vlTxMora;
	}

	public void setVlTxMora(BigDecimal vlTxMora) {
		this.vlTxMora = vlTxMora;
	}

	public String getNuIp() {
		return nuIp;
	}

	public void setNuIp(String nuIp) {
		this.nuIp = nuIp;
	}

	public String getDsClausulaLegal() {
		return dsClausulaLegal;
	}

	public void setDsClausulaLegal(String dsClausulaLegal) {
		this.dsClausulaLegal = dsClausulaLegal;
	}

	public String getDsEmailGarantidor() {
		return dsEmailGarantidor;
	}

	public void setDsEmailGarantidor(String dsEmailGarantidor) {
		this.dsEmailGarantidor = dsEmailGarantidor;
	}

	public Date getDtCompra() {
		return dtCompra;
	}

	public void setDtCompra(Date dtCompra) {
		this.dtCompra = dtCompra;
	}

	public Integer getIdIndiceCorrecao() {
		return idIndiceCorrecao;
	}

	public void setIdIndiceCorrecao(Integer idIndiceCorrecao) {
		this.idIndiceCorrecao = idIndiceCorrecao;
	}

	public Boolean getInPenalidade() {
		return inPenalidade;
	}

	public void setInPenalidade(Boolean inPenalidade) {
		this.inPenalidade = inPenalidade;
	}

	public String getNmGarantidor() {
		return nmGarantidor;
	}

	public void setNmGarantidor(String nmGarantidor) {
		this.nmGarantidor = nmGarantidor;
	}

	public String getNuCnpjGarantidor() {
		return nuCnpjGarantidor;
	}

	public void setNuCnpjGarantidor(String nuCnpjGarantidor) {
		this.nuCnpjGarantidor = nuCnpjGarantidor;
	}

	public String getNuCpfGarantidor() {
		return nuCpfGarantidor;
	}

	public void setNuCpfGarantidor(String nuCpfGarantidor) {
		this.nuCpfGarantidor = nuCpfGarantidor;
	}

	public Short getNuDdd1Garantidor() {
		return nuDdd1Garantidor;
	}

	public void setNuDdd1Garantidor(Short nuDdd1Garantidor) {
		this.nuDdd1Garantidor = nuDdd1Garantidor;
	}

	public Short getNuDdd2Garantidor() {
		return nuDdd2Garantidor;
	}

	public void setNuDdd2Garantidor(Short nuDdd2Garantidor) {
		this.nuDdd2Garantidor = nuDdd2Garantidor;
	}

	public Long getNuTelefone1Garantidor() {
		return nuTelefone1Garantidor;
	}

	public void setNuTelefone1Garantidor(Long nuTelefone1Garantidor) {
		this.nuTelefone1Garantidor = nuTelefone1Garantidor;
	}

	public Long getNuTelefone2Garantidor() {
		return nuTelefone2Garantidor;
	}

	public void setNuTelefone2Garantidor(Long nuTelefone2Garantidor) {
		this.nuTelefone2Garantidor = nuTelefone2Garantidor;
	}

	public Short getTpAditivo() {
		return tpAditivo;
	}

	public void setTpAditivo(Short tpAditivo) {
		this.tpAditivo = tpAditivo;
	}

	public Short getNuDdi1Garantidor() {
		return nuDdi1Garantidor;
	}

	public void setNuDdi1Garantidor(Short nuDdi1Garantidor) {
		this.nuDdi1Garantidor = nuDdi1Garantidor;
	}

	public Short getNuDdi2Garantidor() {
		return nuDdi2Garantidor;
	}

	public void setNuDdi2Garantidor(Short nuDdi2Garantidor) {
		this.nuDdi2Garantidor = nuDdi2Garantidor;
	}

	public Integer getTpGarantidor() {
		return tpGarantidor;
	}

	public void setTpGarantidor(Integer tpGarantidor) {
		this.tpGarantidor = tpGarantidor;
	}

	public Integer getIdEnderecoGarantidor() {
		return idEnderecoGarantidor;
	}

	public void setIdEnderecoGarantidor(Integer idEnderecoGarantidor) {
		this.idEnderecoGarantidor = idEnderecoGarantidor;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idHstRegistro != null ? idHstRegistro.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof HstRegistros)) {
			return false;
		}
		HstRegistros other = (HstRegistros) object;
		if ((this.idHstRegistro == null && other.idHstRegistro != null) || (this.idHstRegistro != null && !this.idHstRegistro.equals(other.idHstRegistro))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.HstRegistros[ idHstRegistro=" + idHstRegistro + " ]";
	}

}
