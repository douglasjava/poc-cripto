/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;



import com.demo.cripto.utils.CryptoConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author peterson.silva
 */
@Builder
@Entity
@Table(name = "regs_veiculos")
@NamedQueries({ @NamedQuery(name = "RegsVeiculos.findAll", query = "SELECT r FROM RegsVeiculos r") })
@DynamicUpdate
@AllArgsConstructor
public class RegsVeiculos implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	@Basic(optional = false)
	@Column(name = "nu_chassi")
	//@Convert(converter = CryptoConverter.class)
	private String nuChassi;

	@Column(name = "nu_chassi_remarcado")
	private String nuChassiRemarcado;

	@Column(name = "nu_placa")
	//@Convert(converter = CryptoConverter.class)
	private String nuPlaca;

	@Column(name = "nu_renavam")
	private String nuRenavam;

	@Column(name = "nm_cor_veiculo")
	//@Convert(converter = CryptoConverter.class)
	private String nmCorVeiculo;

	@Basic(optional = false)
	@Column(name = "nu_ano_fabrica", columnDefinition = "NUMERIC")
	private Short nuAnoFabrica;

	@Basic(optional = false)
	@Column(name = "nu_ano_modelo", columnDefinition = "NUMERIC")
	private Short nuAnoModelo;

	@Basic(optional = false)
	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Basic(optional = false)
	@Column(name = "id_usuario_atualiza")
	private Integer idUsuarioAtualiza;

	@UpdateTimestamp
	@Basic(optional = false)
	@Column(name = "dt_ult_atualiza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltAtualiza;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_reg_veiculo")
	private Integer idRegVeiculo;

	@CreationTimestamp
	@Column(name = "dt_registro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtRegistro;

	@Column(name = "nu_registro")
	private String nuRegistro;

	@Column(name = "nu_restricao_sng", columnDefinition = "NUMERIC")
	private Integer nuRestricaoSng;

	@Column(name = "im_pdf_espelho", columnDefinition = "bytea")
	private byte[] imPdfEspelho;

	@OneToMany(mappedBy = "idRegVeiculo", fetch = FetchType.LAZY)
	private List<LivrosItens> livrosItensList;

	@JoinColumn(name = "id_marca", referencedColumnName = "id_marca")
	@ManyToOne
	private Marcas idMarca;

	@JoinColumn(name = "id_modelo", referencedColumnName = "id_modelo")
	@ManyToOne
	private Modelos idModelo;

	@JoinColumn(name = "id_municipio_placa", referencedColumnName = "id_municipio")
	@ManyToOne
	private Municipios idMunicipioPlaca;

	@JoinColumn(name = "id_registro", referencedColumnName = "id_registro", nullable = false)
	@ManyToOne
	private Registros idRegistro;

	@JoinColumn(name = "id_status", referencedColumnName = "id_status")
	@ManyToOne
	private Status idStatus;

	@JoinColumn(name = "id_status_gravame", referencedColumnName = "id_status_gravame")
	@ManyToOne
	private StatusGravame idStatusGravame;

	@JoinColumn(name = "id_tipo_veiculo", referencedColumnName = "id_tipo_veiculo")
	@ManyToOne
	private TiposVeiculos idTipoVeiculo;

	@Column(name = "in_situacao_gravame_dmg")
	private Integer inSituacaoGravameDmg;

	@Column(name = "in_situacao_veiculo_dmg")
	private Integer inSituacaoVeiculoDmg;

	@Column(name = "nu_registro_sircof")
	private String nuRegistroSircof;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idRegVeiculo")
	private List<LogRegistros> logRegistrosList;
	
	@Column(name = "id_reg_veiculo_db_rj")
	private Long idRegVeiculoDbRj;

	@Column(name = "id_transacao_hub")
	private Long idTransacaoHub;

	public RegsVeiculos() {
	}

	public RegsVeiculos(Integer idRegVeiculo) {
		this.idRegVeiculo = idRegVeiculo;
	}

	public RegsVeiculos(Integer idRegVeiculo, String nuChassi, short nuAnoFabrica, short nuAnoModelo, boolean inAtivo, int idUsuarioAtualiza, Date dtUltAtualiza) {
		this.idRegVeiculo = idRegVeiculo;
		this.nuChassi = nuChassi;
		this.nuAnoFabrica = nuAnoFabrica;
		this.nuAnoModelo = nuAnoModelo;
		this.inAtivo = inAtivo;
		this.idUsuarioAtualiza = idUsuarioAtualiza;
		this.dtUltAtualiza = dtUltAtualiza;
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

	public Integer getIdRegVeiculo() {
		return idRegVeiculo;
	}

	public void setIdRegVeiculo(Integer idRegVeiculo) {
		this.idRegVeiculo = idRegVeiculo;
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

	public byte[] getImPdfEspelho() {
		return imPdfEspelho;
	}

	public void setImPdfEspelho(byte[] imPdfEspelho) {
		this.imPdfEspelho = imPdfEspelho;
	}

	public List<LivrosItens> getLivrosItensList() {
		return livrosItensList;
	}

	public void setLivrosItensList(List<LivrosItens> livrosItensList) {
		this.livrosItensList = livrosItensList;
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

	public Municipios getIdMunicipioPlaca() {
		return idMunicipioPlaca;
	}

	public void setIdMunicipioPlaca(Municipios idMunicipioPlaca) {
		this.idMunicipioPlaca = idMunicipioPlaca;
	}

	public Registros getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Registros idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Status getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Status idStatus) {
		this.idStatus = idStatus;
	}

	public StatusGravame getIdStatusGravame() {
		return idStatusGravame;
	}

	public void setIdStatusGravame(StatusGravame idStatusGravame) {
		this.idStatusGravame = idStatusGravame;
	}

	public TiposVeiculos getIdTipoVeiculo() {
		return idTipoVeiculo;
	}

	public void setIdTipoVeiculo(TiposVeiculos idTipoVeiculo) {
		this.idTipoVeiculo = idTipoVeiculo;
	}

	public Integer getInSituacaoGravameDmg() {
		return inSituacaoGravameDmg;
	}

	public Integer getInSituacaoVeiculoDmg() {
		return inSituacaoVeiculoDmg;
	}

	public String getNuRegistroSircof() {
		return nuRegistroSircof;
	}

	public void setInSituacaoGravameDmg(Integer inSituacaoGravameDmg) {
		this.inSituacaoGravameDmg = inSituacaoGravameDmg;
	}

	public void setInSituacaoVeiculoDmg(Integer inSituacaoVeiculoDmg) {
		this.inSituacaoVeiculoDmg = inSituacaoVeiculoDmg;
	}

	public void setNuRegistroSircof(String nuRegistroSircof) {
		this.nuRegistroSircof = nuRegistroSircof;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idRegVeiculo != null ? idRegVeiculo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RegsVeiculos)) {
			return false;
		}
		RegsVeiculos other = (RegsVeiculos) object;
		if ((this.idRegVeiculo == null && other.idRegVeiculo != null) || (this.idRegVeiculo != null && !this.idRegVeiculo.equals(other.idRegVeiculo))) {
			return false;
		}
		return true;
	}

	public List<LogRegistros> getLogRegistrosList() {
		return logRegistrosList;
	}

	public void setLogRegistrosList(List<LogRegistros> logRegistrosList) {
		this.logRegistrosList = logRegistrosList;
	}

	@Override
	public String toString() {
		return "montreal.rcf.entity.RegsVeiculos[ idRegVeiculo=" + idRegVeiculo + " ]";
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void setNuAnoFabrica(Short nuAnoFabrica) {
		this.nuAnoFabrica = nuAnoFabrica;
	}

	public void setNuAnoModelo(Short nuAnoModelo) {
		this.nuAnoModelo = nuAnoModelo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public void setIdUsuarioAtualiza(Integer idUsuarioAtualiza) {
		this.idUsuarioAtualiza = idUsuarioAtualiza;
	}

	public Long getIdRegVeiculoDbRj() {
		return idRegVeiculoDbRj;
	}

	public void setIdRegVeiculoDbRj(Long idRegVeiculoDbRj) {
		this.idRegVeiculoDbRj = idRegVeiculoDbRj;
	}

	public Long getIdTransacaoHub() {
		return idTransacaoHub;
	}

	public void setIdTransacaoHub(Long idTransacaoHub) {
		this.idTransacaoHub = idTransacaoHub;
	}
}

