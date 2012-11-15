package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

/** 
 * This class represents the primary key of the dados table.
 */
@Embeddable
public class DadosPk implements Serializable
{
	protected long seq;

	protected long idDadosDoGrupoDePesquisa;

	/** 
	 * Sets the value of seq
	 */
	public void setSeq(long seq)
	{
		this.seq = seq;
	}

	/** 
	 * Gets the value of seq
	 */
	public long getSeq()
	{
		return seq;
	}

	/** 
	 * Sets the value of idDadosDoGrupoDePesquisa
	 */
	public void setIdDadosDoGrupoDePesquisa(long idDadosDoGrupoDePesquisa)
	{
		this.idDadosDoGrupoDePesquisa = idDadosDoGrupoDePesquisa;
	}

	/** 
	 * Gets the value of idDadosDoGrupoDePesquisa
	 */
	public long getIdDadosDoGrupoDePesquisa()
	{
		return idDadosDoGrupoDePesquisa;
	}

	/**
	 * Method 'DadosPk'
	 * 
	 */
	public DadosPk()
	{
	}

	/**
	 * Method 'DadosPk'
	 * 
	 * @param seq
	 * @param idDadosDoGrupoDePesquisa
	 */
	public DadosPk(final long seq, final long idDadosDoGrupoDePesquisa)
	{
		this.seq = seq;
		this.idDadosDoGrupoDePesquisa = idDadosDoGrupoDePesquisa;
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
		
		if (!(_other instanceof DadosPk)) {
			return false;
		}
		
		final DadosPk _cast = (DadosPk) _other;
		if (seq != _cast.seq) {
			return false;
		}
		
		if (idDadosDoGrupoDePesquisa != _cast.idDadosDoGrupoDePesquisa) {
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
		_hashCode = 29 * _hashCode + (int) (seq ^ (seq >>> 32));
		_hashCode = 29 * _hashCode + (int) (idDadosDoGrupoDePesquisa ^ (idDadosDoGrupoDePesquisa >>> 32));
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
		ret.append( "br.com.usp.ime.sigp.modelo.DadosPk: " );
		ret.append( "seq=" + seq );
		ret.append( ", idDadosDoGrupoDePesquisa=" + idDadosDoGrupoDePesquisa );
		return ret.toString();
	}

}
