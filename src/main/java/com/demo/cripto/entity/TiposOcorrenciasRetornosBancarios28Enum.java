package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan.souza
 *
 */
public enum TiposOcorrenciasRetornosBancarios28Enum {

	TARIFA_DE_PERMANENCIA_TITULO_CADASTRADO(2, "Tarifa de permanência título cadastrado"),
	TARIFA_DE_SUSTACAO_EXCL_NEGATIVACAO(3, "Tarifa de sustação/Excl Negativação"),
	TARIFA_DE_PROTESTO_INCL_NEGATIVACAO(4, "Tarifa de protesto/Incl Negativação"),
	TARIFA_DE_OUTRAS_INSTRUCOES(5, "Tarifa de outras instruções"),
	TARIFA_DE_OUTRAS_OCORRENCIAS(6, "Tarifa de outras ocorrências"),
	CUSTAS_DE_PROTESTO(8, "Custas de protesto"),
	TARIFA_DE_REGISTRO(12, "Tarifa de registro"),
	TARIFA_TITULO_PAGO_NO_BRADESCO(13, "Tarifa título pago no Bradesco"),
	TARIFA_TITULO_PAGO_COMPENSACAO(14, "Tarifa título pago compensação"),
	TARIFA_TITULO_BAIXADO_NAO_PAGO(15, "Tarifa título baixado não pago"),
	TARIFA_ALTERACAO_DE_VENCIMENTO(16, "Tarifa alteração de vencimento"),
	TARIFA_CONCESSAO_ABATIMENTO(17, "Tarifa concessão abatimento"),
	TARIFA_CANCELAMENTO_DE_ABATIMENTO(18, "Tarifa cancelamento de abatimento"),
	TARIFA_CONCESSAO_DESCONTO(19, "Tarifa concessão desconto"),
	TARIFA_CANCELAMENTO_DESCONTO(20, "Tarifa cancelamento desconto"),
	TARIFA_TITULO_PAGO_CICS(21, "Tarifa título pago cics"),
	TARIFA_TITULO_PAGO_INTERNET(22, "Tarifa título pago Internet"),
	TARIFA_TITULO_PAGO_TERM_GERENCIAL_SERVICOS(23, "Tarifa título pago term. gerencial serviços"),
	TARIFA_TITULO_PAGO_PAG_CONTAS(24, "Tarifa título pago Pág-Contas"),
	TARIFA_TITULO_PAGO_FONE_FACIL(25, "Tarifa título pago Fone Fácil"),
	TARIFA_TITULO_DEB_POSTAGEM(26, "Tarifa título Déb. Postagem"),
	TARIFA_IMPRESSAO_DE_TITULOS_PENDENTES(27, "Tarifa impressão de títulos pendentes"),
	TARIFA_TITULO_PAGO_BDN(28, "Tarifa título pago BDN"),
	TARIFA_TITULO_PAGO_TERM_MULTI_FUNCAO(29, "Tarifa título pago Term. Multi Função"),
	IMPRESSAO_DE_TITULOS_BAIXADOS(30, "Impressão de títulos baixados"),
	IMPRESSAO_DE_TITULOS_PAGOS(31, "Impressão de títulos pagos"),
	TARIFA_TITULO_PAGO_PAGFOR(32, "Tarifa título pago Pagfor"),
	TARIFA_REG_PGTO_GUICHE_CAIXA(33, "Tarifa reg/pgto – guichê caixa"),
	TARIFA_TITULO_PAGO_RETAGUARDA(34, "Tarifa título pago retaguarda"),
	TARIFA_TITULO_PAGO_SUBCENTRO(35, "Tarifa título pago Subcentro"),
	TARIFA_TITULO_PAGO_CARTAO_DE_CREDITO(36, "Tarifa título pago Cartão de Crédito"),
	TARIFA_TITULO_PAGO_COMP_ELETRONICA(37, "Tarifa título pago Comp Eletrônica"),
	TARIFA_TITULO_BAIX_PG_CARTORIO(38, "Tarifa título Baix. Pg. Cartório"),
	TARIFA_TITULO_BAIXADO_ACERTO_BCO(39, "Tarifa título baixado acerto BCO"),
	BAIXA_REGISTRO_EM_DUPLICIDADE(40, "Baixa registro em duplicidade"),
	TARIFA_TITULO_BAIXADO_DECURSO_PRAZO(41, "Tarifa título baixado decurso prazo"),
	TARIFA_TITULO_BAIXADO_JUDICIALMENTE(42, "Tarifa título baixado Judicialmente"),
	TARIFA_TITULO_BAIXADO_VIA_REMESSA(43, "Tarifa título baixado via remessa"),
	TARIFA_TITULO_BAIXADO_RASTREAMENTO(44, "Tarifa título baixado rastreamento"),
	TARIFA_TITULO_BAIXADO_CONF_PEDIDO(45, "Tarifa título baixado conf. Pedido"),
	TARIFA_TITULO_BAIXADO_PROTESTADO(46, "Tarifa título baixado protestado"),
	TARIFA_TITULO_BAIXADO_P_DEVOLUCAO(47, "Tarifa título baixado p/ devolução"),
	TARIFA_TITULO_BAIXADO_FRANCO_PAGTO(48, "Tarifa título baixado franco pagto"),
	TARIFA_TITULO_BAIXADO_SUST_RET_CART_RIO(49, "Tarifa título baixado SUST/RET/CARTÓRIO"),
	TARIFA_TITULO_BAIXADO_SUS_SEM_REM_CART_RIO(50, "Tarifa título baixado SUS/SEM/REM/CARTÓRIO"),
	TARIFA_TITULO_TRANSFERIDO_DESCONTO(51, "Tarifa título transferido desconto"),
	COBRADO_BAIXA_MANUAL(52, "Cobrado baixa manual"),
	BAIXA_POR_ACERTO_CLIENTE(53, "Baixa por acerto cliente"),
	TARIFA_BAIXA_POR_CONTABILIDADE(54, "Tarifa baixa por contabilidade"),
	TR_TENTATIVA_CONS_DEB_AUT(55, "Tr. tentativa cons deb aut"),
	TR_CREDITO_ONLINE(56, "Tr. credito online"),
	TARIFA_REG_PAGTO_BRADESCO_EXPRESSO(57, "Tarifa reg/pagto Bradesco Expresso"),
	TARIFA_EMISSAO_PAPELETA(58, "Tarifa emissão Papeleta"),
	TARIFA_FORNEC_PAPELETA_SEMI_PREENCHIDA(59, "Tarifa fornec papeleta semi preenchida"),
	ACONDICIONADOR_DE_PAPELETAS_RPB_S(60, "Acondicionador de papeletas (RPB)S"),
	ACOND_DE_PAPELATAS_RPB_S_PERSONAL(61, "Acond. De papelatas (RPB)s PERSONAL"),
	PAPELETA_FORMULARIO_BRANCO(62, "Papeleta formulário branco"),
	FORMULARIO_A4_SERRILHADO(63, "Formulário A4 serrilhado"),
	FORNECIMENTO_DE_SOFTWARES_TRANSMISS(64, "Fornecimento de softwares transmiss"),
	FORNECIMENTO_DE_SOFTWARES_CONSULTA(65, "Fornecimento de softwares consulta"),
	FORNECIMENTO_MICRO_COMPLETO(66, "Fornecimento Micro Completo"),
	FORNECIMENTO_MODEN(67, "Fornecimento MODEN"),
	FORNECIMENTO_DE_MAQUINA_FAX(68, "Fornecimento de máquina FAX"),
	FORNECIMENTO_DE_MAQUINAS_OTICAS(69, "Fornecimento de máquinas óticas"),
	FORNECIMENTO_DE_IMPRESSORAS(70, "Fornecimento de Impressoras"),
	REATIVACAO_DE_TITULO(71, "Reativação de título"),
	ALTERACAO_DE_PRODUTO_NEGOCIADO(72, "Alteração de produto negociado"),
	TARIFA_EMISSAO_DE_CONTRA_RECIBO(73, "Tarifa emissão de contra recibo"),
	TARIFA_EMISSAO_2_VIA_PAPELETA(74, "Tarifa emissão 2ª via papeleta"),
	TARIFA_REGRAVACAO_ARQUIVO_RETORNO(75, "Tarifa regravação arquivo retorno"),
	ARQ_TITULOS_A_VENCER_MENSAL(76, "Arq. Títulos a vencer mensal"),
	LISTAGEM_AUXILIAR_DE_CREDITO(77, "Listagem auxiliar de crédito"),
	TARIFA_CADASTRO_CARTELA_INSTRUCAO_PERMANENTE(78, "Tarifa cadastro cartela instrução permanente"),
	CANALIZACAO_DE_CREDITO(79, "Canalização de Crédito"),
	CADASTRO_DE_MENSAGEM_FIXA(80, "Cadastro de Mensagem Fixa"),
	TARIFA_REAPRESENTACAO_AUTOMATICA_TITULO(81, "Tarifa reapresentação automática título"),
	TARIFA_REGISTRO_TITULO_DEB_AUTOMATICO(82, "Tarifa registro título déb. Automático"),
	TARIFA_RATEIO_DE_CREDITO(83, "Tarifa Rateio de Crédito"),
	EMISSAO_PAPELETA_SEM_VALOR(84, "Emissão papeleta sem valor"),
	SEM_USO(85, "Sem uso"),
	CADASTRO_DE_REEMBOLSO_DE_DIFERENCA(86, "Cadastro de reembolso de diferença"),
	RELATORIO_FLUXO_DE_PAGTO(87, "Relatório fluxo de pagto"),
	EMISSAO_EXTRATO_MOV_CARTEIRA(88, "Emissão Extrato mov. Carteira"),
	MENSAGEM_CAMPO_LOCAL_DE_PAGTO(89, "Mensagem campo local de pagto"),
	CADASTRO_CONCESSIONARIA_SERV_PUBL_(90, "Cadastro Concessionária serv. Publ."),
	CLASSIF_EXTRATO_CONTA_CORRENTE(91, "Classif. Extrato Conta Corrente"),
	CONTABILIDADE_ESPECIAL(92, "Contabilidade especial"),
	REALIMENTACAO_PAGTO(93, "Realimentação pagto"),
	REPASSE_DE_CREDITOS(94, "Repasse de Créditos"),
	TARIFA_REG_PAGTO_OUTRAS_MIDIAS(96, "Tarifa reg. Pagto outras mídias"),
	TARIFA_REG_PAGTO_NET_EMPRESA(97, "Tarifa Reg/Pagto – Net Empresa"),
	TARIFA_TITULO_PAGO_VENCIDO(98, "Tarifa título pago vencido"),
	TR_TIT_BAIXADO_POR_DECURSO_PRAZO(99, "TR Tít. Baixado por decurso prazo"),
	ARQUIVO_RETORNO_ANTECIPADO(100, "Arquivo Retorno Antecipado"),
	ARQ_RETORNO_HORA_HORA(101, "Arq retorno Hora/Hora"),
	TR_AGENDAMENTO_DEB_AUT(102, "TR. Agendamento Déb Aut"),
	TR_AGENDAMENTO_RAT_CREDITO(105, "TR. Agendamento rat. Crédito"),
	TR_EMISSAO_AVISO_RATEIO(106, "TR Emissão aviso rateio"),
	EXTRATO_DE_PROTESTO(107, "Extrato de protesto");

	private TiposOcorrenciasRetornosBancarios28Enum(int id, String descricao) {
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

	public static TiposOcorrenciasRetornosBancarios28Enum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TiposOcorrenciasRetornosBancarios28Enum e : TiposOcorrenciasRetornosBancarios28Enum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}

	public static TiposOcorrenciasRetornosBancarios28Enum obterInstanciaPorId(Integer id) {

		if(id == null) {
			return null;
		}

		List<TiposOcorrenciasRetornosBancarios28Enum> lista = Arrays.asList(TiposOcorrenciasRetornosBancarios28Enum.values());
		for (TiposOcorrenciasRetornosBancarios28Enum l : lista) {
			if (l.getId() == id) {
				return l;
			}
		}
		return null;
	}
}
