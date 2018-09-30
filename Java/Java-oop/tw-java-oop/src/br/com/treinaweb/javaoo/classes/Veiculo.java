package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;

/**
 * Classe veículo para o projeto do curso de Java - Orientação a Objetos
 * @author Daniel Silva
 *
 */

public class Veiculo {
	
	/**
	 * Definindo atributos para classe veículo
	 */
	private String marca;
	private String modelo;
	private String motor;
	private String ano;
	private String chassi;
	protected int qtdRodas;
	private float qtdCombustivel;
	
	/**
	 * método para ligar o carro
	 */
	public void ligar() {
		System.out.println("Veículo ligado!");
	}
	
	/**
	 * método para desligar o carro
	 */
	public void desligar() {
		System.out.println("Veículo desligado!");
	}

	/**
	 * 
	 * @return
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * 
	 * @return
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * 
	 * @return
	 */
	public String getMotor() {
		return motor;
	}

	/**
	 * 
	 * @param motor
	 */
	public void setMotor(String motor) {
		this.motor = motor;
	}

	/**
	 * 
	 * @return
	 */
	public String getAno() {
		return ano;
	}

	/**
	 * 
	 * @param ano
	 */
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	/**
	 * 
	 * @return chassi
	 */
	public String getChassi() {
		return chassi;
	}
	
	/**
	 * 
	 * @param chassi
	 */
	public void setChassi(String chassi) throws Exception{
		if(chassi.length() == 10) {
			this.chassi = chassi;
		}else {
			throw new ChassiInvalidoException (chassi);
		}
		
	}
	
	/**
	 * 
	 * @return qtdRodas
	 */
	public int getQtdRodas() {
		return qtdRodas;
	}

	/**
	 * 
	 * @return qtdCombustivel
	 */
	public float getQtdCombustivel() {
		return qtdCombustivel;
	}

	/**
	 * 
	 * @param litros
	 * @return
	 */
	public void abastecer(float litros) {
		this.qtdCombustivel += litros;
	}

	
	
	
	
	
	
}
