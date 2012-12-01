package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="coordenador")
public class Coordenador implements Serializable
{
	@Id
	protected Colaborador colaborador;

	/**
	 * Method 'Coordenador'
	 * 
	 */
	public Coordenador()
	{
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

}
