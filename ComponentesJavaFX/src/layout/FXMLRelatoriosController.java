package layout;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;

public class FXMLRelatoriosController implements Initializable{
	

    @FXML
    private BarChart<String, Integer> barchart;

    @FXML
    private CategoryAxis xaxis;
    
    //private ObservableList<String> observableListMeses = FXCollections.observableArrayList();
    //private ObservableList<Integer> observableListQtdVendas = FXCollections.observableArrayList();
    

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		XYChart.Series<String, Integer> series = new XYChart.Series<>();
		series.setName("2016");
		series.getData().add(new XYChart.Data<>("Janeiro",20));
		series.getData().add(new XYChart.Data<>("Fevereiro",40));
		series.getData().add(new XYChart.Data<>("Março",60));
		barchart.getData().add(series);
		
	}

}
