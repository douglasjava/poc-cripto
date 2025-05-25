package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan.souza
 *
 */
public enum TiposOcorrenciasRetornosBancarios02Enum {

	OCORRENCIA_ACEITA(0, "Ocorrência aceita"),
	CODIGO_DO_BANCO_INVALIDO(1, "Código do Banco inválido"),
	CODIGO_DO_MOVIMENTO_NAO_PERMITIDO_PARA_A_CARTEIRA(4, "Código do movimento não permitido para a carteira"),
	CARACTERISTICAS_DA_COBRANCA_INCOMPATIVEIS(15, "Características da cobrança incompatíveis"),
	DATA_DE_VENCIMENTO_ANTERIOR_A_DATA_DE_EMISSAO(17, "Data de vencimento anterior a data de emissão"),
	ESPECIE_DO_TITULO_INVALIDO(21, "Espécie do Título inválido"),
	DATA_DA_EMISSAO_INVALIDA(24, "Data da emissão inválida"),
	VALOR_TAXA_DE_JUROS_MORA_INVALIDO(27, "Valor/taxa de juros mora inválido"),
	PRAZO_PARA_PROTESTO__NEGATIVACAO_INVALIDO(38, "Prazo para protesto/ Negativação inválido"),
	PEDIDO_PARA_PROTESTO__NEGATIVACAO_NAO_PERMITIDO_PARA_O_TITULO(39, "Pedido para protesto/ Negativação não permitido para o título"),
	PRAZO_PARA_BAIXA_E_DEVOLUCAO_INVALIDO(43, "Prazo para baixa e devolução inválido"),
	NOME_DO_PAGADOR_INVALIDO(45, "Nome do Pagador inválido"),
	TIPO_NUM__DE_INSCRICAO_DO_PAGADOR_INVALIDOS(46, "Tipo/num. de inscrição do Pagador inválidos"),
	ENDERECO_DO_PAGADOR_NAO_INFORMADO(47, "Endereço do Pagador não informado"),
	CEP_INVALIDO(48, "CEP Inválido"),
	CEP_REFERENTE_A_BANCO_CORRESPONDENTE(50, "CEP referente a Banco correspondente"),
	N_DE_INSCRICAO_DO_PAGADOR_AVALISTA_INVALIDOS__CPF_CNPJ_(53, "Nº de inscrição do Pagador/avalista inválidos (CPF/CNPJ)"),
	PAGADOR_AVALISTA_NAO_INFORMADO(54, "Pagador/avalista não informado"),
	DEBITO_AUTOMATICO_AGENDADO(67, "Débito automático agendado"),
	DEBITO_NAO_AGENDADO_ERRO_NOS_DADOS_DE_REMESSA(68, "Débito não agendado - erro nos dados de remessa"),
	DEBITO_NAO_AGENDADO_PAGADOR_NAO_CONSTA_NO_CADASTRO_DE_AUTORIZANTE(69, "Débito não agendado - Pagador não consta no cadastro de autorizante"),
	DEBITO_NAO_AGENDADO_BENEFICIARIO_NAO_AUTORIZADO_PELO_PAGADOR(70, "Débito não agendado - Beneficiário não autorizado pelo Pagador"),
	DEBITO_NAO_AGENDADO_BENEFICIARIO_NAO_PARTICIPA_DA_MODALIDADE_DE_DEB_AUTOMATICO(71, "Débito não agendado - Beneficiário não participa da modalidade de déb.automático"),
	DEBITO_NAO_AGENDADO_CODIGO_DE_MOEDA_DIFERENTE_DE_R_(72, "Débito não agendado - Código de moeda diferente de R$"),
	DEBITO_NAO_AGENDADO_DATA_DE_VENCIMENTO_INVALIDA_VENCIDA(73, "Débito não agendado - Data de vencimento inválida/vencida"),
	DEBITO_NAO_AGENDADO_TIPO_DO_NUMERO_DE_INSCRICAO_DO_PAGADOR_DEBITADO_INVALIDO(75, "Débito não agendado - Tipo do número de inscrição do pagador debitado inválido"),
	PAGADOR_ELETRONICO_DDA_NOVO_ESSE_MOTIVO_SOMENTE_SERA_DISPONIBILIZADO_NO_ARQUIVO_RETORNO_PARA_AS_EMPRESAS_CADASTRADAS(76, "Pagador Eletrônico DDA (NOVO)- Esse motivo somente será disponibilizado no arquivo retorno para as empresas cadastradas"),
	SEU_NUMERO_DO_DOCUMENTO_INVALIDO(86, "Seu número do documento inválido"),
	EMAIL_PAGADOR_NAO_ENVIADO_TITULO_COM_DEBITO_AUTOMATICO(89, "Email Pagador não enviado – título com débito automático"),
	EMAIL_PAGADOR_NAO_ENVIADO_TITULO_DE_COBRANCA_SEM_REGISTRO(90, "Email pagador não enviado – título de cobrança sem registro");

	private TiposOcorrenciasRetornosBancarios02Enum(int id, String descricao) {
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

	public static TiposOcorrenciasRetornosBancarios02Enum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TiposOcorrenciasRetornosBancarios02Enum e : TiposOcorrenciasRetornosBancarios02Enum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TiposOcorrenciasRetornosBancarios02Enum obterInstanciaPorId(Integer id) {

		if(id == null) {
			return null;
		}

		List<TiposOcorrenciasRetornosBancarios02Enum> lista = Arrays.asList(TiposOcorrenciasRetornosBancarios02Enum.values());
		for (TiposOcorrenciasRetornosBancarios02Enum l : lista) {
			if (l.getId() == id) {
				return l;
			}
		}
		return null;
	}
}
