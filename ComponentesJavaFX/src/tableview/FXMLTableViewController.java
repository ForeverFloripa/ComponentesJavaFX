package tableview;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLTableViewController implements Initializable {
	@FXML
	private TableView<Cliente> tblCliente;
	@FXML
	private TableColumn<Cliente, String> tcNome;
	@FXML
	private TableColumn<Cliente, String> tcFone;
	@FXML
	private Button btnRemover;

	private List<Cliente> listClientes = new ArrayList();

	private ObservableList<Cliente> observableListClientes;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		carregartblClientes();
		tblCliente.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> selecionarItemTabela(newValue));

	}

	public void carregartblClientes() {

		tcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tcFone.setCellValueFactory(new PropertyValueFactory<>("telefone"));

		Cliente c1 = new Cliente("Astrogilda", "9999-0000");
		Cliente c2 = new Cliente("Gumercinda", "8888-0000");

		listClientes.add(c1);
		listClientes.add(c2);

		observableListClientes = FXCollections.observableArrayList(listClientes);

		tblCliente.setItems(observableListClientes);
	}

	public void selecionarItemTabela(Cliente cliente) {
		if (cliente != null) {
			System.out.println("Cliente selecionado: " + cliente.getNome());
		}
	}

	public void removerItemTabela() {
		Cliente cliente = tblCliente.getSelectionModel().getSelectedItem();
		if (cliente != null) {
			System.out.println(cliente + "Removido da tabela");
//		tblCliente.getItems().remove(cliente);
			observableListClientes.remove(cliente);
		}
	}

}
