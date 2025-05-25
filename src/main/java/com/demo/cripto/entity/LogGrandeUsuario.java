package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "log_grande_usuario")
public class LogGrandeUsuario implements Serializable{

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
    @Column(name = "gru_no")
    private String gruNo;
    @Column(name = "gru_endereco")
    private String gruEndereco;
    @Column(name = "gru_no_abrev")
    private String gruNoAbrev;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "gru_nu", columnDefinition = "NUMERIC")
    private Long gru_nu;
    
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
	public String getGruNo() {
		return gruNo;
	}
	public void setGruNo(String gruNo) {
		this.gruNo = gruNo;
	}
	public String getGruEndereco() {
		return gruEndereco;
	}
	public void setGruEndereco(String gruEndereco) {
		this.gruEndereco = gruEndereco;
	}
	public String getGruNoAbrev() {
		return gruNoAbrev;
	}
	public void setGruNoAbrev(String gruNoAbrev) {
		this.gruNoAbrev = gruNoAbrev;
	}
	public Long getGru_nu() {
		return gru_nu;
	}
	public void setGru_nu(Long gru_nu) {
		this.gru_nu = gru_nu;
	}

    
    
}
