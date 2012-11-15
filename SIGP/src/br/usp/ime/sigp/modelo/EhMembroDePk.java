package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

/** 
 * This class represents the primary key of the EhMembroDe table.
 */
@Embeddable
public class EhMembroDePk implements Serializable
{
	protected long idColaborador;

	protected long idGrupoDePesquisaAssociado;

	/** 
	 * Sets the value of idColaborador
	 */
	public void setIdColaborador(long idColaborador)
	{
		this.idColaborador = idColaborador;
	}

	/** 
	 * Gets the value of idColaborador
	 */
	public long getIdColaborador()
	{
		return idColaborador;
	}

	/** 
	 * Sets the value of idGrupoDePesquisaAssociado
	 */
	public void setIdGrupoDePesquisaAssociado(long idGrupoDePesquisaAssociado)
	{
		this.idGrupoDePesquisaAssociado = idGrupoDePesquisaAssociado;
	}

	/** 
	 * Gets the value of idGrupoDePesquisaAssociado
	 */
	public long getIdGrupoDePesquisaAssociado()
	{
		return idGrupoDePesquisaAssociado;
	}

	/**
	 * Method 'EhMembroDePk'
	 * 
	 */
	public EhMembroDePk()
	{
	}

	/**
	 * Method 'EhMembroDePk'
	 * 
	 * @param idColaborador
	 * @param idGrupoDePesquisaAssociado
	 */
	public EhMembroDePk(final long idColaborador, final long idGrupoDePesquisaAssociado)
	{
		this.idColaborador = idColaborador;
		this.idGrupoDePesquisaAssociado = idGrupoDePesquisaAssociado;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof EhMembroDePk)) {
			return false;
		}
		
		final EhMembroDePk _cast = (EhMembroDePk) _other;
		if (idColaborador != _cast.idColaborador) {
			return false;
		}
		
		if (idGrupoDePesquisaAssociado != _cast.idGrupoDePesquisaAssociado) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + (int) (idColaborador ^ (idColaborador >>> 32));
		_hashCode = 29 * _hashCode + (int) (idGrupoDePesquisaAssociado ^ (idGrupoDePesquisaAssociado >>> 32));
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mycompany.myapp.EhMembroDePk: " );
		ret.append( "idColaborador=" + idColaborador );
		ret.append( ", idGrupoDePesquisaAssociado=" + idGrupoDePesquisaAssociado );
		return ret.toString();
	}

}
