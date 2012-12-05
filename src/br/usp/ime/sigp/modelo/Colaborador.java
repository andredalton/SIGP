package br.usp.ime.sigp.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="colaborador")
public class Colaborador implements Serializable
{
	protected long id;

	protected byte[] imagem;

	protected String nomecompleto;

	protected String apelido;

	protected String tipodecolaborador;

	protected String nomeemcitacoes;

	protected String email;

	protected String cvurl;

	protected String rg;

	protected String cpf;

	protected String shortbioportugues;

	protected String outrasinformacoespublico;

	protected String shortbioenglish;

	protected String outrasinformacoesprivado;

	protected long coordenador;
	
	/**
	 * Method 'Colaborador'
	 * 
	 */
	public Colaborador()
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
	 * Method 'getNomecompleto'
	 * 
	 * @return String
	 */
	@Column(name="nomecompleto")
	public String getNomecompleto()
	{
		return nomecompleto;
	}

	/**
	 * Method 'setNomecompleto'
	 * 
	 * @param nomecompleto
	 */
	public void setNomecompleto(String nomecompleto)
	{
		this.nomecompleto = nomecompleto;
	}

	/**
	 * Method 'getApelido'
	 * 
	 * @return String
	 */
	@Column(name="apelido")
	public String getApelido()
	{
		return apelido;
	}

	/**
	 * Method 'setApelido'
	 * 
	 * @param apelido
	 */
	public void setApelido(String apelido)
	{
		this.apelido = apelido;
	}

	/**
	 * Method 'getTipodecolaborador'
	 * 
	 * @return String
	 */
	@Column(name="tipodecolaborador")
	public String getTipodecolaborador()
	{
		return tipodecolaborador;
	}

	/**
	 * Method 'setTipodecolaborador'
	 * 
	 * @param tipodecolaborador
	 */
	public void setTipodecolaborador(String tipodecolaborador)
	{
		this.tipodecolaborador = tipodecolaborador;
	}

	/**
	 * Method 'getNomeemcitacoes'
	 * 
	 * @return String
	 */
	@Column(name="nomeemcitacoes")
	public String getNomeemcitacoes()
	{
		return nomeemcitacoes;
	}

	/**
	 * Method 'setNomeemcitacoes'
	 * 
	 * @param nomeemcitacoes
	 */
	public void setNomeemcitacoes(String nomeemcitacoes)
	{
		this.nomeemcitacoes = nomeemcitacoes;
	}

	/**
	 * Method 'getEmail'
	 * 
	 * @return String
	 */
	@Column(name="email")
	public String getEmail()
	{
		return email;
	}

	/**
	 * Method 'setEmail'
	 * 
	 * @param email
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * Method 'getCvurl'
	 * 
	 * @return String
	 */
	@Column(name="cvurl")
	public String getCvurl()
	{
		return cvurl;
	}

	/**
	 * Method 'setCvurl'
	 * 
	 * @param cvurl
	 */
	public void setCvurl(String cvurl)
	{
		this.cvurl = cvurl;
	}

	/**
	 * Method 'getRg'
	 * 
	 * @return String
	 */
	@Column(name="rg")
	public String getRg()
	{
		return rg;
	}

	/**
	 * Method 'setRg'
	 * 
	 * @param rg
	 */
	public void setRg(String rg)
	{
		this.rg = rg;
	}

	/**
	 * Method 'getCpf'
	 * 
	 * @return String
	 */
	@Column(name="cpf")
	public String getCpf()
	{
		return cpf;
	}

	/**
	 * Method 'setCpf'
	 * 
	 * @param cpf
	 */
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	/**
	 * Method 'getShortbioportugues'
	 * 
	 * @return String
	 */
	@Column(name="shortbioportugues")
	public String getShortbioportugues()
	{
		return shortbioportugues;
	}

	/**
	 * Method 'setShortbioportugues'
	 * 
	 * @param shortbioportugues
	 */
	public void setShortbioportugues(String shortbioportugues)
	{
		this.shortbioportugues = shortbioportugues;
	}

	/**
	 * Method 'getOutrasinformacoespublico'
	 * 
	 * @return String
	 */
	@Column(name="outrasinformacoespublico")
	public String getOutrasinformacoespublico()
	{
		return outrasinformacoespublico;
	}

	/**
	 * Method 'setOutrasinformacoespublico'
	 * 
	 * @param outrasinformacoespublico
	 */
	public void setOutrasinformacoespublico(String outrasinformacoespublico)
	{
		this.outrasinformacoespublico = outrasinformacoespublico;
	}

	/**
	 * Method 'getShortbioenglish'
	 * 
	 * @return String
	 */
	@Column(name="shortbioenglish")
	public String getShortbioenglish()
	{
		return shortbioenglish;
	}

	/**
	 * Method 'setShortbioenglish'
	 * 
	 * @param shortbioenglish
	 */
	public void setShortbioenglish(String shortbioenglish)
	{
		this.shortbioenglish = shortbioenglish;
	}

	/**
	 * Method 'getOutrasinformacoesprivado'
	 * 
	 * @return String
	 */
	@Column(name="outrasinformacoesprivado")
	public String getOutrasinformacoesprivado()
	{
		return outrasinformacoesprivado;
	}

	/**
	 * Method 'setOutrasinformacoesprivado'
	 * 
	 * @param outrasinformacoesprivado
	 */
	public void setOutrasinformacoesprivado(String outrasinformacoesprivado)
	{
		this.outrasinformacoesprivado = outrasinformacoesprivado;
	}

	/**
	 * Method 'getCoordenador'
	 * 
	 * @return long
	 */
	@Column(name="coordenador")
	public long getCoordenador()
	{
		return coordenador;
	}

	/**
	 * Method 'setCoordenador'
	 * 
	 * @param coordenador
	 */
	public void setCoordenador(long coordenador)
	{
		this.coordenador = coordenador;
	}
	
}
