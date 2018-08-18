package br.com.treinaweb.main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class simulando uma calculadora utilizando a estrutura de repetição While
 * @author Daniel Silva
 * @version 1.0
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Variável responsável pela ação de escolha na interação.
		 * @param indica a opção do menu a ser escolhida
		 */		
		int acao = 1;
		
		/**
		 * arraylist que armazena o histórico das operações
		 */
		ArrayList<String> historico = new ArrayList<String>();
		
		/**
		 * repetição de verificação
		 */
		
		while(acao > 0) {	
			/**
			 * condição para execução da operação
			 * @param indica operação matemárica
			 */
			if(acao == 1) {
				/**
				 * solicita os valores e a operação e armazena em variáveis
				 */
				System.out.println("=== OPERAÇÃO MATEMÁTICA ===");
				System.out.print("Digite o primeiro valor: ");
				int valor1 = sc.nextInt();
				System.out.print("Digite a operação: ");
				char operacao = sc.next().charAt(0);
				System.out.print("Digite o segundo valor: ");
				int valor2 = sc.nextInt();
				
				/**
				 * indica qual operação está sendo realizada
				 */
				System.out.println(String.format("A operação solicitada é %d %c %d", valor1, operacao, valor2));
				
				/**
				 * variável que armazenará o resultado da operação matemática
				 */
				int resultado = 0;
				
				/**
				 * condição para execução da operação matemática
				 * @param executa a operação matemática de acordo com a opção escolhida
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
					System.out.println("Operação inválida!");
				}
				
				/**
				 * armazena a operação numa variável
				 */
				String entradaHistorico = String.format("%d %c %d = %d", valor1, operacao, valor2, resultado);
				
				/**
				 * adiciona a variável de entradaHistorico ao ArrayList
				 */
				historico.add(entradaHistorico);
				
				/**
				 * saída do resuldado da operação
				 */
				System.out.println(entradaHistorico);
				
			}else if(acao == 2) {
				System.out.println("=== HISTÓRICO ===)");
				System.out.println(String.format(" - Você já fez %d operações", historico.size()));
				
				/**
				 * imprime cada item do histórico na tela.
				 * @param saída dos itens do histórico 
				 */
				for(int i = 0; i < historico.size(); i++) {
					System.out.println(historico.get(i));
				}
			}
			System.out.println("=== O que você deseja fazer? ===");
			System.out.println("1. Realizar operação matemática");
			System.out.println("2. Visualizar histórioco");
			System.out.println("0. Sair");
			System.out.println("Qual a sua opção?");
			acao = sc.nextInt();
		}
		sc.close();
	}
}