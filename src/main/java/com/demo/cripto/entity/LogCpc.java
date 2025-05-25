package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "log_cpc")
public class LogCpc implements Serializable{

	private static final long serialVersionUID = 1L;
	
    
    @Column(name = "cep")
    private String cep;
    @Column(name = "ufe_sg")
    private String ufeSg;
    @Column(name = "loc_nu", columnDefinition = "NUMERIC")
    private Long locNu;
    @Column(name = "cpc_no")
    private String cpcNo;
    @Column(name = "cpcEndereco")
    private String cpc_endereco;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cpc_nu", columnDefinition = "NUMERIC")
    private Long cpcNu;
    
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
	public String getCpcNo() {
		return cpcNo;
	}
	public void setCpcNo(String cpcNo) {
		this.cpcNo = cpcNo;
	}
	public String getCpc_endereco() {
		return cpc_endereco;
	}
	public void setCpc_endereco(String cpc_endereco) {
		this.cpc_endereco = cpc_endereco;
	}
	public Long getCpcNu() {
		return cpcNu;
	}
	public void setCpcNu(Long cpcNu) {
		this.cpcNu = cpcNu;
	}
    
    
}
