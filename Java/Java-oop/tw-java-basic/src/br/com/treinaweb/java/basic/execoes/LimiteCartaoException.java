package br.com.treinaweb.java.basic.execoes;

public class LimiteCartaoException extends Exception {

	private static final long serialVersionUID = -5297940615759267408L;

	public LimiteCartaoException(float compra) {
		super(String.format("O valor da compra � maior que o limite do cart�o"));
	}
	
}
