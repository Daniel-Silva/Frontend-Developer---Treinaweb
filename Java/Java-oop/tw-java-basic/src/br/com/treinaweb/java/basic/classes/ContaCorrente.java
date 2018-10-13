package br.com.treinaweb.java.basic.classes;

import br.com.treinaweb.java.basic.execoes.LimiteCartaoException;

public class ContaCorrente extends Conta {

	private float limiteCartao;

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

	public void CartaoCredito (float compra) throws LimiteCartaoException {
		if(compra <= this.limiteCartao) {
			this.limiteCartao -= compra;
		}else {
			throw new LimiteCartaoException(compra);
		}
	}
	
}
