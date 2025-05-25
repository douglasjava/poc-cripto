package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan.souza
 *
 */
public enum TiposOcorrenciasRetornosBancarios27Enum {

	CODIGO_DE_OCORRENCIA_NAO_PERMITIDO_PARA_A_CARTEIRA(4, "Código de ocorrência não permitido para a carteira"),
	AGENCIA_CONTA_DIGITO_INVALIDOS(7, "Agência/Conta/dígito inválidos"),
	NOSSO_NUMERO_INVALIDO(8, "Nosso número inválido"),
	CARTEIRA_INVALIDA(10, "Carteira inválida"),
	CARTEIRA_AGENCIA_CONTA_NOSSO_NUMERO_INVALIDOS(15, "Carteira/Agência/Conta/nosso número inválidos"),
	TITULO_COM_ORDEM_DE_PROTESTO_EMITIDO(40, "Título com ordem de protesto emitido"),
	CODIGO_PARA_BAIXA_DEVOLUCAO_VIA_TELE_BRADESCO_INVALIDO(42, "Código para baixa/devolução via Tele Bradesco inválido"),
	MOVIMENTO_PARA_TITULO_NAO_CADASTRADO(60, "Movimento para Título não cadastrado"),
	TRANSFERENCIA_PARA_DESCONTO_NAO_PERMITIDO_PARA_A_CARTEIRA(77, "Transferência para desconto não permitido para a carteira"),
	TITULO_COM_PAGAMENTO_VINCULADO(85, "Título com pagamento vinculado");

	private TiposOcorrenciasRetornosBancarios27Enum(int id, String descricao) {
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

	public static TiposOcorrenciasRetornosBancarios27Enum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TiposOcorrenciasRetornosBancarios27Enum e : TiposOcorrenciasRetornosBancarios27Enum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TiposOcorrenciasRetornosBancarios27Enum obterInstanciaPorId(Integer id) {

		if(id == null) {
			return null;
		}

		List<TiposOcorrenciasRetornosBancarios27Enum> lista = Arrays.asList(TiposOcorrenciasRetornosBancarios27Enum.values());
		for (TiposOcorrenciasRetornosBancarios27Enum l : lista) {
			if (l.getId() == id) {
				return l;
			}
		}
		return null;
	}
}
