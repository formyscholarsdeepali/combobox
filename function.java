package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class function implements Initializable {
	@FXML
		private ComboBox<String> c;
	@FXML
	private Label l;
	ObservableList<String> l1=FXCollections.observableArrayList("B.Tech","M.Tech","Phd");

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// TODO Auto-generated method stub
		c.setItems(l1);
		
	}
	public void show(ActionEvent event)
	{
		l.setText(c. getValue());
	}
	
	

	
}
