package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "log_localidade")
public class LogLocalidade implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "loc_nu", columnDefinition = "NUMERIC")
    private Long locNu;
    @Column(name = "ufe_sg")
    private String ufeSg;
    @Column(name = "loc_no")
    private String locNo;
    @Column(name = "cep")
    private String cep;
    @Column(name = "loc_in_sit")
    private String locInSit;
    @Column(name = "loc_in_tipo_loc")
    private String locInTipoLoc;
    @Column(name = "loc_nu_sub", columnDefinition = "NUMERIC")
    private Long locNuSub;
    @Column(name = "loc_no_abrev")
    private String locNoAbrev;
    @Column(name = "mun_nu", columnDefinition = "NUMERIC")
    private Long munNu;
    
	public Long getLocNu() {
		return locNu;
	}
	public void setLocNu(Long locNu) {
		this.locNu = locNu;
	}
	public String getUfeSg() {
		return ufeSg;
	}
	public void setUfeSg(String ufeSg) {
		this.ufeSg = ufeSg;
	}
	public String getLocNo() {
		return locNo;
	}
	public void setLocNo(String locNo) {
		this.locNo = locNo;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLocInSit() {
		return locInSit;
	}
	public void setLocInSit(String locInSit) {
		this.locInSit = locInSit;
	}
	public String getLocInTipoLoc() {
		return locInTipoLoc;
	}
	public void setLocInTipoLoc(String locInTipoLoc) {
		this.locInTipoLoc = locInTipoLoc;
	}
	public Long getLocNuSub() {
		return locNuSub;
	}
	public void setLocNuSub(Long locNuSub) {
		this.locNuSub = locNuSub;
	}
	public String getLocNoAbrev() {
		return locNoAbrev;
	}
	public void setLocNoAbrev(String locNoAbrev) {
		this.locNoAbrev = locNoAbrev;
	}
	public Long getMunNu() {
		return munNu;
	}
	public void setMunNu(Long munNu) {
		this.munNu = munNu;
	}
    
    
    
}
