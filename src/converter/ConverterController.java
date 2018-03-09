package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 *  UI Controller for events and initializing components.
 * @author Poorin Pichayamongkol
 */
public class ConverterController {
	@FXML
	TextField textfield1;
	@FXML
	TextField textfield2;
	@FXML
	Button convert;
	@FXML
	Button clear;
	@FXML
	private ComboBox<Length> combo1;
	@FXML
	private ComboBox<Length> combo2;
	
	/**
	* JavaFX calls the initialize() method of your controller when
	* it creates the UI form, after the components have been created
	* and @FXML annotated attributes have been set.
	*
	* This is a hook to initialize anything your controller or UI needs.
	*/
	@FXML
	public void initialize() {
		System.out.println("Running initialize");
		if (combo1 != null) {
			combo1.getItems().addAll( Length.values() );
			combo1.getSelectionModel().select(0); 
		}
		if (combo2 != null) {
			combo2.getItems().addAll( Length.values() );
			combo2.getSelectionModel().select(1); 
		}
	}
	
	/**
	 * Convert a distance from one unit to another.
	 */
	public void handleConvert(ActionEvent event) {
		// read values from textfield(s)
		String text1 = textfield1.getText().trim();
		String text2 = textfield2.getText().trim();
		//read the Length from combobox
		Length length1 = combo1.getValue();
		Length length2 = combo2.getValue();
		double value = 0;
		// This is for testing
		System.out.println("handleConvert converting "+text1);
//		System.out.println("handleConvert converting "+value1);
		System.out.println("handleConvert converting "+text2);
//		System.out.println("handleConvert converting "+value2);
		System.out.printf("got values %s %s\n", text1, combo1.toString() );
		// perform the conversion and output the result
		try {
			if (!text1.isEmpty() && text2.isEmpty()) {
				value = Double.parseDouble(text1);
				textfield2.setText(String.format("%.4g", ((value * length1.getValue())/length2.getValue()) ));
				textfield1.setText("");
			}
			if (!text2.isEmpty() && text1.isEmpty()) {
				value = Double.parseDouble(text2);
				textfield1.setText(String.format("%.4g", ((value * length2.getValue())/length1.getValue())));
				textfield2.setText("");
			}
		}
		catch(Exception e) {
			textfield1.setText("Press clear");
			textfield2.setText("Press clear");
		}
	}
	
	public void handleClear(ActionEvent event) {
		textfield1.clear();
		textfield2.clear();
	}
}
