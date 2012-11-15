package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="disciplina")
public class Disciplina implements Serializable
{
	protected DisciplinaPk id;

	protected String nome;

	protected String descricao;

	protected String cargahoraria;

	/**
	 * Method 'Disciplina'
	 * 
	 */
	public Disciplina()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return DisciplinaPk
	 */
	@EmbeddedId
	@AttributeOverrides( {
	@AttributeOverride(name="codigo", column=@Column(name="codigo")),
	@AttributeOverride(name="idGrupoDePesquisaAssociado", column=@Column(name="idGrupoDePesquisaAssociado"))
	} )
	public DisciplinaPk getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(DisciplinaPk id)
	{
		this.id = id;
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
	 * Method 'getCargahoraria'
	 * 
	 * @return String
	 */
	@Column(name="cargahoraria")
	public String getCargahoraria()
	{
		return cargahoraria;
	}

	/**
	 * Method 'setCargahoraria'
	 * 
	 * @param cargahoraria
	 */
	public void setCargahoraria(String cargahoraria)
	{
		this.cargahoraria = cargahoraria;
	}

}
