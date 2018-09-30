package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Carro;

public class Main {

	public static void main(String[] args) {
		
		try {
			Carro corsa = new Carro();		
			corsa.setMarca("GM");
			corsa.setModelo("Corsa Sedan");
			corsa.setMotor("1.6cv");
			corsa.setAno("2010");
			corsa.setChassi("C157B9781F");
			
			System.out.println(corsa.getQtdCombustivel());
			corsa.ligar();		
			corsa.abastecer(10);
			System.out.println(corsa.getQtdCombustivel() + " Litros de combustível no tamque");
			System.out.println(corsa.getChassi());
			System.out.println(corsa.getQtdRodas() + " rodas + estepe");
		} catch (Exception e){
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
	}

}
