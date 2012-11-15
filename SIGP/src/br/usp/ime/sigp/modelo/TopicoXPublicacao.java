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
@Table(name="TopicoXPublicacao")
public class TopicoXPublicacao implements Serializable
{
	protected TopicoXPublicacaoPk id;

	protected Publicacao publicacao;

	protected Topico topico;

	/**
	 * Method 'TopicoXPublicacao'
	 * 
	 */
	public TopicoXPublicacao()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return TopicoXPublicacaoPk
	 */
	@EmbeddedId
	@AttributeOverrides( {
	@AttributeOverride(name="nomeTopico", column=@Column(name="nomeTopico")),
	@AttributeOverride(name="marcadorpai", column=@Column(name="marcadorpai")),
	@AttributeOverride(name="idPublicacao", column=@Column(name="idPublicacao"))
	} )
	public TopicoXPublicacaoPk getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(TopicoXPublicacaoPk id)
	{
		this.id = id;
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

	/**
	 * Method 'getTopico'
	 * 
	 * @return Topico
	 */
	@ManyToOne
	@JoinColumns({
	@JoinColumn(name="nomeTopico", insertable=false, updatable=false),
	@JoinColumn(name="marcadorpai", insertable=false, updatable=false)
	})
	public Topico getTopico()
	{
		return topico;
	}

	/**
	 * Method 'setTopico'
	 * 
	 * @param topico
	 */
	public void setTopico(Topico topico)
	{
		this.topico = topico;
	}

}
