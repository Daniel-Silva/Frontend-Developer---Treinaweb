package br.com.treinaweb.agenda.repositorios.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.treinaweb.agenda.entidades.Contato;
import br.com.treinaweb.agenda.repositorios.interfaces.RepositorioAgenda;

public class RepositorioContatoJdbc implements RepositorioAgenda<Contato> {

	@Override
	public List<Contato> selecionar() throws SQLException {

		List<Contato> contatos = new ArrayList<Contato>();
		// Criando conexão com o Banco de Dados
		Connection conexao = null;
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/TW_JDBC?useTimezone=true&serverTimezone=UTC", "root", "ThirdDay");
			Statement comando = conexao.createStatement(); // Dispara o comando SQL ao banco de dados
			ResultSet result = comando.executeQuery("SELECT * FROM T_CONTATOS");

			while (result.next()) {
				Contato contato = new Contato();
				contato.setId(result.getInt("id"));
				contato.setNome(result.getString("nome"));
				contato.setEmail(result.getString("email"));
				contato.setIdade(result.getInt("idade"));
				contato.setTelefone(result.getString("telefone"));
				contatos.add(contato);
			}
		} finally {
			if(conexao != null) {
				conexao.close();
			}			
		}
		return contatos;
	}

	@Override
	public void inserir(Contato entidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Contato entidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Contato entidade) {
		// TODO Auto-generated method stub

	}

}
