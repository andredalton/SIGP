package br.usp.ime.sigp.modelo;

public enum TipoColaborador {
	Pesquisador("Pesquisador"), Pesquisadora("Pesquisadora"), Doutorando(
			"Doutorando"), Doutoranda("Doutoranda"), Mestrando("Mestrando"), Mestranda(
			"Mestranda"), Graduando("Graduando"), Graduanda("Graduanda"), Colaborador(
			"Colaborador"), Egresso("Egresso");
	private String tipoColaborador;

	private TipoColaborador(String tipoColaborador) {
		this.tipoColaborador = tipoColaborador;
	}

	public String getTipoColaborador() {
		return tipoColaborador;
	}
}
