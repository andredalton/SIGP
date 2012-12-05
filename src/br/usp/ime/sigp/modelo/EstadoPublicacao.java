package br.usp.ime.sigp.modelo;

public enum EstadoPublicacao {
    WORKING("Em Producao"),
    SUBMITED("Submetido"),
    PUBLISHED("Publicado"),
    REJECTED("Recusado"),
    CANCELED("Cancelado"),
    ACCEPTED("Aceito para publicacao");
	
	private String publicacaoStatus;
	
	private EstadoPublicacao(String status) {		
		this.publicacaoStatus = status;
	}

	public String getPublicacaoStatus(){
		return publicacaoStatus;
	}
}
