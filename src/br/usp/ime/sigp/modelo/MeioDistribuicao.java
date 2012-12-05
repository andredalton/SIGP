package br.usp.ime.sigp.modelo;

public enum MeioDistribuicao {
	MAGNETICO("Magn�tico"), DIGITAL("Digital"), HIPERTEXTO("Hipertexto"), VARIOS(
			"V�rios"), OUTRO("Outro"), NAO_INFORMADO("N�o Informado");
	private String meioDistribuicao;

	private MeioDistribuicao(String meioDistribuicao) {
		this.meioDistribuicao = meioDistribuicao;
	}

	public String getMeioDistribuicao() {
		return meioDistribuicao;
	}
}
