package br.com.treinaweb.main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class simulando uma calculadora utilizando a estrutura de repeti��o While
 * @author Daniel Silva
 * @version 1.0
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Vari�vel respons�vel pela a��o de escolha na intera��o.
		 * @param indica a op��o do menu a ser escolhida
		 */		
		int acao = 1;
		
		/**
		 * arraylist que armazena o hist�rico das opera��es
		 */
		ArrayList<String> historico = new ArrayList<String>();
		
		/**
		 * repeti��o de verifica��o
		 */
		
		while(acao > 0) {	
			/**
			 * condi��o para execu��o da opera��o
			 * @param indica opera��o matem�rica
			 */
			if(acao == 1) {
				/**
				 * solicita os valores e a opera��o e armazena em vari�veis
				 */
				System.out.println("=== OPERA��O MATEM�TICA ===");
				System.out.print("Digite o primeiro valor: ");
				int valor1 = sc.nextInt();
				System.out.print("Digite a opera��o: ");
				char operacao = sc.next().charAt(0);
				System.out.print("Digite o segundo valor: ");
				int valor2 = sc.nextInt();
				
				/**
				 * indica qual opera��o est� sendo realizada
				 */
				System.out.println(String.format("A opera��o solicitada � %d %c %d", valor1, operacao, valor2));
				
				/**
				 * vari�vel que armazenar� o resultado da opera��o matem�tica
				 */
				int resultado = 0;
				
				/**
				 * condi��o para execu��o da opera��o matem�tica
				 * @param executa a opera��o matem�tica de acordo com a op��o escolhida
				 */
				switch(operacao) {
				case '+':
					resultado = valor1 + valor2;
					break;
				case '-':
					resultado = valor1 - valor2;
					break;
				case '*': 
					resultado = valor1 * valor2;
					break;
				case '/':
					resultado = valor1 / valor2;
					break;
				default:
					System.out.println("Opera��o inv�lida!");
				}
				
				/**
				 * armazena a opera��o numa vari�vel
				 */
				String entradaHistorico = String.format("%d %c %d = %d", valor1, operacao, valor2, resultado);
				
				/**
				 * adiciona a vari�vel de entradaHistorico ao ArrayList
				 */
				historico.add(entradaHistorico);
				
				/**
				 * sa�da do resuldado da opera��o
				 */
				System.out.println(entradaHistorico);
				
			}else if(acao == 2) {
				System.out.println("=== HIST�RICO ===)");
				System.out.println(String.format(" - Voc� j� fez %d opera��es", historico.size()));
				
				/**
				 * imprime cada item do hist�rico na tela.
				 * @param sa�da dos itens do hist�rico 
				 */
				for(int i = 0; i < historico.size(); i++) {
					System.out.println(historico.get(i));
				}
			}
			System.out.println("=== O que voc� deseja fazer? ===");
			System.out.println("1. Realizar opera��o matem�tica");
			System.out.println("2. Visualizar hist�rioco");
			System.out.println("0. Sair");
			System.out.println("Qual a sua op��o?");
			acao = sc.nextInt();
		}
		sc.close();
	}
}