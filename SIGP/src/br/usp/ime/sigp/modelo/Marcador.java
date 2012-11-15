package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.usp.ime.sigp.jpa.BaseEntityString;

@Entity
@Table(name="marcador")
public class Marcador extends BaseEntityString implements Serializable {
	protected String nome;

	/**
	 * Method 'Marcador'
	 * 
	 */
	public Marcador()
	{
	}

	/**
	 * Method 'getNome'
	 * 
	 * @return String
	 */
	@Id
	@Column(name="nome")
	public String getId()
	{
		return nome;
	}

	/**
	 * Method 'setNome'
	 * 
	 * @param nome
	 */
	public void setId(String nome)
	{
		this.nome = nome;
	}
}
