package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="financiador")
public class Financiador implements Serializable
{
	protected String nome;

	protected String descricao;

	/**
	 * Method 'Financiador'
	 * 
	 */
	public Financiador()
	{
	}

	/**
	 * Method 'getNome'
	 * 
	 * @return String
	 */
	@Id
	@Column(name="nome")
	public String getNome()
	{
		return nome;
	}

	/**
	 * Method 'setNome'
	 * 
	 * @param nome
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
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

}
