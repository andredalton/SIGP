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
@Table(name="ColaboradorXPublicacao")
public class ColaboradorXPublicacao implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8174086053459323645L;

	protected ColaboradorXPublicacaoPk id;

	protected Colaborador colaborador;

	protected Publicacao publicacao;

	/**
	 * Method 'ColaboradorXPublicacao'
	 * 
	 */
	public ColaboradorXPublicacao()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return ColaboradorXPublicacaoPk
	 */
	@EmbeddedId
	@AttributeOverrides( {
	@AttributeOverride(name="idColaborador", column=@Column(name="idColaborador")),
	@AttributeOverride(name="idPublicacao", column=@Column(name="idPublicacao"))
	} )
	public ColaboradorXPublicacaoPk getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(ColaboradorXPublicacaoPk id)
	{
		this.id = id;
	}

	/**
	 * Method 'getColaborador'
	 * 
	 * @return Colaborador
	 */
	@ManyToOne
	@JoinColumn(name="idColaborador", insertable=false, updatable=false)
	public Colaborador getColaborador()
	{
		return colaborador;
	}

	/**
	 * Method 'setColaborador'
	 * 
	 * @param colaborador
	 */
	public void setColaborador(Colaborador colaborador)
	{
		this.colaborador = colaborador;
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
