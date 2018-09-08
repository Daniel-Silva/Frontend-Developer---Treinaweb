package br.com.treinaweb.java.basico.exercicios;

import java.util.Scanner;

public class CalcularArea {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("=== CALCULAR �REA E PER�METRO DE UM RENT�NGULO ===");
		System.out.print("Informe o comprimento do ret�ngulo: ");
		int comprimento = leitor.nextInt();
		System.out.print("Informe a largura do ret�ngulo: ");
		int largura = leitor.nextInt();
		int area = comprimento * largura;
		int perimetro = (2 * comprimento) + (2 * largura);
		
		System.out.println("A �rea do ret�ngulo �: "+ area);
		System.out.println("O per�metro do ret�ngulo �: "+ perimetro);
		
		leitor.close();
		
	}
	
}
