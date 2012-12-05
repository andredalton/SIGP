package br.usp.ime.sigp.modelo;

public enum MeioDistribuicao {
	MAGNETICO("Magnético"), DIGITAL("Digital"), HIPERTEXTO("Hipertexto"), VARIOS(
			"Vários"), OUTRO("Outro"), NAO_INFORMADO("Não Informado");
	private String meioDistribuicao;

	private MeioDistribuicao(String meioDistribuicao) {
		this.meioDistribuicao = meioDistribuicao;
	}

	public String getMeioDistribuicao() {
		return meioDistribuicao;
	}
}
