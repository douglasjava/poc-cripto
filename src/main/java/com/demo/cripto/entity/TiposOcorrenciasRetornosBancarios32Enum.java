package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan.souza
 *
 */
public enum TiposOcorrenciasRetornosBancarios32Enum {

	CODIGO_DO_BANCO_INVALIDO(1, "Código do Banco inválido"),
	CODIGO_DO_REGISTRO_DETALHE_INVALIDO(2, "Código do registro detalhe inválido"),
	CODIGO_DE_OCORRENCIA_NAO_PERMITIDO_PARA_A_CARTEIRA(4, "Código de ocorrência não permitido para a carteira"),
	CODIGO_DE_OCORRENCIA_NAO_NUMERICO(5, "Código de ocorrência não numérico"),
	AGENCIA_CONTA_DIGITO_INVALIDOS(7, "Agência/Conta/dígito inválidos"),
	NOSSO_NUMERO_INVALIDO(8, "Nosso número inválido"),
	CARTEIRA_INVALIDA(10, "Carteira inválida"),
	CARACTERISTICAS_DA_COBRANCA_INCOMPATIVEIS(15, "Características da cobrança incompatíveis"),
	DATA_DE_VENCIMENTO_INVALIDA(16, "Data de vencimento inválida"),
	DATA_DE_VENCIMENTO_ANTERIOR_A_DATA_DE_EMISSAO(17, "Data de vencimento anterior a data de emissão"),
	VENCIMENTO_FORA_DO_PRAZO_DE_OPERACAO(18, "Vencimento fora do prazo de operação"),
	VALOR_DO_TITULO_INVALIDO(20, "Valor do título inválido"),
	ESPECIE_DO_TITULO_INVALIDA(21, "Espécie do Título inválida"),
	ESPECIE_NAO_PERMITIDA_PARA_A_CARTEIRA(22, "Espécie não permitida para a carteira"),
	DATA_DE_EMISSAO_INVALIDA(24, "Data de emissão inválida"),
	CODIGO_DE_DESCONTO_VIA_TELEBRADESCO_INVALIDO(28, "Código de desconto via Telebradesco inválido"),
	VALOR_DO_DESCONTO_MAIOR_IGUAL_AO_VALOR_DO_TITULO(29, "Valor do desconto maior/igual ao valor do Título"),
	DESCONTO_A_CONCEDER_NAO_CONFERE(30, "Desconto a conceder não confere"),
	CONCESSAO_DE_DESCONTO_JA_EXISTE_DESCONTO_ANTERIOR(31, "Concessão de desconto - Já existe desconto anterior"),
	VALOR_DO_ABATIMENTO_INVALIDO(33, "Valor do abatimento inválido"),
	VALOR_DO_ABATIMENTO_MAIOR_IGUAL_AO_VALOR_DO_TITULO(34, "Valor do abatimento maior/igual ao valor do Título"),
	CONCESSAO_ABATIMENTO_JA_EXISTE_ABATIMENTO_ANTERIOR(36, "Concessão abatimento - Já existe abatimento anterior"),
	PRAZO_PARA_PROTESTO_NEGATIVACAO_INVALIDO(38, "Prazo para protesto/ Negativação inválido"),
	PEDIDO_PARA_PROTESTO_NEGATIVACAO_NAO_PERMITIDO_PARA_O_TITULO(39, "Pedido para protesto/ Negativação não permitido para o título"),
	TITULO_COM_ORDEM_PEDIDO_DE_PROTESTO_NEGATIVACAO_EMITIDO(40, "Título com ordem/pedido de protesto/Negativação emitido"),
	PEDIDO_DE_SUSTACAO_EXCL_P_TITULO_SEM_INSTRUCAO_DE_PROTESTO_NEGATIVACAO(41, "Pedido de sustação/excl p/ Título sem instrução de protesto/Negativação"),
	CODIGO_PARA_BAIXA_DEVOLUCAO_INVALIDO(42, "Código para baixa/devolução inválido"),
	NOME_DO_PAGADOR_NAO_INFORMADO(45, "Nome do Pagador não informado"),
	TIPO_NUMERO_DE_INSCRICAO_DO_PAGADOR_INVALIDOS(46, "Tipo/número de inscrição do Pagador inválidos"),
	ENDERECO_DO_PAGADOR_NAO_INFORMADO(47, "Endereço do Pagador não informado"),
	CEP_INVALIDO(48, "CEP Inválido"),
	CEP_REFERENTE_A_UM_BANCO_CORRESPONDENTE(50, "CEP referente a um Banco correspondente"),
	TIPO_DE_INSCRICAO_DO_PAGADOR_AVALISTA_INVALIDOS(53, "Tipo de inscrição do pagador avalista inválidos"),
	MOVIMENTO_PARA_TITULO_NAO_CADASTRADO(60, "Movimento para Título não cadastrado"),
	TITULO_COM_PAGAMENTO_VINCULADO(85, "Título com pagamento vinculado"),
	SEU_NUMERO_INVALIDO(86, "Seu número inválido"),
	TITULO_PENHORADO_INSTRUCAO_NAO_LIBERADA_PELA_AGENCIA(94, "Título Penhorado – Instrução Não Liberada pela Agência"),
	INSTRUCAO_NAO_PERMITIDA_TITULO_NEGATIVADO(97, "Instrução não permitida título negativado"),
	INCLUSAO_BLOQUEADA_FACE_A_DETERMINACAO_JUDICIAL(98, "Inclusão Bloqueada face a determinação Judicial"),
	TELEFONE_BENEFICIARIO_NAO_INFORMADO_INCONSISTENTE(99, "Telefone beneficiário não informado / inconsistente"),;

	private TiposOcorrenciasRetornosBancarios32Enum(int id, String descricao) {
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

	public static TiposOcorrenciasRetornosBancarios32Enum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TiposOcorrenciasRetornosBancarios32Enum e : TiposOcorrenciasRetornosBancarios32Enum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TiposOcorrenciasRetornosBancarios32Enum obterInstanciaPorId(Integer id) {

		if(id == null) {
			return null;
		}

		List<TiposOcorrenciasRetornosBancarios32Enum> lista = Arrays.asList(TiposOcorrenciasRetornosBancarios32Enum.values());
		for (TiposOcorrenciasRetornosBancarios32Enum l : lista) {
			if (l.getId() == id) {
				return l;
			}
		}
		return null;
	}
}
