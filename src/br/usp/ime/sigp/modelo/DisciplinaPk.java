package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

/** 
 * This class represents the primary key of the disciplina table.
 */
@Embeddable
public class DisciplinaPk implements Serializable
{
	protected String codigo;

	protected long idGrupoDePesquisaAssociado;

	/** 
	 * Sets the value of codigo
	 */
	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}

	/** 
	 * Gets the value of codigo
	 */
	public String getCodigo()
	{
		return codigo;
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
	 * Method 'DisciplinaPk'
	 * 
	 */
	public DisciplinaPk()
	{
	}

	/**
	 * Method 'DisciplinaPk'
	 * 
	 * @param codigo
	 * @param idGrupoDePesquisaAssociado
	 */
	public DisciplinaPk(final String codigo, final long idGrupoDePesquisaAssociado)
	{
		this.codigo = codigo;
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
		
		if (!(_other instanceof DisciplinaPk)) {
			return false;
		}
		
		final DisciplinaPk _cast = (DisciplinaPk) _other;
		if (codigo == null ? _cast.codigo != codigo : !codigo.equals( _cast.codigo )) {
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
		if (codigo != null) {
			_hashCode = 29 * _hashCode + codigo.hashCode();
		}
		
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
		ret.append( "br.com.usp.ime.sigp.modelo.DisciplinaPk: " );
		ret.append( "codigo=" + codigo );
		ret.append( ", idGrupoDePesquisaAssociado=" + idGrupoDePesquisaAssociado );
		return ret.toString();
	}

}
