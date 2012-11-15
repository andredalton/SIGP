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
@Table(name="comentarios")
public class Comentarios implements Serializable
{
	protected ComentariosPk id;

	protected String comentario;

	protected Colaborador colaborador;

	protected Publicacao publicacao;

	/**
	 * Method 'Comentarios'
	 * 
	 */
	public Comentarios()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return ComentariosPk
	 */
	@EmbeddedId
	@AttributeOverrides( {
	@AttributeOverride(name="seq", column=@Column(name="seq")),
	@AttributeOverride(name="idPublicacao", column=@Column(name="idPublicacao"))
	} )
	public ComentariosPk getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(ComentariosPk id)
	{
		this.id = id;
	}

	/**
	 * Method 'getComentario'
	 * 
	 * @return String
	 */
	@Column(name="comentario")
	public String getComentario()
	{
		return comentario;
	}

	/**
	 * Method 'setComentario'
	 * 
	 * @param comentario
	 */
	public void setComentario(String comentario)
	{
		this.comentario = comentario;
	}

	/**
	 * Method 'getColaborador'
	 * 
	 * @return Colaborador
	 */
	@ManyToOne
	@JoinColumn(name="idColaborador", insertable=true, updatable=true)
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
