package Quiz;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application{
	
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		primaryStage.setTitle("Farhad's Quiz");
		button = new Button();
		button.setText("A");
		button.setPrefSize(300, 50);
		button.setTextAlignment(TextAlignment.LEFT);
		
		
		Pane layout = new Pane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 1440,720);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);
	}

	/*@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	} */

}
