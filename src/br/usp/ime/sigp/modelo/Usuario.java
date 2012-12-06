package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.usp.ime.sigp.jpa.BaseEntityString;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable
{
	protected String login;

	protected String senha;

	protected Colaborador colaborador;

	/**
	 * Method 'Usuario'
	 * 
	 */
	public Usuario()
	{
	}

	/**
	 * Method 'getLogin'
	 * 
	 * @return String
	 */
	@Id
	@Column(name="login")
	public String getLogin()
	{
		return login;
	}

	/**
	 * Method 'setLogin'
	 * 
	 * @param login
	 */
	public void setLogin(String login)
	{
		this.login = login;
	}

	/**
	 * Method 'getSenha'
	 * 
	 * @return String
	 */
	@Column(name="senha")
	public String getSenha()
	{
		return senha;
	}

	/**
	 * Method 'setSenha'
	 * 
	 * @param senha
	 */
	public void setSenha(String senha)
	{
		this.senha = senha;
	}

	/**
	 * Method 'getColaborador'
	 * 
	 * @return Colaborador
	 */
	@ManyToOne
	@JoinColumn(name="idColaborador", insertable=true, updatable=true)
	public Colaborador getColaborador()
	{
		return colaborador;
	}

	/**
	 * Method 'setColaborador'
	 * 
	 * @param colaborador
	 */
	public void setColaborador(Colaborador colaborador)
	{
		this.colaborador = colaborador;
	}
}
