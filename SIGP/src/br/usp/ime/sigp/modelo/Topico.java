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

import br.usp.ime.sigp.jpa.BaseEntityTopicoPk;

@Entity
@Table(name="topico")
public class Topico extends BaseEntityTopicoPk implements Serializable {
	protected TopicoPk id;

	protected Marcador marcador;

	/**
	 * Method 'Topico'
	 * 
	 */
	public Topico()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return TopicoPk
	 */
	@EmbeddedId
	@AttributeOverrides( {
	@AttributeOverride(name="nome", column=@Column(name="nome")),
	@AttributeOverride(name="marcadorpai", column=@Column(name="marcadorpai"))
	} )
	public TopicoPk getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(TopicoPk id)
	{
		this.id = id;
	}

	/**
	 * Method 'getMarcador'
	 * 
	 * @return Marcador
	 */
	@ManyToOne
	@JoinColumn(name="marcadorpai", insertable=false, updatable=false)
	public Marcador getMarcador()
	{
		return marcador;
	}

	/**
	 * Method 'setMarcador'
	 * 
	 * @param marcador
	 */
	public void setMarcador(Marcador marcador)
	{
		this.marcador = marcador;
	}

}
