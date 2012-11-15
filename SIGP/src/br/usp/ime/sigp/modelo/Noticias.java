package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="noticias")
public class Noticias implements Serializable
{
	protected long id;

	protected String noticia;

	protected String tipo;

	protected String url;

	protected byte[] imagem;

	/**
	 * Method 'Noticias'
	 * 
	 */
	public Noticias()
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
	 * Method 'getNoticia'
	 * 
	 * @return String
	 */
	@Column(name="noticia")
	public String getNoticia()
	{
		return noticia;
	}

	/**
	 * Method 'setNoticia'
	 * 
	 * @param noticia
	 */
	public void setNoticia(String noticia)
	{
		this.noticia = noticia;
	}

	/**
	 * Method 'getTipo'
	 * 
	 * @return String
	 */
	@Column(name="tipo")
	public String getTipo()
	{
		return tipo;
	}

	/**
	 * Method 'setTipo'
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
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
