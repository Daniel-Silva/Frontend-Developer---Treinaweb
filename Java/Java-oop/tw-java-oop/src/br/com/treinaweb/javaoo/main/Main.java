package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Carro;
import br.com.treinaweb.javaoo.classes.Veiculo;
import br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;
import br.com.treinaweb.javaoo.excecoes.ValidAbastecimentoException;

public class Main {

	public static void main(String[] args) {
		
		try {
			Veiculo corsa = new Carro("GM", "Corsa Sedan", "1.6cv", "2010", "C157B9781F");		
			
			System.out.println(corsa.getQtdCombustivel());
			System.out.println(corsa.isLigado());
			((Carro)corsa).setQtdPortas(4);
			corsa.ligar();		
			System.out.println(corsa.getQtdCombustivel() + " Litros de combustível no tamque");
			System.out.println(corsa.getChassi());
			System.out.println(corsa.getQtdRodas() + " rodas + estepe");
			System.out.println(corsa.isLigado());
			
		} catch (ValidAbastecimentoException e) {
			System.out.println("Desligue o veículo para abastecer!");
		} catch (ChassiInvalidoException e) {
			System.out.println("Número de chassi inválido. "+ e.getMessage());
		} catch (Exception e){
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
	}

}
