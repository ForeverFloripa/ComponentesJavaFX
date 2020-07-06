package combobox;

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
import javafx.scene.control.ComboBox;

public class FXMLComboboxController implements Initializable {

	@FXML
	private Button btnRemover;

	private List<Cliente> listClientes = new ArrayList();

	private ObservableList<Cliente> observableListClientes;

	@FXML
	private ComboBox<Cliente> cbbCliente;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		carregartblClientes();
		
		cbbCliente.getSelectionModel().selectedItemProperty()
		.addListener((observable, oldValue, newValue) -> selecionarItemCbb(newValue));


	}

	public void carregartblClientes() {

		Cliente c1 = new Cliente("Astrogilda", "9999-0000");
		Cliente c2 = new Cliente("Gumercinda", "8888-0000");
		Cliente c3 = new Cliente("Grugumila", "444-0000");
		Cliente c4 = new Cliente("Onofre", "1111-0000");

		listClientes.add(c1);
		listClientes.add(c2);
		listClientes.add(c3);
		listClientes.add(c4);

		observableListClientes = FXCollections.observableArrayList(listClientes);

		cbbCliente.setItems(observableListClientes);
	}

	public void selecionarItemCbb(Cliente cliente) {
		if (cliente != null) {
			System.out.println("Cliente selecionado: " + cliente.getNome());
		}
	}

	@FXML
	public void removerItemCbb() {
		Cliente cliente = cbbCliente.getSelectionModel().getSelectedItem();
		if (cliente != null) {
			System.out.println(cliente + "Removido da tabela");
//		cbbCliente.getItems().remove(cliente);
			observableListClientes.remove(cliente);
		}
	}

}
