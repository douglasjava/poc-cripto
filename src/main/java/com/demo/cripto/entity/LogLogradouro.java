package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "log_logradouro")
public class LogLogradouro implements Serializable{

	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cep")
    private String cep;
    @Column(name = "log_nu", columnDefinition = "NUMERIC")
    private Long logNu;
    @Column(name = "ufe_sg")
    private String ufeSg;
    @Column(name = "loc_nu", columnDefinition = "NUMERIC")
    private Long locNu;
    @Column(name = "bai_nu_ini", columnDefinition = "NUMERIC")
    private Long baiNuIni;
    @Column(name = "bai_nu_fim", columnDefinition = "NUMERIC")
    private Long baiNuFim;
    @Column(name = "log_no")
    private String logNo;
    @Column(name = "log_complemento")
    private String logComplemento;
    @Column(name = "tlo_tx")
    private String tloTx;
    @Column(name = "log_sta_tlo")
    private String logStaTlo;
    @Column(name = "log_no_abrev")
    private String logNoAbrev;
    
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Long getLogNu() {
		return logNu;
	}

	public void setLogNu(Long logNu) {
		this.logNu = logNu;
	}

	public String getUfeSg() {
		return ufeSg;
	}

	public void setUfeSg(String ufeSg) {
		this.ufeSg = ufeSg;
	}

	public Long getLocNu() {
		return locNu;
	}

	public void setLocNu(Long locNu) {
		this.locNu = locNu;
	}

	public Long getBaiNuIni() {
		return baiNuIni;
	}

	public void setBaiNuIni(Long baiNuIni) {
		this.baiNuIni = baiNuIni;
	}

	public Long getBaiNuFim() {
		return baiNuFim;
	}

	public void setBaiNuFim(Long baiNuFim) {
		this.baiNuFim = baiNuFim;
	}

	public String getLogNo() {
		return logNo;
	}

	public void setLogNo(String logNo) {
		this.logNo = logNo;
	}

	public String getLogComplemento() {
		return logComplemento;
	}

	public void setLogComplemento(String logComplemento) {
		this.logComplemento = logComplemento;
	}

	public String getTloTx() {
		return tloTx;
	}

	public void setTloTx(String tloTx) {
		this.tloTx = tloTx;
	}

	public String getLogStaTlo() {
		return logStaTlo;
	}

	public void setLogStaTlo(String logStaTlo) {
		this.logStaTlo = logStaTlo;
	}

	public String getLogNoAbrev() {
		return logNoAbrev;
	}

	public void setLogNoAbrev(String logNoAbrev) {
		this.logNoAbrev = logNoAbrev;
	}
    
    
}
