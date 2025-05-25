package com.demo.cripto.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author douglas.dias
 */
@Entity
@Table(name = "log_gerenciamento")
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class LogGerenciamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_log_gerenciamento")
	@EqualsAndHashCode.Include
	private Integer idPerfilFuncionalidade;

	@JoinColumn(name = "id_funcionalidade", referencedColumnName = "id_funcionalidade")
	@ManyToOne(optional = false)
	private Funcionalidades funcionalidade;

	@JoinColumn(name = "id_usuario_registro", referencedColumnName = "id_usuario")
	@ManyToOne(optional = false)
	private Usuarios idUsuarioRegistro;

	@Basic(optional = false)
	@Column(name = "dt_atualizacao")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtAtualizacao;

	@Enumerated(EnumType.STRING)
	private TipoLogGerenciamentoEnum tipoLogGerenciamento;

}
