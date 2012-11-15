package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

/** 
 * This class represents the primary key of the ProjPesqXTopico table.
 */
@Embeddable
public class ProjPesqXTopicoPk implements Serializable
{
	protected String nomeTopico;

	protected String nomeProjetoDePesquisa;

	protected String marcadorpai;

	protected String nomeLinhaDePesquisa;

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
	 * Method 'ProjPesqXTopicoPk'
	 * 
	 */
	public ProjPesqXTopicoPk()
	{
	}

	/**
	 * Method 'ProjPesqXTopicoPk'
	 * 
	 * @param nomeTopico
	 * @param nomeProjetoDePesquisa
	 * @param marcadorpai
	 * @param nomeLinhaDePesquisa
	 */
	public ProjPesqXTopicoPk(final String nomeTopico, final String nomeProjetoDePesquisa, final String marcadorpai, final String nomeLinhaDePesquisa)
	{
		this.nomeTopico = nomeTopico;
		this.nomeProjetoDePesquisa = nomeProjetoDePesquisa;
		this.marcadorpai = marcadorpai;
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
		
		if (!(_other instanceof ProjPesqXTopicoPk)) {
			return false;
		}
		
		final ProjPesqXTopicoPk _cast = (ProjPesqXTopicoPk) _other;
		if (nomeTopico == null ? _cast.nomeTopico != nomeTopico : !nomeTopico.equals( _cast.nomeTopico )) {
			return false;
		}
		
		if (nomeProjetoDePesquisa == null ? _cast.nomeProjetoDePesquisa != nomeProjetoDePesquisa : !nomeProjetoDePesquisa.equals( _cast.nomeProjetoDePesquisa )) {
			return false;
		}
		
		if (marcadorpai == null ? _cast.marcadorpai != marcadorpai : !marcadorpai.equals( _cast.marcadorpai )) {
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
		if (nomeTopico != null) {
			_hashCode = 29 * _hashCode + nomeTopico.hashCode();
		}
		
		if (nomeProjetoDePesquisa != null) {
			_hashCode = 29 * _hashCode + nomeProjetoDePesquisa.hashCode();
		}
		
		if (marcadorpai != null) {
			_hashCode = 29 * _hashCode + marcadorpai.hashCode();
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
		ret.append( "com.mycompany.myapp.ProjPesqXTopicoPk: " );
		ret.append( "nomeTopico=" + nomeTopico );
		ret.append( ", nomeProjetoDePesquisa=" + nomeProjetoDePesquisa );
		ret.append( ", marcadorpai=" + marcadorpai );
		ret.append( ", nomeLinhaDePesquisa=" + nomeLinhaDePesquisa );
		return ret.toString();
	}

}
