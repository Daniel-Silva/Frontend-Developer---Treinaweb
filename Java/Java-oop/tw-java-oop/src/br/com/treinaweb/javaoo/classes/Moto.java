package br.com.treinaweb.javaoo.classes;

public class Moto extends Veiculo {
	
	
	/**
	 * Construtor da classe moto
	 * @param marca
	 * @param modelo
	 * @param motor
	 * @param ano
	 * @param chassi
	 * @throws Exception
	 */
	public Moto(String marca, String modelo, String motor, String ano, String chassi) throws Exception {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setMotor(motor);
		this.setAno(ano);
		this.setChassi(chassi);
		this.qtdRodas = 2;
	}
	
	/**
	 * Construtor padrão
	 */
	public Moto() {
		
	}
	
}
