package br.com.treinaweb.java.basic.classes;

public class ContaSalario extends Conta {

	@Override
	public void depositar(float valor) {
		System.out.println("Função indisponível para Conta Salário");		
	}
	
	@Override
	public float getSaldo() {
		return saldo;
	}
	
}
