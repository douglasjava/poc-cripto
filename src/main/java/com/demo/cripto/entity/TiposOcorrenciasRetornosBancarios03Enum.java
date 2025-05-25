package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan.souza
 *
 */
public enum TiposOcorrenciasRetornosBancarios03Enum {

	CODIGO_DO_REGISTRO_DETALHE_INVALIDO(2, "Código do registro detalhe inválido"),
	CODIGO_DA_OCORRENCIA_INVALIDA(3, "Código da ocorrência inválida"),
	CODIGO_DE_OCORRENCIA_NAO_PERMITIDA_PARA_A_CARTEIRA(4, "Código de ocorrência não permitida para a carteira"),
	CODIGO_DE_OCORRENCIA_NAO_NUMERICO(5, "Código de ocorrência não numérico"),
	AGENCIA_CONTA_DIGITO_INVALIDO(7, "Agência/conta/Digito - |Inválido"),
	NOSSO_NUMERO_INVALIDO(8, "Nosso número inválido"),
	NOSSO_NUMERO_DUPLICADO(9, "Nosso número duplicado"),
	CARTEIRA_INVALIDA(10, "Carteira inválida"),
	IDENTIFICACAO_DA_EMISSAO_DO_BLOQUETO_INVALIDA(13, "Identificação da emissão do bloqueto inválida"),
	DATA_DE_VENCIMENTO_INVALIDA(16, "Data de vencimento inválida"),
	VENCIMENTO_FORA_DO_PRAZO_DE_OPERACAO(18, "Vencimento fora do prazo de operação"),
	VALOR_DO_TITULO_INVALIDO(20, "Valor do Título inválido"),
	ESPECIE_DO_TITULO_INVALIDA(21, "Espécie do Título inválida"),
	ESPECIE_NAO_PERMITIDA_PARA_A_CARTEIRA(22, "Espécie não permitida para a carteira"),
	DATA_DE_EMISSAO_INVALIDA(24, "Data de emissão inválida"),
	CODIGO_DO_DESCONTO_INVALIDO(28, "Código do desconto inválido"),
	PRAZO_PARA_PROTESTO__NEGATIVACAO_INVALIDO(38, "Prazo para protesto/ Negativação inválido"),
	AGENCIA_BENEFICIARIO_NAO_PREVISTA(44, "Agência Beneficiário não prevista"),
	NOME_DO_PAGADOR_NAO_INFORMADO(45, "Nome do pagador não informado"),
	TIPO_NUMERO_DE_INSCRICAO_DO_PAGADOR_INVALIDOS(46, "Tipo/número de inscrição do pagador inválidos"),
	ENDERECO_DO_PAGADOR_NAO_INFORMADO(47, "Endereço do pagador não informado"),
	CEP_INVALIDO(48, "CEP Inválido"),
	CEP_IRREGULAR_BANCO_CORRESPONDENTE(50, "CEP irregular - Banco Correspondente"),
	ENTRADA_PARA_TITULO_JA_CADASTRADO(63, "Entrada para Título já cadastrado"),
	LIMITE_EXCEDIDO(65, "Limite excedido"),
	NUMERO_AUTORIZACAO_INEXISTENTE(66, "Número autorização inexistente"),
	DEBITO_NAO_AGENDADO_ERRO_NOS_DADOS_DE_REMESSA(68, "Débito não agendado - erro nos dados de remessa"),
	DEBITO_NAO_AGENDADO_PAGADOR_NAO_CONSTA_NO_CADASTRO_DE_AUTORIZANTE(69, "Débito não agendado - Pagador não consta no cadastro de autorizante"),
	DEBITO_NAO_AGENDADO_BENEFICIARIO_NAO_AUTORIZADO_PELO_PAGADOR(70, "Débito não agendado - Beneficiário não autorizado pelo Pagador"),
	DEBITO_NAO_AGENDADO_BENEFICIARIO_NAO_PARTICIPA_DO_DEBITO_AUTOMATICO(71, "Débito não agendado - Beneficiário não participa do débito Automático"),
	DEBITO_NAO_AGENDADO_CODIGO_DE_MOEDA_DIFERENTE_DE_R(72, "Débito não agendado - Código de moeda diferente de R$"),
	DEBITO_NAO_AGENDADO_DATA_DE_VENCIMENTO_INVALIDA(73, "Débito não agendado - Data de vencimento inválida"),
	DEBITO_NAO_AGENDADO_CONFORME_SEU_PEDIDO__TITULO_NAO_REGISTRADO(74, "Débito não agendado - Conforme seu pedido, Título não registrado"),
	DEBITO_NAO_AGENDADO_TIPO_DE_NUMERO_DE_INSCRICAO_DO_DEBITADO_INVALIDO(75, "Débito não agendado – Tipo de número de inscrição do debitado inválido");

	private TiposOcorrenciasRetornosBancarios03Enum(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	private final int id;
	private final String descricao;

	public int id() {
		return this.id;
	}

	public int getId() {
		return this.id;
	}

	public String descricao() {
		return this.descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public static TiposOcorrenciasRetornosBancarios03Enum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TiposOcorrenciasRetornosBancarios03Enum e : TiposOcorrenciasRetornosBancarios03Enum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TiposOcorrenciasRetornosBancarios03Enum obterInstanciaPorId(Integer id) {

		if(id == null) {
			return null;
		}

		List<TiposOcorrenciasRetornosBancarios03Enum> lista = Arrays.asList(TiposOcorrenciasRetornosBancarios03Enum.values());
		for (TiposOcorrenciasRetornosBancarios03Enum l : lista) {
			if (l.getId() == id) {
				return l;
			}
		}
		return null;
	}
}
