package br.usp.ime.sigp.modelo;

public enum Abrangencia {
	INTERNACIONAL("Internacional"), NACIONAL("Nacional"), REGIONAL("Regional");
	private String abrangencia;

	private Abrangencia(String abrangencia) {
		this.abrangencia = abrangencia;
	}

	public String getAbrangencia() {
		return abrangencia;
	}
}
