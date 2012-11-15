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
@Table(name="publicacoesselecionada")
public class Publicacoesselecionada implements Serializable
{
	protected PublicacoesselecionadaPk id;

	protected LinhadePesquisa linhadepesquisa;

	protected Publicacao publicacao;

	/**
	 * Method 'Publicacoesselecionada'
	 * 
	 */
	public Publicacoesselecionada()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return PublicacoesselecionadaPk
	 */
	@EmbeddedId
	@AttributeOverrides( {
	@AttributeOverride(name="linhaDePesquisa", column=@Column(name="linhaDePesquisa")),
	@AttributeOverride(name="idPublicacao", column=@Column(name="idPublicacao"))
	} )
	public PublicacoesselecionadaPk getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(PublicacoesselecionadaPk id)
	{
		this.id = id;
	}

	/**
	 * Method 'getLinhadepesquisa'
	 * 
	 * @return Linhadepesquisa
	 */
	@ManyToOne
	@JoinColumn(name="linhaDePesquisa", insertable=false, updatable=false)
	public LinhadePesquisa getLinhadepesquisa()
	{
		return linhadepesquisa;
	}

	/**
	 * Method 'setLinhadepesquisa'
	 * 
	 * @param linhadepesquisa
	 */
	public void setLinhadepesquisa(LinhadePesquisa linhadepesquisa)
	{
		this.linhadepesquisa = linhadepesquisa;
	}

	/**
	 * Method 'getPublicacao'
	 * 
	 * @return Publicacao
	 */
	@ManyToOne
	@JoinColumn(name="idPublicacao", insertable=false, updatable=false)
	public Publicacao getPublicacao()
	{
		return publicacao;
	}

	/**
	 * Method 'setPublicacao'
	 * 
	 * @param publicacao
	 */
	public void setPublicacao(Publicacao publicacao)
	{
		this.publicacao = publicacao;
	}

}
