package com.demo.cripto.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class MensagensRetornoRemessa extends ArrayList<MensagemRetornoRemessa> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("montreal.rcf.entity.MensagensRetornoRemessa[  {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(Object o) {
		return o == null ? "null" : o.toString().replace("\n", "\n    ");
	}
}
