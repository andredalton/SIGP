package br.usp.ime.sigp.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="HistoricodeAcoesRealizadas")
public class HistoricodeAcoesRealizadas implements Serializable
{
	protected long id;

	protected Date timestamp;

	protected String acao;

	protected Usuario usuario;

	/**
	 * Method 'HistoricodeAcoesRealizadas'
	 * 
	 */
	public HistoricodeAcoesRealizadas()
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
	 * Method 'getTimestamp'
	 * 
	 * @return Date
	 */
	@Column(name="timestamp")
	public Date getTimestamp()
	{
		return timestamp;
	}

	/**
	 * Method 'setTimestamp'
	 * 
	 * @param timestamp
	 */
	public void setTimestamp(Date timestamp)
	{
		this.timestamp = timestamp;
	}

	/**
	 * Method 'getAcao'
	 * 
	 * @return String
	 */
	@Column(name="acao")
	public String getAcao()
	{
		return acao;
	}

	/**
	 * Method 'setAcao'
	 * 
	 * @param acao
	 */
	public void setAcao(String acao)
	{
		this.acao = acao;
	}

	/**
	 * Method 'getUsuario'
	 * 
	 * @return Usuario
	 */
	@ManyToOne
	@JoinColumn(name="loginusuario", insertable=true, updatable=true)
	public Usuario getUsuario()
	{
		return usuario;
	}

	/**
	 * Method 'setUsuario'
	 * 
	 * @param usuario
	 */
	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}

}
