/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author urbano.menegato
 */
//@Entity
//@Table(name = "vw_registros_unicos")
//@NamedQueries({ @NamedQuery(name = "VwRegistrosUnicos.findAll", query = "SELECT r FROM VwRegistrosUnicos r") })
//@DynamicUpdate
public class VwRegistrosUnicos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_registro")
	private Integer idRegistro;

	@Basic(optional = false)
	@Column(name = "dt_cadastro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtCadastro;

	@Basic(optional = false)
	@Column(name = "tp_devedor", columnDefinition = "NUMERIC")
	private Short tpDevedor;

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

	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;

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

	@Column(name = "vl_contrato")
	private BigDecimal vlContrato;

	@Column(name = "vl_iof")
	private BigDecimal vlIof;

	@Basic(optional = false)
	@Column(name = "in_multa")
	private Boolean inMulta;

	@Basic(optional = false)
	@Column(name = "in_mora")
	private Boolean inMora;

	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;

	@Column(name = "dt_anulacao")
	@Temporal(TemporalType.DATE)
	private Date dtAnulacao;

	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Column(name = "ds_mensagem")
	private String dsMensagem;

	@Column(name = "im_xml_espelho", columnDefinition = "bytea")
	private byte[] imXmlEspelho;

	@Column(name = "vl_registro")
	private BigDecimal vlRegistro;

	@Basic(optional = false)
	@Column(name = "qt_total_parcelas")
	private Integer qtTotalParcelas;

	@Basic(optional = false)
	@Column(name = "qt_total_meses")
	private Integer qtTotalMeses;

	@Basic(optional = false)
	@Column(name = "pc_juros_mes_cont")
	private BigDecimal pcJurosMesCont;

	@Basic(optional = false)
	@Column(name = "vl_comissao")
	private BigDecimal vlComissao;

	@Column(name = "im_certidao", columnDefinition = "bytea")
	private byte[] imCertidao;

	@Column(name = "dt_emis_certidao")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtEmisCertidao;

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

	@Column(name = "in_penalidade")
	private Boolean inPenalidade;

	@Basic(optional = false)
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

	@Column(name = "ds_clausula_legal")
	private String dsClausulaLegal;

	@Column(name = "ds_email_garantidor")
	private String dsEmailGarantidor;

	@Column(name = "dt_compra")
	@Temporal(TemporalType.DATE)
	private Date dtCompra;

	@Column(name = "tp_garantidor", columnDefinition = "NUMERIC")
	private Integer tpGarantidor;

	@Column(name = "nu_ddi_1_garantidor", columnDefinition = "NUMERIC")
	private Short nuDdi1Garantidor;

	@Column(name = "nu_ddi_2_garantidor", columnDefinition = "NUMERIC")
	private Short nuDdi2Garantidor;

	@Column(name = "tp_operacao")
	private String tpOperacao;

	@OneToMany(mappedBy = "idRegistro")
	private List<HstRegistros> hstRegistrosList;

	@Column(name = "in_situacao_contrato_dmg")
	private Integer inSituacaoContratoDmg;

	@Column(name = "ufimovelcredor")
	private String ufimovelcredor;

	@Column(name = "ufliberacaocredito")
	private String ufliberacaocredito;

	@Column(name = "numero_sequencial_transacao")
	private String numeroSequencialTransacao;

	@Column(name = "codigo_transacao")
	private String codigoTransacao;

	@Basic(optional = false)
	@Column(name = "in_b3")
	private Boolean inB3;

	@OneToMany(mappedBy = "idRegistro")
	private List<LivrosItens> livrosItensList;

	@JoinColumn(name = "id_credor", referencedColumnName = "id_credor")
	@ManyToOne(optional = false)
	private Credores idCredor;

	@JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Enderecos idEndereco;

	@JoinColumn(name = "id_endereco_garantidor", referencedColumnName = "id_endereco")
	@ManyToOne( fetch = FetchType.LAZY)
	private Enderecos idEnderecoGarantidor;

	@JoinColumn(name = "id_municipio_contrato", referencedColumnName = "id_municipio")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Municipios idMunicipioContrato;

	@OneToMany(mappedBy = "idRegistroPai")
	private List<Registros> registrosList;

	@JoinColumn(name = "id_registro_pai", referencedColumnName = "id_registro")
	@ManyToOne(fetch = FetchType.LAZY)
	private Registros idRegistroPai;

	@JoinColumn(name = "id_status", referencedColumnName = "id_status")
	@ManyToOne(optional = false)
	private Status idStatus;

	@JoinColumn(name = "id_tipo_contrato", referencedColumnName = "id_tipo_contrato")
	@ManyToOne(optional = false)
	private TiposContratos idTipoContrato;

	@JoinColumn(name = "id_tipo_financ", referencedColumnName = "id_tipo_financ")
	@ManyToOne
	private TiposFinancs idTipoFinanc;

	@JoinColumn(name = "id_uf", referencedColumnName = "id_uf")
	@ManyToOne(fetch = FetchType.LAZY)
	private Ufs idUf;

	@JoinColumn(name = "id_usuario_registro", referencedColumnName = "id_usuario")
	@ManyToOne(optional = false)
	private Usuarios idUsuarioRegistro;

	@OneToMany(mappedBy = "idRegistro")
	private List<DocsRegistros> docsRegistrosList;

	@OneToMany(mappedBy = "idRegistro")
	private List<RegsVeiculos> regsVeiculosList;

	@JoinColumn(name = "id_indice_correcao", referencedColumnName = "id_indice_correcao")
	@ManyToOne
	private IndicesCorrecao idIndiceCorrecao;

	@JoinColumn(name = "id_remessa", referencedColumnName = "id_remessa")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Remessas idRemessa;

	@JoinColumn(name = "id_tipo_operacao", referencedColumnName = "id_tipo_operacao")
	@ManyToOne(optional = false)
	private TipoOperacao tipoOperacao;

	public Integer getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Integer idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Short getTpDevedor() {
		return tpDevedor;
	}

	public void setTpDevedor(Short tpDevedor) {
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

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
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

	public Integer getIdUsuarioAtualiza() {
		return idUsuarioAtualiza;
	}

	public void setIdUsuarioAtualiza(Integer idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Date getDtAnulacao() {
		return dtAnulacao;
	}

	public void setDtAnulacao(Date dtAnulacao) {
		this.dtAnulacao = dtAnulacao;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
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

	public Integer getQtTotalParcelas() {
		return qtTotalParcelas;
	}

	public void setQtTotalParcelas(Integer qtTotalParcelas) {
		this.qtTotalParcelas = qtTotalParcelas;
	}

	public Integer getQtTotalMeses() {
		return qtTotalMeses;
	}

	public void setQtTotalMeses(Integer qtTotalMeses) {
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

	public byte[] getImCertidao() {
		return imCertidao;
	}

	public void setImCertidao(byte[] imCertidao) {
		this.imCertidao = imCertidao;
	}

	public Date getDtEmisCertidao() {
		return dtEmisCertidao;
	}

	public void setDtEmisCertidao(Date dtEmisCertidao) {
		this.dtEmisCertidao = dtEmisCertidao;
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

	public List<LivrosItens> getLivrosItensList() {
		return livrosItensList;
	}

	public void setLivrosItensList(List<LivrosItens> livrosItensList) {
		this.livrosItensList = livrosItensList;
	}

	public Credores getIdCredor() {
		return idCredor;
	}

	public void setIdCredor(Credores idCredor) {
		this.idCredor = idCredor;
	}

	public Enderecos getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Enderecos idEndereco) {
		this.idEndereco = idEndereco;
	}

	public Municipios getIdMunicipioContrato() {
		return idMunicipioContrato;
	}

	public void setIdMunicipioContrato(Municipios idMunicipioContrato) {
		this.idMunicipioContrato = idMunicipioContrato;
	}

	public List<Registros> getRegistrosList() {
		return registrosList;
	}

	public void setRegistrosList(List<Registros> registrosList) {
		this.registrosList = registrosList;
	}

	public Registros getIdRegistroPai() {
		return idRegistroPai;
	}

	public void setIdRegistroPai(Registros idRegistroPai) {
		this.idRegistroPai = idRegistroPai;
	}

	public Status getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Status idStatus) {
		this.idStatus = idStatus;
	}

	public TiposContratos getIdTipoContrato() {
		return idTipoContrato;
	}

	public void setIdTipoContrato(TiposContratos idTipoContrato) {
		this.idTipoContrato = idTipoContrato;
	}

	public TiposFinancs getIdTipoFinanc() {
		return idTipoFinanc;
	}

	public void setIdTipoFinanc(TiposFinancs idTipoFinanc) {
		this.idTipoFinanc = idTipoFinanc;
	}

	public Ufs getIdUf() {
		return idUf;
	}

	public void setIdUf(Ufs idUf) {
		this.idUf = idUf;
	}

	public Usuarios getIdUsuarioRegistro() {
		return idUsuarioRegistro;
	}

	public void setIdUsuarioRegistro(Usuarios idUsuarioRegistro) {
		this.idUsuarioRegistro = idUsuarioRegistro;
	}

	public List<DocsRegistros> getDocsRegistrosList() {
		return docsRegistrosList;
	}

	public void setDocsRegistrosList(List<DocsRegistros> docsRegistrosList) {
		this.docsRegistrosList = docsRegistrosList;
	}

	public List<RegsVeiculos> getRegsVeiculosList() {
		return regsVeiculosList;
	}

	public void setRegsVeiculosList(List<RegsVeiculos> regsVeiculosList) {
		this.regsVeiculosList = regsVeiculosList;
	}

	public Remessas getIdRemessa() {
		return idRemessa;
	}

	public void setIdRemessa(Remessas idRemessa) {
		this.idRemessa = idRemessa;
	}

	public Boolean getInPenalidade() {
		return inPenalidade;
	}

	public String getNmGarantidor() {
		return nmGarantidor;
	}

	public String getNuCnpjGarantidor() {
		return nuCnpjGarantidor;
	}

	public String getNuCpfGarantidor() {
		return nuCpfGarantidor;
	}

	public Short getNuDdd1Garantidor() {
		return nuDdd1Garantidor;
	}

	public Short getNuDdd2Garantidor() {
		return nuDdd2Garantidor;
	}

	public Long getNuTelefone1Garantidor() {
		return nuTelefone1Garantidor;
	}

	public Long getNuTelefone2Garantidor() {
		return nuTelefone2Garantidor;
	}

	public Short getTpAditivo() {
		return tpAditivo;
	}

	public String getDsClausulaLegal() {
		return dsClausulaLegal;
	}

	public String getDsEmailGarantidor() {
		return dsEmailGarantidor;
	}

	public Date getDtCompra() {
		return dtCompra;
	}

	public void setInPenalidade(Boolean inPenalidade) {
		this.inPenalidade = inPenalidade;
	}

	public void setNmGarantidor(String nmGarantidor) {
		this.nmGarantidor = nmGarantidor;
	}

	public void setNuCnpjGarantidor(String nuCnpjGarantidor) {
		this.nuCnpjGarantidor = nuCnpjGarantidor;
	}

	public void setNuCpfGarantidor(String nuCpfGarantidor) {
		this.nuCpfGarantidor = nuCpfGarantidor;
	}

	public void setNuDdd1Garantidor(Short nuDdd1Garantidor) {
		this.nuDdd1Garantidor = nuDdd1Garantidor;
	}

	public void setNuDdd2Garantidor(Short nuDdd2Garantidor) {
		this.nuDdd2Garantidor = nuDdd2Garantidor;
	}

	public void setNuTelefone1Garantidor(Long nuTelefone1Garantidor) {
		this.nuTelefone1Garantidor = nuTelefone1Garantidor;
	}

	public void setNuTelefone2Garantidor(Long nuTelefone2Garantidor) {
		this.nuTelefone2Garantidor = nuTelefone2Garantidor;
	}

	public void setTpAditivo(Short tpAditivo) {
		this.tpAditivo = tpAditivo;
	}

	public void setDsClausulaLegal(String dsClausulaLegal) {
		this.dsClausulaLegal = dsClausulaLegal;
	}

	public void setDsEmailGarantidor(String dsEmailGarantidor) {
		this.dsEmailGarantidor = dsEmailGarantidor;
	}

	public void setDtCompra(Date dtCompra) {
		this.dtCompra = dtCompra;
	}

	public Integer getTpGarantidor() {
		return tpGarantidor;
	}

	public Short getNuDdi1Garantidor() {
		return nuDdi1Garantidor;
	}

	public Short getNuDdi2Garantidor() {
		return nuDdi2Garantidor;
	}

	public void setTpGarantidor(Integer tpGarantidor) {
		this.tpGarantidor = tpGarantidor;
	}

	public void setNuDdi1Garantidor(Short nuDdi1Garantidor) {
		this.nuDdi1Garantidor = nuDdi1Garantidor;
	}

	public void setNuDdi2Garantidor(Short nuDdi2Garantidor) {
		this.nuDdi2Garantidor = nuDdi2Garantidor;
	}

	public IndicesCorrecao getIdIndiceCorrecao() {
		return idIndiceCorrecao;
	}

	public void setIdIndiceCorrecao(IndicesCorrecao idIndiceCorrecao) {
		this.idIndiceCorrecao = idIndiceCorrecao;
	}

	public Enderecos getIdEnderecoGarantidor() {
		return idEnderecoGarantidor;
	}

	public void setIdEnderecoGarantidor(Enderecos idEnderecoGarantidor) {
		this.idEnderecoGarantidor = idEnderecoGarantidor;
	}

	public String getTpOperacao() {
		return tpOperacao;
	}

	public void setTpOperacao(String tpOperacao) {
		this.tpOperacao = tpOperacao;
	}

	public List<HstRegistros> getHstRegistrosList() {
		return hstRegistrosList;
	}

	public void setHstRegistrosList(List<HstRegistros> hstRegistrosList) {
		this.hstRegistrosList = hstRegistrosList;
	}

	public Integer getInSituacaoContratoDmg() {
		return inSituacaoContratoDmg;
	}

	public void setInSituacaoContratoDmg(Integer inSituacaoContratoDmg) {
		this.inSituacaoContratoDmg = inSituacaoContratoDmg;
	}

	public String getUfimovelcredor() {
		return ufimovelcredor;
	}

	public void setUfimovelcredor(String ufimovelcredor) {
		this.ufimovelcredor = ufimovelcredor;
	}

	public String getUfliberacaocredito() {
		return ufliberacaocredito;
	}

	public void setUfliberacaocredito(String ufliberacaocredito) {
		this.ufliberacaocredito = ufliberacaocredito;
	}

	public String getNumeroSequencialTransacao() {
		return numeroSequencialTransacao;
	}

	public void setNumeroSequencialTransacao(String numeroSequencialTransacao) {
		this.numeroSequencialTransacao = numeroSequencialTransacao;
	}

	public String getCodigoTransacao() {
		return codigoTransacao;
	}

	public void setCodigoTransacao(String codigoTransacao) {
		this.codigoTransacao = codigoTransacao;
	}

	public Boolean isInB3() {
		return inB3;
	}

	public void setInB3(Boolean inB3) {
		this.inB3 = inB3;
	}

	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(TipoOperacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	@Override
	public String toString() {
		return "Registros [idRegistro=" + idRegistro + ", "
				+ "dtCadastro=" + dtCadastro + ", "
				+ "tpDevedor=" + tpDevedor + ", "
				+ "nuCnpj=" + nuCnpj + ", "
				+ "nuCpf=" + nuCpf + ", "
				+ "dsEmail=" + dsEmail + ", "
				+ "nuDdd1=" + nuDdd1 + ", "
				+ "nuTelefone1=" + nuTelefone1
				+ ", nuDdd2=" + nuDdd2 + ", "
				+ "nuTelefone2=" + nuTelefone2 + ", "
				+ "tpOrigem=" + tpOrigem + ", "
				+ "vlDivida=" + vlDivida + ", "
				+ "vlEncargos=" + vlEncargos + ", "
				+ "pcJurosAno=" + pcJurosAno + ", "
				+ "pcCorrecao=" + pcCorrecao + ", "
				+ "dtContrato=" + dtContrato
				+ ", dtUltAtualiza=" + dtUltAtualiza + ", "
				+ "nuDdi1=" + nuDdi1 + ", nuDdi2=" + nuDdi2 + ", "
				+ "nuContrato=" + nuContrato + ", dtFimContrato=" + dtFimContrato + ", "
				+ "nmDevedor=" + nmDevedor + ", vlContrato=" + vlContrato + ", vlIof=" + vlIof
				+ ", inMulta=" + inMulta + ", inMora=" + inMora + ", idUsuarioAtualiza=" + idUsuarioAtualiza + ", dtAnulacao=" + dtAnulacao + ", inAtivo=" + inAtivo + ", dsMensagem=" + dsMensagem + ", imXmlEspelho=" + Arrays.toString(imXmlEspelho)
				+ ", vlRegistro=" + vlRegistro + ", qtTotalParcelas=" + qtTotalParcelas + ", qtTotalMeses=" + qtTotalMeses + ", pcJurosMesCont=" + pcJurosMesCont + ", vlComissao=" + vlComissao + ", imCertidao=" + Arrays.toString(imCertidao)
				+ ", dtEmisCertidao=" + dtEmisCertidao + ", dtBaixa=" + dtBaixa + ", vlParcela=" + vlParcela + ", dtParcela1=" + dtParcela1 + ", dtLiberaCredito=" + dtLiberaCredito + ", nuGrupoConsorcio=" + nuGrupoConsorcio + ", nuCotaConsorcio="
				+ nuCotaConsorcio + ", vlTxMulta=" + vlTxMulta + ", vlTxMora=" + vlTxMora + ", nuIp=" + nuIp + ", idCredor=" + idCredor + ", idEndereco=" + idEndereco + ", idEnderecoGarantidor=" + idEnderecoGarantidor + ", idMunicipioContrato="
				+ idMunicipioContrato + ", idStatus=" + idStatus + ", idTipoContrato=" + idTipoContrato + ", idTipoFinanc=" + idTipoFinanc + ", idUf=" + idUf + ", idUsuarioRegistro=" + idUsuarioRegistro
				+ ", inPenalidade=" + inPenalidade + ", nmGarantidor=" + nmGarantidor + ", nuCnpjGarantidor=" + nuCnpjGarantidor + ", nuCpfGarantidor=" + nuCpfGarantidor + ", nuDdd1Garantidor=" + nuDdd1Garantidor + ", nuDdd2Garantidor="
				+ nuDdd2Garantidor + ", nuTelefone1Garantidor=" + nuTelefone1Garantidor + ", nuTelefone2Garantidor=" + nuTelefone2Garantidor + ", tpAditivo=" + tpAditivo + ", dsClausulaLegal=" + dsClausulaLegal + ", dsEmailGarantidor="
				+ dsEmailGarantidor + ", dtCompra=" + dtCompra + ", tpGarantidor=" + tpGarantidor + ", nuDdi1Garantidor=" + nuDdi1Garantidor + ", nuDdi2Garantidor=" + nuDdi2Garantidor + ", idIndiceCorrecao=" + idIndiceCorrecao + "]";
	}
}
