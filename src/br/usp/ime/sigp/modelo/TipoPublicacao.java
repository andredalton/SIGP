package br.usp.ime.sigp.modelo;

public enum TipoPublicacao {
	JOURNAL_PAPER("01. Journal paper"), BOOK("02. Book"), BOOK_CHAPTER(
			"03. Book chapter"), EDITED_WORK("04. Edited work"), CONFERENCE_FULL_PAPER(
			"05. Conference full paper"), CONFERENCE_SHORT_PAPER(
			"06. Conference short paper"), WORKSHOP_FULL_PAPER(
			"07. Workshop full paper"), WORKSHOP_SHORT_PAPER(
			"08. Workshop short paper"), PHD_THESIS("09. phD Thesis"), MSC_DISSERTATION(
			"10. MSc Dissertation"), BSC_MONOGRAPH("11. BSc Monograph"), TECHNICAL_REPORT(
			"12. Technical Report"), MAGAZINE("13. Magazine"), OTHER(
			"14. Other");
	private String tipoPublicacao;

	private TipoPublicacao(String tipoPublicacao) {
		this.tipoPublicacao = tipoPublicacao;
	}

	public String getTipoPublicacao() {
		return tipoPublicacao;
	}

	/**
	 * 
	 * @return O tipo da publicação SEM o número
	 */
	public String getTipoPublicacaoSN() {
		return tipoPublicacao.substring(4);
	}
}
