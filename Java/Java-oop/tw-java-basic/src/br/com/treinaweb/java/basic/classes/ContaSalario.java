package br.com.treinaweb.java.basic.classes;

public class ContaSalario extends Conta {

	@Override
	public void depositar(float valor) {
		System.out.println("Fun��o indispon�vel para Conta Sal�rio");		
	}
	
	@Override
	public float getSaldo() {
		return saldo;
	}
	
}
