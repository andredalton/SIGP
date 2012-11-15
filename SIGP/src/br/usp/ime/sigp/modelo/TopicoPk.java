package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

/** 
 * This class represents the primary key of the topico table.
 */
@Embeddable
public class TopicoPk implements Serializable
{
	protected String nome;

	protected String marcadorpai;

	/** 
	 * Sets the value of nome
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	/** 
	 * Gets the value of nome
	 */
	public String getNome()
	{
		return nome;
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
	 * Method 'TopicoPk'
	 * 
	 */
	public TopicoPk()
	{
	}

	/**
	 * Method 'TopicoPk'
	 * 
	 * @param nome
	 * @param marcadorpai
	 */
	public TopicoPk(final String nome, final String marcadorpai)
	{
		this.nome = nome;
		this.marcadorpai = marcadorpai;
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
		
		if (!(_other instanceof TopicoPk)) {
			return false;
		}
		
		final TopicoPk _cast = (TopicoPk) _other;
		if (nome == null ? _cast.nome != nome : !nome.equals( _cast.nome )) {
			return false;
		}
		
		if (marcadorpai == null ? _cast.marcadorpai != marcadorpai : !marcadorpai.equals( _cast.marcadorpai )) {
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
		if (nome != null) {
			_hashCode = 29 * _hashCode + nome.hashCode();
		}
		
		if (marcadorpai != null) {
			_hashCode = 29 * _hashCode + marcadorpai.hashCode();
		}
		
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
		ret.append( "br.com.usp.ime.sigp.modelo.TopicoPk: " );
		ret.append( "nome=" + nome );
		ret.append( ", marcadorpai=" + marcadorpai );
		return ret.toString();
	}

}
