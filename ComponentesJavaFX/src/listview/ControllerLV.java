package listview;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.Cliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class ControllerLV implements Initializable {

	@FXML
	private ListView<Cliente> listViewClientes;

	@FXML
	private Button btnRemover;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		carregarListViewClientes();

		listViewClientes.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> selecionarItemLV(newValue));

	}

	private List<Cliente> listClientes = new ArrayList<Cliente>();
	private ObservableList<Cliente> observableListClientes;

	public void carregarListViewClientes() {
		Cliente c1 = new Cliente("Astrogilda", "9999-0000");
		Cliente c2 = new Cliente("Gumercinda", "8888-0000");

		listClientes.add(c1);
		listClientes.add(c2);

		observableListClientes = FXCollections.observableArrayList(listClientes);

		listViewClientes.setItems(observableListClientes);

	}

	@FXML
	public void clicarMouseItemLV() {
		Cliente cliente = listViewClientes.getSelectionModel().getSelectedItem();
		System.out.println("Cliente Selecionado: " + cliente.getNome() + " " + cliente.getTelefone());
	}

	@FXML
	public void selecionarItemLV(Cliente cliente) {
		if (cliente != null) {
			System.out.println("Cliente Selecionado: " + cliente.getNome() + " " + cliente.getTelefone());
		}
	}

	@FXML
	public void removerItemLV() {
		Cliente cliente = listViewClientes.getSelectionModel().getSelectedItem();
		System.out.println("Removendo o cliente : " + cliente.getNome());
		listViewClientes.getItems().remove(cliente);

	}

}
