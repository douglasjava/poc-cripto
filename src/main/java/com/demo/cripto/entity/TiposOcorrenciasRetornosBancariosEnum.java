package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan.souza
 *
 */
public enum TiposOcorrenciasRetornosBancariosEnum {

	ENTRADA_CONFIRMADA(2, "Entrada Confirmada"),
	ENTRADA_REJEITADA(3, "Entrada Rejeitada"),
	LIQUIDACAO_NORMAL(6, "Liquidação normal"),
	BAIXADO_AUTOMAT_(9, "Baixado Automat."),
	BAIXADO_CONFORME_INSTRUCOES_DA_AGENCIA(10, "Baixado conforme instruções da Agência"),
	EM_SER_ARQUIVO_DE_TITULOS_PENDENTES(11, "Em Ser - Arquivo de Títulos pendentes"),
	ABATIMENTO_CONCEDIDO(12, "Abatimento Concedido"),
	ABATIMENTO_CANCELADO(13, "Abatimento Cancelado"),
	VENCIMENTO_ALTERADO(14, "Vencimento Alterado"),
	LIQUIDACAO_EM_CARTORIO(15, "Liquidação em Cartório"),
	TITULO_PAGO_EM_CHEQUE_VINCULADO(16, "Título Pago em Cheque – Vinculado"),
	LIQUIDACAO_APOS_BAIXA_OU_TITULO_NAO_REGISTRADO(17, "Liquidação após baixa ou Título não registrado"),
	ACERTO_DE_DEPOSITARIA(18, "Acerto de Depositária"),
	CONFIRMACAO_RECEB__INST_DE_PROTESTO(19, "Confirmação Receb. Inst. de Protesto"),
	CONFIRMACAO_RECEBIMENTO_INSTRUCAO_SUSTACAO_DE_PROTESTO(20, "Confirmação Recebimento Instrução Sustação de Protesto"),
	ACERTO_DO_CONTROLE_DO_PARTICIPANTE(21, "Acerto do Controle do Participante"),
	TITULO_COM_PAGAMENTO_CANCELADO(22, "Título Com Pagamento Cancelado"),
	ENTRADA_DO_TITULO_EM_CARTORIO(23, "Entrada do Título em Cartório"),
	ENTRADA_REJEITADA_POR_CEP_IRREGULAR(24, "Entrada rejeitada por CEP Irregular"),
	CONFIRMACAO_RECEB_INST_DE_PROTESTO_FALIMENTAR(25, "Confirmação Receb.Inst.de Protesto Falimentar"),
	BAIXA_REJEITADA(27, "Baixa Rejeitada"),
	DEBITO_DE_TARIFAS_CUSTAS(28, "Débito de tarifas/custas"),
	OCORRENCIAS_DO_PAGADOR(29, "Ocorrências do Pagador"),
	ALTERACAO_DE_OUTROS_DADOS_REJEITADOS(30, "Alteração de Outros Dados Rejeitados"),
	INSTRUCAO_REJEITADA(32, "Instrução Rejeitada"),
	CONFIRMACAO_PEDIDO_ALTERACAO_OUTROS_DADOS(33, "Confirmação Pedido Alteração Outros Dados"),
	RETIRADO_DE_CARTORIO_E_MANUTENCAO_CARTEIRA(34, "Retirado de Cartório e Manutenção Carteira"),
	DESAGENDAMENTO_DO_DEBITO_AUTOMATICO(35, "Desagendamento do débito automático"),
	ESTORNO_DE_PAGAMENTO(40, "Estorno de pagamento"),
	SUSTADO_JUDICIAL(55, "Sustado judicial"),
	ACERTO_DOS_DADOS_DO_RATEIO_DE_CREDITO(68, "Acerto dos dados do rateio de Crédito"),
	CANCELAMENTO_DOS_DADOS_DO_RATEIO(69, "Cancelamento dos dados do rateio"),
	CONFIRMACAO_RECEB_PEDIDO_DE_NEGATIVACAO(73, "Confirmação Receb. Pedido de Negativação"),
	CONFIR_PEDIDO_DE_EXCL_DE_NEGAT_COM_OU_SEM_BAIXA_(74, "Confir Pedido de Excl de Negat (com ou sem baixa)");

	private TiposOcorrenciasRetornosBancariosEnum(int id, String descricao) {
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

	public static TiposOcorrenciasRetornosBancariosEnum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TiposOcorrenciasRetornosBancariosEnum e : TiposOcorrenciasRetornosBancariosEnum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TiposOcorrenciasRetornosBancariosEnum obterInstanciaPorId(Integer id) {

		if(id == null) {
			return null;
		}

		List<TiposOcorrenciasRetornosBancariosEnum> lista = Arrays.asList(TiposOcorrenciasRetornosBancariosEnum.values());
		for (TiposOcorrenciasRetornosBancariosEnum l : lista) {
			if (l.getId() == id) {
				return l;
			}
		}
		return null;
	}
}
