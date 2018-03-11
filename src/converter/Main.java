package converter;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Main to start and show GUI for converter.
 * @author Poorin Pichayamongkol
 */
public class Main extends Application {
	
	//initializing the UI
	@Override
	public void start(Stage stage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("ConverterUI.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.sizeToScene();
			stage.show();
		} catch(Exception e) {
			System.out.println("Exception creating scene: " + e.getMessage());
		}
	}
	
	//launch the application
	public static void main(String[] args) {
		launch(args);
	}
}
