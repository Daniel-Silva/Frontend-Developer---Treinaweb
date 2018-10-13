package br.com.java.basic.app;

import br.com.treinaweb.java.basic.classes.ContaCorrente;

public class Main {

	public static void main (String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.depositar(10);
		
		System.out.println("R$" + conta.getSaldo());
		
	}
	
}
