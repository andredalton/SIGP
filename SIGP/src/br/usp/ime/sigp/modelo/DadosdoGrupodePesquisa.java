package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DadosdoGrupodePesquisa")
public class DadosdoGrupodePesquisa implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3708622830530504608L;

	protected Long id;

	protected String grupodedados;

	/**
	 * Method 'DadosdoGrupodePesquisa'
	 * 
	 */
	public DadosdoGrupodePesquisa()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return Long
	 */
	@Id
	@Column(name="id")
	public Long getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(Long id)
	{
		this.id = id;
	}

	/**
	 * Method 'getGrupodedados'
	 * 
	 * @return String
	 */
	@Column(name="grupodedados")
	public String getGrupodedados()
	{
		return grupodedados;
	}

	/**
	 * Method 'setGrupodedados'
	 * 
	 * @param grupodedados
	 */
	public void setGrupodedados(String grupodedados)
	{
		this.grupodedados = grupodedados;
	}

}
