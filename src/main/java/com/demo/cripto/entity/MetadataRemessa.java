/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import lombok.*;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@Table(name = "metadata_remessa")
@NamedQueries({ @NamedQuery(name = "MetadataRemessa.findAll", query = "SELECT mr FROM MetadataRemessa mr") })
public class MetadataRemessa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_metadata_remessa")
	private Integer idMetadataRemessa;

	@Basic(optional = false)
	@Column(name = "nome_arquivo")
	private String nomeArquivo;

	@Basic(optional = false)
	@Column(name = "codigo_financeira")
	private String codigoFinanceira;

	@Column(name = "numero_lote")
	private String numeroLote;

	@Column(name = "sequencia_registro")
	private String sequenciaRegistro;

	@Column(name = "identificacao_registro_arquivo")
	private String identificacaoRegistroArquivo;

	@Column(name = "identificacao_registro_lote")
	private String identificacaoRegistroLote;

	@Column(name = "data_movimento")
	private String dataMovimento;

	@Column(name = "data_envio")
	private String dataEnvio;

	@Column(name = "hora_envio")
	private String horaEnvio;

	@Column(name = "marca_final_registro")
	private String marcaFinalRegistro;

	@JoinColumn(name = "id_remessa", referencedColumnName = "id_remessa")
	@ManyToOne(optional = true)
	private Remessas idRemessa;

	public MetadataRemessa() {
	}

}


