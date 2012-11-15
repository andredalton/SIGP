package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GrupodePesquisaAssociado")
public class GrupodePesquisaAssociado implements Serializable
{
	protected long id;

	protected String descricao;

	protected String nome;

	protected String url;

	protected byte[] imagem;

	/**
	 * Method 'GrupodePesquisaAssociado'
	 * 
	 */
	public GrupodePesquisaAssociado()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return long
	 */
	@Id
	@Column(name="id")
	public long getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(long id)
	{
		this.id = id;
	}

	/**
	 * Method 'getDescricao'
	 * 
	 * @return String
	 */
	@Column(name="descricao")
	public String getDescricao()
	{
		return descricao;
	}

	/**
	 * Method 'setDescricao'
	 * 
	 * @param descricao
	 */
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	/**
	 * Method 'getNome'
	 * 
	 * @return String
	 */
	@Column(name="nome")
	public String getNome()
	{
		return nome;
	}

	/**
	 * Method 'setNome'
	 * 
	 * @param nome
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	/**
	 * Method 'getUrl'
	 * 
	 * @return String
	 */
	@Column(name="url")
	public String getUrl()
	{
		return url;
	}

	/**
	 * Method 'setUrl'
	 * 
	 * @param url
	 */
	public void setUrl(String url)
	{
		this.url = url;
	}

	/**
	 * Method 'getImagem'
	 * 
	 * @return byte[]
	 */
	@Column(name="imagem")
	public byte[] getImagem()
	{
		return imagem;
	}

	/**
	 * Method 'setImagem'
	 * 
	 * @param imagem
	 */
	public void setImagem(byte[] imagem)
	{
		this.imagem = imagem;
	}

}
