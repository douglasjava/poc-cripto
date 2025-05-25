package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "log_bairro")
public class LogBairro implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bai_nu", columnDefinition = "NUMERIC")
    private Long baiNu;
    @Column(name = "ufe_sg")
    private String ufeSg;
    @Column(name = "loc_nu", columnDefinition = "NUMERIC")
    private Long locNu;
    @Column(name = "bai_no")
    private String baiNo;
    @Column(name = "bai_no_abrev")
    private String baiNoAbrev;
    
	public Long getBaiNu() {
		return baiNu;
	}
	public void setBaiNu(Long baiNu) {
		this.baiNu = baiNu;
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
	public String getBaiNo() {
		return baiNo;
	}
	public void setBaiNo(String baiNo) {
		this.baiNo = baiNo;
	}
	public String getBaiNoAbrev() {
		return baiNoAbrev;
	}
	public void setBaiNoAbrev(String baiNoAbrev) {
		this.baiNoAbrev = baiNoAbrev;
	}

    
    
}
