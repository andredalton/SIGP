package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="OnMedia")
public class OnMedia implements Serializable
{
	protected OnMediaPk id;

	protected String ano;

	protected String descricao;

	protected byte[] idioma;

	protected String mes;

	protected byte[] imagem;

	protected ProjetodePesquisa projetodePesquisa;

	/**
	 * Method 'OnMedia'
	 * 
	 */
	public OnMedia()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return OnMediaPk
	 */
	@EmbeddedId
	@AttributeOverrides( {
	@AttributeOverride(name="nomeProjetoDePesquisa", column=@Column(name="nomeProjetoDePesquisa")),
	@AttributeOverride(name="nomeLinhaDePesquisa", column=@Column(name="nomeLinhaDePesquisa")),
	@AttributeOverride(name="nome", column=@Column(name="nome"))
	} )
	public OnMediaPk getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(OnMediaPk id)
	{
		this.id = id;
	}

	/**
	 * Method 'getAno'
	 * 
	 * @return String
	 */
	@Column(name="ano")
	public String getAno()
	{
		return ano;
	}

	/**
	 * Method 'setAno'
	 * 
	 * @param ano
	 */
	public void setAno(String ano)
	{
		this.ano = ano;
	}

	/**
	 * Method 'getDescricao'
	 * 
	 * @return String
	 */
	@Column(name="descricao")
	public String getDescricao()
	{
		return descricao;
	}

	/**
	 * Method 'setDescricao'
	 * 
	 * @param descricao
	 */
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	/**
	 * Method 'getIdioma'
	 * 
	 * @return byte[]
	 */
	@Column(name="idioma")
	public byte[] getIdioma()
	{
		return idioma;
	}

	/**
	 * Method 'setIdioma'
	 * 
	 * @param idioma
	 */
	public void setIdioma(byte[] idioma)
	{
		this.idioma = idioma;
	}

	/**
	 * Method 'getMes'
	 * 
	 * @return String
	 */
	@Column(name="mes")
	public String getMes()
	{
		return mes;
	}

	/**
	 * Method 'setMes'
	 * 
	 * @param mes
	 */
	public void setMes(String mes)
	{
		this.mes = mes;
	}

	/**
	 * Method 'getImagem'
	 * 
	 * @return byte[]
	 */
	@Column(name="imagem")
	public byte[] getImagem()
	{
		return imagem;
	}

	/**
	 * Method 'setImagem'
	 * 
	 * @param imagem
	 */
	public void setImagem(byte[] imagem)
	{
		this.imagem = imagem;
	}

	/**
	 * Method 'getProjetodePesquisa'
	 * 
	 * @return ProjetodePesquisa
	 */
	@ManyToOne
	@JoinColumns({
	@JoinColumn(name="nomeProjetoDePesquisa", insertable=false, updatable=false),
	@JoinColumn(name="nomeLinhaDePesquisa", insertable=false, updatable=false)
	})
	public ProjetodePesquisa getProjetodePesquisa()
	{
		return projetodePesquisa;
	}

	/**
	 * Method 'setProjetodePesquisa'
	 * 
	 * @param projetodePesquisa
	 */
	public void setProjetodePesquisa(ProjetodePesquisa projetodePesquisa)
	{
		this.projetodePesquisa = projetodePesquisa;
	}

}
