package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="arquivo")
public class Arquivo implements Serializable
{
	protected String nome;

	protected String descricao;

	protected String local;

	protected String tipo;

	protected short publico;

	protected OnMedia onmedia;

	protected Publicacao publicacao;

	/**
	 * Method 'Arquivo'
	 * 
	 */
	public Arquivo()
	{
	}

	/**
	 * Method 'getNome'
	 * 
	 * @return String
	 */
	@Id
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
	 * Method 'getLocal'
	 * 
	 * @return String
	 */
	@Column(name="local")
	public String getLocal()
	{
		return local;
	}

	/**
	 * Method 'setLocal'
	 * 
	 * @param local
	 */
	public void setLocal(String local)
	{
		this.local = local;
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
	 * Method 'getPublico'
	 * 
	 * @return short
	 */
	@Column(name="publico")
	public short getPublico()
	{
		return publico;
	}

	/**
	 * Method 'setPublico'
	 * 
	 * @param publico
	 */
	public void setPublico(short publico)
	{
		this.publico = publico;
	}

	/**
	 * Method 'getOnmedia'
	 * 
	 * @return Onmedia
	 */
	@ManyToOne
	@JoinColumns({
	@JoinColumn(name="nomeProjetoDePesquisa", insertable=true, updatable=true),
	@JoinColumn(name="nomeLinhaDePesquisa", insertable=true, updatable=true),
	@JoinColumn(name="nomeOnMedia", insertable=true, updatable=true)
	})
	public OnMedia getOnmedia()
	{
		return onmedia;
	}

	/**
	 * Method 'setOnmedia'
	 * 
	 * @param onmedia
	 */
	public void setOnmedia(OnMedia onmedia)
	{
		this.onmedia = onmedia;
	}

	/**
	 * Method 'getPublicacao'
	 * 
	 * @return Publicacao
	 */
	@ManyToOne
	@JoinColumn(name="idPublicacao", insertable=true, updatable=true)
	public Publicacao getPublicacao()
	{
		return publicacao;
	}

	/**
	 * Method 'setPublicacao'
	 * 
	 * @param publicacao
	 */
	public void setPublicacao(Publicacao publicacao)
	{
		this.publicacao = publicacao;
	}

}
