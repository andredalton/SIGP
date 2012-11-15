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
@Table(name="ProjPesqXTopico")
public class ProjPesqXTopico implements Serializable
{
	protected ProjPesqXTopicoPk id;

	protected ProjetodePesquisa projetodePesquisa;

	protected Topico topico;

	/**
	 * Method 'ProjPesqXTopico'
	 * 
	 */
	public ProjPesqXTopico()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return ProjPesqXTopicoPk
	 */
	@EmbeddedId
	@AttributeOverrides( {
	@AttributeOverride(name="nomeTopico", column=@Column(name="nomeTopico")),
	@AttributeOverride(name="nomeProjetoDePesquisa", column=@Column(name="nomeProjetoDePesquisa")),
	@AttributeOverride(name="marcadorpai", column=@Column(name="marcadorpai")),
	@AttributeOverride(name="nomeLinhaDePesquisa", column=@Column(name="nomeLinhaDePesquisa"))
	} )
	public ProjPesqXTopicoPk getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(ProjPesqXTopicoPk id)
	{
		this.id = id;
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
