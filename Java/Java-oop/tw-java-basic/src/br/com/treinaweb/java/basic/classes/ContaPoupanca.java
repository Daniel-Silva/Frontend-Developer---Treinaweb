package br.com.treinaweb.java.basic.classes;

public class ContaPoupanca extends Conta {

	private float juros;
	
	@Override
	public void depositar(float valor) {
		this.saldo += (valor + this.juros);		
	}
}
