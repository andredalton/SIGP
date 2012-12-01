package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

/** 
 * This class represents the primary key of the ProjPesqXFinanciador table.
 */
@Embeddable
public class ProjPesqXFinanciadorPk implements Serializable
{
	protected String nomeProjetoDePesquisa;

	protected String nomeLinhaDePesquisa;

	protected String nomeFinanciador;

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
	 * Sets the value of nomeFinanciador
	 */
	public void setNomeFinanciador(String nomeFinanciador)
	{
		this.nomeFinanciador = nomeFinanciador;
	}

	/** 
	 * Gets the value of nomeFinanciador
	 */
	public String getNomeFinanciador()
	{
		return nomeFinanciador;
	}

	/**
	 * Method 'ProjPesqXFinanciadorPk'
	 * 
	 */
	public ProjPesqXFinanciadorPk()
	{
	}

	/**
	 * Method 'ProjPesqXFinanciadorPk'
	 * 
	 * @param nomeProjetoDePesquisa
	 * @param nomeLinhaDePesquisa
	 * @param nomeFinanciador
	 */
	public ProjPesqXFinanciadorPk(final String nomeProjetoDePesquisa, final String nomeLinhaDePesquisa, final String nomeFinanciador)
	{
		this.nomeProjetoDePesquisa = nomeProjetoDePesquisa;
		this.nomeLinhaDePesquisa = nomeLinhaDePesquisa;
		this.nomeFinanciador = nomeFinanciador;
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
		
		if (!(_other instanceof ProjPesqXFinanciadorPk)) {
			return false;
		}
		
		final ProjPesqXFinanciadorPk _cast = (ProjPesqXFinanciadorPk) _other;
		if (nomeProjetoDePesquisa == null ? _cast.nomeProjetoDePesquisa != nomeProjetoDePesquisa : !nomeProjetoDePesquisa.equals( _cast.nomeProjetoDePesquisa )) {
			return false;
		}
		
		if (nomeLinhaDePesquisa == null ? _cast.nomeLinhaDePesquisa != nomeLinhaDePesquisa : !nomeLinhaDePesquisa.equals( _cast.nomeLinhaDePesquisa )) {
			return false;
		}
		
		if (nomeFinanciador == null ? _cast.nomeFinanciador != nomeFinanciador : !nomeFinanciador.equals( _cast.nomeFinanciador )) {
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
		
		if (nomeFinanciador != null) {
			_hashCode = 29 * _hashCode + nomeFinanciador.hashCode();
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
		ret.append( "com.mycompany.myapp.ProjPesqXFinanciadorPk: " );
		ret.append( "nomeProjetoDePesquisa=" + nomeProjetoDePesquisa );
		ret.append( ", nomeLinhaDePesquisa=" + nomeLinhaDePesquisa );
		ret.append( ", nomeFinanciador=" + nomeFinanciador );
		return ret.toString();
	}

}
