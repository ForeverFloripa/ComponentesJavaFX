package alert;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class AlertController implements Initializable {

	@FXML Button btnAciona;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	@FXML
	public void alertar() {
		AlertMaker.showSimpleAlert("Titulo aqui", "Mensagem aqui");
	}
}
