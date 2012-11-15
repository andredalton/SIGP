package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ProjetodePesquisa")
public class ProjetodePesquisa implements Serializable
{
	protected ProjetodePesquisaPk id;

	protected String descricao;

	protected String url;

	protected LinhadePesquisa linhadePesquisa;

	/**
	 * Method 'ProjetodePesquisa'
	 * 
	 */
	public ProjetodePesquisa()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return ProjetodePesquisaPk
	 */
	@EmbeddedId
	@AttributeOverrides( {
	@AttributeOverride(name="nome", column=@Column(name="nome")),
	@AttributeOverride(name="nomeLinhaDePesquisa", column=@Column(name="nomeLinhaDePesquisa"))
	} )
	public ProjetodePesquisaPk getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(ProjetodePesquisaPk id)
	{
		this.id = id;
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
	 * Method 'getUrl'
	 * 
	 * @return String
	 */
	@Column(name="url")
	public String getUrl()
	{
		return url;
	}

	/**
	 * Method 'setUrl'
	 * 
	 * @param url
	 */
	public void setUrl(String url)
	{
		this.url = url;
	}

	/**
	 * Method 'getLinhadePesquisa'
	 * 
	 * @return LinhadePesquisa
	 */
	@ManyToOne
	@JoinColumn(name="nomeLinhaDePesquisa", insertable=false, updatable=false)
	public LinhadePesquisa getLinhadePesquisa()
	{
		return linhadePesquisa;
	}

	/**
	 * Method 'setLinhadePesquisa'
	 * 
	 * @param linhadePesquisa
	 */
	public void setLinhadePesquisa(LinhadePesquisa linhadePesquisa)
	{
		this.linhadePesquisa = linhadePesquisa;
	}

}
