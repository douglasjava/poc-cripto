package com.demo.cripto.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "erros_nresolvidos_mg")
@Getter
@Setter
public class MgErrosNresolvidosMg {

    @Id
    @Column(name = "id_erros_nresolvidos_mg")
    Integer id;

    @Column(name = "nm_credor")
    String nmCredor;

    @Column(name = "nu_chassi")
    String nuChassi;

    @Column(name = "nu_contrato")
    String nuContrato;

    @Column(name = "vl_contrato")
    private BigDecimal vlContrato;

    @Column(name = "sg_uf")
    String sgUf;

    @Column(name = "dt_cadastro")
    Date dtCadastro;

    @Column(name = "origem")
    String origem;

    @Column(name = "dt_erro")
    Date dtErro;

    @Column(name = "ds_erro")
    private String dsErro;

    @Column(name = "dt_resolucao")
    Date dtResolucao;

    @Column(name = "in_resolvido")
    private Boolean inResolvido;

}
