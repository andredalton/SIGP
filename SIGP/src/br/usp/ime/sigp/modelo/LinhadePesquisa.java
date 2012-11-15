package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LinhadePesquisa")
public class LinhadePesquisa implements Serializable
{
	protected String nome;

	protected String descricao;

	protected byte[] imagem;

	protected short atual;

	/**
	 * Method 'LinhadePesquisa'
	 * 
	 */
	public LinhadePesquisa()
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

	/**
	 * Method 'getAtual'
	 * 
	 * @return short
	 */
	@Column(name="atual")
	public short getAtual()
	{
		return atual;
	}

	/**
	 * Method 'setAtual'
	 * 
	 * @param atual
	 */
	public void setAtual(short atual)
	{
		this.atual = atual;
	}

}
