package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "log_unid_oper")
public class LogUnidOper implements Serializable{

	private static final long serialVersionUID = 1L;
	
    @Column(name = "cep")
    private String cep;
    @Column(name = "ufe_sg")
    private String ufeSg;
    @Column(name = "loc_nu", columnDefinition = "NUMERIC")
    private Long locNu;
    @Column(name = "bai_nu", columnDefinition = "NUMERIC")
    private Long baiNu;
    @Column(name = "log_nu", columnDefinition = "NUMERIC")
    private Long logNu;
    @Column(name = "uop_no")
    private String uopNo;
    @Column(name = "uop_endereco")
    private String uopEndereco;
    @Column(name = "uop_in_cp")
    private String uopInCp;
    @Column(name = "uop_no_abrev")
    private String uopNoAbrev;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "uop_nu", columnDefinition = "NUMERIC")
    private Long uop_nu;
    
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
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
	public Long getBaiNu() {
		return baiNu;
	}
	public void setBaiNu(Long baiNu) {
		this.baiNu = baiNu;
	}
	public Long getLogNu() {
		return logNu;
	}
	public void setLogNu(Long logNu) {
		this.logNu = logNu;
	}
	public String getUopNo() {
		return uopNo;
	}
	public void setUopNo(String uopNo) {
		this.uopNo = uopNo;
	}
	public String getUopEndereco() {
		return uopEndereco;
	}
	public void setUopEndereco(String uopEndereco) {
		this.uopEndereco = uopEndereco;
	}
	public String getUopInCp() {
		return uopInCp;
	}
	public void setUopInCp(String uopInCp) {
		this.uopInCp = uopInCp;
	}
	public String getUopNoAbrev() {
		return uopNoAbrev;
	}
	public void setUopNoAbrev(String uopNoAbrev) {
		this.uopNoAbrev = uopNoAbrev;
	}
	public Long getUop_nu() {
		return uop_nu;
	}
	public void setUop_nu(Long uop_nu) {
		this.uop_nu = uop_nu;
	}
    
	
    
}
