package com.demo.cripto.entity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Valores de domínio arqs_cargas.tp_doc_contrato
 * @author vanessa.vasconcelos
 *
 */
public enum TipoDocContratoEnum {

	CONTRATO 				(1, "Contrato"),
	ADITIVO_CONTRATO 		(2, "Aditivo de contrato"),
	OUTROS 					(3, "Outros");
	

	private TipoDocContratoEnum(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	private final int id;
	private final String descricao;
	
	public int id() { return this.id; }
	public int getId() { return this.id; }
	
	public String descricao() { return this.descricao; }
	public String getDescricao() { return this.descricao; }


	public static Map<String, String> getListaTipoDocContrato() {
        List<TipoDocContratoEnum> lista = Arrays.asList(TipoDocContratoEnum.values());
        Map<String, String> mapa = new HashMap<>();
		
        for (TipoDocContratoEnum l : lista) {
			mapa.put(String.valueOf(l.getId()), l.getDescricao());
		}
        return mapa;
	}
	
	public static TipoDocContratoEnum getType(String descricao) {

		if (("").equals(descricao)) {
			return null;
		}

		for (TipoDocContratoEnum e: TipoDocContratoEnum.values()) {
			if (e.getDescricao().equalsIgnoreCase(descricao)) {
				return e;
			}
		}

		return null;
	}
	
	
   public static TipoDocContratoEnum obterInstanciaPorId(String id) {
		
	   List<TipoDocContratoEnum> lista = Arrays.asList(TipoDocContratoEnum.values());
	   for (TipoDocContratoEnum l : lista) {
		   if(String.valueOf(l.getId()).equals(id)){
			   return l;
	         }
	   }
	   return null;
    }
}
