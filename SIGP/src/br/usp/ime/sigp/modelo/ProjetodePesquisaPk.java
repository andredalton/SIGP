package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

/** 
 * This class represents the primary key of the ProjetodePesquisa table.
 */
@Embeddable
public class ProjetodePesquisaPk implements Serializable
{
	protected String nome;

	protected String nomeLinhaDePesquisa;

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
	 * Method 'ProjetodePesquisaPk'
	 * 
	 */
	public ProjetodePesquisaPk()
	{
	}

	/**
	 * Method 'ProjetodePesquisaPk'
	 * 
	 * @param nome
	 * @param nomeLinhaDePesquisa
	 */
	public ProjetodePesquisaPk(final String nome, final String nomeLinhaDePesquisa)
	{
		this.nome = nome;
		this.nomeLinhaDePesquisa = nomeLinhaDePesquisa;
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
		
		if (!(_other instanceof ProjetodePesquisaPk)) {
			return false;
		}
		
		final ProjetodePesquisaPk _cast = (ProjetodePesquisaPk) _other;
		if (nome == null ? _cast.nome != nome : !nome.equals( _cast.nome )) {
			return false;
		}
		
		if (nomeLinhaDePesquisa == null ? _cast.nomeLinhaDePesquisa != nomeLinhaDePesquisa : !nomeLinhaDePesquisa.equals( _cast.nomeLinhaDePesquisa )) {
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
		
		if (nomeLinhaDePesquisa != null) {
			_hashCode = 29 * _hashCode + nomeLinhaDePesquisa.hashCode();
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
		ret.append( "com.mycompany.myapp.ProjetodePesquisaPk: " );
		ret.append( "nome=" + nome );
		ret.append( ", nomeLinhaDePesquisa=" + nomeLinhaDePesquisa );
		return ret.toString();
	}

}
