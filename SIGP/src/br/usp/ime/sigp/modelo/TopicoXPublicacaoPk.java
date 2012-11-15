package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

/** 
 * This class represents the primary key of the TopicoXPublicacao table.
 */
@Embeddable
public class TopicoXPublicacaoPk implements Serializable
{
	protected String nomeTopico;

	protected String marcadorpai;

	protected long idPublicacao;

	/** 
	 * Sets the value of nomeTopico
	 */
	public void setNomeTopico(String nomeTopico)
	{
		this.nomeTopico = nomeTopico;
	}

	/** 
	 * Gets the value of nomeTopico
	 */
	public String getNomeTopico()
	{
		return nomeTopico;
	}

	/** 
	 * Sets the value of marcadorpai
	 */
	public void setMarcadorpai(String marcadorpai)
	{
		this.marcadorpai = marcadorpai;
	}

	/** 
	 * Gets the value of marcadorpai
	 */
	public String getMarcadorpai()
	{
		return marcadorpai;
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
	 * Method 'TopicoXPublicacaoPk'
	 * 
	 */
	public TopicoXPublicacaoPk()
	{
	}

	/**
	 * Method 'TopicoXPublicacaoPk'
	 * 
	 * @param nomeTopico
	 * @param marcadorpai
	 * @param idPublicacao
	 */
	public TopicoXPublicacaoPk(final String nomeTopico, final String marcadorpai, final long idPublicacao)
	{
		this.nomeTopico = nomeTopico;
		this.marcadorpai = marcadorpai;
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
		
		if (!(_other instanceof TopicoXPublicacaoPk)) {
			return false;
		}
		
		final TopicoXPublicacaoPk _cast = (TopicoXPublicacaoPk) _other;
		if (nomeTopico == null ? _cast.nomeTopico != nomeTopico : !nomeTopico.equals( _cast.nomeTopico )) {
			return false;
		}
		
		if (marcadorpai == null ? _cast.marcadorpai != marcadorpai : !marcadorpai.equals( _cast.marcadorpai )) {
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
		if (nomeTopico != null) {
			_hashCode = 29 * _hashCode + nomeTopico.hashCode();
		}
		
		if (marcadorpai != null) {
			_hashCode = 29 * _hashCode + marcadorpai.hashCode();
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
		ret.append( "com.mycompany.myapp.TopicoXPublicacaoPk: " );
		ret.append( "nomeTopico=" + nomeTopico );
		ret.append( ", marcadorpai=" + marcadorpai );
		ret.append( ", idPublicacao=" + idPublicacao );
		return ret.toString();
	}

}
