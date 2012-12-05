package br.usp.ime.sigp.modelo;

public enum TipoNoticia {
	Normal("Normal"),Destaque("Destaque");
	private String tipoNoticia;

	private TipoNoticia(String tipoNoticia) {
		this.tipoNoticia = tipoNoticia;
	}

	public String getTipoNoticia() {
		return tipoNoticia;
	}
}
