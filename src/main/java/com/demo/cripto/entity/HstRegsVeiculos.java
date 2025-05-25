/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author peterson.silva / alan.souza
 */
@Entity
@Table(name = "hst_regs_veiculos")
@NamedQueries({ @NamedQuery(name = "HstRegsVeiculos.findAll", query = "SELECT h FROM HstRegsVeiculos h") })
public class HstRegsVeiculos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_hst_reg_veiculo")
	private Long idHstRegVeiculo;

	@Basic(optional = false)
	@Column(name = "nu_chassi")
	private String nuChassi;

	@Column(name = "nu_chassi_remarcado")
	private String nuChassiRemarcado;

	@Column(name = "nu_placa")
	private String nuPlaca;

	@Column(name = "nu_renavam")
	private String nuRenavam;

	@Column(name = "nm_cor_veiculo")
	private String nmCorVeiculo;

	@Basic(optional = false)
	@Column(name = "nu_ano_fabrica", columnDefinition = "NUMERIC")
	private Short nuAnoFabrica;

	@Basic(optional = false)
	@Column(name = "nu_ano_modelo", columnDefinition = "NUMERIC")
	private Short nuAnoModelo;

	@JoinColumn(name = "id_marca", referencedColumnName = "id_marca")
	@ManyToOne
	private Marcas idMarca;

	@JoinColumn(name = "id_modelo", referencedColumnName = "id_modelo")
	@ManyToOne
	private Modelos idModelo;

	@JoinColumn(name = "id_registro", referencedColumnName = "id_registro")
	@ManyToOne
	private Registros idRegistro;

	@JoinColumn(name = "id_tipo_veiculo", referencedColumnName = "id_tipo_veiculo")
	@ManyToOne
	private TiposVeiculos idTipoVeiculo;

	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;

	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;

	@Basic(optional = false)
	@Column(name = "id_reg_veiculo")
	private Integer idRegVeiculo;

	@JoinColumn(name = "id_municipio_placa", referencedColumnName = "id_municipio")
	@ManyToOne
	private Municipios idMunicipioPlaca;

	@Column(name = "dt_registro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtRegistro;

	@Column(name = "nu_registro")
	private String nuRegistro;

	@Column(name = "nu_restricao_sng", columnDefinition = "NUMERIC")
	private Integer nuRestricaoSng;

	@JoinColumn(name = "id_status_gravame", referencedColumnName = "id_status_gravame")
	@ManyToOne
	private StatusGravame idStatusGravame;

	@Column(name = "im_pdf_espelho", columnDefinition = "bytea")
	private byte[] imPdfEspelho;

	@Basic(optional = false)
	@Column(name = "tp_operacao")
	private String tpOperacao;

	@JoinColumn(name = "id_status", referencedColumnName = "id_status")
	@ManyToOne
	private Status idStatus;

	public HstRegsVeiculos() {
	}

	public HstRegsVeiculos(Long idHstRegVeiculo) {
		this.idHstRegVeiculo = idHstRegVeiculo;
	}

	public HstRegsVeiculos(Long idHstRegVeiculo, String nuChassi, short nuAnoFabrica, short nuAnoModelo, boolean inAtivo, int idUsuarioAtualiza, Date dtUltAtualiza, int idRegVeiculo, String tpOperacao) {
		this.idHstRegVeiculo = idHstRegVeiculo;
		this.nuChassi = nuChassi;
		this.nuAnoFabrica = nuAnoFabrica;
		this.nuAnoModelo = nuAnoModelo;
		this.inAtivo = inAtivo;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
		this.idRegVeiculo = idRegVeiculo;
		this.tpOperacao = tpOperacao;
	}

	public String getNuChassi() {
		return nuChassi;
	}

	public void setNuChassi(String nuChassi) {
		this.nuChassi = nuChassi;
	}

	public String getNuChassiRemarcado() {
		return nuChassiRemarcado;
	}

	public void setNuChassiRemarcado(String nuChassiRemarcado) {
		this.nuChassiRemarcado = nuChassiRemarcado;
	}

	public String getNuPlaca() {
		return nuPlaca;
	}

	public void setNuPlaca(String nuPlaca) {
		this.nuPlaca = nuPlaca;
	}

	public String getNuRenavam() {
		return nuRenavam;
	}

	public void setNuRenavam(String nuRenavam) {
		this.nuRenavam = nuRenavam;
	}

	public String getNmCorVeiculo() {
		return nmCorVeiculo;
	}

	public void setNmCorVeiculo(String nmCorVeiculo) {
		this.nmCorVeiculo = nmCorVeiculo;
	}

	public short getNuAnoFabrica() {
		return nuAnoFabrica;
	}

	public void setNuAnoFabrica(short nuAnoFabrica) {
		this.nuAnoFabrica = nuAnoFabrica;
	}

	public short getNuAnoModelo() {
		return nuAnoModelo;
	}

	public void setNuAnoModelo(short nuAnoModelo) {
		this.nuAnoModelo = nuAnoModelo;
	}

	public Marcas getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Marcas idMarca) {
		this.idMarca = idMarca;
	}

	public Modelos getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(Modelos idModelo) {
		this.idModelo = idModelo;
	}

	public Registros getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Registros idRegistro) {
		this.idRegistro = idRegistro;
	}

	public TiposVeiculos getIdTipoVeiculo() {
		return idTipoVeiculo;
	}

	public void setIdTipoVeiculo(TiposVeiculos idTipoVeiculo) {
		this.idTipoVeiculo = idTipoVeiculo;
	}

	public boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public int getIdUsuarioAtualiza() {
		return idUsuarioAtualiza;
	}

	public void setIdUsuarioAtualiza(int idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Date getDtUltAtualiza() {
		return dtUltAtualiza;
	}

	public void setDtUltAtualiza(Date dtUltAtualiza) {
		this.dtUltAtualiza = dtUltAtualiza;
	}

	public int getIdRegVeiculo() {
		return idRegVeiculo;
	}

	public void setIdRegVeiculo(int idRegVeiculo) {
		this.idRegVeiculo = idRegVeiculo;
	}

	public Municipios getIdMunicipioPlaca() {
		return idMunicipioPlaca;
	}

	public void setIdMunicipioPlaca(Municipios idMunicipioPlaca) {
		this.idMunicipioPlaca = idMunicipioPlaca;
	}

	public Date getDtRegistro() {
		return dtRegistro;
	}

	public void setDtRegistro(Date dtRegistro) {
		this.dtRegistro = dtRegistro;
	}

	public String getNuRegistro() {
		return nuRegistro;
	}

	public void setNuRegistro(String nuRegistro) {
		this.nuRegistro = nuRegistro;
	}

	public Integer getNuRestricaoSng() {
		return nuRestricaoSng;
	}

	public void setNuRestricaoSng(Integer nuRestricaoSng) {
		this.nuRestricaoSng = nuRestricaoSng;
	}

	public StatusGravame getIdStatusGravame() {
		return idStatusGravame;
	}

	public void setIdStatusGravame(StatusGravame idStatusGravame) {
		this.idStatusGravame = idStatusGravame;
	}

	public byte[] getImPdfEspelho() {
		return imPdfEspelho;
	}

	public void setImPdfEspelho(byte[] imPdfEspelho) {
		this.imPdfEspelho = imPdfEspelho;
	}

	public Long getIdHstRegVeiculo() {
		return idHstRegVeiculo;
	}

	public void setIdHstRegVeiculo(Long idHstRegVeiculo) {
		this.idHstRegVeiculo = idHstRegVeiculo;
	}

	public String getTpOperacao() {
		return tpOperacao;
	}

	public void setTpOperacao(String tpOperacao) {
		this.tpOperacao = tpOperacao;
	}

	public Status getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Status idStatus) {
		this.idStatus = idStatus;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idHstRegVeiculo != null ? idHstRegVeiculo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof HstRegsVeiculos)) {
			return false;
		}
		HstRegsVeiculos other = (HstRegsVeiculos) object;
		if ((this.idHstRegVeiculo == null && other.idHstRegVeiculo != null) || (this.idHstRegVeiculo != null && !this.idHstRegVeiculo.equals(other.idHstRegVeiculo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.HstRegsVeiculos[ idHstRegVeiculo=" + idHstRegVeiculo + " ]";
	}

}
