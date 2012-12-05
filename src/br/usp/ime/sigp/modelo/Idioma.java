package br.usp.ime.sigp.modelo;

public enum Idioma {
	INGLES("Inglês"), PORTUGUES("Português"), ESPANHOL("Espanhol"), OUTROS(
			"Outros");
	private String idioma;

	private Idioma(String idioma) {
		this.idioma = idioma;
	}

	public String getIdioma() {
		return idioma;
	}
}
