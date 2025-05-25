/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author peterson.silva
 */
@Entity
@Table(name = "vw_correios")
@NamedQueries({
    @NamedQuery(name = "VwCorreios.findAll", query = "SELECT v FROM VwCorreios v")})
public class VwCorreios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "nu_cep")
    private String nuCep;
    @Column(name = "nu_logradouro")
    private String nuLogradouro;
    @Column(name = "nm_logradouro")
    private String nmLogradouro;
    @Column(name = "tx_complemento")
    private String txComplemento;
    @Column(name = "nm_bairro")
    private String nmBairro;
    @Column(name = "nm_municipio")
    private String nmMunicipio;
    @Column(name = "id_municipio")
    private Integer idMunicipio;
    @Column(name = "sg_uf")
    private String sgUf;
    @Column(name = "id_uf")
    private Integer idUf;

    public VwCorreios() {
    }

    public String getNuCep() {
        return nuCep;
    }

    public void setNuCep(String nuCep) {
        this.nuCep = nuCep;
    }

    public String getNuLogradouro() {
        return nuLogradouro;
    }

    public void setNuLogradouro(String nuLogradouro) {
        this.nuLogradouro = nuLogradouro;
    }

    public String getNmLogradouro() {
        return nmLogradouro;
    }

    public void setNmLogradouro(String nmLogradouro) {
        this.nmLogradouro = nmLogradouro;
    }

    public String getTxComplemento() {
        return txComplemento;
    }

    public void setTxComplemento(String txComplemento) {
        this.txComplemento = txComplemento;
    }

    public String getNmBairro() {
        return nmBairro;
    }

    public void setNmBairro(String nmBairro) {
        this.nmBairro = nmBairro;
    }

    public String getNmMunicipio() {
        return nmMunicipio;
    }

    public void setNmMunicipio(String nmMunicipio) {
        this.nmMunicipio = nmMunicipio;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getSgUf() {
        return sgUf;
    }

    public void setSgUf(String sgUf) {
        this.sgUf = sgUf;
    }

    public Integer getIdUf() {
        return idUf;
    }

    public void setIdUf(Integer idUf) {
        this.idUf = idUf;
    }
    
}
