package br.com.treinaweb.agenda.fx;

import java.util.List;

import br.com.treinaweb.agenda.entidades.Contato;
import br.com.treinaweb.agenda.repositorios.impl.RepositorioContato;
import br.com.treinaweb.agenda.repositorios.interfaces.RepositorioAgenda;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TableView<Contato> tabelaContatos;
	@FXML
	private Button btnInsert;
	@FXML
	private Button btnUpdate;
	@FXML
	private Button btnDelete;
	@FXML
	private Button btnSava;
	@FXML
	private Button btnCancel;
	@FXML
	private TextField txfNome;
	@FXML
	private TextField txfIdade;
	@FXML
	private TextField txfEmail;
	@FXML
	private TextField txfTelefone;
	
	private void carregarTabelaContato() {
		RepositorioAgenda<Contato> repositorioContato = new RepositorioContato();
		List<Contato> contatos = repositorioContato.selecionar();
		ObservableList<Contato> contatosObservableList = FXCollections.observableList(contatos);
		this.tabelaContatos.getItems().setAll(contatosObservableList);
	}

}
