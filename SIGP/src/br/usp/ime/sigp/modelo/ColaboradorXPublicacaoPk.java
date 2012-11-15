package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

/** 
 * This class represents the primary key of the ColaboradorXPublicacao table.
 */
@Embeddable
public class ColaboradorXPublicacaoPk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7102111502676477590L;

	protected long idColaborador;

	protected long idPublicacao;

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
	 * Method 'ColaboradorXPublicacaoPk'
	 * 
	 */
	public ColaboradorXPublicacaoPk()
	{
	}

	/**
	 * Method 'ColaboradorXPublicacaoPk'
	 * 
	 * @param idColaborador
	 * @param idPublicacao
	 */
	public ColaboradorXPublicacaoPk(final long idColaborador, final long idPublicacao)
	{
		this.idColaborador = idColaborador;
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
		
		if (!(_other instanceof ColaboradorXPublicacaoPk)) {
			return false;
		}
		
		final ColaboradorXPublicacaoPk _cast = (ColaboradorXPublicacaoPk) _other;
		if (idColaborador != _cast.idColaborador) {
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
		_hashCode = 29 * _hashCode + (int) (idColaborador ^ (idColaborador >>> 32));
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
		ret.append( "com.mycompany.myapp.ColaboradorXPublicacaoPk: " );
		ret.append( "idColaborador=" + idColaborador );
		ret.append( ", idPublicacao=" + idPublicacao );
		return ret.toString();
	}

}
