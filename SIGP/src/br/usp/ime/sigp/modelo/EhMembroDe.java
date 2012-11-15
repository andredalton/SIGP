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
@Table(name="EhMembroDe")
public class EhMembroDe implements Serializable
{
	protected EhMembroDePk id;

	protected Colaborador colaborador;

	protected GrupodePesquisaAssociado grupodePesquisaAssociado;

	/**
	 * Method 'EhMembroDe'
	 * 
	 */
	public EhMembroDe()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return EhMembroDePk
	 */
	@EmbeddedId
	@AttributeOverrides( {
	@AttributeOverride(name="idColaborador", column=@Column(name="idColaborador")),
	@AttributeOverride(name="idGrupoDePesquisaAssociado", column=@Column(name="idGrupoDePesquisaAssociado"))
	} )
	public EhMembroDePk getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(EhMembroDePk id)
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
	 * Method 'getGrupodePesquisaAssociado'
	 * 
	 * @return GrupodePesquisaAssociado
	 */
	@ManyToOne
	@JoinColumn(name="idGrupoDePesquisaAssociado", insertable=false, updatable=false)
	public GrupodePesquisaAssociado getGrupodePesquisaAssociado()
	{
		return grupodePesquisaAssociado;
	}

	/**
	 * Method 'setGrupodePesquisaAssociado'
	 * 
	 * @param grupodePesquisaAssociado
	 */
	public void setGrupodePesquisaAssociado(GrupodePesquisaAssociado grupodePesquisaAssociado)
	{
		this.grupodePesquisaAssociado = grupodePesquisaAssociado;
	}

}
