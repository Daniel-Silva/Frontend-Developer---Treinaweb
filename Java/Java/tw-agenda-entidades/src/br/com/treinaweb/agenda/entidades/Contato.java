package br.com.treinaweb.agenda.entidades;

public class Contato {
	
	/**
	 * Estas s�o as caracter�sticas do contato
	 */
	private int id;
	private String nome;
	private String email;
	private int idade;
	private String telefone;
	
	public Contato() {
		
	}
	
	public Contato(String nome, String email, int idade, String telefone) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	/**
	 * Este m�todo pega o id do contato
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Este m�todo insere o id a um contato
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Este m�todo pega o nome do contato
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Este m�todo insere o nome a um contato
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Este m�todo pega o email do contato
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Este m�todo insere o email a um contato
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Este m�todo pega a idade do contato
	 * @return idade
	 */
	public int getIdade() {
		return idade;
	}
	
	/**
	 * Este m�todo insere a idade a um contato
	 * @param idade
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/**
	 * Este m�todo pega o telefone do contato
	 * @return telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	
	/**
	 * Este m�todo insere o telefone a um contato
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}

