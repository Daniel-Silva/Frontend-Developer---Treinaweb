package br.com.treinaweb.java.basic.classes;

import br.com.treinaweb.java.basic.execoes.LimiteCartaoException;
import br.com.treinaweb.java.basic.interfaces.ContaCorrenteInterface;

public class ContaCorrente extends Conta implements ContaCorrenteInterface{

	private float limiteCartao;
	private float compra;

	@Override
	public void depositar(float valor) {
		this.saldo += valor;		
	}

	/**
	 * 
	 * @return
	 */
	public float getLimiteCartao() {
		return limiteCartao;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public float getCompra() {
		return compra;
	}

	/**
	 * 
	 * @param compra
	 */
	public void setCompra(float compra) {
		this.compra = compra;
	}

	public void CartaoCredito (float compra) throws LimiteCartaoException {
		if(compra <= this.limiteCartao) {
			this.limiteCartao -= compra;
		}else {
			throw new LimiteCartaoException(compra);
		}
	}
	
	@Override
	public float getSaldo() {
		return saldo;
	}

	
}
