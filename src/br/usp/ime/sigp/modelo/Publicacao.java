package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publicacao")
public class Publicacao implements Serializable {
	protected long id;

	protected String estado;

	protected String doi;

	protected String tipo;

	protected String titulo;

	protected String ano;

	protected String idioma;

	protected String titulodaconferenciajornallivrorevista;

	protected String editora;

	protected String cidade;

	protected String pais;

	protected String volume;

	protected String serie;

	protected String paginainicial;

	protected String paginafinal;

	protected String fasciculoSpecialIssue;

	protected String isbn;

	protected String issn;

	protected String abrangencia;

	protected String resumolinguaoriginal;

	protected String resumo;

	protected String bibtex;

	protected String complemento;

	protected Qualis webqualis;

	protected String meio;

	protected String data;

	protected String citacaourl;

	protected Long citacoes;

	/**
	 * Method 'Publicacao'
	 * 
	 */
	public Publicacao() {
	}

	/**
	 * Method 'getId'
	 * 
	 * @return long
	 */
	@Id
	@Column(name = "id")
	public long getId() {
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Method 'getEstado'
	 * 
	 * @return String
	 */
	@Column(name = "estado")
	public String getEstado() {
		return estado;
	}

	/**
	 * Method 'setEstado'
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Method 'getDoi'
	 * 
	 * @return String
	 */
	@Column(name = "doi")
	public String getDoi() {
		return doi;
	}

	/**
	 * Method 'setDoi'
	 * 
	 * @param doi
	 */
	public void setDoi(String doi) {
		this.doi = doi;
	}

	/**
	 * Method 'getTipo'
	 * 
	 * @return String
	 */
	@Column(name = "tipo")
	public String getTipo() {
		return tipo;
	}

	/**
	 * Method 'setTipo'
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Method 'getTitulo'
	 * 
	 * @return String
	 */
	@Column(name = "titulo")
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Method 'setTitulo'
	 * 
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Method 'getAno'
	 * 
	 * @return String
	 */
	@Column(name = "ano")
	public String getAno() {
		return ano;
	}

	/**
	 * Method 'setAno'
	 * 
	 * @param ano
	 */
	public void setAno(String ano) {
		this.ano = ano;
	}

	/**
	 * Method 'getIdioma'
	 * 
	 * @return String
	 */
	@Column(name = "idioma")
	public String getIdioma() {
		return idioma;
	}

	/**
	 * Method 'setIdioma'
	 * 
	 * @param idioma
	 */
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	/**
	 * Method 'getTitulodaconferenciajornallivrorevista'
	 * 
	 * @return String
	 */
	@Column(name = "titulodaconferenciajornallivrorevista")
	public String getTitulodaconferenciajornallivrorevista() {
		return titulodaconferenciajornallivrorevista;
	}

	/**
	 * Method 'setTitulodaconferenciajornallivrorevista'
	 * 
	 * @param titulodaconferenciajornallivrorevista
	 */
	public void setTitulodaconferenciajornallivrorevista(
			String titulodaconferenciajornallivrorevista) {
		this.titulodaconferenciajornallivrorevista = titulodaconferenciajornallivrorevista;
	}

	/**
	 * Method 'getEditora'
	 * 
	 * @return String
	 */
	@Column(name = "editora")
	public String getEditora() {
		return editora;
	}

	/**
	 * Method 'setEditora'
	 * 
	 * @param editora
	 */
	public void setEditora(String editora) {
		this.editora = editora;
	}

	/**
	 * Method 'getCidade'
	 * 
	 * @return String
	 */
	@Column(name = "cidade")
	public String getCidade() {
		return cidade;
	}

	/**
	 * Method 'setCidade'
	 * 
	 * @param cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * Method 'getPais'
	 * 
	 * @return String
	 */
	@Column(name = "pais")
	public String getPais() {
		return pais;
	}

	/**
	 * Method 'setPais'
	 * 
	 * @param pais
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * Method 'getVolume'
	 * 
	 * @return String
	 */
	@Column(name = "volume")
	public String getVolume() {
		return volume;
	}

	/**
	 * Method 'setVolume'
	 * 
	 * @param volume
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}

	/**
	 * Method 'getSerie'
	 * 
	 * @return String
	 */
	@Column(name = "serie")
	public String getSerie() {
		return serie;
	}

	/**
	 * Method 'setSerie'
	 * 
	 * @param serie
	 */
	public void setSerie(String serie) {
		this.serie = serie;
	}

	/**
	 * Method 'getPaginainicial'
	 * 
	 * @return String
	 */
	@Column(name = "paginainicial")
	public String getPaginainicial() {
		return paginainicial;
	}

	/**
	 * Method 'setPaginainicial'
	 * 
	 * @param paginainicial
	 */
	public void setPaginainicial(String paginainicial) {
		this.paginainicial = paginainicial;
	}

	/**
	 * Method 'getPaginafinal'
	 * 
	 * @return String
	 */
	@Column(name = "paginafinal")
	public String getPaginafinal() {
		return paginafinal;
	}

	/**
	 * Method 'setPaginafinal'
	 * 
	 * @param paginafinal
	 */
	public void setPaginafinal(String paginafinal) {
		this.paginafinal = paginafinal;
	}

	/**
	 * Method 'getFasciculoSpecialIssue'
	 * 
	 * @return String
	 */
	@Column(name = "fasciculoSpecialIssue")
	public String getFasciculoSpecialIssue() {
		return fasciculoSpecialIssue;
	}

	/**
	 * Method 'setFasciculoSpecialIssue'
	 * 
	 * @param fasciculoSpecialIssue
	 */
	public void setFasciculoSpecialIssue(String fasciculoSpecialIssue) {
		this.fasciculoSpecialIssue = fasciculoSpecialIssue;
	}

	/**
	 * Method 'getIsbn'
	 * 
	 * @return String
	 */
	@Column(name = "isbn")
	public String getIsbn() {
		return isbn;
	}

	/**
	 * Method 'setIsbn'
	 * 
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * Method 'getIssn'
	 * 
	 * @return String
	 */
	@Column(name = "issn")
	public String getIssn() {
		return issn;
	}

	/**
	 * Method 'setIssn'
	 * 
	 * @param issn
	 */
	public void setIssn(String issn) {
		this.issn = issn;
	}

	/**
	 * Method 'getAbrangencia'
	 * 
	 * @return String
	 */
	@Column(name = "abrangencia")
	public String getAbrangencia() {
		return abrangencia;
	}

	/**
	 * Method 'setAbrangencia'
	 * 
	 * @param abrangencia
	 */
	public void setAbrangencia(String abrangencia) {
		this.abrangencia = abrangencia;
	}

	/**
	 * Method 'getResumolinguaoriginal'
	 * 
	 * @return String
	 */
	@Column(name = "resumolinguaoriginal")
	public String getResumolinguaoriginal() {
		return resumolinguaoriginal;
	}

	/**
	 * Method 'setResumolinguaoriginal'
	 * 
	 * @param resumolinguaoriginal
	 */
	public void setResumolinguaoriginal(String resumolinguaoriginal) {
		this.resumolinguaoriginal = resumolinguaoriginal;
	}

	/**
	 * Method 'getResumo'
	 * 
	 * @return String
	 */
	@Column(name = "resumo")
	public String getResumo() {
		return resumo;
	}

	/**
	 * Method 'setResumo'
	 * 
	 * @param resumo
	 */
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	/**
	 * Method 'getBibtex'
	 * 
	 * @return String
	 */
	@Column(name = "bibtex")
	public String getBibtex() {
		return bibtex;
	}

	/**
	 * Method 'setBibtex'
	 * 
	 * @param bibtex
	 */
	public void setBibtex(String bibtex) {
		this.bibtex = bibtex;
	}

	/**
	 * Method 'getComplemento'
	 * 
	 * @return String
	 */
	@Column(name = "complemento")
	public String getComplemento() {
		return complemento;
	}

	/**
	 * Method 'setComplemento'
	 * 
	 * @param complemento
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * Method 'getWebqualis'
	 * 
	 * @return Qualis
	 */
	@Column(name = "webqualis")
	public Qualis getWebqualis() {
		return webqualis;
	}

	/**
	 * Method 'setWebqualis'
	 * 
	 * @param webqualis
	 */
	public void setWebqualis(Qualis webqualis) {
		this.webqualis = webqualis;
	}

	/**
	 * Method 'getMeio'
	 * 
	 * @return String
	 */
	@Column(name = "meio")
	public String getMeio() {
		return meio;
	}

	/**
	 * Method 'setMeio'
	 * 
	 * @param meio
	 */
	public void setMeio(String meio) {
		this.meio = meio;
	}

	/**
	 * Method 'getData'
	 * 
	 * @return String
	 */
	@Column(name = "data")
	public String getData() {
		return data;
	}

	/**
	 * Method 'setData'
	 * 
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * Method 'getCitacaourl'
	 * 
	 * @return String
	 */
	@Column(name = "citacaourl")
	public String getCitacaourl() {
		return citacaourl;
	}

	/**
	 * Method 'setCitacaourl'
	 * 
	 * @param citacaourl
	 */
	public void setCitacaourl(String citacaourl) {
		this.citacaourl = citacaourl;
	}

	/**
	 * Method 'getCitacoes'
	 * 
	 * @return long
	 */
	@Column(name = "citacoes")
	public long getCitacoes() {
		return citacoes;
	}

	/**
	 * Method 'setCitacoes'
	 * 
	 * @param citacoes
	 */
	public void setCitacoes(Long citacoes) {
		this.citacoes = citacoes;
	}

}
