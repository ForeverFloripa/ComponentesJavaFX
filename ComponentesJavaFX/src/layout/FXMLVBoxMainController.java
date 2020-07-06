package layout;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

public class FXMLVBoxMainController implements Initializable {
	
	
	@FXML
    private MenuBar menubar;

    @FXML
    private MenuItem menuitemcadastrosclientes;

    @FXML
    private MenuItem menuitemvendaspormes;

	@FXML AnchorPane anchorpane;

	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	@FXML
	public void showFXMLCadastrosCliente() throws IOException {
		AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLCadastrosCliente.fxml"));
		anchorpane.getChildren().setAll(a);
	}
	@FXML
	public void showFXMLRelatorios() throws IOException {
		AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLRelatorios.fxml"));
		anchorpane.getChildren().setAll(a);
	}

}
