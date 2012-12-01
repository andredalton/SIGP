package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

/** 
 * This class represents the primary key of the publicacoesselecionada table.
 */
@Embeddable
public class PublicacoesselecionadaPk implements Serializable
{
	protected String linhaDePesquisa;

	protected long idPublicacao;

	/** 
	 * Sets the value of linhaDePesquisa
	 */
	public void setLinhaDePesquisa(String linhaDePesquisa)
	{
		this.linhaDePesquisa = linhaDePesquisa;
	}

	/** 
	 * Gets the value of linhaDePesquisa
	 */
	public String getLinhaDePesquisa()
	{
		return linhaDePesquisa;
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
	 * Method 'PublicacoesselecionadaPk'
	 * 
	 */
	public PublicacoesselecionadaPk()
	{
	}

	/**
	 * Method 'PublicacoesselecionadaPk'
	 * 
	 * @param linhaDePesquisa
	 * @param idPublicacao
	 */
	public PublicacoesselecionadaPk(final String linhaDePesquisa, final long idPublicacao)
	{
		this.linhaDePesquisa = linhaDePesquisa;
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
		
		if (!(_other instanceof PublicacoesselecionadaPk)) {
			return false;
		}
		
		final PublicacoesselecionadaPk _cast = (PublicacoesselecionadaPk) _other;
		if (linhaDePesquisa == null ? _cast.linhaDePesquisa != linhaDePesquisa : !linhaDePesquisa.equals( _cast.linhaDePesquisa )) {
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
		if (linhaDePesquisa != null) {
			_hashCode = 29 * _hashCode + linhaDePesquisa.hashCode();
		}
		
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
		ret.append( "br.com.usp.ime.sigp.modelo.PublicacoesselecionadaPk: " );
		ret.append( "linhaDePesquisa=" + linhaDePesquisa );
		ret.append( ", idPublicacao=" + idPublicacao );
		return ret.toString();
	}

}
