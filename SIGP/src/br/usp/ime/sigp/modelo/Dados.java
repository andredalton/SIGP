package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dados")
public class Dados implements Serializable
{
	protected DadosPk id;

	protected String atributo;

	protected String valor;

	protected DadosdoGrupodePesquisa dadosdogrupodepesquisa;

	/**
	 * Method 'Dados'
	 * 
	 */
	public Dados()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return DadosPk
	 */
	@EmbeddedId
	@AttributeOverrides( {
	@AttributeOverride(name="seq", column=@Column(name="seq")),
	@AttributeOverride(name="idDadosDoGrupoDePesquisa", column=@Column(name="idDadosDoGrupoDePesquisa"))
	} )
	public DadosPk getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(DadosPk id)
	{
		this.id = id;
	}

	/**
	 * Method 'getAtributo'
	 * 
	 * @return String
	 */
	@Column(name="atributo")
	public String getAtributo()
	{
		return atributo;
	}

	/**
	 * Method 'setAtributo'
	 * 
	 * @param atributo
	 */
	public void setAtributo(String atributo)
	{
		this.atributo = atributo;
	}

	/**
	 * Method 'getValor'
	 * 
	 * @return String
	 */
	@Column(name="valor")
	public String getValor()
	{
		return valor;
	}

	/**
	 * Method 'setValor'
	 * 
	 * @param valor
	 */
	public void setValor(String valor)
	{
		this.valor = valor;
	}

	/**
	 * Method 'getDadosdogrupodepesquisa'
	 * 
	 * @return DadosdoGrupodePesquisa
	 */
	@ManyToOne
	@JoinColumn(name="idDadosDoGrupoDePesquisa", insertable=false, updatable=false)
	public DadosdoGrupodePesquisa getDadosdogrupodepesquisa()
	{
		return dadosdogrupodepesquisa;
	}

	/**
	 * Method 'setDadosdogrupodepesquisa'
	 * 
	 * @param dadosdogrupodepesquisa
	 */
	public void setDadosdogrupodepesquisa(DadosdoGrupodePesquisa dadosdogrupodepesquisa)
	{
		this.dadosdogrupodepesquisa = dadosdogrupodepesquisa;
	}

}
