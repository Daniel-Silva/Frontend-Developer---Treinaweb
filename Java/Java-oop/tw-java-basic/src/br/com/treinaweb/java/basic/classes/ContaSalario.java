package br.com.treinaweb.java.basic.classes;

public class ContaSalario extends Conta {


	/**
	 * Construtor com par�metos
	 * @param nome
	 * @param email
	 * @param telefone
	 */
	public ContaSalario(String nome, String email, String telefone) {
		super(nome, email, telefone);
		// TODO Auto-generated constructor stub
	}

	public ContaSalario() {
		super();
	}
	
	@Override
	public void depositar(float valor) {
		System.out.println("Fun��o indispon�vel para Conta Sal�rio");		
	}
	
	@Override
	public float getSaldo() {
		return saldo;
	}
	
}
