package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan.souza
 *
 */
public enum TiposOcorrenciasRetornosBancarios30Enum {

	CODIGO_DO_BANCO_INVALIDO(1, "Código do Banco inválido"),
	CODIGO_DE_OCORRENCIA_NAO_PERMITIDO_PARA_A_CARTEIRA(4, "Código de ocorrência não permitido para a carteira"),
	CODIGO_DA_OCORRENCIA_NAO_NUMERICO(5, "Código da ocorrência não numérico"),
	NOSSO_NUMERO_INVALIDO(8, "Nosso número inválido"),
	CARACTERISTICA_DA_COBRANCA_INCOMPATIVEL(15, "Característica da cobrança incompatível"),
	DATA_DE_VENCIMENTO_INVALIDO(16, "Data de vencimento inválido"),
	DATA_DE_VENCIMENTO_ANTERIOR_A_DATA_DE_EMISSAO(17, "Data de vencimento anterior a data de emissão"),
	VENCIMENTO_FORA_DO_PRAZO_DE_OPERACAO(18, "Vencimento fora do prazo de operação"),
	DATA_DE_EMISSAO_INVALIDA(24, "Data de emissão Inválida"),
	CODIGO_DE_JUROS_DE_MORA_INVALIDO(26, "Código de juros de mora inválido"),
	VALOR_TAXA_DE_JUROS_DE_MORA_INVALIDO(27, "Valor/taxa de juros de mora inválido"),
	CODIGO_DE_DESCONTO_INVALIDO(28, "Código de desconto inválido"),
	DESCONTO_A_CONCEDER_NAO_CONFERE(30, "Desconto a conceder não confere"),
	CONCESSAO_DE_DESCONTO_JA_EXISTENTE_DESCONTO_ANTERIOR__(31, "Concessão de desconto já existente ( Desconto anterior )"),
	VALOR_DO_IOF_INVALIDO(32, "Valor do IOF inválido"),
	VALOR_DO_ABATIMENTO_INVALIDO(33, "Valor do abatimento inválido"),
	VALOR_DO_ABATIMENTO_MAIOR_IGUAL_AO_VALOR_DO_TITULO(34, "Valor do abatimento maior/igual ao valor do Título"),
	PRAZO_PARA_PROTESTO_NEGATIVACAO_INVALIDO(38, "Prazo para protesto/ Negativação inválido"),
	PEDIDO_PARA_PROTESTO_NEGATIVACAO_NAO_PERMITIDO_PARA_O_TITULO(39, "Pedido para protesto/ Negativação não permitido para o título"),
	TITULO_COM_ORDEM_PEDIDO_DE_PROTESTO_NEGATIVACAO_EMITIDO(40, "Título com ordem/pedido de protesto/Negativação emitido"),
	CODIGO_PARA_BAIXA_DEVOLUCAO_INVALIDO(42, "Código para baixa/devolução inválido"),
	TIPO_NUMERO_DE_INSCRICAO_DO_PAGADOR_INVALIDOS(46, "Tipo/número de inscrição do pagador inválidos"),
	CEP_INVALIDO(48, "Cep Inválido"),
	TIPO_NUMERO_DE_INSCRICAO_DO_PAGADOR_AVALISTA_INVALIDOS(53, "Tipo/Número de inscrição do pagador/avalista inválidos"),
	PAGADORR_AVALISTA_NAO_INFORMADO(54, "Pagadorr/avalista não informado"),
	CODIGO_DA_MULTA_INVALIDO(57, "Código da multa inválido"),
	DATA_DA_MULTA_INVALIDA(58, "Data da multa inválida"),
	MOVIMENTO_PARA_TITULO_NAO_CADASTRADO(60, "Movimento para Título não cadastrado"),
	DATA_DE_JUROS_DE_MORA_INVALIDA(79, "Data de Juros de mora Inválida"),
	DATA_DO_DESCONTO_INVALIDA(80, "Data do desconto inválida"),
	TITULO_COM_PAGAMENTO_VINCULADO(85, "Título com Pagamento Vinculado"),
	E_MAIL_PAGADOR_NAO_LIDO_NO_PRAZO_5_DIAS(88, "E-mail Pagador não lido no prazo 5 dias"),
	E_MAIL_PAGADOR_NAO_RECEBIDO(91, "E-mail pagador não recebido");

	private TiposOcorrenciasRetornosBancarios30Enum(int id, String descricao) {
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

	public static TiposOcorrenciasRetornosBancarios30Enum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TiposOcorrenciasRetornosBancarios30Enum e : TiposOcorrenciasRetornosBancarios30Enum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TiposOcorrenciasRetornosBancarios30Enum obterInstanciaPorId(Integer id) {

		if(id == null) {
			return null;
		}

		List<TiposOcorrenciasRetornosBancarios30Enum> lista = Arrays.asList(TiposOcorrenciasRetornosBancarios30Enum.values());
		for (TiposOcorrenciasRetornosBancarios30Enum l : lista) {
			if (l.getId() == id) {
				return l;
			}
		}
		return null;
	}
}
