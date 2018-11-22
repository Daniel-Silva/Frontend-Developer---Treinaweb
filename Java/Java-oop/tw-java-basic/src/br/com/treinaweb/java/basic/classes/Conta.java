package br.com.treinaweb.java.basic.classes;

import br.com.treinaweb.java.basic.execoes.SacarException;

public abstract class Conta {
	
	private String nome;
	private String email;
	private String telefone;
	private int agencia;
	private int conta;
	protected float saldo;
	private Boolean ativo;
	
	
	/**
	 * Método para depositar
	 * @param valor
	 */
	public abstract void depositar(float valor);
	
	/**
	 * Método para sacar
	 * @param valor
	 */
	public void sacar(float valor) throws SacarException{

		if(valor <= this.saldo) {
			this.saldo -= valor;
		}else {
			throw new SacarException(valor);
		}
		
	}
	
	/**
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * 
	 * @return agencia
	 */
	public int getAgencia() {
		return agencia;
	}
	
	/**
	 * 
	 * @return conta
	 */
	public int getConta() {
		return conta;
	}
	
	protected void setConta() {
		this.conta = (int) (Math.random() * 501);
	}
	
	/**
	 * 
	 * @return saldo
	 */
	public abstract float getSaldo();
	

	/**
	 * 
	 * @return ativo
	 */
	public Boolean isAtivo() {
		return ativo;
	}

	
	
}
