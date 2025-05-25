package com.demo.cripto.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "param_sftp")
public class ParamSftp {

	@Id
	@Column(name = "sg_uf")
	private String sgUf;

	@Column(name = "in_ativo")
	private boolean inAtivo;

	@Column(name = "ds_ambiente")
	@Enumerated(EnumType.STRING)
	private AmbienteEnum dsAmbiente;

	@Column(name = "ds_host")
	private String dsHost;

	@Column(name = "ds_user")
	private String dsUser;

	@Column(name = "nm_password")
	private String nmPassword;

	@Column(name = "ds_credor")
	private String dsCredor;

}
