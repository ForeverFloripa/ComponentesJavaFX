package treetableview;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableColumn.CellDataFeatures;
import javafx.scene.control.TreeTableView;
import javafx.util.Callback;

public class FXMLTreeTableViewController implements Initializable {
	@FXML
	private TreeTableView<String> tblView;
	@FXML
	private TreeTableColumn<String, String> tc1;

	TreeItem<String> itel_l1 = new TreeItem<>("add queijo     3.00");
	TreeItem<String> itel_l2 = new TreeItem<>("add ovo        1.50");

	TreeItem<String> parent1 = new TreeItem<>("ADICIONAIS");

	TreeItem<String> itel_h1 = new TreeItem<>("maionese");
	TreeItem<String> itel_h2 = new TreeItem<>("ketchup");
	TreeItem<String> itel_h3 = new TreeItem<>("mostarda");

	TreeItem<String> parent2 = new TreeItem<>("COMPLEMENTOS");

	TreeItem<String> root = new TreeItem<>("1  X-SALADA - GRANDE    14.50    14.50");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		parent1.getChildren().setAll(itel_l1, itel_l2);
		parent2.getChildren().setAll(itel_h1, itel_h2,itel_h3);

		root.getChildren().setAll(parent1, parent2);

		tc1.setCellValueFactory(
				new Callback<TreeTableColumn.CellDataFeatures<String, String>, ObservableValue<String>>() {

					@Override
					public ObservableValue<String> call(CellDataFeatures<String, String> param) {
						return new SimpleStringProperty(param.getValue().getValue());
					}
				});

		tblView.setRoot(root);

		// TODO Auto-generated method stub

	}

	@FXML public void makeChange() {
		itel_h3.setValue("sem mostarda");
		
		
	}

}
