package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

/** 
 * This class represents the primary key of the comentarios table.
 */
@Embeddable
public class ComentariosPk implements Serializable
{
	protected long seq;

	protected long idPublicacao;

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
	 * Sets the value of idPublicacao
	 */
	public void setIdPublicacao(long idPublicacao)
	{
		this.idPublicacao = idPublicacao;
	}

	/** 
	 * Gets the value of idPublicacao
	 */
	public long getIdPublicacao()
	{
		return idPublicacao;
	}

	/**
	 * Method 'ComentariosPk'
	 * 
	 */
	public ComentariosPk()
	{
	}

	/**
	 * Method 'ComentariosPk'
	 * 
	 * @param seq
	 * @param idPublicacao
	 */
	public ComentariosPk(final long seq, final long idPublicacao)
	{
		this.seq = seq;
		this.idPublicacao = idPublicacao;
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
		
		if (!(_other instanceof ComentariosPk)) {
			return false;
		}
		
		final ComentariosPk _cast = (ComentariosPk) _other;
		if (seq != _cast.seq) {
			return false;
		}
		
		if (idPublicacao != _cast.idPublicacao) {
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
		_hashCode = 29 * _hashCode + (int) (idPublicacao ^ (idPublicacao >>> 32));
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
		ret.append( "br.com.usp.ime.sigp.modelo.ComentariosPk: " );
		ret.append( "seq=" + seq );
		ret.append( ", idPublicacao=" + idPublicacao );
		return ret.toString();
	}

}
