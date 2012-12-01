package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

/** 
 * This class represents the primary key of the OnMedia table.
 */
@Embeddable
public class OnMediaPk implements Serializable
{
	protected String nomeProjetoDePesquisa;

	protected String nomeLinhaDePesquisa;

	protected String nome;

	/** 
	 * Sets the value of nomeProjetoDePesquisa
	 */
	public void setNomeProjetoDePesquisa(String nomeProjetoDePesquisa)
	{
		this.nomeProjetoDePesquisa = nomeProjetoDePesquisa;
	}

	/** 
	 * Gets the value of nomeProjetoDePesquisa
	 */
	public String getNomeProjetoDePesquisa()
	{
		return nomeProjetoDePesquisa;
	}

	/** 
	 * Sets the value of nomeLinhaDePesquisa
	 */
	public void setNomeLinhaDePesquisa(String nomeLinhaDePesquisa)
	{
		this.nomeLinhaDePesquisa = nomeLinhaDePesquisa;
	}

	/** 
	 * Gets the value of nomeLinhaDePesquisa
	 */
	public String getNomeLinhaDePesquisa()
	{
		return nomeLinhaDePesquisa;
	}

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
	 * Method 'OnMediaPk'
	 * 
	 */
	public OnMediaPk()
	{
	}

	/**
	 * Method 'OnMediaPk'
	 * 
	 * @param nomeProjetoDePesquisa
	 * @param nomeLinhaDePesquisa
	 * @param nome
	 */
	public OnMediaPk(final String nomeProjetoDePesquisa, final String nomeLinhaDePesquisa, final String nome)
	{
		this.nomeProjetoDePesquisa = nomeProjetoDePesquisa;
		this.nomeLinhaDePesquisa = nomeLinhaDePesquisa;
		this.nome = nome;
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
		
		if (!(_other instanceof OnMediaPk)) {
			return false;
		}
		
		final OnMediaPk _cast = (OnMediaPk) _other;
		if (nomeProjetoDePesquisa == null ? _cast.nomeProjetoDePesquisa != nomeProjetoDePesquisa : !nomeProjetoDePesquisa.equals( _cast.nomeProjetoDePesquisa )) {
			return false;
		}
		
		if (nomeLinhaDePesquisa == null ? _cast.nomeLinhaDePesquisa != nomeLinhaDePesquisa : !nomeLinhaDePesquisa.equals( _cast.nomeLinhaDePesquisa )) {
			return false;
		}
		
		if (nome == null ? _cast.nome != nome : !nome.equals( _cast.nome )) {
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
		if (nomeProjetoDePesquisa != null) {
			_hashCode = 29 * _hashCode + nomeProjetoDePesquisa.hashCode();
		}
		
		if (nomeLinhaDePesquisa != null) {
			_hashCode = 29 * _hashCode + nomeLinhaDePesquisa.hashCode();
		}
		
		if (nome != null) {
			_hashCode = 29 * _hashCode + nome.hashCode();
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
		ret.append( "com.mycompany.myapp.OnMediaPk: " );
		ret.append( "nomeProjetoDePesquisa=" + nomeProjetoDePesquisa );
		ret.append( ", nomeLinhaDePesquisa=" + nomeLinhaDePesquisa );
		ret.append( ", nome=" + nome );
		return ret.toString();
	}

}
