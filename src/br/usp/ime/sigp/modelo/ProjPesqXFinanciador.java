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
@Table(name="ProjPesqXFinanciador")
public class ProjPesqXFinanciador implements Serializable
{
	protected ProjPesqXFinanciadorPk id;

	protected Financiador financiador;

	protected ProjetodePesquisa projetodePesquisa;

	/**
	 * Method 'ProjPesqXFinanciador'
	 * 
	 */
	public ProjPesqXFinanciador()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return ProjPesqXFinanciadorPk
	 */
	@EmbeddedId
	@AttributeOverrides( {
	@AttributeOverride(name="nomeProjetoDePesquisa", column=@Column(name="nomeProjetoDePesquisa")),
	@AttributeOverride(name="nomeLinhaDePesquisa", column=@Column(name="nomeLinhaDePesquisa")),
	@AttributeOverride(name="nomeFinanciador", column=@Column(name="nomeFinanciador"))
	} )
	public ProjPesqXFinanciadorPk getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(ProjPesqXFinanciadorPk id)
	{
		this.id = id;
	}

	/**
	 * Method 'getFinanciador'
	 * 
	 * @return Financiador
	 */
	@ManyToOne
	@JoinColumn(name="nomeFinanciador", insertable=false, updatable=false)
	public Financiador getFinanciador()
	{
		return financiador;
	}

	/**
	 * Method 'setFinanciador'
	 * 
	 * @param financiador
	 */
	public void setFinanciador(Financiador financiador)
	{
		this.financiador = financiador;
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
