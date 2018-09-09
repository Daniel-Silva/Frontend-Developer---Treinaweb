package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Veiculo corsa = new Veiculo();		
		corsa.setMarca("GM");
		corsa.setModelo("Corsa Sedan");
		corsa.setMotor("1.6cv");
		corsa.setAno("2010");
		
		System.out.println(corsa.getQtdCombustivel());
		corsa.ligar();
		
		corsa.abastecer(10);
		System.out.println(corsa.getQtdCombustivel());
		System.out.println(corsa.getModelo());
		
		
	}

}
